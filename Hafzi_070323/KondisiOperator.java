/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafzi_070323;

/**
 *
 * @author Hafzi
 */
public class KondisiOperator {
    public static void main (String[] args){
        
        String status = "";
        int grade = 80;
        
        status = (grade >= 60)?"Passed":"Fail";
        
        System.out.println(status);
    }
}
