package pila;

import java.util.Arrays;
import java.util.Stack;

public class MonotonicStack {

    public static void main(String[] args) {

        //int[] nums = {2, 1, 2, 4, 3};
        int[] nums = {1,2,3,4,3};
        System.out.println(Arrays.toString(monotonicStackIncreasing(nums)));
    }

    public static int[] monotonicStackIncreasing(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);

        //stack guarda posiciones no valores
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {

            //mientra la pila no esté vacía y no se viole el monotonic stack
            //ya sea menor o mayor
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int index = stack.pop();
                result[index] = i;
            }

            stack.push(i);
        }

        return result;
    }

}
