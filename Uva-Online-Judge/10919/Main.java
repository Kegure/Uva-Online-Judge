
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int coursesChosen = in.nextInt();
            if(coursesChosen == 0) break;
            int numberOfCategories = in.nextInt();
            String[] courses = new String[coursesChosen];
            boolean passed = true;
            for(int i = 0 ; i < coursesChosen ; i++){
                courses[i] = in.next();
            }
            for(int i = 0 ; i < numberOfCategories ; i++){
                int numberOfCoursesByCategory = in.nextInt();
                int minimumNumberOfCoursesNecessary = in.nextInt();
                int count = 0;
                for(int j = 0 ; j < numberOfCoursesByCategory ; j++){
                    String categoryCourseId = in.next();
                    for(int k = 0 ; k < coursesChosen ; k++){
                        if(courses[k].equals(categoryCourseId)) {
                            count++;
                            break;
                        }
                    }
                }
                if(count < minimumNumberOfCoursesNecessary){
                    passed = false;
                }
            }
            if(passed) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
