package p8;
import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 * Write a description of class Center here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Center extends JPanel
{
    public Center(){
        this.setBackground(Color.WHITE);
        JLabel j = new JLabel("*");
        Vector<Integer> v_x = new Vector<Integer>();
        Vector<Integer> v_y = new Vector<Integer>();
        for(int i = 0;i<10;i++){
            v_x.add((int)(Math.random()*200+50));
            v_y.add((int)(Math.random()*200+50));
            j.setBounds(v_x.get(i),v_y.get(i),5,5);
            this.add(j);
            this.setOpaque(true);
            System.out.println("Vector("+v_x.get(i)+","+v_y.get(i)+")");
        }
    }
}
