import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    static Scanner inputData;
    static int size;
    static int [] arrayNumbers;
    static Random rnd;
    static  int [] output;

    public static void main(String[] args) {
        inputData = new Scanner(System.in);
        System.out.println("Please enter size of array");
        rnd = new Random();
        size = inputData.nextInt();
        System.out.println("Array before sorting");
        arrayNumbers = new int[size];

        for(int i = 0; i < size; i++){
            int randomNum = rnd.nextInt(100) + 1;
            arrayNumbers[i] = randomNum;
            System.out.print(arrayNumbers[i] + " ");
        }
       output = sorting(arrayNumbers);
        for (int i = 0; i < output.length; i++){//changes
            System.out.print(output[i] + ", ");
        }
    }
    static int[] sorting(int [] myArray){
        int tempNum;
        for (int i = 0; i < myArray.length; i++){
            for(int j = 1; j < myArray.length - i; j++){
                if (myArray[j-1] > myArray[j]){
                    tempNum = myArray[j];
                    myArray[j-1] = myArray[j];
                    myArray[j] = tempNum;
                }
            }
        }
        return myArray;
    }
}
