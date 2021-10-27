/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Arrays;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;



/**
 *
 * @author yshrajsinhs
 */
public class TestUuserProfile {

    public static void main(String args[]) 
    {
        
    
     
        Scanner sc= new Scanner(System.in);  
           String usersName;   
           
           UserProfile obj=new UserProfile(null,null);
         
        
        System.out.print("Please enter your name: ");
        usersName = sc.next();
        obj.setUserID(usersName);
        System.out.println();
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
          for (int i = 0; i < genres.length;i++) 
	      { 		      
	          System.out.println(genres[i]); 		
	      }   
         System.out.print("select any one of this geners: ");
         String gener = sc.next();
         obj.setGenre(gener);
            System.out.print("UserProfile Created ");
    }

    

}
