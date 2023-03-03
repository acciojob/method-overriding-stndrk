package com.driver;

public class Main{
    public static class A{
        public String meth(){return "Invoking method from class A";}
    }
    public static class B extends A{
        public String meth(){return "Invoking method from class B";}
    }
    public static void main(String[] args) {
		B temp=new B();
        String res=temp.meth();
        System.out.print(res);
	}
}