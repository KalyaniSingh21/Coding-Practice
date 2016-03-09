/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlepractice;

import java.util.HashMap;

/**
 *
 * @author Kalyani
 */

class TrieNode{
    char c;
    HashMap<Character,TrieNode> children = new HashMap<Character,TrieNode>();
    boolean isleaf;
    
    TrieNode()
    {}
    
    TrieNode(char c)
    {
            this.c = c;
    }
    
    
}
    
public class TrieTrees {
    
    TrieNode root;
    
    TrieTrees()
    {
        root = new TrieNode(); //create a root, no need to invoke trieNode, it will be invoked from here
    }
    
    void insert(String s)
    {
        HashMap<Character,TrieNode> children = root.children;
        
        for(int i=0; i< s.length();i++)
        {
            char c = s.charAt(i);
            TrieNode t;
            if(children.containsKey(c))
            {
                t = children.get(c);
                System.out.print("Entered gets");
            }
            else
            {
                t = new TrieNode(c);
                children.put(c,t);
                System.out.print("Entered puts");
            }
            
            children = t.children;
            
            if(i == s.length()-1)
                t.isleaf = true;
                
        }
        
        System.out.println();
        
    }
    
    TrieNode search(String word)
    {
        HashMap<Character,TrieNode> children = root.children;
        
        TrieNode t = null;
        for(int i = 0; i<word.length();i++)
        {
            char c = word.charAt(i);
            
            if(children.containsKey(c))
            {
              t = children.get(c);
              children = t.children;   
            }
            else
            {
                return null;
            }

        }
        return t;
    }
    
    boolean isLeaf(TrieNode t)
    {
        if(t.children == null)
            return true;
        else
            return false;
    }
    
    public static void main(String args[])
    {
       // TrieNode node = new TrieNode('e');  
        TrieTrees root = new TrieTrees();
        
        root.insert("trie");
       // root.insert("try");   // can only be invoked internally from TrieTrees
       // System.out.println(root.isLeaf(node));
        System.out.println(root.search("try"));

        
    }
    
    
}
