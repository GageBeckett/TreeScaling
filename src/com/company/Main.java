package com.company;

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
        System.out.println("Pre Order");
        tree.traversePreOrder();
        System.out.println("In Order");
        tree.traverseInOrder();
        System.out.println("Post Order");
        tree.traversePostOrder();
    }

    private String[] clean(String[] purple){

        purple = Arrays.stream(purple)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);

        return purple;
    }
}
