import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Principal extends JFrame implements ActionListener{    
    
    JTextField textField;
    JTextArea area;

    Principal(){
        this.setVisible(true);
        this.setTitle("Prueba");
        this.getContentPane().setBackground(Color.YELLOW);
        this.setPreferredSize(new Dimension(700, 500));

        // finalizar programa al cerrar ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        JLabel titulo = new JLabel();
        titulo.setText("Texto de la ventana");
        titulo.setBounds(10, 10, 150, 30);        
        add(titulo);

        JButton boton = new JButton();
        boton.setText("Aceptar");
        boton.setBounds(10, 50, 100, 30);
        boton.addActionListener(this);
        
        add(boton);

        textField = new JTextField();
        textField.setBounds(10, 100, 150, 30);
        add(textField);

        area = new JTextArea();
        area.setBounds(10, 150, 100, 100);
        add(area);

        pack();

        //posición al centro
        this.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String texto = textField.getText();
        area.setText(texto);
    }

}
