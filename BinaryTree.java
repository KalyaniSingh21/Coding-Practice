/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlepractice;

/**
 *
 * @author Kalyani
 */
public class BinaryTree {
    
    BinaryTree ln,rn,root;
    int data;
    
    
    BinaryTree()
    {
        root = null;
        ln = null;
        rn = null;
        data = 0;
    }
    
    BinaryTree(BinaryTree bt,int n)
    {
        root = bt;
        ln = null;
        rn = null;
        data = n;
    }
    
    /* Basic functions for seeting left and right nodes */
    
    void setRight(BinaryTree node)
    {
        rn = node;
    }
            
    void setLeft(BinaryTree node)
    {
        ln = node;
    }
    
    void setData(int n)
    {
        data = n;
    }
            
    BinaryTree getRight()
    {
        return rn;
    }
    
    BinaryTree getLeft()
    {
        return ln;
    }
            
    int getData()
    {
        return data;
    }
    
    /* Check if the tree is empty */
    
    boolean isEmpty() 
    {
        return (root==null);
    }
    
    void insert(int data)
    {
       root = insert(root,data);
    }
    
    
    /* check the working on notebook Start everything from the root */
   BinaryTree insert(BinaryTree root, int data)
    {
        /*
            root = insert(root,data);
            System.out.print(data+ "\t");
        */
        
        if (root == null)
        {
            root = new BinaryTree(root,data);   
            System.out.print(data+ "\t");
        }
           
        else if (data <= root.getData())
        {
            root.ln = insert(root.ln,data);
            System.out.print(data+ "\t");
        }
        else
        {
            root.rn = insert(root.rn,data);
            System.out.print(data+ "\t");
        }
        
        return root;
    }
   
  /* insert_left(BinaryTree node, int data)
   {
       if(data == node.getData())
               
   } */
   
   
   BinaryTree delete(BinaryTree root, int data)
   {
       BinaryTree previous,n,left,right;
       if(root.getData() == data)
       {
              left = root.getLeft();
              right = root.getRight();
              
              if(left == null && right == null)
              {
                  previous = null;
                  return null;
              }
              
              else if(left == null)
              {
                  previous = right;
                  return previous;
              }
              
              else if(right == null)
              {
                  previous = left;
                  return left;
              }
              
              else 
              {
                  previous = right;
                  while(previous.getLeft() != null)
                      previous = previous.getLeft();
                  previous.setLeft(left);
                  return right;
              }
       }
       
       else if (data < root.getData())
       {
          n = delete(root.getLeft(),data);
          root.setLeft(n);
       }
       
       else if (data > root.getData())
       {
           n = delete(root.getRight(), data);
           root.setRight(n);
       }
       
       return root;
   }
   
   boolean search(BinaryTree root,int data)
   {
       if(isEmpty())
       {
           System.out.print("Empty Tree");
           return false;
       }
       else if (data == root.getData())
           return true;
       else if(data < root.getData())
           root = root.getLeft();
       else if (data > root.getData())
           root = root.getRight();
       return false;
   }
   
   void inorder(BinaryTree root)
   {
       //BinaryTree left = root.getLeft();   // do not declare them because they wil be dynamic, changes with every itertion
       //BinaryTree right = root.getRight();
       //int data = (root.getData());
       
       inorder(root.getLeft());
       System.out.print(root.getData()+" ");
       inorder (root.getRight());
       return ;
   }
   
   void preorder(BinaryTree root) 
   {
       if(root != null)
       {
       System.out.print(root.getData()+" ");
       preorder(root.getLeft());
       preorder(root.getRight());
       }
   }
   
   void postorder(BinaryTree root)
   {
       postorder(root.getLeft());
       postorder(root.getRight());
       System.out.print(root.getData()+" ");
   }
   
   
  public static void main(String[] args)
  {
      BinaryTree bt = new BinaryTree();
     // BinaryTree bt = new BinaryTree(bt1,9);
      bt.insert(9);
      bt.insert(4);
      bt.insert(6);
      bt.insert(8);
      bt.insert(12);
      bt.insert(10);
      bt.insert(15);
      
      bt.preorder(bt);
  }
    
}
