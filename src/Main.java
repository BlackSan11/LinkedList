import sun.awt.image.ImageWatched;

public class Main {
    static LinkedList root, current, temp;

    public static void addToLinkedList(String name) {
        if (root != null) {
            current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new LinkedList(name);
        } else {
            root = new LinkedList(name);
        }
    }

    public static void linkedSet(LinkedList link) {
        current = temp = link;
        do {
            while (temp.next != null) {
                System.out.println("C = " + current.name + " T = " + temp.name);
                if (current.name == temp.name) {
                    System.out.println("Yeah");
                }
                temp = temp.next;
            }
            current = current.next;
        }
        while (current != null);
    }


    public static void main(String[] args) {
        addToLinkedList("Игорь");
        addToLinkedList("Иван");
        addToLinkedList("Андрейа");
        addToLinkedList("Андрей");
        linkedSet(root);
    }
}
