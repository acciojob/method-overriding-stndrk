package com.driver;
class A{
    String meth(){
        return "Invoking method from class A";
    }
 }
 class B extends A{
    String meth(){
        return "Invoking method from class B";
    }
 }
 
public class Main
{
	public static void main(String[] args) {
		B temp=new B();
        String res=temp.meth();
        System.out.print(res);
	}
}