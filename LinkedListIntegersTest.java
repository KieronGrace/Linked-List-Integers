//LinkedListIntegersTest.java demonstrates use of LinkedList and associated methods
//CSIS 312-D01
package linkedlistintegerstest;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListIntegersTest {

   public static void main(String[] args) {
      //output student and assignment
      System.out.println("Kieron Roberson – Assignment 05");
      
      //create linkedList of integer object references
      List<Integer> intList = new LinkedList<>();
      
      //display emply list
      System.out.printf("intList before populating with random numbers:%n%s%n%n", intList);
      
      //call method to populate and display intList
      popRandomInt(intList);
      
      //display populated list
      System.out.printf("intList initialized with 25 random numbers:%n%s%n%n", intList);
      
      //sort list
      Collections.sort(intList);
      
      //display sorted list
      System.out.printf("intList with contents sorted:%n%s%n%n", intList);
      
      //call method to sum contents and display
      System.out.printf("Sum total of intList contents: %d%n%n", getListSum(intList));
      
      //call method to get average of contents
      System.out.printf("Average value of intList contents: %.2f%n%n", getListAverage(intList));
   }
   
  private static void popRandomInt(List<Integer> list){
     //create random object
     Random intGenerator = new Random();
     
     System.out.println("Initializing...");
     //populate list
     for (int c = 1; c <= 25; c++) {
        list.add(intGenerator.nextInt(99)+1);
        System.out.println(list);
     }
     
     System.out.println();
  }
  
  public static int getListSum(List<Integer> list) {
     int sum = 0;
     
     Integer[] arr = list.toArray(new Integer[list.size()]);
     
      for (Integer arr1 : arr) {
         sum = sum + arr1;
      }
     
     return sum;
  }
  
  public static float getListAverage(List<Integer> list) {
     
     float average = getListSum(list) / (float)list.size();
     
     return average;
  }
}
