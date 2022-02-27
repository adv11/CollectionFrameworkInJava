package Collection_Framework;

import java.util.HashSet;

public class CustomClass_or_NonPrimitive_HashSet {
    public static void main(String[] args) {
        // here datatype of hashSet is student type, so it is not primitive
        HashSet<Student> studentDetails = new HashSet<>();

        studentDetails.add(new Student("Akash", 37));
        studentDetails.add(new Student("Abhishek", 15));
        studentDetails.add(new Student("Anurag", 67));
        studentDetails.add(new Student("Akash Chatterjee", 38));

        // HashSet will add this also, but actually we are inserting two diff names in same roll number
        // so should not accept it
        // for this we have to override equals() method and implement custom rules for checking equality
        // after implementing equals method now this info will not be stored in the HashSet
        studentDetails.add(new Student("Deepak", 37));

        System.out.println(studentDetails);
    }
}
