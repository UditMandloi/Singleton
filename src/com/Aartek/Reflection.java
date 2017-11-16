package com.Aartek;

public class Reflection {
	
	 static Object createObject(String className) {
	      Object object = null;
	      try {
	          Class classDefinition = Class.forName(className);
	          object = classDefinition.newInstance();
	      } catch (InstantiationException e) {
	          System.out.println(e);
	      } catch (IllegalAccessException e) {
	          System.out.println(e);
	      } catch (ClassNotFoundException e) {
	          System.out.println(e);
	      }
	      return object;
	   }
	
	
	public static void main(String[] args) {
		
		Reflection r = (Reflection) createObject("com.Aartek.Reflection");
	      System.out.println(r.toString());

	}

}
