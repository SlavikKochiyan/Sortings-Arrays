import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    static Scanner inputData;
    static int size;
    static int [] arrayNumbers;
    static Random rnd;
    static  int [] output;

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
        sorting(arrayNumbers);
        for(int k = 0; k < size; k++){
            System.out.println("\n" + arrayNumbers[k]);
        }
    }

    //TODO Change algorithm. This style of algorithm are wrong
    //TODO output wrong
    static int[] sorting(int [] myArray){
        int tempNum;
        for (int i = 0; i < myArray.length; i++){
            for(int j = 1; j < myArray.length - i - 1; j++){
                if (myArray[j] > myArray[j+1]){
                    tempNum = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j] = tempNum;
                }
            }
        }
        return myArray;
    }
}
