/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Container;
import javafx.scene.control.ComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LN710Q
 */
public class Consulta extends JFrame {
    
    public JLabel lblNombre, lblDirector, lblPais, lblClasificacion, lblAnnio, lblEnProyeccion;
    public JTextField nombre, director, pais, annio;
    public JComboBox clasificacion;
    public JCheckBox en_proyeccion;
    public JButton buscar, eliminar, insertar, actualizar;
    public JPanel table;
    public JTable resultados;
    public DefaultTableModel tm;
    public Container container = getContentPane();
    
    private static final int ANCHOC = 130, ALTOC = 25;

    public Consulta() {
    
        super("Cinepolix");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        agregarLabels();
        formulario();
        container.add(lblNombre);
        container.add(lblDirector);
        container.add(lblPais);
        container.add(lblClasificacion);
        container.add(lblAnnio);
        container.add(lblEnProyeccion);
        container.add(nombre);
        container.add(director);
        container.add(pais);
        container.add(annio);
        container.add(clasificacion);
        container.add(en_proyeccion);
        
        setSize(900,500);
        //eventos();
    }

    private void agregarLabels() {
        
        lblNombre = new JLabel("Nombre:");
        lblDirector = new JLabel("Director:");
        lblPais = new JLabel("Pais:");
        lblClasificacion = new JLabel("Clasificación:");
        lblAnnio = new JLabel("Año:");
        lblEnProyeccion = new JLabel("En proyección:");
        
        lblNombre.setBounds(200, 80, ANCHOC, ALTOC);
        lblDirector.setBounds(200, 120, ANCHOC, ALTOC);
        lblPais.setBounds(220, 160, ANCHOC, ALTOC);
        lblClasificacion.setBounds(500, 80, ANCHOC, ALTOC);
        lblAnnio.setBounds(500, 120, ANCHOC, ALTOC);
        lblEnProyeccion.setBounds(500, 160, ANCHOC, ALTOC);
    }

    private void formulario() {
        
        nombre = new JTextField();
        director = new JTextField();
        pais = new JTextField();
        annio = new JTextField();
        en_proyeccion = new JCheckBox();
        clasificacion = new JComboBox();
        insertar = new JButton("Insertar");
        eliminar = new JButton("Eliminar");
        actualizar = new JButton("Actualizar");
        buscar = new JButton("Buscar");
        table = new JPanel();
        resultados = new JTable();
        
        clasificacion.addItem("G");
        clasificacion.addItem("PG");
        clasificacion.addItem("14A");
        clasificacion.addItem("18A");
        clasificacion.addItem("R");
        clasificacion.addItem("A");
        
        nombre.setBounds(260, 80, ANCHOC, ALTOC);
        director.setBounds(260, 120, ANCHOC, ALTOC);
        pais.setBounds(260, 160, ANCHOC, ALTOC);
        annio.setBounds(590, 120, ANCHOC, ALTOC);
        clasificacion.setBounds(590, 80, ANCHOC, ALTOC);
        en_proyeccion.setBounds(590, 160, ANCHOC, ALTOC);
        table.setBounds(1, 400, WIDTH, HEIGHT);
        
    }
    
    
    

    

}
