package codigo.Vista;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
//import java.awt.*;
import java.awt.event.*;

public class Interfazp extends JFrame implements ActionListener{
    JButton btn01;
    JButton btn02;
    JButton btn03;
    JPanel panel01;
    JLabel texto1;

    public Interfazp(){
        setTitle("Consultas");
        texto1= new JLabel("Informes Reto 5");
        texto1.setBounds(120, 40, 200,30);
        texto1.setFont (new Font("Serif",Font.BOLD,20));
        add(texto1);
        setResizable(false);
        setSize(420,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btn01=new JButton("Informe 1");
        btn01.setBounds(150,100,100,30);
        btn01.addActionListener(this);
        add(btn01);

        btn02=new JButton("Informe 2");
        btn02.setBounds(150,150,100,30);
        btn02.addActionListener(this);
        add(btn02);

        btn03=new JButton("Informe 3");
        btn03.setBounds(150,200,100,30);
        btn03.addActionListener(this);
        add(btn03);

        panel01=new JPanel();
        panel01.setBackground(new Color(220, 176, 236 ));
        add(panel01);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource()==btn01){
            new Interfaz1();
        }
        if (e.getSource()==btn02){
            new Interfaz2();
        }
        if (e.getSource()==btn03){
            new Interfaz3();
        }
        
    }

}
