/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlepractice;
/* composition example */
import java.io.*;

class FileClass{
    String filename = "filename.txt";
    String date_modified;
    
    enum permissions{read, write, execute};
    String readFile(String filename) throws FileNotFoundException, IOException
    {
        String fin=null;
        BufferedReader br = new BufferedReader(new FileReader(filename));
        for(String s = br.readLine(); s!= null; s= br.readLine())
             fin = fin + s;
        return fin;
    }
    
    void writeFile() throws FileNotFoundException, IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Kalyani/Documents/NetBeansProjects/"
                + "GooglePractice/src/googlepractice/Accessfile.txt"));
        bw.write("Kalyani Singh");
        bw.write(109088050);
    }
            
}

class Directory {
     
    FileClass f;
    
    Directory() throws IOException /* always throw exception for reading a file */
    {
        f=new FileClass();
        f.writeFile();
        System.out.print(f.readFile("C:/Users/Kalyani/Documents/NetBeansProjects/"
                + "GooglePractice/src/googlepractice/Accessfile.txt"));
        
    }  
   
}

public class OOD_File_System{
    public static void main(String[] args) throws IOException  /* here also, even if you are calling the function*/
    {
        Directory d = new Directory();
        
    }
}


