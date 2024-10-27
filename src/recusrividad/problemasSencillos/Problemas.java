package recusrividad.problemasSencillos;

public class Problemas {

    //12. Write a Java recursive method to find the maximum element in an array.
    public int findMax(int []numbers, int contador, int max) {

        if (contador == numbers.length) {
            return max;
        }

        if (numbers[contador] > max) {
            max = numbers[contador];
        }

        contador++;

        return findMax(numbers, contador, max);
    }

    //15. Write a Java recursive method to check if a given array is sorted in ascending order.
    public boolean isSortedAscending(int []numbers, int contador, int lastNumber) {

        if (contador == numbers.length) {
            return true;
        }

        if (numbers[contador] < lastNumber) {
            return false;
        }

        lastNumber = numbers[contador];
        contador++;

        return isSortedAscending(numbers, contador, lastNumber);

    }

    //9. Write a Java recursive method to find the sum of all odd numbers in an array.
    public int sumAllOdd(int []numbers, int contador, int sum) {

        if (contador == numbers.length) {
            return sum;
        }

        if (numbers[contador] % 2 == 1) {
            sum += numbers[contador];
        }

        return sumAllOdd(numbers, contador+1, sum);

    }

    //8. Write a Java recursive method to count the number of occurrences of a specific element in an array.
    public int countOccurrences(int []numbers, int contador, int element, int repeticiones) {

        if (contador == numbers.length) {
            return repeticiones;
        }

        if (element == numbers[contador]) {
            repeticiones += 1;
        }

        return countOccurrences(numbers, contador+1, element, repeticiones);

    }

    //6. Write a Java recursive method to reverse a given string.
    public String reverseString(String palabra, int contador, String res) {

        if (contador < 0) {
            return res;
        }

        res = res+palabra.charAt(contador);
        contador--;

        return reverseString(palabra, contador, res);

    }

    //4. Write a Java recursive method to check if a given string is a palindrome.
    public boolean isPalindrome(String palabra, int contador, String palindrome) {

        if (palabra.equals(palindrome)) {
            return true;
        }

        if (contador < 0) {
            return false;
        }

        palindrome += palabra.charAt(contador);


        return isPalindrome(palabra, contador-1, palindrome);
    }

    //14. Write a Java recursive method to find the sum of the digits of a given integer.
    public int sumDigits(int number, int suma) {

        if (number<=0) {
            return suma;
        }

        int digit = number%10;
        suma += digit;
        number = number/10;

        return sumDigits(number, suma);

    }

    //
    public int strCount(String str, String sub, int contador, int suma) {

        if (str.length() == contador) {
            return suma;
        }

        int max = contador - sub.length()-1;
        String palabra = str.substring(contador, sub.length()-1);
        if (palabra.equals(sub)) {
            suma++;
        }

        contador+=sub.length();

        return strCount(str, sub, contador, suma);

    }



}
