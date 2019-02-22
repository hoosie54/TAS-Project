/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs310.tas.wrf;

/**
 *
 * @author Marcus Shell
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Debug A");
        TASDatabase db = new TASDatabase();
        db.getBadge("abc");
    }
    
}
