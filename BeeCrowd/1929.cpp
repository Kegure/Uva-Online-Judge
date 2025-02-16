
#include <iostream>
#include <vector>

using namespace std;


int main(){
    int key = 0;
    int j = 0;
    vector<int> vec(4);
    int size = vec.size();

    for(int i = 0 ; i < size ; i++){
        cin >> vec[i];
    }

    for (int i = 1 ; i < size ; i++){
        key = vec[i];
        j = i - 1;


        while ( j >= 0 && vec[j] > key){
            vec[j+1] = vec[j];
            j--;
        }
        vec[j+1] = key;
    }

    if( (vec[0] + vec[1]) > vec[2] || vec[1] + vec[2] > vec[3]){
        cout << "S" << endl;
    }else{
        cout << "N" << endl;
    }


     return 0;
}
