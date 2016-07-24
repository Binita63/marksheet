/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Bini
 */
public class StudentMarksheet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
         
       while(true){
         
         
         System.out.println(" 1. enter students");
         System.out.println(" 2. enter subjects");
         System.out.println(" 3. enter marks");
         System.out.println(" 4. exit");
         int choice =input.nextInt();
         Marks m= new Marks();
          
       //stdnum =0;
         switch(choice){
             
             case 1:{ 
                 
                 m.enterStudents();
             break;
                 
         
         
         }
         case 2:{ 
                 
                 m.enterSubjects();
             break;
                 
         
         
         }
         case 3:{ 
                 
                 m.enterMarks();
             break;
                 
         
         
         }
         case 4:{ 
                 
                System.exit(0);
                break;
         
         
         }
         }
         System.out.println("Do you want to continue[Y/N]?");
            String ch=input.next();
            if(ch.equalsIgnoreCase("n")){
                System.exit(0);
            }
       } 
        
    
    }
    public static void marksheet(){
       Marks m = new Marks();
    
        
    m.enterMarks();
    m.enterStudents();
    m.enterSubjects();
    
    }
    


            
    
}
