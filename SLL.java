// Singly link list methods bellow
public class SLL{
    // start with the head
    private Node head;
    // by default it set the head to null if para() is empyt
    public SLL(){
        this.head = null; 
    }

    // add new nodes
    public void add(Node newNode){
        // if head is empyt
        if(this.head == null){
            // set the newNode to the this Head
            this.head = newNode;
        }else{
            // if not the head value is equal to runner
            Node runner = this.head;
            // if the next value is not null meaing
            while(runner.next != null){
                // we will set the next runner to the current runner 
                runner=runner.next;
            }
            // set the next node to the new created node
            runner.next = newNode;
        }
    }

    public void showNodes(){
        Node runner = this.head;
        while(runner.next != null){
            System.out.println(runner.value); //prints first two nodes
            runner=runner.next;  
        }
        System.out.println(runner.value); //prints last node (after runner.next)   
    }

    public void removeNode(){
        Node walker = this.head;
        Node runner = this.head;
        while(runner.next != null){
            walker = runner;
            runner=runner.next;
        }
        walker.next = null;
    }
}