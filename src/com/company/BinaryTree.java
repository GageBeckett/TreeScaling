package com.company;

public class BinaryTree {

    private int data;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int num) {
        this.data = num;
        this.left = null;
        this.right = null;
    }

    public void addNode(int num) {
        if (num < this.data) {
            if (this.left != null) {
                this.left.addNode(num);
            } else {
                this.left = new BinaryTree(num);
            }

        } else {
            if (this.right != null) {
                this.right.addNode(num);
            } else {
                this.right = new BinaryTree(num);
            }

        }
    }
    // Visit the node first, then left and right sub-trees
    //VLR
    public void VLR() {
        System.out.print( this.data + ", " );
        if( this.left != null ) {
            this.left.VLR();
        }
        if( this.right != null ) {
            this.right.VLR();
        }
    }
    public void VRL() {
        System.out.print( this.data + ", " );
        if( this.right != null ) {
            this.right.VRL();
        }
        if( this.left != null ) {
            this.left.VRL();
        }
    }
    // Visit left sub-tree, then node and then, right sub-tree
    //LVR
    public void LVR() {
        if( this.left != null ) {
            this.left.LVR();
        }
        System.out.print( this.data + ", " );
        if( this.right != null ) {
            this.right.LVR();
        }
    }
    public void RVL(){
        if(this.right!=null){
            this.right.RVL();
        }
        System.out.print(this.data + ", ");
        if(this.left != null){
            this.left.RVL();
        }
    }
    // Visit left sub-tree, then right sub-tree and then the node
    //LRV
    public void LRV() {
        if( this.left != null ) {
            this.left.LRV();
        }
        if( this.right != null ) {
            this.right.LRV();
        }
        System.out.print( this.data + ", " );
    }
    public void RLV() {
        if( this.right != null ) {
            this.right.RLV();
        }
        if( this.left != null ) {
            this.left.RLV();
        }
        System.out.print( this.data + ", " );
    }

}

