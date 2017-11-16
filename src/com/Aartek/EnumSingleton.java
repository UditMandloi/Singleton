package com.Aartek;

 enum EnumSingleton {
    INSTANCE;
    static int value;
    public static int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    
    public static void main(String[] args) {
        Enum singleton = EnumSingleton.INSTANCE;
        Enum singleton1 = EnumSingleton.INSTANCE;

        System.out.println(EnumSingleton.INSTANCE);
        System.out.println(singleton1);

        System.out.println(getValue());
        ((EnumSingleton) singleton).setValue(2);
        System.out.println(((EnumSingleton) singleton).getValue());
    }
}
