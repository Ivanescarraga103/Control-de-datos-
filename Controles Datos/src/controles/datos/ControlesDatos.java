/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controles.datos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author azcar
 */
public class ControlesDatos extends JFrame implements ActionListener {

   
    private JLabel lbl11,lblN,lblG,lblE,lblT,lblCE,lblC;
    private JTextField txtN,txtCE;
    private JButton btnG,btnL;
    private JToggleButton tbtnM,tbtnF;
    private JSpinner spnEdad;
    private JFormattedTextField ftxtTel;
    private JPasswordField pfl;
    private JTextArea txtal;
    private String genero;
    
    public ControlesDatos() throws ParseException{
        
    lbl11= new JLabel("Ingresa lo siguiente");
    lbl11.setBounds(15,50,80,30);
    add(lbl11);
    
    lblN=new JLabel("Nombre:  ");
    lblN.setBounds(15,50,80,30);
    add(lblN);
    
    txtN=new JTextField("");
    txtN.setBounds(100,50,120,30);
    add(txtN);
    
    lblG=new JLabel("Genero:   ");
    lblG.setBounds(15,90,80,30);
    add(lblG);
    
    tbtnM=new JToggleButton("M");
    tbtnM.setBounds(100,90,50,30);
    tbtnM.addActionListener(this);
    add(tbtnM);
    
    tbtnF=new JToggleButton("F");
    tbtnF.setBounds(155,90,50,30);
    tbtnF.addActionListener(this);
    add(tbtnF);
    
    lblE=new JLabel("Edad:   ");
    lblE.setBounds(15,130,80,30);
    add(lblE);
    
    spnEdad=new JSpinner();
    spnEdad.setBounds(100,130,80,30);
    spnEdad.setModel(new SpinnerNumberModel(1,1,100,1));
    add(lblE);
    
    lblT=new JLabel("Telefono:  ");
    lblT.setBounds(15,170,80,30);
    add(lblT);
    
    ftxtTel= new JFormattedTextField();
    ftxtTel.setBounds(100,170,100,30);
     try {
     ftxtTel.setFormattedFactory(new DefaultFormattedFacotry(new MaskFormatter("############")));
     
     }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class DefaultFormattedFacotry {

        public DefaultFormattedFacotry(MaskFormatter maskFormatter) {
        }
    }
    
}
