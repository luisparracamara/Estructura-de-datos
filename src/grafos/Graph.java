package grafos;


import java.io.*; 
import java.util.*; 
  

class Graph 
{ 
 
   private int vertice;
   private LinkedList<Integer> lista[];
    
    Graph(int total){
        vertice = total;
        lista = new LinkedList[vertice];
        
        for (int i = 0; i < vertice; i++) {
            lista[i] = new LinkedList();
        }
    }
    
    public void agregarArco(int ver, int conectar){
        lista[ver].add(conectar);
        
    }
    
    public void eliminar(int ver){
        for (int i = lista[ver].size(); i > 0; i--) {
            lista[ver].remove();
        }
        
    }
    
    public void imprimir(){
        for (int i = 0; i < vertice; i++) {
            //System.out.println(lista[i]);
            if (lista[i].size()>0) {
                System.out.println("vertice: "+i+" Está conectado con: "+lista[i]);       
            }
        }
    }
    
    
    public void bfs(int indice){
        boolean visitado[] = new boolean[vertice];
        Queue<Integer> cola = new LinkedList<Integer>();
        
        visitado[indice] = true;
        cola.add(indice);
        
        while(!cola.isEmpty()){
            indice = cola.poll();
            System.out.print(indice +"-");
            
            Iterator<Integer> iterador = lista[indice].listIterator();
            while(iterador.hasNext()){
                int siguiente = iterador.next();
                if (visitado[siguiente] == false) {
                    visitado[siguiente] = true;
                    cola.add(siguiente);
                }
            }
        }
    }
       
    
  
    // Driver method to 
    public static void main(String args[]) 
    { 
       Graph grafo = new Graph(6);

       
        //grafo.eliminar(1);
       
        grafo.agregarArco(0, 3); 
        grafo.agregarArco(0, 4);
        
        grafo.agregarArco(1, 3); 
        grafo.agregarArco(1, 5);
        
        grafo.agregarArco(2, 4);
        
        grafo.agregarArco(3, 0); 
        grafo.agregarArco(3, 1); 
        
        grafo.agregarArco(4, 0);
        grafo.agregarArco(4, 2);
        grafo.agregarArco(4, 5);
        
        grafo.agregarArco(5, 1);
        grafo.agregarArco(5, 4);
      
     
       grafo.imprimir();
       
       grafo.bfs(0);
    } 
} 
