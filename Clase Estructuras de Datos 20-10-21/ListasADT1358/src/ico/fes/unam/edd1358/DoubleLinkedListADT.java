/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.unam.edd1358;

/**
 *
 * @author darka
 */
public class DoubleLinkedListADT {

    private class NodoDoble<T> {

        T data;
        NodoDoble next;
        NodoDoble prev;

        public NodoDoble() {
        }

        public NodoDoble(T data, NodoDoble next, NodoDoble prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    private NodoDoble head;
    private NodoDoble tail;
    private int size;
    
    public DoubleLinkedListADT() {
        head = null;
        tail = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return this.head == null;
    }
    
    public void append(Object valor){
        if (this.tail == null){
            this.tail = new NodoDoble(valor, null, null); //Hasta que no se metan mas elementos apuntan a null
            this.head = this.tail;
        }else{
            this.tail.next = new NodoDoble(valor, null, this.tail);
            this.tail = this.tail.next;
        }
        this.size ++;
    }
    public void transversal(){
        NodoDoble currNode = this.head;
        while(currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("");
    }
    
    public int getSize(){
        return size;
    }
    
    //*
    public NodoDoble removeFromHead(Object valor){
        NodoDoble currNode = this.head;
        while(currNode.data != valor || currNode != null ){
            
        }
    }
    //
    
    public void reverseTransversal(){
        NodoDoble currNode = this.tail;
        while(currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.prev;
        }
        System.out.println("");
    }
    
    
}
