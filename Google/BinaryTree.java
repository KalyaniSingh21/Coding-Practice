/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlepractice;

//import static javafx.scene.input.KeyCode.T;

import java.util.Queue;


/**
 *
 * @author Kalyani
 */
class Node{
    
    public Node ln,rn;
    public int data;
    
    
  
    Node(int n)
    {
        ln = null;
        rn = null;
        data = n;
    }
    
    /* Basic functions for seeting left and right nodes */
    
    void setRight(Node node)
    {
        rn = node;
    }
            
    void setLeft(Node node)
    {
        ln = node;
    }
    
    void setData(int n)
    {
        data = n;
    }
            
    Node getRight()
    {
        return rn;
    }
    
    Node getLeft()
    {
        return ln;
    }
            
    int getData()
    {
        return data;
    }    
   
}

class BinaryTree{
    
    public static Node root;
    
    BinaryTree(Node root)
    {
        this.root = root;
    }
    
    void insert(int data)
    {
        root = insert(root,data);
    }
    
    Node insert(Node root, int data)
    {
        if(root == null)
        {
            root = new Node(data);
            return root;
        }
        else if(data == root.getData())
        {
            root.ln = insert(root.ln,data);
            System.out.print("Data already exists");
            return root.ln;
        }
        
        else if (data < root.getData())
            {
                root.ln = insert(root.ln,data);
                System.out.print(root.getData()+"\t");
                return root.ln;
            }
            
        else
            {
                root.rn = insert(root.rn,data);  
                System.out.print(root.getData()+"\t");
                return root.rn;
            }
        
    }
    
    boolean search(Node root, int data)
    {
        if(data == root.getData())
        {            
            return true;
        }
        
        else if (data < root.getData())
        {
            search(root.getLeft(),data);
            return true;
        }
            
        else if (data > root.getData())
        {
            search(root.getRight(),data);  
            return true;
        }
        else
            return false;
            
        //return false;
    }
    
    
   static void preorder(Node root)
    {
        System.out.print("\t"+root.data);
        preorder(root.getLeft());
        preorder(root.getRight());
    }
   
    Node delete(Node root,int data)
    {
        if(root == null)
            return null;       
        else if(data < root.getData())  
           root.ln = delete(root.getLeft(),data);
        
        else if (data > root.getData())
            root.rn = delete(root.getRight(),data);
        
        else
        { 
            // Node with only left child
            if(root.getRight() == null)
                return root.getLeft();
            
            //Node with only right child
            else if(root.getLeft() == null)
                return root.getRight();
            
            else
            {
                //get data of rightmost node from left subtree
                int datanew = rightmostdata(root.getLeft());
                
                root.ln = delete(root.ln,datanew);
                
            }
            
        }
        return root;
       
                    
    }
    
    int rightmostdata(Node node)
    {
        int data = 0;
        while(node.getRight() != null)
           data = rightmostdata(node.getRight());
        return data;
    }
      
    void breadthfirstsearch(Node root)
   {
       Queue<Node> q = null;
       if(root!=null)
       {
           q.add(root);
           while(! q.isEmpty())
           {
               Node item = (Node) q.remove();
               System.out.print("/t"+item);
               if(item != null)
               {
                   if(root.ln != null)
                       q.add(root.ln);
                   if(root.rn !=null )
                       q.add(root.rn);
               }
           }
       }
       
       
   }
   


    public static void main(String[] args)
    {
        Node node = new Node(18);
               
        BinaryTree bn = new BinaryTree(node);
        bn.insert(5);
        bn.insert(10);
        bn.insert(8);
        bn.insert(12);
        bn.insert(8);
        
        bn.breadthfirstsearch(node);
        System.out.print(bn.search(node,1));
        
       // preorder(node);
        
        
    }   
    
}