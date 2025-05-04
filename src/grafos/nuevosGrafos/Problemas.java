package grafos.nuevosGrafos;

import listasEnlazadas.Nodo;
import problemas.ListNode;
import problemas.TreeNode;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Array;
import java.sql.Time;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Problemas {

    public static void main(String[] args) {

//        int[][] edges = {
//                {1,4},
//                {5,6}
//        };

        int[][] edges = {
                {1, 3},
                {2, 6},
                {3, 7},
                {8, 10},
                {15, 18},
        };

        String s = "a good   example";
        //[10,2,-5]

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        ListNode listNode7 = new ListNode(7, null);
        ListNode listNode6 = new ListNode(6, listNode7);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode3 = new ListNode(4, listNode5);
        ListNode listNode2 = new ListNode(3, listNode3);
        ListNode listNode1 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode1);
        ListNode listNode = new ListNode(0, listNode4);

        char[][] matrix = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };


        char[] chars = {'a', 'b', 'c'};

        //[[2],[1,0],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]

        //int[] digits = {-2,10,-20,5,2,1,-5};

//        ListNode node7 = new ListNode(7, null);
//        ListNode node6 = new ListNode(4, node7);
//        ListNode node5 = new ListNode(6, node6);
//        ListNode node4 = new ListNode(5, node5);
//        ListNode node3 = new ListNode(3, node4);
//        ListNode node2 = new ListNode(1, node3);
//        ListNode node = new ListNode(2, node2);

        ListNode node1 = new ListNode(7);
        node1.next = new ListNode(7);
        node1.next.next = new ListNode(7);
        node1.next.next.next = new ListNode(7);
//        node1.next.next.next.next = new ListNode(4);
//        node1.next.next.next.next.next = new ListNode(5);
//        node1.next.next.next.next.next.next = new ListNode(6);

        //int[] digits = {1,2,3,4,3};
        int[] digits = {5,4,3,2,1};
        //Output: [2,3,4,-1,4]

        //1,2,6,3,4,5,6
//        ListNode node6 = new ListNode(6, null);
//        ListNode node5 = new ListNode(5, node6);
//        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(7, null);
        ListNode node62 = new ListNode(7, node3);
        ListNode node2 = new ListNode(7, node62);
        ListNode node = new ListNode(7, node2);


    }



    public static boolean validPalindrome(String s) {

        A a = new B();
        a.print();

        B b = new B();
        b.print();

        //B c = new A();

        Person p1 = new Person();
        p1.setAge(99);

        Person p2 = p1;
        p2.setAge(33);

        System.out.println(p1);
        System.out.println(p2);

        return true;
    }


}


class A {

    public A() {
        System.out.println("CONSTRUCTOR A");
    }

    public void print() {
        System.out.println("PRINT A");
    }
}

class B extends A {

    public B() {
        System.out.println("CONSTRUCTOR B");
    }

    public void print() {
        System.out.println("PRINT B");
    }
}

class Person {
    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
