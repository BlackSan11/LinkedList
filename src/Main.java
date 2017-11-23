import sun.awt.image.ImageWatched;

public class Main {
    static LinkedList root, current, temp, prev;

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
        current = root;
        int copyCounter;
       while (current != null){
           temp = prev = root;
           copyCounter = 0;
           System.out.println("Name: " + current.name);
           while (temp != null){
               System.out.println("---Name: " + temp.name);
               if(current.name == temp.name){
                   if(copyCounter > 0){
                       System.out.println("Вхождение:" + copyCounter + " раз");
                       prev.next = temp.next;
                   } else copyCounter++;

               }
               prev = temp;
               temp = temp.next;

           }
           current = current.next;
       }
    }


    public static void main(String[] args) {
        addToLinkedList("Игорь");
        addToLinkedList("Игорь");
        addToLinkedList("Иван");
        addToLinkedList("Михаил");
        addToLinkedList("Андрей");
        addToLinkedList("Андрей");
        linkedSet(root);
    }
}
