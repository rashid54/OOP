/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPassing;

/**
 *
 * @author rashid
 */
public class ByConstructor {
    public static void main(String[] args) {
        Rectangle rec1= new Rectangle(7,4);
        Rectangle rec2= new Rectangle(rec1);
        
        System.out.println("rec1:");
        System.out.println(rec1);
        System.out.println("rec2");
        System.out.println(rec2);
    }
}
