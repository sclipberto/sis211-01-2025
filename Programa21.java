import javax.swing.*;
import java.awt.*;

public class Programa21 {
    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
    }
}

class Ventana extends JFrame {
    JTextField txtA, txtB;
    JLabel lblA, lblB;
    JButton btnOk, btnClose;

    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(3, 2, 10, 10));
        txtA = new JTextField();
        txtB = new JTextField();
        lblA = new JLabel("Valor de A:");
        lblB = new JLabel("Valor de B:");
        btnOk = new JButton("Sumar");
        btnClose = new JButton("Cerrar");

        getContentPane().add(lblA);
        getContentPane().add(lblB);
        getContentPane().add(txtA);
        getContentPane().add(txtB);
        getContentPane().add(btnOk);
        getContentPane().add(btnClose);
        btnOk.addActionListener(e -> sumar());
        btnClose.addActionListener(e -> System.exit(0));
    }

    public void sumar() {
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        JOptionPane.showMessageDialog(null, "" + (a + b));
    }
}