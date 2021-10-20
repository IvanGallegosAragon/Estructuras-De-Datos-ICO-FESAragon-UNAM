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
public class LinkedListADT {

    private class Nodo<T> {//Encapsular metodos necesarios

        T data;
        Nodo next;

        public Nodo(T valor) {
            this.data = valor;
        }

        public Nodo(T valor, Nodo siguiente) {
            this.data = valor;
            this.next = siguiente;
        }
    }

    private Nodo head;
    
    public LinkedListADT(){
        this.head = null;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    public Nodo getTail(){
        Nodo currNode = this.head;
        if (!this.isEmpty()){
            while(currNode.next != null){
                currNode = currNode.next;
            }
        }
        return currNode;
    }
    public void append( Object valor ){
        if (this.isEmpty()){
            this.head = new Nodo(valor);
        }else{
            this.getTail().next = new Nodo(valor);
        }
    }
    public void prepend(Object valor){
        this.head = new Nodo(valor, this.head);
    }
    
    public void transversal(){
        Nodo currNode = this.head;
        while(currNode != null){
            System.out.print(currNode.data + "--->");
            currNode = currNode.next;
        }
        System.out.println("");
    }
    
    public void remove(Object valor){
        Nodo currNode = this.head;
        if (currNode != null){
            while(currNode.next != null){
                if (currNode.next.data == valor){
                    currNode.next.data = null;
                    if (currNode.next.next != null){
                        currNode.next = currNode.next.next;
                    } 
                }else{
                    currNode = currNode.next;
                } 
            }
        } 
    }
    
    public Object pop(){
        Object dat = this.getTail().data;
        this.getTail().data = null;
        return dat;
    }
    
    public Object popFirst(){
        Object dat = this.head.data;
        this.head = this.head.next;
        return dat;
    }
}
