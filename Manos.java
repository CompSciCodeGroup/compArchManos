/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manos;

/**
 *
 * @author mcclainhocklander, chase, justinhill, hunteranderson
 */
//package comp_arch;

import java.util.Random;


public class Manos {

   public static void getNums()
  {

//Global Variables
int ac = 56;   //Sets global variables to be modified at any point
int pc = 23;
int e = 1;
int dr = 64;
int ir = 324;
int mar = 0;
int ar; 
    
   //counter
int rand_pc = 0;
     int[][] memoryarray = new int[400][2];
     //loop counter 
     //int[] registerarray = new int{ 800, 400, 200, 100, 80, 40, 20, 10, 8, 4, 2, 1 };
     
     for(int i = 0; i<399; i++)
     {
       Random gen1 = new Random();

       memoryarray[i][0]= gen1.nextInt(15);      
     } 
     
     for(int i = 0; i<399; i++)
     {
       
         if(memoryarray[i][1] == 7)
         {
           Random gen1 = new Random();

           memoryarray[i][1] = gen1.nextInt(15);
         }
         else
         {
           Random gen1 = new Random();
           memoryarray[i][1] = gen1.nextInt(399);
         }
        
     }
    
    
     for(int i = rand_pc; i<5; i++)
     {
       
       
         ar = pc;
    System.out.println("\n"+ ir +"      " + ac + "      " + dr + "      " + pc + "      " + ar + "      "
      + mar + "          " + e + "      T0" );      //T0 output
    
    mar = memoryarray[pc][0] * 1000 + memoryarray[pc][1];
    ir = mar;
    pc++;//T1
    System.out.println( + ir + "      " + ac + "      " + dr + "      " + pc + "      " + ar + "      "
      + mar + "          " + e + "      T1" );       //T1 output

    ar = memoryarray[ar][1];
    mar = memoryarray[memoryarray[ar][1]][0] * 1000 + memoryarray[memoryarray[ar][1]][1];
    System.out.println( + ir + "      " + ac + "      " + dr + "      " + pc + "      " + ar + "      "
      + mar + "          " + e + "      T2" );       //T2 output
        
       
      
        //direct version of all memory functions
        
        if(memoryarray[ar][0] == 0)
         {
           //And memory word to AC
           
           System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
    + mar + "          " + e + "      T3"  )   ;    //T3 output
  dr = mar;
  System.out.println( ir + "      " + ac + "      " + dr + "      " + pc + "      " + ar + "      "
    + mar + "          " + e + "      T4" );        //T3 output
  ac = ac & dr;
  System.out.println(  ir + "      " + ac + "      " + dr + "      " + pc  + "      " + ar + "      "
    + mar + "          " + e + "      T5" )   ;     //T3 output
            
           
         }
         else if(memoryarray[ar][0] == 1)
         {
           //Add memory word to AC
          
                     System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
    + mar + "          " + e + "      T3"  )   ;    //T3 output
  dr = mar;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
  ac = dr + ac;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
           
         }
         else if(memoryarray[ar][0] == 2)
         {
           //Load memory word to AC
          
           System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
    + mar + "          " + e + "      T3"  )   ;    //T3 output        //T3 output
  dr = mar;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
  ac = dr;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
         }
         else if(memoryarray[ar][0] == 3)
         {
           //Store content of AC in memory
           
             System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
    + mar + "          " + e + "      T3"  )   ;    //T3 output        //T3 output
  mar = ac;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
            
           
         }
         else if(memoryarray[ar][0] == 4)
         {
           //Branch Unconditionally
           
             System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
  pc = ar;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
            
         }
         else if(memoryarray[ar][0] == 5)
         {
           //Branch and save return address
           
            System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
  mar = pc;
  ar++;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
  pc = ar;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
            
         }
         else if(memoryarray[ar][0] == 6)
         {
           //Increment and skip if zero
          
            System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
  dr = mar;
 System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
  dr++;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
  mar = dr;
  if (dr == 0)
  {
    pc++;
  }
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
           
         }
         else if(memoryarray[ar][0] == 8)
         {
          
            ar = memoryarray[ar][1];
      mar = memoryarray[memoryarray[ar][1]][0] * 1000 + memoryarray[memoryarray[ar][1]][1];
      
        System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
    + mar + "          " + e + "      T3"  )   ;    //T3 output
  dr = mar;
  System.out.println( ir + "      " + ac + "      " + dr + "      " + pc + "      " + ar + "      "
    + mar + "          " + e + "      T4" );        //T3 output
  ac = ac & dr;
  System.out.println(  ir + "      " + ac + "      " + dr + "      " + pc  + "      " + ar + "      "
    + mar + "          " + e + "      T5" )   ;     //T3 output
           
         }
         else if(memoryarray[ar][0] == 9)
         {
           
             ar = memoryarray[ar][1];
      mar = memoryarray[memoryarray[ar][1]][0] * 1000 + memoryarray[memoryarray[ar][1]][1];
      
       System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
    + mar + "          " + e + "      T3"  )   ;    //T3 output
  dr = mar;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
  ac = dr + ac;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T5"  )   ;    //T3 output
            
         }
         else if(memoryarray[ar][0] == 10)
         {
           
             ar = memoryarray[ar][1];
      mar = memoryarray[memoryarray[ar][1]][0] * 1000 + memoryarray[memoryarray[ar][1]][1];
      
     System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
    + mar + "          " + e + "      T3"  )   ;    //T3 output        //T3 output
  dr = mar;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
  ac = dr;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T5"  )   ;    //T3 output
            
         }
         else if(memoryarray[ar][0] == 11)
         {
           
             ar = memoryarray[ar][1];
      mar = memoryarray[memoryarray[ar][1]][0] * 1000 + memoryarray[memoryarray[ar][1]][1];
      
      System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
    + mar + "          " + e + "      T3"  )   ;    //T3 output        //T3 output
  mar = ac;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
            
         }
         else if(memoryarray[ar][0] == 12)
         {
           
             ar = memoryarray[ar][1];
      mar = memoryarray[memoryarray[ar][1]][0] * 1000 + memoryarray[memoryarray[ar][1]][1];
      
     System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
  pc = ar;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
            
         }
         else if(memoryarray[ar][0] == 13)
         {
           
             ar = memoryarray[ar][1];
      mar = memoryarray[memoryarray[ar][1]][0] * 1000 + memoryarray[memoryarray[ar][1]][1];
      
    System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
  mar = pc;
  ar++;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
  pc = ar;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T5"  )   ;    //T3 output
            
         }
         else if(memoryarray[ar][0] == 14)
         {
           
             ar = memoryarray[ar][1];
      mar = memoryarray[memoryarray[ar][1]][0] * 1000 + memoryarray[memoryarray[ar][1]][1];
      
       System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
  dr = mar;
 System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
  dr++;
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T5"  )   ;    //T3 output
  mar = dr;
  if (dr == 0)
  {
    pc++;
  }
  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T6"  )   ;    //T3 output
            
         }
         else if(memoryarray[ar][0] == 7)
         {
             if(memoryarray[ar][1] == 1)
               {
                 //Halt Computer and needs output like memory for each t step
                  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
                
                  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;  
                  break;//T3 output
               }
               else if(memoryarray[ar][1] == 2)
               {
                 //Skip next instruction if E is zero and needs output like memory for each t step
                  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T5"  )   ;    //T3 output
                 if(e == 0)
                 {
                   pc++;
                   break;
                 }
                 else
                     System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
                   + mar + "          " + e + "      T6"  )   ;    //T3 output
                             break;
                    

               }
               else if(memoryarray[ar][1] == 4)
               {
                 //Skip next instruction if AC is zero and needs output like memory for each t step
                  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
                 if(ac == 0)
                 {
                   pc++;
                   break;
                 }
                 else
                      System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
                   break;
                   
               }
               else if(memoryarray[ar][1] == 8)
               {
                 //Skip next instruction if AC negative and needs output like memory for each t step
                  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
                 if(ac < 0)
                 {
                   pc++;
                 }
                 else
                   break;
                    System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
               }
               else if(memoryarray[ar][1] == 10)
               {
                 //Skip Next Instruction if AC positive and needs output like memory for each t step
                  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
                 if(ac > 0)
                 {   
                   pc++;
                 }
                 else
                   break;
                    System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
               }
               else if(memoryarray[ar][1] == 20)
               {
                 //Increment AC and needs output like memory for each t step
                  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
                   //ac = Integer.parseInt(binxx[i]);
                   ac++; 
                    System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
               }
               else if(memoryarray[ar][1] == 40)
               {
                 //Circulate left AC and E and needs output like memory for each t step
                  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
                   //ac = Integer.parseInt(binxx[i]) + 1;
                    System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
               }
               else if(memoryarray[ar][1] == 80)
               {
                 //Circulate right AC and E and needs output like memory for each t step
                  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
                  // ac = Integer.parseInt(binxx[i]) >> 1;
                    System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
               }
               else if(memoryarray[ar][1] == 100)
               {
               //Complement E and needs output like memory for each t step
                System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
                   e = ~e;
                    System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
               }
               else if(memoryarray[ar][1] == 200)
               {
                 //Complement AC and needs output like memory for each t step
                  System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
                   ac = ~ac;
                    System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output
               }
               else if(memoryarray[ar][1] == 400)
               {
               //Clear E and needs output like memory for each t step
                System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T3"  )   ;    //T3 output
                   e = 0;
                    System.out.println( ir + "      " + ac+ "      " +dr + "      "+ pc + "      " + ar + "      "
+ mar + "          " + e + "      T4"  )   ;    //T3 output

               }
               else if(memoryarray[ar][1] == 800)
                 {
                 
                 //T3
                 System.out.println("AC     DR     PC     AR     M[AR]     IR     E");
     System.out.println(ac + "    " +dr+ "   " + pc + "      " + ar + "    " 
             + mar + "      " + ir + "     " + e);
     System.out.println("------------------------------------------------");
                   ac = 0;
                 
                 //T4
                 System.out.println("AC     DR     PC     AR     M[AR]     IR     E");
     System.out.println(ac + "    " +dr+ "   " + pc + "      " + ar + "    " 
             + mar + "      " + ir + "     " + e);
     System.out.println("------------------------------------------------");
               }
          }
         }
       }

     public static void main(String[] args) {
   
     System.out.println("First run: ");
     Manos.getNums();
     
     System.out.println("\nRepeat: ");
     Manos.getNums();
     
     System.exit(0);
   }
}