package test123;

class B extends A{
static{
System.out.print("a");
}
public B(){
System.out.print("b");
} 
}

class A{
	static	{
			System.out.print("1");
			}
	public A()	{
				System.out.print("2");
				}
}



public class Hello{
public static void main(String[] ars){
A ab = new B(); //��д��ִ�е��˴��Ľ��: 
ab = new B(); //��д��ִ�е��˴��Ľ��:
}
}

