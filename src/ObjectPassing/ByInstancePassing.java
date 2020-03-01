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
public class ByInstancePassing {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle(7,4);
        Rectangle rec1= new Rectangle(rec);
        Rectangle rec2= new Rectangle(9,3);
        
        if(rec.isEqual(rec1)){
            System.out.println("rec is equal to rec1");
        }
        else{
            System.out.println("rec is not equal to rec1");
        }
        if(rec.isEqual(rec2)){
            System.out.println("rec is equal to rec2");
        }
        else{
            System.out.println("rec is not equal to rec2");
        }
    }
}
