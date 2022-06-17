/*construir un árbol binario equilibrado a partir de las claves 1075342264534152874201590, */
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

    public void insertar(int llave, Object contenido){
        Nodo nuevo = new Nodo(llave);
        nuevo.contenido = contenido;
        if(raiz == null){
            raiz = nuevo;
        }else{
            Nodo actual = raiz;
            Nodo padre;
            while(true){
                padre = actual;
                if(llave < actual.llave){
                    actual = actual.izquierda;
                    if(actual == null){
                        padre.izquierda = nuevo;
                        nuevo.padre = padre;
                        return;
                    }
                }else{
                    actual = actual.derecha;
                    if(actual == null){
                        padre.derecha = nuevo;
                        nuevo.padre = padre;
                        return;
                    }
                }
            }
        }
    }

    public void tooString(){
        if(raiz != null){
            System.out.println(raiz.llave);
            if(raiz.izquierda != null){
                System.out.println(raiz.izquierda.llave);
            }
            if(raiz.derecha != null){
                System.out.println(raiz.derecha.llave);
            }
        }
    }

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        /*Aún no se si esto esté bien xD*/
        arbol.insertar(10, "10");
        arbol.insertar(75, "75");
        arbol.insertar(34, "34");
        arbol.insertar(22, "22");
        arbol.insertar(64, "64");
        arbol.insertar(53, "53");
        arbol.insertar(12, "12");
        arbol.insertar(45, "45");
        arbol.insertar(67, "67");
        arbol.insertar(89, "89");
        arbol.insertar(100, "100");

        arbol.tooString();
    }
}