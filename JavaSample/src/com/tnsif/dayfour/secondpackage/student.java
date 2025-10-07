package com.tnsif.dayfour.secondpackage;

import com.tnsif.dayfour.firstpackage.person;

public class student extends person {
    public void showDetails() {
        
        System.out.println("Accessing public name: " + name);

        
        System.out.println("Accessing protected city: " + city);

        
 
        displayPublic();

        
        displayProtected();
    }
}
