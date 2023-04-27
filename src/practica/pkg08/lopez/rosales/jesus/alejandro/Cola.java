/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg08.lopez.rosales.jesus.alejandro;

public class Cola {

    public Nodo cola;

    public Cola() {
        cola = null;
    }

    public String encolar(int v) {
        Nodo nuevo = new Nodo(v);
        if (cola == null) {
            cola = nuevo;
            return "El elemento " + v + " ha sido insertado en la cola.";
        } else {
            Nodo aux = cola;
            while (aux.getNodoSiguiente() != null) {
                aux = aux.getNodoSiguiente();
            }
            aux.setNodoSiguiente(nuevo);
            return "El elemento " + v + " ha sido insertado en la cola.";
        }
    }

    public String recorrerCola() {
        Nodo aux = cola;
        String elementos = "";
        if (cola == null) {
            elementos = "La cola está vacía.";
        } else {
            while (aux != null) {
                elementos += "Valor: " + aux.getValor() + "\n";
                aux = aux.getNodoSiguiente();
            }
        }
        return elementos;
    }

    public String desencolar() {
        Nodo aux = cola;
        if (cola == null) {
            return "La cola está vacía.";
        } else {
            if (aux.getNodoSiguiente() == null) {
                cola = null;
            } else {
                cola = aux.getNodoSiguiente();
            }
            return "El primer elemento eliminado de la cola es: " + aux.getValor();
        }
    }
}
