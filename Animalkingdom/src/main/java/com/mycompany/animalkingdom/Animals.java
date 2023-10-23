/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animalkingdom;

/**
 *
 * @author chase
 */
public abstract class Animals{
    String Type;
    String Breed;
    String Name;
    String Color;
    byte numLegs;
    String favoriteFood;
    
    public abstract void makeSound();
    
    public abstract void eat();
    
    public abstract void sleep(); 
}
