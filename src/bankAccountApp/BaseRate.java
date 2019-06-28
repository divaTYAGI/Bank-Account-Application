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
public interface BaseRate {
    //method that returns base rate
    default double getBaseRate(){
    return 2.5;
    }
    
}
