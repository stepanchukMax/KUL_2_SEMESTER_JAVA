import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sizeOfArray;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        sizeOfArray = scanner.nextInt();
        System.out.println("value  of your size is: "+sizeOfArray);

        int array[] = new int[sizeOfArray];
        for (int i=0; i<sizeOfArray; i++){
            System.out.print("Enter your "+(i+1)+" element ");
            array[i] = scanner.nextInt();
        }

        findMinAndIndex(array);
        printArray(createArraysOfOpposites(array));


    }

    public static int replaceEvenWithZeros(int[] arr){
        int counter=0;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                arr[i]=0;
                counter++;
            }
        }
        return counter;
    }

    public static void printArray(int[] arr){
        System.out.println("Your array is: ");
        System.out.print("{ ");
        for(int el: arr){
            System.out.print(el+" ");
        }
        System.out.print("}");
    }

    public static int[] createArraysOfOpposites(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i=0; i<arr.length; i++){
           newArr[i] = arr[i]*(-1);
        }
        return newArr;
    }

    public static void findMinAndIndex(int[] arr){
        int minValue=arr[0];
        int minValueIndex=0;
        for (int i=0; i< arr.length; i++){
            if (minValue>arr[i]){
                minValue=arr[i];
                minValueIndex=i;
            }
        }
        System.out.println("Your min value is "+minValue + ", index of value is"+minValueIndex);
    }
}