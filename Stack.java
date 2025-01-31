package com.company;

    public class Stack<T> {
        private Node<T> head;
        public Stack(){
            this.head = null;
        }
        public boolean isEmpty(){
            return this.head == null;
        }
        public T top(){
            return this.head.getValue();
        }
        public void push(T x){
            this.head = new Node<T>(x, this.head);
        }
        public T pop(){
            T x = this.head.getValue();
            this.head = this.head.getNext();
            return x;
        }

        public String toString() {
            String str = "[";
            Node<T> pos = this.head;
            while (pos != null){
                str += pos.getValue().toString();
                if (pos.getNext() != null)
                    str += ",";
                pos = pos.getNext();
            }
            str += "]";
            return str;
        }

    }

