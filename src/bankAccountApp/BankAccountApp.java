/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankAccountApp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tejasv Pratap Tyagi
 */
public class BankAccountApp {
    public static void main(String[] args) throws IOException{
        List<Account> accounts= new LinkedList<Account>();
 
        //Read csv file then create new account based on data
        String file="E:\\Java program\\NewBankAccounts.csv";
        List<String[]> newAccountHolders= utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders){
        System.out.println("New Account");
        String name= accountHolder[0];
        String sSN= accountHolder[1];
        String accountType= accountHolder[2];
        double InitDeposit =Double.parseDouble(accountHolder[3]);
        System.out.println(name+" "+sSN+" "+accountType+" $"+InitDeposit);
        if(accountType.equals("Savings")){
        accounts.add(new Saving(name,sSN,InitDeposit));
        }else if(accountType.equals("Checking")){
        accounts.add(new Checking(name,sSN,InitDeposit));
        }else
            System.out.println("Error Reading Account Type");
        }
        for(Account acc: accounts){
        System.out.println("*******");
        acc.showInfo();}
    }
    
}
