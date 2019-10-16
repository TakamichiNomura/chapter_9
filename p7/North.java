package p7;
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
        JLabel j = new JLabel("수식입력:");
        j.setFont(new Font("수식입력:",Font.BOLD,26));
        this.add(j);
        this.add(new JTextField(16));
        this.setOpaque(true);
    }
}
