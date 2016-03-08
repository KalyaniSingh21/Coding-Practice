/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlepractice;

import java.util.List;

public class TreeNode<T>{
    
    private T data;
    private TreeNode<T> parent;
    private List<TreeNode<T>> children;  // this list has every element of type TreeNode
    
   public void setdata(T data)
   {
       this.data = data;
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
   
   public void setChildren(List<TreeNode<T>> children)
   {
       this.children = children;
   }
   
   public List<TreeNode<T>> getChildren()
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
}

public class NAryTree {
    
    
    
}
