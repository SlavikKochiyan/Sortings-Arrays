import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    static Scanner inputData;
    static int size;
    static int [] arrayNumbers;
    static Random rnd;

    public static void main(String[] args) {
        System.out.println("Please enter size of array");

        inputData = new Scanner(System.in);
        size = inputData.nextInt();
        rnd = new Random();
        arrayNumbers = new int[size];

        System.out.println("Array before sorting");

        for(int i = 0; i < size; i++){
            int randomNum = rnd.nextInt(100) + 1;
            arrayNumbers[i] = randomNum;
            System.out.print(arrayNumbers[i] + " ");
        }
        System.out.println("\nArray after sorting");
        sorting(arrayNumbers);
        for(int i = 0; i < size; i++){
            System.out.print(arrayNumbers[i] + " ");
        }
    }
    static void sorting(int [] myArray){
        int temp;
        boolean swapped;

        for (int i = 0; i < myArray.length - 1; i++){
            swapped = false;
            for (int j = 0; j < myArray.length - i - 1; j++){
                if(myArray[j] > myArray[j + 1]){
                    temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                    swapped = true;
                }
            }
            //if two elements sorted
            if(!swapped){
                break;
            }
        }
    }
}
