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
public class Checking extends Account{
    //List properties specific to checking  account
  private  int debitCardNumber;
  private  int debitCardPin;
    //constructor for spcific checking account
    public Checking(String name,String sSN,double InitDeposit){
        super(name,sSN,InitDeposit);
    accountNumber="2"+accountNumber;
    setDebitCard();
    }
   // list any method specific checking account
private void setDebitCard(){
debitCardNumber =(int)(Math.random()*Math.pow(10, 12));
debitCardPin=(int)(Math.random()*Math.pow(10, 4));
}
    /**
     *
     */
        @Override
             public void showInfo()
       {
       super.showInfo();
System.out.println("Account Type: Saving"+
               "Saving Account Features"+
               "\n debit Card Number: "+debitCardNumber+
               "\n debit Card PIN: "+debitCardPin);
              }

    @Override
    public void setRate() {
rate=getBaseRate()*0.15;
    }
            
    
}
