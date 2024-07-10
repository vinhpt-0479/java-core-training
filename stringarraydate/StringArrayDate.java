package stringarraydate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class StringArrayDate {

    public StringArrayDate() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // String Operations
        System.out.println("String Operations:");

        String str1 = "Hello, ";
        String str2 = "World!";
        String str3 = str1 + str2;
        System.out.println("Concatenation: " + str3);

        String str4 = "Java Programming";
        System.out.println("Length: " + str4.length());
        System.out.println("Substring: " + str4.substring(5, 16));
        System.out.println("Upper case: " + str4.toUpperCase());
        System.out.println("Lower case: " + str4.toLowerCase());
        System.out.println("Character at index 5: " + str4.charAt(5));
        System.out.println("Index of 'a': " + str4.indexOf('a'));
        System.out.println("Replace 'a' with 'o': " + str4.replace('a', 'o'));

        // Array Operations
        System.out.println("\nArray Operations:");

        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println("Copied array: " + Arrays.toString(arrayCopy));

        System.out.println("Array length: " + array.length);
        System.out.println("Element at index 3: " + array[3]);

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);

        // Comparing arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        boolean areArraysEqual = Arrays.equals(array1, array2);
        System.out.println("Array1 equals Array2: " + areArraysEqual);

        // Two-dimensional array
        System.out.println("\nTwo-dimensional Array Operations:");
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Two-dimensional array:");
        for (int[] row : twoDArray) {
            System.out.println(Arrays.toString(row));
        }

        // Date Operations
        // Using java.time API
        System.out.println("\nDate Operations:");
        
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Local Date: " + localDate);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedLocalDate = localDate.format(dateFormatter);
        System.out.println("Formatted Local Date: " + formattedLocalDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current Local DateTime: " + localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedLocalDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("Formatted Local DateTime: " + formattedLocalDateTime);
    }
}
