/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesBinarios;

/**
 *
 * @author Luis Parra
 */
public class ArbolBinario {
    NodoArbol raiz;
    
    public ArbolBinario(){
        raiz = null;
    }
    
    //insertar nodo en el arbol
    public void agregarNodo(int elemento){
        NodoArbol nuevo = new NodoArbol(elemento);
        if (raiz == null) {
            raiz = nuevo;
        }else{
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            
            while(true){
                //posicion atrasada
                padre = auxiliar;

                if (elemento<auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                }else{
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
                
                
            }
            
        }
    }
    
    
    public void inOrden(NodoArbol r){
        if (r != null) {
            inOrden(r.hijoIzquierdo); 
            System.out.print(r.dato+"-");
            inOrden(r.hijoDerecho);      
        }
    }
    
    public void preOrden(NodoArbol r){
        if (r!=null) {
            System.out.print(r.dato+"-");
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }
    
    public void postOrden(NodoArbol r){
        if (r!=null) {
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            System.out.print(r.dato+"-");
        }
    }
    
    
    //buscar nodo en un arbol
    public boolean buscarNodo(int elemento){
        NodoArbol recorrer = raiz;
        
        while(recorrer.dato != elemento){
            if (elemento<recorrer.dato) {
                recorrer = recorrer.hijoIzquierdo;
            }else{
                recorrer = recorrer.hijoDerecho;
            }
            
            if (recorrer == null) {
                return false;
            }
            
        }
        
        return true;
    }
    
    
    //metodo eliminar nodo de un arbol
    public boolean eliminar(int elemento){
        //recorrer es el valor encontrado en una posicion determinada
        NodoArbol recorrer = raiz;
        NodoArbol padre = raiz;
        //para saber si el valor lo encuentro en el lado izquierda del arbol
        boolean esHijoIzquierdo = true;
        
        while(recorrer.dato != elemento){
            //la raiz del que quiero eliminar
            padre = recorrer;
            
            if (elemento<recorrer.dato) {
                esHijoIzquierdo = true;
                recorrer = recorrer.hijoIzquierdo;
            }else{
                esHijoIzquierdo = false;
                recorrer = recorrer.hijoDerecho;
            }
            
            if (recorrer == null) {
                return false;
            }
            
        }//fin while
    
        //CASOS
        
        //SI EL NODO A ELIMINAR ES HOJA
        if (recorrer.hijoIzquierdo == null && recorrer.hijoDerecho == null) {
            if (recorrer == raiz) {
                raiz = null;
            }else if(esHijoIzquierdo == true){
                padre.hijoIzquierdo = null;
            }else{
                padre.hijoDerecho = null;
            }
            
        //SI SOLO EXISTE UN HIJO IZQUIERDO DEL NODO RECORRER,(NO IMPORTA EL LADO EN EL QUE ESTÉ) ENTONCES EL HIJO IZQUIERDO TOMA EL LUGAR DEL PADRE
        //NO EXISTE POSIBILIDAD QUE EL RECORRER TENGA UN HIJO DERECHO, PURO IZQUIERDO
        }else if(recorrer.hijoDerecho == null){
            
                System.out.println(padre.dato);
                System.out.println("padre: "+padre.hijoIzquierdo.dato);
                System.out.println("recorrer: "+recorrer.dato);
                System.out.println("es hijo izquierdo? " + esHijoIzquierdo);
                System.out.println("recorrer de hijo izquierdo: " +recorrer.hijoIzquierdo.dato);
            
             if (recorrer == raiz) {
                raiz = recorrer.hijoIzquierdo;
            //SE CAMIBA DE POSICION EL HIJO DEL QUE QUIERO ELIMINAR TOMA EL LUGAR DEL PADRE
            //CONOCER EL LADO DEL ARBOL DONDE SE ENCUENTRA EL ELEMENTO
            }else if(esHijoIzquierdo == true){
                padre.hijoIzquierdo = recorrer.hijoIzquierdo;
            }else{
                padre.hijoDerecho = recorrer.hijoIzquierdo;
            }
             
            //SOLO SI EXISTE UN HIJO DERECHO DEL NODO RECORRER, EL HIJO DERECHO TOMA EL LUGAR DEL PADRE O RECORRER
            //NO EXISTE LA POSIBILIDAD QUE EL NODO RECORRER TENGA UN HIJO IZQUIERDO
            }else if(recorrer.hijoIzquierdo == null){
            if (recorrer == raiz) {
                raiz = recorrer.hijoDerecho;
                //CONOCER EL LADO DEL ARBOL DONDE SE ENCUENTRA EL ELEMENTO
            }else if(esHijoIzquierdo == true){
                padre.hijoIzquierdo = recorrer.hijoDerecho;
            }else{
                padre.hijoDerecho = recorrer.hijoDerecho;
            }
            
            
        }else{
            NodoArbol reemplazo = obtenerNodoReemplazo(recorrer);
            if (recorrer == raiz) {
                raiz = reemplazo;
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo = reemplazo;
            }else{
                padre.hijoDerecho = reemplazo;
            }
               
               //System.out.println("recorrer hijo izquierdo: "+recorrer.hijoIzquierdo.dato);
               //System.out.println("remplazo hijo izquierdo: "+recorrer.hijoDerecho.dato);
              reemplazo.hijoIzquierdo = recorrer.hijoIzquierdo;  
              
              
        }
        
       return true; 
        
    }
    
    //metodo que devuelve el nodo reemplazo
    public NodoArbol obtenerNodoReemplazo(NodoArbol nodoReemp){
        NodoArbol reemplazarPadre = nodoReemp;
        NodoArbol reemplazo = nodoReemp;
        NodoArbol auxiliar = nodoReemp.hijoDerecho;
        
        while(auxiliar != null){
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.hijoIzquierdo;
        }
        
        System.out.println("remplazar padre izquierdo: "+reemplazarPadre.hijoIzquierdo.dato);
        System.out.println(nodoReemp.hijoDerecho.dato);
        
        //reacomodar enlaces de los hijos de remplazar(si son igual,ya están ordenados)
        if (reemplazo != nodoReemp.hijoDerecho) {
            //probar con arbol 10-5-15-3-8-6-9-7
            //toma el hijo izquierdo del padre y lo apunta a null si no tiene
            reemplazarPadre.hijoIzquierdo = reemplazo.hijoDerecho;
            
            
            
            //toma el hijo derecho de remplazo y lo pone abajo del hijo derecho del nodo a eliminar
            reemplazo.hijoDerecho = nodoReemp.hijoDerecho;
            
            System.out.println("ejemplo: "+reemplazo.hijoDerecho.hijoIzquierdo.dato);
            
        }
        
        

        System.out.println("El nodo reemplazo es: " + reemplazo.dato);
        return reemplazo;
    }
    
    
    public int altura(NodoArbol r){
        if (r != null) {
            int izq = altura(r.hijoIzquierdo)+1;
            int der = altura(r.hijoDerecho)+1;
            
            if (izq>der) {
                return izq;
            }else{
                return der;
            }
        }
        return -1;
    }
    
    
    
    
}
