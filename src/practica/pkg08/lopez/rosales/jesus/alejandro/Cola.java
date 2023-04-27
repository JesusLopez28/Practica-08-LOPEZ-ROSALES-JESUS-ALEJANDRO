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
        JOptionPane.showMessageDialog(null, "Valor " + v + " encolado.", "Bien", JOptionPane.INFORMATION_MESSAGE);
    }

    public void recorrerCola() {
        Nodo aux = cola;
        if (cola == null) {
            JOptionPane.showMessageDialog(null, "La cola está vacía.", "Error", JOptionPane.WARNING_MESSAGE);
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
        int valor = 0;
        if (cola == null) {
            JOptionPane.showMessageDialog(null, "La cola está vacía.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            if (aux.getNodoSiguiente() == null) {
                valor = aux.getValor();
                cola = null;
            } else {
                valor = aux.getValor();
                cola = aux.getNodoSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Elemento con valor " + valor + " eliminado de la cola.", "Bien", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
