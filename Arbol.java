public class Arbol{
    Nodo raiz;
    public Arbol(){
        raiz = null;
    }

    private class Nodo{
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        public Object contenido;

        public Nodo(int indice){
            this.llave = indice;
            this.derecha = null;
            this.izquierda = null;
            this.padre = null;
            this.contenido = null;
        }
    }
}