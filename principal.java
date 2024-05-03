package binario;

public class Principal{
        public static void main(String[] args){
            ArbreBinariStrings arbre = new ArbreBinariStrings("A");

            arbre.afegirderecha("B");
            arbre.afegirderecha("C");
            arbre.afegirderecha("D");

            arbre.afegirizquierda("D");
            arbre.afegirizquierda("E");
            arbre.afegirizquierda("F");
        }
}
