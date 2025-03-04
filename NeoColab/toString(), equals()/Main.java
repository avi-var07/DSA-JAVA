import java.util. Scanner;
class Utility {
    // Method to find the maximum value in an array
    public int findMax(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE; // Handle empty array case
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

class ArrayUtils extends Utility {
    private int[] array;

    // Constructor to initialize the array
    public ArrayUtils(int[] array) {
        this.array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
    }

    // Overriding toString method to display the array elements
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i < array.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    // Overriding equals method to compare two arrays
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ArrayUtils that = (ArrayUtils) obj;
        if (this.array.length != that.array.length) return false;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != that.array[i]) return false;
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayUtils utils = new ArrayUtils(array);

        System.out.println(utils.findMax(array));

        scanner.close();
    }
}