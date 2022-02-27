package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();
        // Initial storage capacity of ArrayList is 10.
        // If the elements increased then size of the ArrayList is increased as -
        // New size of the ArrayList = (n + n/2 + 1) where n = previous length of the ArrayList

        studentName.add("Akash");   // for adding elements into the ArrayList
        studentName.add("Pooja");   // add function adds element at last of the ArrayList
        studentName.add("Deepak");
        System.out.println(studentName);    // output : [Akash, Pooja, Deepak]

        studentName.add(3, "Arti"); // for adding element at the specific index of the ArrayList
        System.out.println(studentName);    // output : [Akash, Pooja, Deepak, Arti]


        ArrayList<String> anotherSchoolStudentName = new ArrayList<>();
        anotherSchoolStudentName.add("Abhishek");
        anotherSchoolStudentName.add("Pawan");
        anotherSchoolStudentName.add("Anurag");

        // addAll() function adds whole ArrayList into other ArrayList
        studentName.addAll(anotherSchoolStudentName);
        System.out.println(studentName);    // output : [Akash, Pooja, Deepak, Arti, Abhishek, Pawan, Anurag]

        // get() function is used to get the value present in the ArrayList at the given index
        System.out.println(studentName.get(0)); // output : Akash

        // remove() function is used to remove the elements present in the ArrayList
        studentName.remove("Pawan");    // remove by writing element
        System.out.println(studentName);    // output : [Akash, Pooja, Deepak, Arti, Abhishek, Anurag]

        studentName.remove(5);  // remove by giving index of the element
        System.out.println(studentName);    // output : [Akash, Pooja, Deepak, Arti, Abhishek]

        studentName.removeAll(anotherSchoolStudentName);    // remove whole ArrayList
        System.out.println(studentName);    // output : [Akash, Pooja, Deepak, Arti]

        // studentName.clear();    // will clear whole ArrayList
        // System.out.println(studentName);    // output : []


        // set() func is used for setting/updating the value present in the ArrayList
        studentName.set(1, "Jyoti");
        System.out.println(studentName);    // output : [Akash, Jyoti, Deepak, Arti]


        // contains() func is used for checking if the ArrayList contains that value or not?
        System.out.println(studentName.contains("Akash"));  // returns boolean values. output : true
        System.out.println(studentName.contains("akash"));  // it is case-sensitive. output : false


        // Iterating through the ArrayList
        for(int i=0 ; i<studentName.size() ; i++){  // simple for loop
            System.out.print(studentName.get(i) + " "); // output : Akash Jyoti Deepak Arti
        }
        System.out.println();

        for(String stdName : studentName){  // for-each loop. Can only be used for getting the values from the list
            System.out.print(stdName + " ");    // output : Akash Jyoti Deepak Arti
        }
        System.out.println();


        // Iterator object
        Iterator<String> iterator = studentName.iterator();
        while (iterator.hasNext()){
            System.out.println("By iterator object : " + iterator.next());
        }
        System.out.println();
        // output :
        // By iterator object : Akash
        // By iterator object : Jyoti
        // By iterator object : Deepak
        // By iterator object : Arti
    }
}
