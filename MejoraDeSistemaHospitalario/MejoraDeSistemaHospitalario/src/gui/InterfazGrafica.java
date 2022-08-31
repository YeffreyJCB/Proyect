/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author windos
 */
public class InterfazGrafica extends JFrame{
    private JPanel contentPane;
    private JButton iniciarSesion;
    private JButton registrarse;
    private JPanel pnlSur;
    private JLabel lblTitulo;
    
    public InterfazGrafica(String titulo){
        super(titulo);
        initComponents();
        
    }
        
    private void initComponents(){
        setSize(1000,750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);        
        pnlSur = new JPanel();
        JButton btn1 =new JButton("Aceptar");
        iniciarSesion = new JButton("Iniciar Sesión");
	pnlSur.add(iniciarSesion);
        registrarse = new JButton("Registrarse");
	pnlSur.add(registrarse);
        contentPane.add(pnlSur, BorderLayout.SOUTH);
        
        lblTitulo = new JLabel("Nombre");
                contentPane.add(lblTitulo, BorderLayout.NORTH);
                
       
    }
    
    
}
