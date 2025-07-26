public class NodeApp {
    public static void main(String[] args) {
        // Creating new node using a student object and using toString to test
        Student student = new Student(
                "x12345432",
                "Jack Black",
                "087 1234567",
                "Higher Diploma in Science in Computing",
                true);
        System.out.println("Student Object:");
        System.out.println(student);
        System.out.println("------------------------------");
        Node newNode = new Node(student);
        System.out.println("New Node:");
        System.out.println(newNode);
    }
}