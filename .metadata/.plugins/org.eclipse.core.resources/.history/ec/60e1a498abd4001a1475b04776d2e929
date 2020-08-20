package com.practice;

public class CountObject {

}


//Java program Find Out the Number of Objects Created 
//of a Class 
class TestJava { 

 static int noOfObjects = 0; 

 // Instead of performing increment in the constructor 
 // instance block is preferred to make this program generic. 
 { 
     noOfObjects += 1; 
 } 

 // various types of constructors 
 // that can create objects 
 public TestJava() 
 { 
 } 
 public TestJava(int n) 
 { 
 }
 public TestJava(int n, int m) 
 { 
 }
 public TestJava(String s) 
 { 
 } 
 public TestJava(String s, String v) 
 { 
 }
 
 
 public static void main(String args[]) 
 { 
	 TestJava t1 = new TestJava(); 
	 TestJava t2 = new TestJava(5); 
	 TestJava t3 = new TestJava("GFG");
	 TestJava t4 = new TestJava(5,6); 
	 TestJava t5 = new TestJava("GFG","Test");

     // We can also write t1.noOfObjects or 
     // t2.noOfObjects or t3.noOfObjects 
     System.out.println(TestJava.noOfObjects); 
 } 
} 