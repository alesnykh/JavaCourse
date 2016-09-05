package module2;

/**
 * Created by alesnykh on 21/8/16.
 */
public class Task1 {

    static int[] myIntArray = {1200, -250, 2000, 500, 3200, 2, -133, 1488, 666, 13};
    static double[] myDoubleArray = {100500.00, 33.33333, 14.88, 22.401, 0.0000227, 1.0001, 13.444444, 12.1, -10.01, -122.1444};

    static int sum(int array[]) {
        int arraySum = 0;
        for (int index = 0; index < array.length; index++) {
            arraySum = arraySum + array[index];
        }
        return arraySum;
    }

    static double sum(double array[]) {
        double arraySum = 0;
        for (double i : array) arraySum += i;
        return arraySum;
    }

    static int min(int array[]) {
        int minInArray = array[0];
        int index = array.length - 1;
        while (index > 0) {
            if (array[index] < minInArray)
                minInArray = array[index];
            index--;
        }
        return minInArray;
    }

    static double min(double array[]) {
        int index = 1;
        double minInArray = array[0];
        while (index < array.length) {
            if (minInArray > array[index])
                minInArray = array[index];
            index++;
        }
        return minInArray;
    }

    static int max(int array[]) {
        int index = 1;
        int maxInArray = array[0];
        while (index < array.length) {
            if (maxInArray < array[index])
                maxInArray = array[index];
            index++;
        }
        return maxInArray;
    }

    static double max(double array[]) {
        double maxInArray = array[0];
        int index = 1;
        while (index < array.length) {
            if (array[index] > maxInArray)
                maxInArray = array[index];
            index++;
        }
        return maxInArray;
    }

    static int maxPositive(int array[]) {
        int index = 1;
        int maxPositiveInArray = array[0];
        while (index < array.length) {
            if (array[index] > maxPositiveInArray && array[index] >= 0)
                maxPositiveInArray = array[index];
            index++;
        }
        return maxPositiveInArray;
    }

    static double maxPositive(double array[]) {
        int index = 1;
        double maxPositiveInArray = array[0];
        while (index < array.length) {
            if (array[index] > maxPositiveInArray && array[index] >= 0)
                maxPositiveInArray = array[index];
            index++;
        }
        return maxPositiveInArray;
    }

    static int multiplication(int array[]) {
        int index = 1;
        int arrayMultiplication = array[0];
        while (index < array.length) {
            arrayMultiplication *= array[index];
            index++;
        }
        return arrayMultiplication;
    }

    static double multiplication(double array[]) {
        int index = 1;
        double arrayMultiplication = array[0];
        while (index < array.length) {
            arrayMultiplication *= array[index];
            index++;
        }
        return arrayMultiplication;
    }

    static int modulus(int array[]) {
        int modFirstAndLast;
        if (array[0] == 0 || array[array.length - 1] == 0)
            modFirstAndLast = 0;
        else
            modFirstAndLast = array[0] % array[array.length - 1];
        return modFirstAndLast;
    }

    static double modulus(double array[]) {
        double modFirstAndLast;
        if (array[0] == 0 || array[array.length - 1] == 0)
            modFirstAndLast = 0;
        else
            modFirstAndLast = array[0] % array[array.length - 1];
        return modFirstAndLast;
    }

    static int secondLargest(int array[]) {
//      sorting array by ascending order
        for (int mainIndex = 0; mainIndex < array.length-1; mainIndex++) {
            int intermediateIndex = mainIndex;
            int maxElement;
            for (int secondaryIndex = mainIndex+1; secondaryIndex < array.length; secondaryIndex++) {
                if (array[secondaryIndex] < array[intermediateIndex])
                    intermediateIndex = secondaryIndex;
            }
//          elements replacing block
            maxElement = array[intermediateIndex];
            array[intermediateIndex] = array[mainIndex];
            array[mainIndex] = maxElement;
        }
//      returns penultimate element of array
        return array[array.length-2];
    }

    static double secondLargest(double array[]) {
//      partially sorting array by descending order
        int mainIndex = 0;
        int secondaryIndex;
        int intermediateIndex;
        double maxElement;
        while (mainIndex < 2) {
            maxElement = array[mainIndex];
            intermediateIndex = mainIndex;
            for (secondaryIndex = mainIndex; secondaryIndex < array.length; secondaryIndex++) {
                if (maxElement < array[secondaryIndex]) {
                    maxElement = array[secondaryIndex];
                    intermediateIndex = secondaryIndex;
                }
            }
//          elements replacing block
            maxElement = array[mainIndex];
            array[mainIndex] = array[intermediateIndex];
            array[intermediateIndex] = maxElement;
            mainIndex++;
        }
//      returns second element of array
        return array[mainIndex-1];
    }

    public static void main(String[] args) {

        int sum1 = sum(myIntArray);
        double sum2 = sum(myDoubleArray);
        int min1 = min(myIntArray);
        double min2 = min(myDoubleArray);
        int max1 = max(myIntArray);
        double max2 = max(myDoubleArray);
        int maxPos1 = maxPositive(myIntArray);
        double maxPos2 = maxPositive(myDoubleArray);
        int multiply1 = multiplication(myIntArray);
        double multiply2 = multiplication(myDoubleArray);
        int mod1 = modulus(myIntArray);
        double mod2 = modulus(myDoubleArray);
        int secondLarg1 = secondLargest(myIntArray);
        double secondLarg2 = secondLargest(myDoubleArray);

        System.out.println("Sum of elements in int array = " + sum1);
        System.out.println("Sum of elements in double array = " + sum2);
        System.out.println();
        System.out.println("Min element in int array = " + min1);
        System.out.println("Min element in double array = " + min2);
        System.out.println();
        System.out.println("Max element in int array = " + max1);
        System.out.println("Max element in double array = " + max2);
        System.out.println();
        System.out.println("Max positive element in int array = " + maxPos1);
        System.out.println("Max positive element in double array = " + maxPos2);
        System.out.println();
        System.out.println("Multiplication of elements in int array = " + multiply1);
        System.out.println("Multiplication of elements in double array = " + multiply2);
        System.out.println();
        System.out.println("Modulus of first and last element in int array = " + mod1);
        System.out.println("Modulus of first and last element in double array = " + mod2);
        System.out.println();
        System.out.println("Second largest element in int array = " + secondLarg1);
        System.out.println("Second largest element in double array = " + secondLarg2);
    }

}