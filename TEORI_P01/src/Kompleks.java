import java.util.Arrays;

public class Kompleks {
    public static void main(String[] args) {
        int[] array = {34, 56, 111, 2, 56, 89, 77, 89};
        printArray(array, "Data Array sebelum di sorting secara Ascending");
        bubbleDesc(array);
    }
    public static void bubbleDesc(int[] arrayData) {
        for(int i = 0; i < arrayData.length; i++){
            for(int j = 0; j < arrayData.length-1; j++){
                if(arrayData[j] > arrayData[j+1]){
                    int temporary = arrayData[j];
                    arrayData[j] = arrayData[j+1];
                    arrayData[j+1] = temporary;
                }
            }
        }
        printArray(arrayData, "\nSorting menggunakan Bubble Sort");
    }
    public static void printArray(int[] arrayData, String massage) {
        System.out.println(massage + "\n" + Arrays.toString(arrayData));
    }
}
