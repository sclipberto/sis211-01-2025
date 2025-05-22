package Programa24;

import java.awt.*;
import javax.swing.*;

public class VentanaMain extends JFrame {
    JPanel panel;
    JButton btnAddProducto, btnListarProductos, btnRegistrarCompra, btnRegistrarVenta;
    JButton btnNuevaVenta;

    public VentanaMain() {
        setTitle("Inventario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        add(panel, BorderLayout.NORTH);

        Icon addProducto = new ImageIcon(new ImageIcon("D:\\git\\sis211-01-2025\\Programa24\\add.png").getImage()
                .getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        btnAddProducto = new JButton(addProducto);
        panel.add(btnAddProducto);

        Icon listProducto = new ImageIcon(new ImageIcon("D:\\git\\sis211-01-2025\\Programa24\\list.png").getImage()
                .getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        btnListarProductos = new JButton(listProducto);
        panel.add(btnListarProductos);

        Icon ventaIcon = new ImageIcon(new ImageIcon("D:\\git\\sis211-01-2025\\Programa24\\venta.jpg").getImage()
                .getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        btnNuevaVenta = new JButton(ventaIcon);
        panel.add(btnNuevaVenta);

        btnAddProducto.addActionListener(e -> new VentanaAddProducto().setVisible(true));
        btnListarProductos.addActionListener(e -> new VentanaListarProducto().setVisible(true));
        btnNuevaVenta.addActionListener(e -> new VentanaVenta().setVisible(true));
    }
}
