import java.util.*;

class linkedList<T>{
    T data;
    linkedList<T> next;

    public linkedList(T d){
        this.data = d;
        this.next = null;
    }

}

class node{
    public static linkedList takeInput(linkedList head){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter elemets: ");
        int data = sc.nextInt();;
        
        while(data != -1 ){
            linkedList newNode = new linkedList(data);
            if(head == null){
                head = newNode;
            }else{
                linkedList temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;

            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void printList(linkedList head) {
        linkedList temp = head;
        System.out.println("Printing LinkedList: ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static linkedList deleteNodeAtPosition(linkedList head){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter position");
        int pos = sc.nextInt();
        int i = 0;
        linkedList temp = head;
        while(i != pos-1){
            temp = temp.next;
            i++;
        }

        //linkedList a = temp.next.next;
        linkedList a = temp.next;
        linkedList b = a.next;
        temp.next = b.next;
        return head;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList head = null;
        //head = takeInput(head);
        //printList(head);
        
        int ch = 0;
        do{
            
            System.out.println("1: Enter Elements: ");
            System.out.println("2: print Elements: ");
            System.out.println("3: delete a given node");
            System.out.println("4: exit: ");
            System.out.println("Enter choice: ");
            ch = sc.nextInt();

            switch(ch){
                case 1: head = takeInput(head);
                        break;
                    
                case 2: printList(head);
                        break;

                case 3: head = deleteNodeAtPosition(head);
                        break;

                case 4: System.exit(ch);

                default: System.out.println("invalid!");
            }
        }while( ch != 3);
    }
    
}