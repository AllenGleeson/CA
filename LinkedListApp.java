public class LinkedListApp {
    public static void main(String[] args) {
        Student student1 = new Student(
                "x12345001",
                "Jack Black",
                "0871234567",
                "Higher Diploma in Science in Computing",
                true);

        Student student2 = new Student(
                "x12345002",
                "Jill White",
                "0872345678",
                "Higher Diploma in Science in Computing",
                false);

        Student student3 = new Student(
                "x12345003",
                "Tom Green",
                "0873456789",
                "Higher Diploma in Science in Computing",
                true);

        Student student4 = new Student(
                "x12345004",
                "Lisa Brown",
                "0874567890",
                "Higher Diploma in Science in Computing",
                false);

        Student student5 = new Student(
                "x12345005",
                "Mark Blue",
                "0875678901",
                "Higher Diploma in Science in Computing",
                true);
        Student student6 = new Student(
                "x55522305",
                "Polly Parish",
                "0835675501",
                "Higher Diploma in Science in Computing",
                false);

        student1.setCurrentStatus(false);
        student1.setStudentPhoneNo("0875688903");

        // Adding to the list
        LinkedList mylist = new LinkedList();
        mylist.add(student1);
        mylist.add(student2);
        mylist.add(student3);
        mylist.add(student4);
        mylist.add(student5);
        student2.setCurrentStatus(true);
        student2.setStudentPhoneNo("0871234455");

        // Adding to the list at an index
        System.out.println("Adding to list:");
        try {
            mylist.add(student6, 2);
            System.out.println("Student Added");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The index is out of bounds: " + e.getMessage());
        }
        System.out.println("-------------------------------");

        // List of students to string
        System.out.println(mylist);

        System.out.println("-------------------------------");

        // Removing a student from the list through student name
        if (mylist.remove("Mark Blue")) {
            System.out.println("Mark Blue removed.");
        } else {
            System.out.println("Mark Blue not found in list.");
        }
        System.out.println("-------------------------------");

        // Get student based on student number
        String searchStudentNo = "x12345003";
        System.out.println("Searching for " + searchStudentNo);
        System.out.println(mylist.getStudent(searchStudentNo));
        System.out.println("-------------------------------");

        // Checking if the list is empty
        System.out.println("Checking if list is empty...");
        if (mylist.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
    }
}