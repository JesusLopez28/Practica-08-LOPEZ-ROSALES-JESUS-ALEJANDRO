/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg08.lopez.rosales.jesus.alejandro;

public class Pila {

    public Nodo pila;

    public Pila() {
        pila = null;
    }

    public String push(int v) {
        Nodo nuevo = new Nodo(v);
        if (pila == null) {
            pila = nuevo;
            return "El elemento " + v + " ha sido insertado en la pila.";
        } else {
            Nodo aux = pila;
            pila = nuevo;
            nuevo.setNodoSiguiente(aux);
            return "El elemento " + v + " ha sido insertado en la pila.";
        }
    }

    public String recorrerPila() {
        Nodo aux = pila;
        String elementos = "";
        if (pila == null) {
            elementos = "La pila está vacía.";
        } else {
            while (aux != null) {
                elementos += "Valor: " + aux.getValor() + "\n";
                aux = aux.getNodoSiguiente();
            }
        }
        return elementos;
    }

    public String pop() {
        Nodo aux = pila;
        if (pila == null) {
            return "La pila está vacía.";
        } else {
            if (aux.getNodoSiguiente() == null) {
                pila = null;
            } else {
                pila = aux.getNodoSiguiente();
            }
            return "El elemento eliminado de la pila es: " + aux.getValor();
        }
    }

}
