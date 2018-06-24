package program3;

import java.util.Scanner;

public class Bank {
	 static Account ac = null;
    public static void main(String a[]){
        int n;   
           SavingsAccount  sa = null;
        CurrentAccount ca  = null;
        
          Scanner in = new Scanner(System.in);
     do{     
          
        System.out.println("Which type of account you wish to create:");

        System.out.println("1 : Saving Account");
         System.out.println("2 : Current Account");
 
         System.out.println("0 : Exit");
        n = in.nextInt();
 
       
          switch(n){
 
            case 1:
 
                   getDetails();   
                    System.out.println("Saving Account Created!!"); 
                  System.out.println("Enter the maximum limit to withdraw money:");
                    Scanner sc = new Scanner(System.in); 
                    double max_limit  = sc.nextDouble();
                   sa.max_limit( max_limit);
                           break;
 
             case 2:  
 
                 System.out.println("Do you Have Trading License?");
                if(checkTradingLicense())
                {
                     getDetails();
                    System.out.println("Current Account created");
                    break;

                }
                else{
                  System.out.println("Account Can't be created without License");
                  break;
                   }        
             case 0 : 
            	 System.out.println("Exit");
                       
        	}  
     }while(n!=0);
        
         int x;
          do{
        	  System.out.println("What do you want to do");   
              System.out.println("1 : deposite");
              System.out.println("2 : withdraw");
               System.out.println("3 : Check balance");
               System.out.println("0 : Exit");
               x=in.nextInt();
 
         switch(x)
 
         {
 
             case 1: 
 
                    System.out.println("Amount to be deposited:");
                    double amount = in.nextDouble();                  
 
                    ac.deposite(amount);  
 
                     break;
 
             case 2:
 
                 System.out.println("How much money you want to withdraw");
 
                amount = in.nextDouble();     
 
                if(n==1){
 
                 sa.withdraw(amount);            
                }
                 else               
                 ca.withdraw(amount);
                  
             case 3:                                
 
                  ac.display();
                  break;
 
             case 0:
 
                System.out.println("Exit");
 
                  
 
         }
 
        }while(n!=0);
 
 }
 
 static boolean checkTradingLicense()
 
      {
 
          char ch;
 
          System.out.println("Press 'Y' if yes otherwise press any other character"); 
 
         Scanner sc = new Scanner(System.in);
 
               ch = sc.nextLine().charAt(0);
 
          switch(ch)
           {
              case 'Y':
                    return true;  
 
             case 'y':
 
                   return true;
 
             default : 

                  return false;
          }
 
      } 
 
 static void getDetails()
 
 {
 
      System.out.println("Enter Name:"); 
      Scanner sc = new Scanner(System.in);
       String name = sc.next();
 
      System.out.println("Enter initial Amount:");
 
      double amount = sc.nextDouble();  
 ac = new Account(name,amount);  
 
        ac.generateAccountNumber();
 
}
 
 } 

