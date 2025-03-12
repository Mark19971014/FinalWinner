import java.util.HashMap;


public class M146 {
    class Node {
        Node prev,next;
        int key,val;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    
    private HashMap<Integer,Node> cachemap;
    private int capacity;
    private Node head,tail;

    public M146(int capacity){
        this.capacity = capacity;
        this.cachemap = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;

    } 

    public int get(int key){
        if(cachemap.containsKey(key)){

            Node node = cachemap.get(key);
            moveToFront(node);
            return node.val;
        }

        return -1;
    }

    public void put(int key, int value){
        
        if(cachemap.containsKey(key)){
            Node node = cachemap.get(key);
            moveToFront(node);
            cachemap.put(key, node);
        }

        if (cachemap.size() >= this.capacity){
            deleteLRU();
        }
            
            Node node = new Node(key, value);
            cachemap.put(key,node);
            moveToFront(node);
    }

    public void deleteLRU(){
        Node lruNode = tail.prev;
        cachemap.remove(lruNode.key);
        removeNode(lruNode);
    }

    public void moveToFront(Node node){
        removeNode(node); // remove the node from the current position in the list
        addToHead(node); // insert the node to the head of list 
    }
    
    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addToHead(Node node){
        head.next.prev = node;
        node.next = head.next;
        node.prev = head;
        head.next = node;
    }
}