package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

import Arrays.Student;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<Student> stdArrList = new ArrayList<Student>();
        stdArrList.add(new Student(1, "Tapan", 26));
        stdArrList.add(new Student(2, "Raji", 25));
        stdArrList.add(new Student(3, "Rohit", 27));
        stdArrList.remove(1);
        System.out.println(stdArrList);


        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Tapan");
        nameList.add("Sapan");
        nameList.add("Rajib");
        nameList.remove(1);
        System.out.println(nameList);

        LinkedList<String> nmLinkedList = new LinkedList<>();
        nmLinkedList.add("Raj");
        nmLinkedList.add("Moti");
        nmLinkedList.add("Sahid");
        nmLinkedList.remove(1);
        System.out.println(nmLinkedList);

        Stack<String> nmStack = new Stack<>();
        nmStack.push("Jiban");
        nmStack.push("Mania");
        nmStack.add("Aliza");
        nmStack.push("Mohit");
        nmStack.pop();
        nmStack.remove(1);
        System.out.println(nmStack);

        Vector<String> frtVector = new Vector<>();
        frtVector.add("Apple");
        frtVector.addElement("Banana");
        frtVector.add("Mango");
        frtVector.remove(2);
        System.out.println(frtVector);

        HashSet<String> nmHashSet = new HashSet<>();
        nmHashSet.add("Bala");
        nmHashSet.add("Madhuri");
        nmHashSet.add("Ankita");
        nmHashSet.add("Sabin");
        System.out.println(nmHashSet);
        
        LinkedHashSet<String> nameLHS = new LinkedHashSet<>();
        nameLHS.add("Sambhu");
        nameLHS.add("Shankar");
        nameLHS.add("Krishna");
        System.out.println(nameLHS);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Shiva");
        treeSet.add("Ram");
        System.out.println(treeSet);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(10);
        priorityQueue.add(100);
        priorityQueue.add(1000);
        priorityQueue.add(10000);
        priorityQueue.remove();
        System.out.println(priorityQueue); 
    }
}
