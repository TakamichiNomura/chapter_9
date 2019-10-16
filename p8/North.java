package p8;
import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class North here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class North extends JPanel
{
    public North(){
        this.setBackground(Color.GRAY);
        this.setLayout(new FlowLayout());
        this.add(new Button("열기"));
        this.add(new Button("닫기"));
        this.add(new Button("나가기"));
        this.setOpaque(true);
    }
}
