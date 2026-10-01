import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Login{
    public static void main(String[] args) {
        JFrame frm = new JFrame("Tanvi");
        JTextField inp1 = new JTextField();
        JLabel lbl = new JLabel();
        inp1.setBounds(10, 100, 200, 30);
        lbl.setBounds(10, 200, 200, 30);
        JButton btn = new JButton("Login");
        btn.setBounds(10, 10, 100, 20);
        btn.setBackground(Color.LIGHT_GRAY);
        frm.add(btn);
        frm.add(lbl);
        frm.add(inp1);
        frm.setSize(400,400);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String input = inp1.getText();
              lbl.setText(input);
            }
        });

        frm.setLayout(null);
        frm.setVisible(true);
    }
}