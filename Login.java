import java.awt.Color;

import javax.swing.*;

class Login{
    public static void main(String[] args) {
        JFrame frm = new JFrame("Tanvi");
        JButton btn = new JButton("Login");
        btn.setBounds(10, 10, 100, 20);
        btn.setBackground(Color.LIGHT_GRAY);
        frm.add(btn);
        frm.setSize(400,400);
        frm.setLayout(null);
        frm.setVisible(true);
    }
}