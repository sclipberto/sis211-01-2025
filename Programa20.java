import javax.swing.*;
import java.awt.event.*;

public class Programa20 {
    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
    }
}

class Ventana extends JFrame {
    JButton btnA;
    JTextField txtA, txtB;

    Ventana() {
        setSize(300, 200);// pixels
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        txtA = new JTextField();
        txtA.setBounds(100, 20, 50, 25);
        getContentPane().add(txtA);

        txtB = new JTextField();
        txtB.setBounds(100, 60, 50, 25);
        getContentPane().add(txtB);

        btnA = new JButton("click me");
        btnA.setBounds(100, 100, 100, 25);
        getContentPane().add(btnA);

        btnA.addActionListener(e -> sumar());
    }

    public void sumar() {
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        // System.out.println(a + b);
        JOptionPane.showMessageDialog(null, "" + (a + b));
    }
}

// class ABC123 implements ActionListener {
// public void actionPerformed(ActionEvent e) {
// System.out.println("hola");
// }
// }
