package javaapplication5;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;
public class hotelCode {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Deque<String> list=new ArrayDeque<>();
                list.add("apple");
                list.add("app");
                list.add("appl");
                list.add("apple");
                list.addFirst("gowtham");
               list.addLast("Guna");
               Boolean s=list.contains("appdfg");
              String a=list.peekFirst();
              String b=list.peekLast();
              System.out.println(s);
               System.out.println(b);
                    System.out.println(list);
        }
}
