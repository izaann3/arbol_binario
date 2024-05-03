package binario;

/*public class ArbreBinari{}
public class ArbreBinariEnters{}*/

public class ArbreBinariStrings{
    private Node arrel;

    private static class Node{
        private String valor;
        private Node derecha;
        private Node izquierda;

        public Node(String Valor){
            this.valor = valor;
            this.derecha = null;
            this.izquierda = null;
        }
    }

    public ArbreBinariStrings(String valorArrel){
        this.arrel = new Node(valorArrel);
    }

    public void afegirderecha(String valor){
        arrel.derecha = new Node(valor);
    }

    public void afegirizquierda(String valor){
        arrel.izquierda = new Node(valor);
    }
}
