package p8;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class Myapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Myapp extends JFrame
{
    public Myapp(){
        super("여러 개의 패널을 가진 프레임");
        setSize(300,300);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.setLayout(new BorderLayout());
        this.add(new North(),BorderLayout.NORTH);
        this.add(new Center(),BorderLayout.CENTER);
        this.add(new South(),BorderLayout.SOUTH);
        
    }

    public static void main(String[] args){
        new Myapp();
    }
}
