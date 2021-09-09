/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.holamundo.maven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ropor
 */
public class Main {
    
    public static void main (String[] args) throws IOException{

        //exercise1();
        //exercise2();
        //exercise3();
    }
    
    private static List<Integer> getList() throws IOException{
    
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        
        List<Integer> numbers = new ArrayList<>();
        
        System.out.println("-- Min and Max value of 3 --");
        System.out.println("first Number:");
        String strNumber1 = reader.readLine();
        Integer number1 = Integer.parseInt(strNumber1);
        numbers.add(number1);
        
        System.out.println("second Number:");
        String strNumber2 = reader.readLine();
        Integer number2 = Integer.parseInt(strNumber2);
        numbers.add(number2);
        
        System.out.println("third Number:");
        String strNumber3 = reader.readLine();
        Integer number3 = Integer.parseInt(strNumber3);
        numbers.add(number3);
        
        return numbers;
    }
    
    /**
     * 
     * @param number
     * @return true if a number is par
     * 
     */
     private static boolean isCousinNumber(int number) {
        if (number%2!=0)
          return true;
        else
          return false;
    }
    
    /**
     * get Min and Max value of 3 numbers
     * @param listNumbers 
     */
    private static void exercise1() throws IOException{
        
        List<Integer> listNumbers = getList();
        
            System.out.println("----------------------------");
            System.out.println("\nAll numbers are ");

            for(Integer number:listNumbers) {
                System.out.println(number);
            }
            System.out.println("Minimum Value = " + Collections.min(listNumbers));
            System.out.println("Maximun Value = " + Collections.max(listNumbers));
            System.out.println("Exercise 1 it's over");

    }
    
    /**
     * get average number of 3 values 
     * @param listNumbers 
     */
    private static void exercise2() throws IOException{
        
        List<Integer> listNumbers = getList();
        
            System.out.println("----------------------------");
            System.out.println("\nAll numbers are ");

            for(Integer number:listNumbers) {
                System.out.println(number);
            }
            int sum = 0;
            for (int i: listNumbers) {
                sum += i;
            }
            
            Double numberAverage = Double.valueOf(sum) / 3;
            System.out.println("Total sum " + sum );
            System.out.println("Average number of the 3 Values = " + numberAverage);
            System.out.println("Exercise 2 it's over");
    }
    /**
     * printing all not pair numbers between 1 - 100
     */
    private static void exercise3(){
        
      for (int x=1;x<=100;x++) {
        if (isCousinNumber(x)){
          System.out.println(x);
        }
      }
    }
}

