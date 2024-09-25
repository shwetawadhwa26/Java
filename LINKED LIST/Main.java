class Node {
    int data;
    Node next;

    // Default constructor
    Node() {
        this.next = null;
    }

    // Constructor with data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    // Function to print the linked list
    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creation of nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        // Linking nodes
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Set head node
        Node head = first;

        // Print the linked list
        System.out.println("Printing the entire LL: ");
        printLL(head);
    }
}
