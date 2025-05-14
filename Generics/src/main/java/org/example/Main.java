package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList  < Integer>list = new ArrayList();
        list.add(6);
        list.add(2);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        for (int i =1;i < list.size();i++){
            int x= list.get(i);
            list.set(i,x);

        }

        }
    }
