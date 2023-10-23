/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animalkingdom;

/**
 *
 * @author chase
 */
public class Animalkingdom {

    public static void main(String[] args) {
       Cat Cat1 = new Cat();
       
       Cat1.Type = "Mammal";
       Cat1.Breed = "American Shorttail";
       Cat1.Name = "Snickers";
       Cat1.Color = "Teal with Black Stripes";
       Cat1.numLegs = 4;
       Cat1.favoriteFood = "Tuna";
       
       System.out.print("\n");
       Cat1.makeSound();
       Cat1.eat();
       Cat1.sleep();
       
       Cat Cat2 = new Cat();
       
       Cat2.Type = "Mammal";
       Cat2.Breed = "American Curl";
       Cat2.Name = "Bobby";
       Cat2.Color = "White";
       Cat2.numLegs = 4;
       Cat2.favoriteFood = "Salmon";
       
       System.out.print("\n");
       Cat2.makeSound();
       Cat2.eat();
       Cat2.sleep();
       
       Dog Dog1 = new Dog();
       
       Dog1.Type = "Mammal";
       Dog1.Breed = "French Bulldog";
       Dog1.Name = "Trickster";
       Dog1.Color = "Black";
       Dog1.numLegs = 4;
       Dog1.favoriteFood = "Bacon";
       
       System.out.print("\n");
       Dog1.makeSound();
       Dog1.eat();
       Dog1.sleep();
       
       Bird Bird1 = new Bird();
       
       Bird1.Type = "Avian";
       Bird1.Breed = "Finch";
       Bird1.Name = "King Henry";
       Bird1.Color = "Red,Brown, and White";
       Bird1.numLegs = 2;
       Bird1.favoriteFood = "Jelly";
       
       System.out.print("\n");
       Bird1.makeSound();
       Bird1.eat();
       Bird1.sleep();
       
       Bird Bird2 = new Bird();
       
       Bird2.Type = "Avian";
       Bird2.Breed = "Finch";
       Bird2.Name = "King Henry the II";
       Bird2.Color = "Red,Brown, and White";
       Bird2.numLegs = 2;
       Bird2.favoriteFood = "Worms";
       
       System.out.print("\n");
       Bird2.makeSound();
       Bird2.eat();
       Bird2.sleep();
       
       Fish Fish1 = new Fish();
       
       Fish1.Type = "Fish";
       Fish1.Breed = "Goldfish";
       Fish1.Name = "Biter";
       Fish1.Color = "Bright Orange";
       Fish1.numLegs = 0;
       Fish1.favoriteFood = "Anything that falls into his aquarium";
       
       System.out.print("\n");
       Fish1.makeSound();
       Fish1.eat();
       Fish1.sleep();
       
    }
}


