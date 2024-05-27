import java.security.SecureRandom;
import  java.util.Scanner;

import com.datastruture.*;

class Main {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<>();

        for (int i = 0; i < secureRandom.nextInt(9) + 1; i++)
            linkedList.append(secureRandom.nextInt(6) + 1);

        linkedList.printList();

        linkedList.removeNumbersSmallerThan(secureRandom.nextInt(9) + 1);
        linkedList.printList();
    }
}
