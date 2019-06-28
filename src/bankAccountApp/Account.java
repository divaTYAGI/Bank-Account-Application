/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankAccountApp;

/**
 *
 * @author Tejasv Pratap Tyagi
 */
public abstract class Account implements BaseRate{
    //List common properties for Savig and checking accounts
       private String name;
        private String sSN;
        private double balance;
        protected double rate;
        private static int index =10000;
        protected String accountNumber;
        //Constructore to set base properties and initilize  the account
        public Account(String name,String sSN,double InitDeposite){
            this.name=name;
            this.sSN=sSN;
            balance= InitDeposite;
            this.accountNumber= AccountNumber();
            
        }
        public abstract void setRate();
        //set account number
        private String AccountNumber(){
         String lastTwoofSSN= sSN.substring(sSN.length()-2,sSN.length());
         int uniqueId=index;
         int randomNumber= (int)(Math.random()*Math.pow(10, 3));
         return lastTwoofSSN+uniqueId+randomNumber;
        }
        public void compound(){
        double accountInterest = balance*(rate/100);
        balance=balance+accountInterest;
        System.out.println("Compound Interest: $"+accountInterest);
        printBalance();
        }
        //list common methods
        public void deposite(double amount){
        balance=balance+amount;
        System.out.println("Depositing $"+amount);
        printBalance();
        }
        public void withdraw(double amount){
        balance=balance-amount;
        System.out.println("Withdrawing $"+amount);
        printBalance();
        }
        public void transfer(String towhere, double amount){
        balance = balance+amount;
        System.out.println("Transfering $"+amount+" to "+towhere);
        printBalance();
        }
        public void printBalance(){
        System.out.println("Your balance now is: $"+balance);
        }
       public void showInfo()
       {
       System.out.println(
       "Name: "+name+
       "\nAccount Number: "+accountNumber+
       "\nBalance: "+balance+
               "\n Rate: "+rate+"%"
       );
       }    
}
