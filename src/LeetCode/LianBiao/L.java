package LeetCode.LianBiao;

import java.util.*;

public class L {

    class Node{
        int key;
        int value;
        Node pre;
        Node next;
        public Node(){}
        public Node(int k,int v ){
            key = k;
            value = v;
        }

    }
    private int capacity;
    private int size;
    private Node head,tail;
    private HashMap<Integer,Node> cache = new HashMap<>();
    public L(int capacity) {
        int size = 0;
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    //    存在，移到链表头部返回; 不存在，返回-1;
    public int get(int key) {
        Node node = cache.get(key);
        if(node == null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    //    存在,修改value值，放在头部； 不存在 new Node,如果容量够，则直接插入头部，如果容量不够，则删除尾部插入头部；
    public void put(int key, int value) {
        Node node = new Node(key,value);
        Node n = cache.get(key);
        if(n == null){
            cache.put(key,node);
            addToHead(node);
            if(size < capacity){
                size++;
            }else{
                cache.remove(tail.pre.key);
                removeTailNode();
            }
        }else{
            n.value = value;
            moveToHead(n);
        }
    }

    //  先删除位置，再添加到头部;
    public void moveToHead(Node node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
        addToHead(node);
    }

    //删除尾部;
    public void removeTailNode( ){
        Node n = tail.pre;
        n.pre.next = tail;
        tail.pre = n.pre;

    }

    //    直接添加到头部;
    public void addToHead(Node node){
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet();
        for (int i = 0; i < 3; i++) {
            set.add(i);
        }

    }

}

