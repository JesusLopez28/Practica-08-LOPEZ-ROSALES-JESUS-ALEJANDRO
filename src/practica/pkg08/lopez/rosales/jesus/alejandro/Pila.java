/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg08.lopez.rosales.jesus.alejandro;

import javax.swing.JOptionPane;

public class Pila {

    public Nodo pila;

    public Pila() {
        pila = null;
    }

    public void push(int v) {
        Nodo nuevo = new Nodo(v);
        if (pila == null) {
            pila = nuevo;
        } else {
            Nodo aux = pila;
            pila = nuevo;
            nuevo.setNodoSiguiente(aux);
        }
        JOptionPane.showMessageDialog(null, "Valor agregado a la pila.");
    }

    public void recorrerPila() {
        Nodo aux = pila;
        if (pila == null) {
            JOptionPane.showMessageDialog(null, "La pila está vacía.");
        } else {
            String valores = "";
            while (aux != null) {
                valores += "Valor: " + aux.getValor() + "\n";
                aux = aux.getNodoSiguiente();
            }
            JOptionPane.showMessageDialog(null, valores);
        }
    }

    public void pop() {
        Nodo aux = pila;
        if (pila == null) {
            JOptionPane.showMessageDialog(null, "La pila está vacía.");
        } else {
            if (aux.getNodoSiguiente() == null) {
                pila = null;
            } else {
                pila = aux.getNodoSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Primer elemento eliminado de la pila.");
        }
    }

}
