package company;

import java.util.Arrays;
import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int uniqueCount = removeDuplicates(nums);

        System.out.println("Total unique elements: " + uniqueCount);
        System.out.println("Unique elements:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }

        scanner.close();
    }


        public static int removeDuplicates(int[] nums) {

            
if (nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] finalArr = new int[n];
        int j = 0;

        Arrays.sort(nums);
        finalArr[0] = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] != finalArr[j]) {
                j++;
                finalArr[j] = nums[i];
            }
        }

        // Copy the unique elements back to the original array
        for (int i = 0; i <= j; i++) {
            nums[i] = finalArr[i];
        }

        // Print the unique elements
        for (int i = 0; i <= j; i++) {
            System.out.print(finalArr[i] + " ");
        }
        System.out.println(); // Add a newline after printing the unique elements.

        return j + 1; // Return the length of the modified array
    }
}
