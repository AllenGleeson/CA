public interface StudentInterface {
    void add(Student student, int index);
    boolean remove(String studentName);
    boolean isEmpty();
    String getStudent(String studentNo);
    String toString();
}