package com.sample.raj;

class Parent {
    private int privateNum = 5;
    protected int protectedNum = 10;
    public int publicNum = 15;
    final int finalNum = 20;

    private void privateMethod() {
        System.out.println("This is a private method in the Parent class.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method in the Parent class.");
    }

    public void publicMethod() {
        System.out.println("This is a public method in the Parent class.");
    }

    final void finalMethod() {
        System.out.println("This is a final method in the Parent class.");
    }
}

class Child extends Parent {
    public void accessParentVars() {
        System.out.println(protectedNum);
        System.out.println(publicNum); 
        System.out.println(finalNum); 
    }
    public void accessParentMethods() {
        protectedMethod(); 
        publicMethod(); 
        finalMethod(); 
    }
}

class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.accessParentVars();
        child.accessParentMethods();
    }
}
