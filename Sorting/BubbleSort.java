
public class BubbleSort {
    public static void main(String[] args) {

        int n = 6;
        int A[] = { 32, 12, 23, 19, 21, 10 };
    
    }

    public static void sort(int n; int A[]){

        for(int i=0;i<n;i++){
            
            for(int j = 0 ;j<(n-i);j++){

                if( A[j]>A[j+1]){
            /* Swapping A[j] with A[j+1] */  
                    int temp= A[j];
                    A[j] = A[i+j];
                    A[j+1]=temp;
                }
            }
        }
    }
    
}
