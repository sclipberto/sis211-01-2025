package Programa23;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class VentanaMain extends JFrame {
    JPanel panel;
    JButton btnAdd, btnList;

    public VentanaMain() throws IOException {
        setTitle("Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());// ventana

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Image ico = ImageIO.read(new File("./add.bmp"));
        Icon addIcon = new ImageIcon("D:\\git\\sis211-01-2025\\Programa23\\add.png");
        // btnAdd = new JButton("", new ImageIcon(ico));
        btnAdd = new JButton(addIcon);
        btnList = new JButton("list");
        panel.add(btnAdd);
        panel.add(btnList);

        getContentPane().add(panel, BorderLayout.NORTH);
        btnAdd.addActionListener(e -> {
            VentanaPersona vp = new VentanaPersona();
            vp.setVisible(true);
        });
        btnList.addActionListener(e -> {
            new VentanaLista().setVisible(true);
        });
    }
}
