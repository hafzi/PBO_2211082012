/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hafzi_080323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Hafzi
 */
public class GetInputFromKeyboard {
     public static void main(String[] args){
         BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
         String name ="";
         System.out.print("please enter your name:");
         try{
             name = dataIn.readLine();
            }catch( IOException e ){
             System.out.println("ERROR!");
         }
         System.out.println("hello "+name+" !");
         
         
     }
}
