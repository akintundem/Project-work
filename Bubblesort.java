public class Bubblesort {
    public static void Ascending(int[] array){
        int temp;
        for(int i =0; i < array.length; i++){
            for(int j=0; j< array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    //swap element
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }// looping through unsorted to find the largest then bubble it outside.
        }// repeat process the number of timmes the element equal to.
    }
    public static void Descending(int[] array){
        int temp;
        for(int i =0; i < array.length; i++){
            for(int j=0; j< array.length-i-1; j++){
                if(array[j] < array[j+1]){
                    //swap element
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }// looping through unsorted to find the largest then bubble it outside.
        }// repeat process the number of timmes the element equal to.
    }
}
