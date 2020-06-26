package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
       List<Integer> list = new ArrayList<Integer>();
       System.out.println("Enter Numbers in list : ");
       for(int i=0; i < n; i++)
           list.add(sc.nextInt());
       for(int j=0; j < list.size(); j++)
           if(list.get(j)==42)
               break;
           else
               System.out.println(list.get(j));
    }
}

