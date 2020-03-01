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
public class Rectangle {
    int length;
    int width;
    
    Rectangle(int length,int width){
        this.length= length;
        this.width= width;
    }
    Rectangle(Rectangle rec){
        this.length= rec.length;
        this.width= rec.width;
    }
    
    public boolean isEqual(Rectangle rec){
        return this.length==rec.length&& this.width==rec.width;
    }
    public static boolean isEqual(Rectangle rec1,Rectangle rec2){
        return rec1.length==rec2.length&& rec1.width==rec2.width;
    }
    
    @Override
    public String toString(){
        return "length: "
                + this.length
                + " width: "
                + this.width;
    }
}
