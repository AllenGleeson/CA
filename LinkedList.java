public class LinkedList implements StudentInterface {
  private Node first;
  private Node last;

  /*
   * add - this method should allow the addition of a new Node into the linkedlist
   * at the end of
   * the current list
   */
  public void add(Student elem) {
    if (isEmpty()) {
      Node insertion = new Node(elem);
      first = insertion;
      last = first;
    } else {
      last.next = new Node(elem);
      last = last.next;
    }
  }

  @Override
  public void add(Student student, int index) {
    if (index < 0 || index > size()) {
      throw new IndexOutOfBoundsException();
    }
    // start of list...index = 0
    if (index == 0) {
      Node insert = new Node(student, first);
      first = insert;
      if (last == null) {
        last = first;
      }
      return;
    }

    // Not first node, must find the appropriate index
    Node pred = first;
    for (int i = 0; i < index - 1; i++) {
      pred = pred.next;
    }
    pred.next = new Node(student, pred.next);
    if (pred.next.next == null) {
      last = pred.next;
    }
  }

  /*
   * remove - this method removes the first occurrence of the target Node. The
   * target is defined
   * by Student Name
   */

  public boolean remove(String studentName) {
    Node current = first;
    int index = 0;
    while (current != null && !current.student.getStudentName().equals(studentName)) {
      current = current.next;
      index++;
    }
    if (current != null && current.student.getStudentName().equals(studentName)) {
      remove(index);
      return true;
    }
    return false;
  }

  /*
   * our second method for remove needs to identify the index of the Student based
   * on
   * the reg number
   */
  public void remove(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException();
    }
    if (index == 0) {
      first = first.next;
      if (first == null) {
        last = null;
      }
    } else {
      Node pred = first;
      for (int k = 1; k <= index - 1; k++) {
        pred = pred.next;
      }
      pred.next = pred.next.next;
      if (pred.next == null) {
        last = pred;
      }
    }
  }

  public String getStudent(String studentNo) {
    Node current = first;
    while (current != null) {
      if (current.student.getStudentNo().equals(studentNo)) {
        return "Student Node:\n" + current.toString();
      }
      current = current.next;
    }
    return "Student Node:\nStudent not found";
  }

  @Override
  public String toString() {
    String rep = "Student List:\n";
    Node current = first;
    while (current != null) {
      rep += current.toString() + "\n";
      current = current.next;
    }
    return rep;
  }

  /*
   * The folllowing method size counts the number of objects in the linkedlist
   */
  public int size() {
    int size = 0;
    Node current = first;
    while (current != null) {
      size++;
      current = current.next;
    }
    return size;
  }

  /*
   * isEmpty – this method should check if the linkedlist is empty and return a
   * Boolean
   */
  public boolean isEmpty() {
    return first == null;
  }
}
