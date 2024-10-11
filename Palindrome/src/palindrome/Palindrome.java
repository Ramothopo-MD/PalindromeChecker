/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Desmond
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome...");
        String val=kb.nextLine();
        String reverse="";
        for (int i = val.length()-1; i >=0; i--) {
             reverse+=val.charAt(i);
            
            
    }
    if (reverse.equals(val)) {
                System.out.println(val+" is  a palindrome"); 
            }else  {
            System.out.println(val+" is not a palindrome");
        }
{}
}
}
