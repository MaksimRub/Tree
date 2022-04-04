package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Собака");
        treeSet.add("Волк");
        treeSet.add("Филин");
        treeSet.add("Лисица");
        treeSet.add("Попугай");
        treeSet.add("Белка");
        treeSet.add("Коза");
        treeSet.add("Коза");
        System.out.println(treeSet);
        System.out.println(treeSet.contains("Медведь"));
        System.out.println(treeSet.floor("Медведь"));
        System.out.println(treeSet.ceiling("Медведь"));
        System.out.println(treeSet.ceiling("Лисица"));
        System.out.println(treeSet.subSet("К","Т"));
        System.out.println(treeSet.subSet("Коза","Собака"));

    }
}
