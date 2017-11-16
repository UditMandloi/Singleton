package com.Aartek;

public class Singleton implements Cloneable{

	private static Singleton singleton=null;
	private Singleton () {
		
	}

	
	public static Singleton getInstance()  {
			if(singleton==null) {
			singleton =new Singleton();
			}
		return singleton;
	}
	
	
	public Object clone() throws CloneNotSupportedException {
		   throw new CloneNotSupportedException(); 
	}
	public static void main(String[] args) throws Exception {
		 	
		System.out.println(getInstance());
		System.out.println(getInstance());
		Singleton s=(Singleton) getInstance().clone();		// making object by clone
		System.out.println(s);

/*		Class classDefinition = Class.forName("com.Aartek.Singleton");
        Object object = (Singleton) classDefinition.newInstance();
        System.out.println(object);
*/	}
}
