package ru.itmo.java.basics.lab3;

public class FourMain {

    public static void main(String[] args){

        FourTree tree1 = new FourTree();
        System.out.println(tree1);

        FourTree tree2 = new FourTree(22,true,"Дуб");
        System.out.println(tree2);

        FourTree tree3 = new FourTree(56,"Берёза");
        System.out.println(tree3);
    }
}
