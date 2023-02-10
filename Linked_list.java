class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
    }
}
    public void addfirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next != null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }
    public void print(){
        if(head == null){
            System.out.println("list is empty");
            
        }
        Node currnode = head;
        while(currnode != null){
            System.out.print(currnode.data + " --> " + " ");
            currnode = currnode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst(9);
        list.addfirst(5);
        list.addlast(6);
        list.addlast(8);

        
        list.print();
        
    }
}
