/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan53.rabbit;

/**
 *
 * @author PC
 */
public class Rabbit extends Animal{
    private String name, color;

    public Rabbit(String name,boolean vegatarian, String food, int legs,String color) {
        super(vegatarian, food, legs);
        this.name = name;
        this.color = color;
        
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    
    
    
}
