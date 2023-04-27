/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg08.lopez.rosales.jesus.alejandro;

import javax.swing.JOptionPane;

public class Cola {

    public Nodo cola;

    public Cola() {
        cola = null;
    }

    public void encolar(int v) {
        Nodo nuevo = new Nodo(v);
        if (cola == null) {
            cola = nuevo;
        } else {
            Nodo aux = cola;
            while (aux.getNodoSiguiente() != null) {
                aux = aux.getNodoSiguiente();
            }
            aux.setNodoSiguiente(nuevo);
        }
        JOptionPane.showMessageDialog(null, "Valor encolado.");
    }

    public void recorrerCola() {
        Nodo aux = cola;
        if (cola == null) {
            JOptionPane.showMessageDialog(null, "La cola está vacía.");
        } else {
            String valores = "";
            while (aux != null) {
                valores += "Valor: " + aux.getValor() + "\n";
                aux = aux.getNodoSiguiente();
            }
            JOptionPane.showMessageDialog(null, valores);
        }
    }

    public void desencolar() {
        Nodo aux = cola;
        if (cola == null) {
            JOptionPane.showMessageDialog(null, "La cola está vacía.");
        } else {
            if (aux.getNodoSiguiente() == null) {
                cola = null;
            } else {
                cola = aux.getNodoSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Primer elemento eliminado de la cola.");
        }
    }

}
