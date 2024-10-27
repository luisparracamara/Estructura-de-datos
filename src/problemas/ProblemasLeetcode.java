package problemas;

import arbolesBinarios.NodoArbol;

import java.util.*;
import java.util.stream.Collectors;

public class ProblemasLeetcode {

    public static int mayor = 0;

    public static void main(String[] args) {

        char matrix[][] = 
                {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        int matrix2[][] = {
                {0,1},
                {1,0}
        };

        int array[] = {3,2,3,1,2,4,5,5,6};
        String []ops = {"aa","a"};
        String string = "abqwertyuioplkjhgfdszxcvnm";

        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(6);

        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);

        treeNode.left.left.left = new TreeNode(1);


        System.out.println(problem("j-a-(b-c-a+(a-c-(-a)))"));
        //j = 1
        //a: -1+1 = 0 + 1 = 1
        //b: -1
        //c: +1 -1 = 0

    }

    public static String problem(String input) {

        Map<Character, Integer> map = new HashMap<>();
        map.put(input.charAt(0), 1);
        boolean pharentesisOperation = false;
        int posLastSign = -1;

        for (int i = 1; i < input.length(); i++) {

            char value = input.charAt(i);
            char lastSign = input.charAt(i-1);

            if (value == '(') {
                pharentesisOperation = true;
                posLastSign = i-1;
            }

            if (pharentesisOperation) {
                lastSign = input.charAt(posLastSign);
            }

            if (value == ')') {
                pharentesisOperation = false;
            }

            if (value != '(' && value != ')'  && value != '+' && value != '-') {

                if (lastSign == '+' && pharentesisOperation) {
                    if (map.containsKey(value)) {
                        if (isPositive(value, input.charAt(i-1))) {
                            map.put(value, map.get(value)+1);
                        } else {
                            map.put(value, map.get(value)-1);
                        }
                    } else {
                        if (isPositive(value, input.charAt(i-1))) {
                            map.put(value, 1);
                        } else {
                            map.put(value, -1);
                        }
                    }
                } else if (lastSign == '-' && pharentesisOperation) {

                    if (map.containsKey(value)) {
                        if (isPositive(value, input.charAt(i-1))) {
                            map.put(value, map.get(value)-1);
                        } else {
                            map.put(value, map.get(value)+1);
                        }
                    } else {
                        if (isPositive(value, input.charAt(i-1))) {
                            map.put(value, -1);
                        } else {
                            map.put(value, 1);
                        }
                    }

                } else {
                    if (map.containsKey(value)) {
                        if (isPositive(value, input.charAt(i-1))) {
                            map.put(value, map.get(value)+1);
                        } else {
                            map.put(value, map.get(value)-1);
                        }
                    } else {
                        if (isPositive(value, input.charAt(i-1))) {
                            map.put(value, 1);
                        } else {
                            map.put(value, -1);
                        }
                    }


                }
            }

        }

        System.out.println(map);

        return "";
    }

    public static boolean isPositive(char value, char sign) {
        return Character.isLetter(value) && sign != '-';
    }



        public static void preOrder(TreeNode root){
        if (root != null) {
            System.out.print(root.val+"-");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void imprimir(int[][] res){
        for(int i=0; i< res.length; i++){
            for(int j=0; j< res[i].length; j++){
                System.out.print( res[i][j] + "  " );
            }
            System.out.println();
        }
    }

}







