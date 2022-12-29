/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesAVL;

/**
 *
 * @author Luis Parra
 */
public class ArbolAVL {
    private NodoArbolAVL raiz;
 
    public ArbolAVL(){
        raiz = null;
    }
    
    public NodoArbolAVL obtenerRaiz(){
        return raiz;
    }
    
    public NodoArbolAVL buscar(int elemento, NodoArbolAVL r){
        if (r == null) {
            return null;
        }else if(r.dato == elemento){
            return r;
        }else if(r.dato<elemento){
            return buscar(elemento,r.right);
        }else{
            return buscar(elemento,r.left);
        }
    }
    
    //obetner el factor de equilibrio
    public int obtenerFE(NodoArbolAVL elemento){
        if (elemento == null) {
            return -1;
        }else{
            return elemento.fe;
        }
    }
    
    
    //rotacion simple izquierda
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL elemento){
        NodoArbolAVL aux = elemento.left;
        elemento.left = aux.right;
        aux.right = elemento;
        elemento.fe = Math.max(obtenerFE(elemento.left), obtenerFE(elemento.right))+1;
        aux.fe =  Math.max(obtenerFE(aux.left), obtenerFE(aux.right))+1;
        return aux;    
    }

    
        //rotacion simple derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL elemento){
        NodoArbolAVL aux = elemento.right;
        elemento.right = aux.left;
        aux.left = elemento;
        elemento.fe = Math.max(obtenerFE(elemento.left), obtenerFE(elemento.right))+1;
        aux.fe =  Math.max(obtenerFE(aux.left), obtenerFE(aux.right))+1;
        return aux;    
    }
    
    
    //rotacion doble a la izquierda
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL elemento){
        NodoArbolAVL aux; 
        elemento.left = rotacionDerecha(elemento.left);
        aux = rotacionIzquierda(elemento);
        return aux;
    }
    
    //rotacion doble a la derecha
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL elemento){
        NodoArbolAVL aux;
        elemento.right = rotacionIzquierda(elemento.right);
        aux = rotacionDerecha(elemento);
        return aux;
    }
    
    
    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subArbol){
        NodoArbolAVL nuevoPadre = subArbol;
        
        if(nuevo.dato < subArbol.dato) {
            if (subArbol.left == null) {
                subArbol.left = nuevo;
            }else{
                subArbol.left = insertarAVL(nuevo, subArbol.left);
                if ( (obtenerFE(subArbol.left) - obtenerFE(subArbol.right)) == 2 ) {
                    if (nuevo.dato < subArbol.left.dato) {
                        nuevoPadre  = rotacionIzquierda(subArbol);
                    }else{
                        nuevoPadre  = rotacionDobleIzquierda(subArbol);
                    }
                }
            }
            
            
            
        }else if(nuevo.dato>subArbol.dato){
            if (subArbol.right == null) {
                subArbol.right = nuevo;
            }else{
                subArbol.right = insertarAVL(nuevo,subArbol.right);
                if ( (obtenerFE(subArbol.right) - obtenerFE(subArbol.left)) == 2 ) {
                    if (nuevo.dato>subArbol.right.dato) {
                        nuevoPadre = rotacionDerecha(subArbol);
                    }else{
                        nuevoPadre = rotacionDobleDerecha(subArbol);
                    }
                }
            }
        }else{
            System.out.println("Nodo duplicado");
        }
        
        //Actualizando la altura FE
        if ( (subArbol.left == null) && (subArbol.right != null)  ) {
            subArbol.fe = subArbol.right.fe+1;
        }else if( (subArbol.right == null) && (subArbol.left != null) ){
            subArbol.fe = subArbol.left.fe + 1;
        }else{
            subArbol.fe = Math.max(obtenerFE(subArbol.left), obtenerFE(subArbol.right))+1;
        }
        return nuevoPadre;
    }
    
    
    
    //insertar
    public void insertar(int d){
        NodoArbolAVL nuevo = new NodoArbolAVL(d);
        if (raiz == null) {
            raiz = nuevo;
        }else{
            raiz = insertarAVL(nuevo,raiz);
        }
    }
    
    
    public void preorden(NodoArbolAVL r){
             if (r!=null) {
            System.out.print(r.dato+"-");
            preorden(r.left);
            preorden(r.right);
        }
    }
    
    
    
}
