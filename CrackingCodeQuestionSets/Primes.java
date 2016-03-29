import java.io.*;
import java.util.*;

/*
 * Primes.upTo(5) => [2, 3, 5]
 * Primes.upTo(10) => [2, 3, 5, 7]
 * Primes.upTo(11) => [2, 3, 5, 7, 11]
 * Primes.upTo(-1) => []
 */

public class Primes {
  
  public static ArrayList<Integer> upTo(int num){
    if(num < 0) return new ArrayList<Integer>();
    
    ArrayList<Integer>arr = new ArrayList<Integer>();
    
    for(int i = 2; i <= num; ++i){
      boolean c = isPrime(i);
      if(c == true){
        arr.add(i);
      }         
    }
    return arr;
    
  }
  
  //helper function to check to see if its prime
  public static boolean isPrime(int num){
    // TODO 1 and itself
    if(num < 2 ) return false;
      
    for(int i = 2; i < num; ++i){
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
    
}


class Solution {
  public static void assertArrayListEquals(ArrayList<Integer> actual, ArrayList<Integer> expected) {
    if(expected.equals(actual)){
      System.out.println("PASS!");
    } else {
      System.out.println("Expected: " + expected);
      System.out.println("Actual: " + actual);

    }
  }
    
    // if expected is the same as actual (same values same location)
      // print "PASS"
    // else
      // print "Expected: [4, 5]"
      // print "Actual: [1, 2, 3]"

  
  
  public static void main(String[] args) {
    System.out.println(Primes.upTo(2));
     
    assertArrayListEquals(Primes.upTo(-1), new ArrayList<Integer>());
    
    ArrayList<Integer>arr = new ArrayList<Integer>();
    arr.add(2);
    arr.add(3);
    arr.add(5);
    assertArrayListEquals(Primes.upTo(5),arr);

    ArrayList<Integer>arr1 = new ArrayList<Integer>();
    arr1.add(2);
    arr1.add(3);
    arr1.add(5);
    arr1.add(7);
    assertArrayListEquals(Primes.upTo(10),arr1);
    
    ArrayList<Integer>arr2 = new ArrayList<Integer>();
    arr2.add(2);
    arr2.add(3);
    arr2.add(5);
    arr2.add(7);
    arr2.add(11);    
    assertArrayListEquals(Primes.upTo(11),arr2);    
  }
}
