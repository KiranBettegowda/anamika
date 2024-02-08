package demo;

import java.util.ArrayList;
import java.util.List;

public class  Program11 {
    public static boolean splitArray(int[] arr, int index, int sum1, int sum2, List<Integer> firstPart, List<Integer> secondPart) {
        if (index == arr.length) {
            return sum1 == sum2;
        }

        
        firstPart.add(arr[index]);
        if (splitArray(arr, index + 1, sum1 + arr[index], sum2, firstPart, secondPart)) {
            return true;
        }
       
        firstPart.remove(firstPart.size() - 1);

        
        secondPart.add(arr[index]);
        if (splitArray(arr, index + 1, sum1, sum2 + arr[index], firstPart, secondPart)) {
            return true;
        }
        
        secondPart.remove(secondPart.size() - 1);

        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {7, 0, 2, 5};

        List<Integer> firstPart = new ArrayList<>();
        List<Integer> secondPart = new ArrayList<>();
        
        if (splitArray(arr, 0, 0, 0, firstPart, secondPart)) {
            System.out.println("First part: " + firstPart);
            System.out.println("Second part: " + secondPart);
        } else {
            System.out.println("It is not possible to split the array into two equal-sum parts.");
        }
    }
}

