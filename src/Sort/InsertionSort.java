package Sort;

import java.util.Random;

public class InsertionSort {
    public static void main(String arg[]){
        int [] number = new int[10];
        Random random = new Random();
        for(int i = 0; i < number.length; i++){
            number[i] = random.nextInt(100);
        }
        System.out.println("Print the array before usage");
        printArray(number);
        insertion(number);
        System.out.println("Print the array after usage");
        printArray(number);
    }

    public  static void printArray(int [] array){
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] insertion(int [] inputArray){
        for(int i = 1; i < inputArray.length; i++){
            int j = i;
            while ((j>0) && inputArray[j-1] > inputArray[j] ){
                int temp = inputArray[j];
                inputArray[j] = inputArray[j-1];
                inputArray[j-1]= temp;
                j--;
            }
        }
        return inputArray;
    }
}
