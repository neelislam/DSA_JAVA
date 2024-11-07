
public class Main {
    public static void main(String[] args) {
 int array[] = {9,1,3,7,2,5};
System.out.println("Array before sort: ");
        for( int i: array ) {
            System.out.print(i+ " ");
        }
        System.out.println("");

 insertionSort(array);
        System.out.println("Array after sort: ");
 for( int i: array ) {
     System.out.print(i+ " ");
 }

    }

    private static void insertionSort(int[] array) {
        for(int i=1; i< array.length; i++) {
            int temp = array[i];
            int j = i -1;


            while(j >= 0 && array[j]> temp){
                array[j+1] = array[j]; // shift element at right
                j--;
            }
            array[j+1] = temp;
        }
    }
}