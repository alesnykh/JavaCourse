package module2;

/**
 * Created by alesnykh on 21/8/16.
 */
public class Task1 {

    static int[] myIntArray = {1200, -250, 2000, 500, 3200, 2, -133, 1488, 666, 13};
    static double[] myDoubleArray = {100500.00, 33.33333, 14.88, 22.401, 0.0000227, 1.0001, 13.444444, 12.1, -10.01, -122.1444};

    static int sum(int array[]) {
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            s = s + array[i];
        }
        return s;
    }

    static double sum(double array[]) {
        double s = 0;
        for (double i : array) s += i;
        return s;
    }

    static int min(int array[]) {
        int m = array[0], i = array.length - 1;
        while (i >= 0) {
            if (array[i] < m)
                m = array[i];
            i--;
        }
        return m;
    }

    static double min(double array[]) {
        int i = 0, last = array.length - 1;
        double m = array[last];
        while (i < array.length) {
            if (m > array[i])
                m = array[i];
            i++;
        }
        return m;
    }

    static int max(int array[]) {
        int i = 0;
        int m = array[0];
        while (i < array.length) {
            if (m < array[i])
                m = array[i];
            i++;
        }
        return m;
    }

    static double max(double array[]) {
        double m = array[0];
        int i = 0;
        while (i < array.length) {
            if (array[i] > m)
                m = array[i];
            i++;
        }
        return m;
    }

    static int maxPositive(int array[]) {
        int i = 0, mp = array[0];
        while (i < array.length) {
            if (array[i] > mp && mp >= 0)
                mp = array[i];
            i++;
        }
        return mp;
    }

    static double maxPositive(double array[]) {
        int i = 0;
        double mp = array[0];
        while (i < array.length) {
            if (array[i] > mp && mp >= 0)
                mp = array[i];
            i++;
        }
        return mp;
    }

    static int multiplication(int array[]) {
        int i = 1, ml = array[0];
        while (i < array.length) {
            ml *= array[i];
            i++;
        }
        return ml;
    }

    static double multiplication(double array[]) {
        int i = 1;
        double ml = array[0];
        while (i < array.length) {
            ml *= array[i];
            i++;
        }
        return ml;
    }

    static int modulus(int array[]) {
        int md = 0;
        md = array[0] % array[array.length - 1];
        return md;
    }

    static double modulus(double array[]) {
        double md = 0;
        md = array[0] % array[array.length - 1];
        return md;
    }

    static int secondLargest(int array[]){
        for (int i = 0; i < array.length-1; i++){
            int k = i, m;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[k])
                    k = j;
            m = array[k];
            array[k] = array[i];
            array[i] = m;
        }
        return array[array.length-2];
    }

    static double secondLargest(double array[]){
        int j = 0, i, k;
        double m;
        while (j < 2) {
            m = array[j]; k = j;
            for (i = j; i < array.length; i++)
                if (m < array[i]) {
                    m = array[i];
                    k = i;
                }
            m = array[j];
            array[j] = array[k];
            array[k] = m;
            j++;
        }
        return array[j-1];
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
