package problemas;

import java.util.HashMap;
import java.util.Map;

public class LruCacheProblem {

    public static void main(String[] args) {
        LRUNode lruNode = new LRUNode(1,1);
        LRUNode lruNode2 = new LRUNode(2,2);
        LRUNode lruNode3 = new LRUNode(3,3);

        LRU lru = new LRU(3);
//        lru.agregar(lruNode);
//        lru.agregar(lruNode2);
//        lru.agregar(lruNode3);

//        lru.remover(lruNode2);
//        lru.remover(lruNode);
        lru.put(1,1);
        lru.put(2,2);
        lru.put(3,3);
        lru.put(4,4);
        lru.get(2);
        lru.mostrarListaDoble();
    }

}

class LRU {

    public Map<Integer, LRUNode> map;
    public LRUNode left;
    public LRUNode right;
    public int capacity;

    public LRU(int capacity) {
        this.map = new HashMap<>();
        this.left = new LRUNode(0,0);
        this.right = new LRUNode(0,0);
        this.capacity = capacity;

        this.left.next = right;
        this.right.prev = left;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remover(map.get(key));
        }
            LRUNode node = new LRUNode(key, value);
            map.put(key, node);
            agregar(node);

            if (map.size() > capacity) {
                //eliminar primero
                LRUNode first = left.next;
                map.remove(first.key, first);
                remover(first);
        }
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            LRUNode node = map.get(key);

            remover(node);
            agregar(node);

            return node.val;
        }

        return -1;
    }

    public void agregar(LRUNode node) {
        right.prev.next = node;
        node.prev = right.prev;

        node.next = right;
        right.prev = node;
    }

    public void remover(LRUNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void mostrarListaDoble(){
        LRUNode recorrer = left;
        while(recorrer != null){
            System.out.print("["+recorrer.val+"]<=>");
            recorrer = recorrer.next;
        }
    }

}

class LRUNode {
    public int val;
    public int key;
    public LRUNode prev;
    public LRUNode next;

    public LRUNode(int val, int key) {
        this.val = val;
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}