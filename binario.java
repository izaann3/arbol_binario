package binario;

/*public class ArbreBinari{}
public class ArbreBinariEnters{}*/

class ArbreBinariStrings{
    private Node arrel;

    private static class Node{
        private String valor;
        private Node derecha;

        public Node(String Valor){
            this.valor = valor;
            this.derecha = null;
        }
    }

    public ArbreBinariStrings(String valorArrel){
        this.arrel = new Node(valorArrel);
    }

    public void afegirderecha(String valor){
        arrel.derecha = new Node(valor);
    }
}

class Principal{
        public static final void main(String[] args){
            ArbreBinariStrings arbre = new ArbreBinariStrings("A");

            arbre.afegirderecha("B");
            arbre.afegirderecha("C");
            arbre.afegirderecha("D");
        }
}
