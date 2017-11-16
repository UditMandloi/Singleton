package com.Aartek;

public class DoubleCheckedLockingSingleton{
    private static volatile DoubleCheckedLockingSingleton INSTANCE;
 
    private DoubleCheckedLockingSingleton(){}
 
    public static DoubleCheckedLockingSingleton getInstance(){
        if(INSTANCE == null){
           synchronized(DoubleCheckedLockingSingleton.class){
               //double checking Singleton instance
               if(INSTANCE == null){
                   INSTANCE = new DoubleCheckedLockingSingleton();
               }
           }
        }
        return INSTANCE;
    }
    
    public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException {
    	System.out.println(getInstance());
    /*	DoubleCheckedLockingSingleton s= (DoubleCheckedLockingSingleton) getInstance().clone();
    	System.out.println(s);
*/
    	Class classDefinition = Class.forName("com.Aartek.DoubleCheckedLockingSingleton");
        Object object = (Singleton) classDefinition.newInstance();
        System.out.println(object);
    	}
}

