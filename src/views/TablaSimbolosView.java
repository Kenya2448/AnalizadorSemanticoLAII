package views;

import utils.Simbolo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class TablaSimbolosView extends JFrame {


    private JTable tablaSimbolos;
    private Vector<Vector<String>> data;


    public TablaSimbolosView(ArrayList<Simbolo> listaTablaSimbolos) {

        setLocationRelativeTo(null);
        setSize(600,600);

        data = new Vector<>();
        llenarVector(listaTablaSimbolos);
        Vector<String> headers = new Vector<>(Arrays.asList("Identificador", "Tipo de dato", "Posición", "Valor"));
        this.tablaSimbolos = new JTable(data, headers);
        this.add(new JScrollPane(tablaSimbolos), BorderLayout.CENTER);


    }

    private void llenarVector(ArrayList<Simbolo> tablaSimbolosList) {
        Vector<String> row = new Vector<>();
        
        for(Simbolo simbolo : tablaSimbolosList) {
            row.add(0, simbolo.getIdentificador());
            row.add(1, simbolo.getTipoDato());
            row.add(2, simbolo.getPosicion() + "");
            row.add(3, simbolo.getValor());
            data.add(row);
            row = new Vector<>();
        }
        

    }
}
