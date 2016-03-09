/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlepractice;

import java.util.ArrayList;
import java.util.List;

 class TreeNode<T>{
    
    public T data;
    public TreeNode<T> parent;
    public ArrayList<TreeNode<T>> children;  // this list has every element of type TreeNode
    
   TreeNode(T data)  // while writing constructors for generic classes we do not use templates
   {
       this.data = data;
       this.children = new ArrayList<TreeNode<T>>();
   }
   
   public T getdata()
   {
       return this.data;
   }
   
   public void setParent(TreeNode<T> parent)
   {
       this.parent = parent;
   }
   
   public TreeNode<T> getParent()
   {
       return this.parent;
   }
   
   public void setChildren(ArrayList<TreeNode<T>> children)    // give every child a parent too
   {
       for(TreeNode<T> l : children) 
           l.setParent(this);
               
       this.children = children;
   }
   
   public ArrayList<TreeNode<T>> getChildren()
   {
       return this.children;
   }
   
   public void setChildAt(TreeNode<T> child, int index)
   {
       child.setParent(this);
       this.children.add(index, child);
   }
   
   public void setChild(TreeNode<T> child)
   {
       child.setParent(this);
       this.children.add(child);
   }
   
   public TreeNode<T> getChild(int index)
   {
       return this.children.get(index);
   }
   
   public void removeChildren()
   {
       this.children.clear();
   }
   
   public void removeChildAt(TreeNode<T> child, int index)
   {
       this.children.remove(index);
   }
   
   public void removeIfchild(TreeNode<T> node)
   {
       ArrayList<TreeNode<T>> l = this.getChildren();
       /*
       boolean status = l.contains(node);
       if(status)
           this.children.remove(node); */
       // Easy to remove a node
       
       l.remove(node);
   }
}

public class NAryTree<T> {
    
    public TreeNode<T> root;
    
    NAryTree( TreeNode<T> root)
    {
        this.root = root;
    }
    
       
    TreeNode<T> getRoot(TreeNode<T> root)
    {
        return this.root;
    }
    
    // search
    boolean find(TreeNode<T> node, T keynode)
    {
        /*  non recursive method
        for(TreeNode<T> l : node.getChildren())
          {
              if(l.getdata() == keynode)
                  return true;
              else
                  return false;
          }
          return true;
           */
        if(node.getdata() == keynode)
            return true;
        
        else
        {
            for(TreeNode<T> singlenode: node.getChildren())
            {
                if(find(singlenode,keynode));
                return true;
            }
            
            return false;
        }
          
      }
    
      ArrayList<TreeNode<T>> preorderTraversal(TreeNode<T> root, ArrayList<TreeNode<T>> preorder)
      {
          preorder.add(root);
          for(TreeNode<T> r : root.getChildren()) //Istead of giving a list of children, it gives me single child at a time
              preorderTraversal(r,preorder);
          return preorder;
      }
      
      ArrayList<TreeNode<T>> postorderTraversal(TreeNode<T> root, ArrayList<TreeNode<T>> postorder)
      {
          for(TreeNode<T> t: root.getChildren())
              postorderTraversal(t,postorder);
          
          postorder.add(root);
          return postorder;
      }
      
      public static void main(String[] args)
      {
          TreeNode<Integer> treenode = new TreeNode<Integer>(7);
          TreeNode<Integer> treenode1 = new TreeNode<Integer>(1);
          TreeNode<Integer> treenode2 = new TreeNode<Integer>(2);
          TreeNode<Integer> treenode3 = new TreeNode<Integer>(3);
          TreeNode<Integer> treenode4 = new TreeNode<Integer>(4);
          TreeNode<Integer> treenode5 = new TreeNode<Integer>(5);
          TreeNode<Integer> treenode6 = new TreeNode<Integer>(6);
          
          
          ArrayList<TreeNode<Integer>> list1 = new ArrayList<TreeNode<Integer>>();
          list1.add(treenode1);
          list1.add(treenode2);
          list1.add(treenode3);
          
          treenode.setChildren(list1);
          treenode2.setChild(treenode4);
          treenode2.setChildAt(treenode6,1); 
          treenode3.setChild(treenode5);
          
          NAryTree<Integer> nat = new NAryTree<Integer>(treenode);
          
          ArrayList<TreeNode<Integer>> postorder = new ArrayList<TreeNode<Integer>>();
          ArrayList<TreeNode<Integer>> preorder = new ArrayList<TreeNode<Integer>>();
          postorder = nat.postorderTraversal(treenode, postorder);
          preorder = nat.preorderTraversal(treenode, preorder);
          
          for(TreeNode<Integer> element : postorder)
                System.out.print("\t"+element.getdata());
          System.out.println();
          
          for(TreeNode<Integer> element : preorder)
                System.out.print("\t"+element.getdata());
          System.out.println();
      }
    
    
}
