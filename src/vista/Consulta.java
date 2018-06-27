/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.FiltroDao;
import java.awt.Container;
import java.util.ArrayList;
import javafx.scene.control.ComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Filtro;

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
        llenarTabla();
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
        container.add(insertar);
        container.add(eliminar);
        container.add(actualizar);
        container.add(buscar);
        container.add(table);
        
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
        insertar.setBounds(100, 250, ANCHOC, ALTOC);
        eliminar.setBounds(300, 250, ANCHOC, ALTOC);
        actualizar.setBounds(500, 250, ANCHOC, ALTOC);
        buscar.setBounds(700, 250, ANCHOC, ALTOC);
        table.setBounds(1, 400, 600, 200);
        table.add(new JScrollPane(resultados));
        
    }
    
    public void llenarTabla() {
        //coclocamos el tipo de dato que tendra nuestra columna
        //si es un dato booleano aparecera un checkbox en el JTable
        tm = new DefaultTableModel()
        {
            public Class<?> getColumnClass(int column){
                switch(column)
                {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;
                    case 3:
                        return String.class;
                    case 4:
                        return String.class;
                    case 5:
                        return String.class;
                    default:
                        return Boolean.class;
                
                }
            }
        };
        //agregamos las columnas que se mostraran con sus respectivos nombres
        tm.addColumn("Nombre");
        tm.addColumn("Director");
        tm.addColumn("Pais");
        tm.addColumn("Clasificacion");
        tm.addColumn("Año");
        tm.addColumn("En proyección");
        //Realizamos nuestra consulta a nuestra base de datos por medio de metodo redall
        FiltroDao fd = new FiltroDao();
        ArrayList<Filtro> filtros = fd.readAll();
        //Agregamos el resultado a nuestro JTable
        for(Filtro fi:filtros)
        {
            tm.addRow(new Object[]{fi.getNombre(),fi.getDirector(),fi.getPais(),fi.getClasificacion(),fi.getAnnio(),fi.isEnProyeccion()});
        }
        //le agregamos el modelo a nuestra tabla
        resultados.setModel(tm);   
    }    

}
