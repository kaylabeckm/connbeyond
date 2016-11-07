package acm.graphics;

import java.util.Iterator;

/**
 * Created by kayla on SundayNov/6/2016.
 */
public class LSys {

    GTurtle turt = new GTurtle();
    String entry;
    Double angle;
    int iterations;
    int count = 0;
    Double saveX = 0.0;
    Double saveY = 0.0;

    public LSys(){}

    public LSys(String lsys,double ang,int iter){
        iterations = iter;
        angle = ang;
        entry = lsys;
        parse(entry);
    }


    public void parse(String encoding) {
        while (count <= iterations) {
            for (int i = 0; i < encoding.length(); i++) {
                if (encoding.charAt(i) == 'F'){
                    turt.forward();
                    parse(encoding);
                } else if(encoding.charAt(i) == '+'){
                    turt.right(angle);
                } else if(encoding.charAt(i) == '-'){
                    turt.left(angle);
                } else if(encoding.charAt(i) == '['){
                    saveX = turt.getX();
                    saveY = turt.getY();
                } else if(encoding.charAt(i) == ']'){
                    turt.setLocation(saveX,saveY);
                }
            }
        }
    }
}
