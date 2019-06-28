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
public class Saving extends Account{
    
        //List properties specific to checking  account
   private int safetyDepositBoxId;
   private int safetyDepositBoxKey;
    //constructor for spcific checking account
    public Saving(String name,String sSN,double InitDeposit){
        super(name,sSN,InitDeposit);
    accountNumber="1"+accountNumber;
    setSafetyDepositeBox();
    }
private void setSafetyDepositeBox(){
safetyDepositBoxId = (int)(Math.random()*Math.pow(10, 3));
safetyDepositBoxKey =(int)(Math.random()*Math.pow(10, 4));
}
   // list any method specific checking account

    /**
     *
     */
        @Override
 public void showInfo()
       {
       super.showInfo();
       System.out.println("Account Type: Saving"+
               "Saving Account Features"+
               "\n safety Deposit Box ID: "+safetyDepositBoxId+
               "\n safety Deposit Box Key: "+safetyDepositBoxKey);
       }

    @Override
    public void setRate() {
       rate = getBaseRate()-0.25;
    }
}
