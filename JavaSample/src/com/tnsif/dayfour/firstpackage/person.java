package com.tnsif.dayfour.firstpackage;

public class person {
    public String name = "Hemaprabha";
    private int age = 21;
    protected String city = "Chennai";
    String college = "ABC College"; // default

    public void displayPublic() {
        System.out.println("Public method: Name = " + name);
    }

    private void displayPrivate() {
        System.out.println("Private method: Age = " + age);
    }

    protected void displayProtected() {
        System.out.println("Protected method: City = " + city);
    }

    void displayDefault() {
        System.out.println("Default method: College = " + college);
    }

    public void accessPrivate() {
        
        displayPrivate();
    }
}
