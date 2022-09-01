/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author windos
 */
public class InterfazGrafica extends JFrame{
    private JPanel contentPane;
    private JButton btnRegistrarse;
    private JPanel pnlNorte;
    private JPanel pnlBtnR;
    private JButton btnMedico;
    private JLabel nombreHospital;
    
    public InterfazGrafica(String titulo){
        super(titulo);
        initComponents();
    }
        
    private void initComponents(){
        setSize(800,750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);
        
        pnlNorte = new JPanel();
        contentPane.add(pnlNorte, BorderLayout.NORTH);
        btnRegistrarse = new JButton("Registro");
        pnlNorte.add(btnRegistrarse); 
        btnMedico = new JButton("Medicos");
        pnlNorte.add(btnMedico);
        btnRegistrarse.setSize(300,300);
        pnlNorte.setBackground(Color.gray);
        pnlBtnR = new JPanel();
        contentPane.add(pnlBtnR);
        pnlBtnR.setBackground(Color.black);
        
        pnlBtnR.setLayout(null);
        nombreHospital = new JLabel();
        nombreHospital.setText("Hospital El paciente feliz");
        nombreHospital.setBounds(10,10,450,45);
        nombreHospital.setForeground(Color.red);     
        nombreHospital.setOpaque(false);        
        nombreHospital.setFont(new Font("cooper black",0,35));
        pnlBtnR.add(nombreHospital);     
    }  
}
