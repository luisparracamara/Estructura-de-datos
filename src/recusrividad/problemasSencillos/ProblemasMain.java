package recusrividad.problemasSencillos;

public class ProblemasMain {


    public static void main(String[] args) {
        Problemas problemas = new Problemas();

        //int arr[] = {5,3,100,22,5,87};
        int arr[] = {2,3,4,3,7,2};
        String palabra = "elley";

        //System.out.println(problemas.findMax(arr, 0, 0));
        //System.out.println(problemas.isSortedAscending(arr, 0, -1));
        //System.out.println(problemas.sumAllOdd(arr, 0, 0));
        //System.out.println(problemas.countOccurrences(arr, 0, 3, 0));
        //System.out.println(problemas.reverseString(palabra, palabra.length()-1, ""));
        //System.out.println(problemas.isPalindrome(palabra, palabra.length()-1, ""));
        //System.out.println(problemas.sumDigits(1234509, 0));
        System.out.println(problemas.strCount("catcowcat", "cat", 0, 0));

    }

}
