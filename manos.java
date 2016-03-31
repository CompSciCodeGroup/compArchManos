package comp_arch;

import java.util.Random;


public class manos {

   public static void getNums()
  {
     int[] addr1 = new int[399];
     int[] addr2 = new int[399];
     int[] addr3 = new int[399];
     int[] addr4 = new int[399];
     String[] bin_str1 = new String[399];
     String[] bin_str2 = new String[399];
     String[] bin_str3 = new String[399];
     String[] bin_str4 = new String[399];
     String[] hex_str1 = new String[399];
     String[] hex_str2 = new String[399];
     String[] hex_str3 = new String[399];
     String[] hex_str4 = new String[399];

     Random xlg = new Random();
     int ar = xlg.nextInt(400);
     int pc = xlg.nextInt(400);
     int dr = xlg.nextInt(400);
     int ac = xlg.nextInt(400);
     int ir = xlg.nextInt(400);
     int tr = xlg.nextInt(400);
     int e = 0;
     int temp = 0;
     int temp2 = 0;
     int temp3 = 0;
     int c = 0;
     int a = 0b1000;
     int aa = 0b0001;
     int yass = Integer.parseInt("1000", 2);
     
     for(int i = 0; i<399; i++)
     {
       Random gen1 = new Random();

       
       addr1[i]= gen1.nextInt(15);
      
     } 
     
     for(int i = 0; i<399; i++)
     {
       if(addr1[i] == 7)
       {
         //Generate random number from 0-12;
         
         if(temp == 0)
         {
           addr2[i] = 0;
           addr3[i] = 0;
           addr4[i] = 1;
         }
         else if(temp == 1)
         {
           addr2[i] = 0;
           addr3[i] = 0;
           addr4[i] = 2;
         }
         else if(temp == 2)
         {
           addr2[i] = 0;
           addr3[i] = 0;
           addr4[i] = 4;
         }
         else if(temp == 3)
         {
           addr2[i] = 0;
           addr3[i] = 0;
           addr4[i] = 8;
         }
         else if(temp == 4)
         {
           addr2[i] = 0;
           addr3[i] = 1;
           addr4[i] = 0;
         }
         else if(temp == 5)
         {
           addr2[i] = 0;
           addr3[i] = 2;
           addr4[i] = 0;
         }
         else if(temp == 6)
         {
           addr2[i] = 0;
           addr3[i] = 4;
           addr4[i] = 0;
         }
         else if(temp == 7)
         {
           addr2[i] = 0;
           addr3[i] = 8;
           addr4[i] = 0;
         }
         else if(temp == 8)
         {
           addr2[i] = 1;
           addr3[i] = 0;
           addr4[i] = 0;
         }
         else if(temp == 9)
         {
           addr2[i] = 2;
           addr3[i] = 0;
           addr4[i] = 0;
         }
         else if(temp == 10)
         {
           addr2[i] = 4;
           addr3[i] = 0;
           addr4[i] = 0;
         }
         else if(temp == 11)
         {
           addr2[i] = 8;
           addr3[i] = 0;
           addr4[i] = 0;
         }
          
       }
       
       else if(addr1[i] != 7)
       {
         Random gen1 = new Random();
         Random gen2 = new Random();
         Random gen3 = new Random();
         //generate random number between 0 and 3
         addr2[i] = gen1.nextInt(4);
         //generate random number between 0 and 9
         addr3[i] = gen2.nextInt(10);
         //generate random number between 0 and 9
         addr4[i] = gen3.nextInt(10);
       }
     }
     //store all values in two different string arrays: hex and bin
     for(int i = 0; i < 399; i++)
     {
       bin_str1[i] = Integer.toBinaryString(addr1[i]);
       bin_str2[i] = Integer.toBinaryString(addr2[i]);
       bin_str3[i] = Integer.toBinaryString(addr3[i]);
       bin_str4[i] = Integer.toBinaryString(addr4[i]);
       
       hex_str1[i] = Integer.toHexString(addr1[i]);
       hex_str2[i] = Integer.toHexString(addr2[i]);
       hex_str3[i] = Integer.toHexString(addr3[i]);
       hex_str4[i] = Integer.toHexString(addr4[i]);

       
     }
     
       Random num_var = new Random();
       String[] binxx = new String[399];
       String[] hexxx = new String[399];
       String bin_strx;
       String hex_strx;
       for(int i = 0; i < 399; i++)
       {
         bin_strx = ( bin_str1[i] + bin_str2[i] + bin_str3[i] + bin_str4[i]);
         hex_strx = ( hex_str1[i] + hex_str2[i] + hex_str3[i] + hex_str4[i]);
         binxx[i] = (bin_strx);
         hexxx[i] = (hex_strx);
         
       }
       /*
        * Create a for loop and make a hexxx array like binxx
        */
       
       Random pc_rand = new Random();
       int rand_pc = 0;
       rand_pc = pc_rand.nextInt(400);
       
       
       
     for(int i = rand_pc; i<5; i++)
     {
       
         if(addr1[i] == 7 && addr2[i] == 0 && addr3[i] == 0 && addr4[i] == 1)
         {
           //Halt Computer
           break;
         }
         else if(addr1[i] == 7 && addr2[i] == 0 && addr3[i] == 0 && addr4[i] == 2)
         {
           //Skip next instruction if E is zero
           if(e == 0)
           {
             pc++;
             break;
           }
           else
             break;
         }
         else if(addr1[i] == 7 && addr2[i] == 0 && addr3[i] == 0 && addr4[i] == 4)
         {
           //Skip next instruction if AC is zero
           if(ac == 0)
           {
             pc++;
             break;
           }
           else
             break;
         }
         else if(addr1[i] == 7 && addr2[i] == 0 && addr3[i] == 0 && addr4[i] == 8)
         {
           //Skip next instruction if AC negative
           if(ac < 0)
           {
             pc++;
           }
           else
             break;
         }
         else if(addr1[i] == 7 && addr2[i] == 0 && addr3[i] == 1 && addr4[i] == 0)
         {
           //Skip Next Instruction if AC positive
           if(ac > 0)
           {   
             pc++;
           }
           else
             break;
         }
         else if(addr1[i] == 7 && addr2[i] == 0 && addr3[i] == 2 && addr4[i] == 0)
         {
           //Increment AC
           ac = Integer.parseInt(binxx[i]);
           ac++;
         }
          else if(addr1[i] == 7 && addr2[i] == 0 && addr3[i] == 4 && addr4[i] == 0)
         {
           //Circulate left AC and E
            ac = Integer.parseInt(binxx[i]) << 1;
         }
         else if(addr1[i] == 7 && addr2[i] == 0 && addr3[i] == 8 && addr4[i] == 0)
          {
           //Circulate right AC and E
           ac = Integer.parseInt(binxx[i]) >> 1;
          }
         else if(addr1[i] == 7 && addr2[i] == 1 && addr3[i] == 0 && addr4[i] == 0)
         {
           //Complement E
           e = ~e;
         }
         else if(addr1[i] == 7 && addr2[i] == 2 && addr3[i] == 0 && addr4[i] == 0)
         {
           //Complement AC
           ac = ~ac;
         }
         else if(addr1[i] == 7 && addr2[i] == 4 && addr3[i] == 0 && addr4[i] == 0)
         {
           //Clear E
           e = 0;
         }
         else if(addr1[i] == 7 && addr2[i] == 8 && addr3[i] == 0 && addr4[i] == 0)
         {
           //Clear AC
           ac = 0;
         }
         else if(addr1[i] == 0 || addr1[i] == 8)
         {
           //And memory word to AC
           ar = Integer.parseInt(hexxx[ar]);
           dr = Integer.parseInt(binxx[ar]);
           ac = ac*dr; 
           
         }
         else if(addr1[i] == 1 || addr1[i] == 9)
         {
           //Add memory word to AC
           ar = Integer.parseInt(hexxx[ar]);
           dr = Integer.parseInt(binxx[ar]);
           ac = ac+dr;
         }
         else if(addr1[i] == 2 || addr1[i] == 10)
         {
           //Load memory word to AC
           ar = Integer.parseInt(hexxx[ar]);
           dr = Integer.parseInt(binxx[ar]);
           ac = dr; 
         }
         else if(addr1[i] == 3 || addr1[i] == 11)
         {
           //Store content of AC in memory
           hexxx[ar] = Integer.toString(ac);
           
         }
         else if(addr1[i] == 4 || addr1[i] == 12)
         {
           //Branch Unconditionally
           pc = ar;
         }
         else if(addr1[i] == 5 || addr1[i] == 13)
         {
           //Branch and save return address
           hexxx[ar] = Integer.toString(pc);
           ar = ar + 1;
           pc = ar;
         }
         else if(addr1[i] == 6 || addr1[i] == 14)
         {
           //Increment and skip if zero
           hexxx[ar] = Integer.toString(Integer.parseInt(hexxx[ar]) + 1);
           if(Integer.parseInt(hexxx[ar]) == 0)
           {
             pc++;
           }
         }
         
         
       }
     

     System.out.println("IR  AC  DR  AR  M[AR]  E");
     System.out.println(ir + "   " + ac + "   " + dr + "  " + ar + "   " + hexxx[ar] + "  " + e);
     System.out.println("--------------------");

  }

   
   public static void main(String[] args) {
     int[] addr1 = new int[399];
     int[] addr2 = new int[399];
     int[] addr3 = new int[399];
     int[] addr4 = new int[399];
     String[] bin_str1 = new String[399];
     String[] bin_str2 = new String[399];
     String[] bin_str3 = new String[399];
     String[] bin_str4 = new String[399];
     String[] hex_str1 = new String[399];
     String[] hex_str2 = new String[399];
     String[] hex_str3 = new String[399];
     String[] hex_str4 = new String[399];

     int ar = 314;
     int pc = 0;
     int dr = 0;
     int ac = 0;
     int ir = 0;
     int tr = 0;
     int e = 0;
     int temp = 0;
     int temp2 = 0;
     int temp3 = 0;
     int c = 0;
     Random num_var = new Random();
     String[] binxx = new String[399];
     String[] hexxx = new String[399];
     String bin_strx;
     String hex_strx;

     manos runprog = new manos();
     
     runprog.getNums();
     
     runprog.getNums();
     
     runprog.getNums();
     
     runprog.getNums();
     
     runprog.getNums();

     //Generate a random number between 0 and 399
     //Random genz = new Random();
     //temp3 = genz.nextInt(400);
     //Display random value
     
     
     
     System.exit(0);

   }
}