package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner (System.in);
        /*TheList link = new TheList();
        String[] purple = new String[20];
        String temp ="";
        System.out.println("Tree Scaling. Numerical values only, type 'n' to exit input");
        for(int i = 0; true; i++){
            System.out.println("Input an addition to the tree");
            temp = in.next();
            if (temp.equalsIgnoreCase("n")){
                break;
            }else{
                purple[i]=temp;
            }
        }


        link.main(purple);*/
        int root;
        System.out.println("Input root node");
        root = in.nextInt();
        BinaryTree tree = new BinaryTree(root);
        int num;
        while(true) {
            System.out.println("Input Leaf");
            num = in.nextInt();
            if(num == 0){
                break;
            }else{
                tree.addNode( num );
            }
        }
        System.out.println("LVR");
        tree.LVR();
        System.out.println("");
        System.out.println("RVL");
        tree.RVL();
        System.out.println("");
        System.out.println("VLR");
        tree.VLR();
        System.out.println("");
        System.out.println("VRL");
        tree.VRL();
        System.out.println("");
        System.out.println("LRV");
        tree.LRV();
        System.out.println("");
        System.out.println("RLV");
        tree.RLV();


    }

    private String[] clean(String[] purple){

        purple = Arrays.stream(purple)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);

        return purple;
    }
}
