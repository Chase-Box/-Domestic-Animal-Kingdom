/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animalkingdom;

/**
 *
 * @author chase
 */
public class Dog extends Animals{

    @Override
    public void makeSound() {
        System.out.println(Name + " " + "says:" + " "+ "bark!");
    }

    @Override
    public void eat() {
        System.out.println(Name + " " + "is eating its favorite food," + " " + favoriteFood + "!");
    }

    @Override
    public void sleep() {
        System.out.println(Name + " " + "is sleeping now." + " " + "ZZZZZZZzzzzzz.");
    }
}

