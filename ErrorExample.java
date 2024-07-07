//package com.example;

public class ErrorExample {

	public static void main(String[] args) {
		test(2);

	}
	 // method of this class
    public static void test(int i)
    {
        // No correct as base condition leads to
        // non-stop recursion.
        if (i == 0)
            return;
        else {
        	System.out.println("calling recursion"+i);
            test(i-1);
        }
    }

}
//test(2)-->test(1)-->test(0)
