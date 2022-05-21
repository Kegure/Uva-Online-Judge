import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int loanTotaltime,arrayDayTaxCount,totalTaxesChanges,monthCount,arrayTaxCount;
        double downPayment,loan,carValue,paymentPerMonth;
        while(true){
            loanTotaltime = in.nextInt();
            downPayment = in.nextDouble();
            loan = in.nextDouble();
            totalTaxesChanges = in.nextInt();
            carValue = loan + downPayment;
            paymentPerMonth = loan/loanTotaltime;
            arrayDayTaxCount = arrayTaxCount = monthCount = 0;
            boolean flag = true;
            if(loanTotaltime < 0){
                break;
            }
            double newTax[] = new double[totalTaxesChanges];
            int monthTax[] = new int[totalTaxesChanges];
            for(int i = 0 ; i < totalTaxesChanges ; i++){
                monthTax[i] = in.nextInt();
                newTax[i] = in.nextDouble();
            }
            for(int i = 0 ; i <= loanTotaltime ; i++){
                if(totalTaxesChanges > 1 && flag){
                    totalTaxesChanges--;
                    arrayDayTaxCount++;
                    flag = false;
                }
                if(monthTax[arrayDayTaxCount] == i && monthTax.length > 1){
                    arrayTaxCount++;
                    flag = true;
                }
                carValue = carValue - (carValue * newTax[arrayTaxCount]);
                if(loan  < carValue){
                    break;
                }
                loan = loan-paymentPerMonth;
                monthCount++;
            }
            if(monthCount == 1){
                System.out.println(monthCount+" month");
            }else{
                System.out.println(monthCount+" months");
            }
        }
    }
}