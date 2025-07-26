// This is going to represent the Node in the linkedlist

public class Node{
  Student student;
  Node next;

  public Node(Student student, Node next){
    this.student = student;
    this.next = next;
  }

  public Node(Student student){
    this.student = student;
  }

  @Override
  public String toString(){
    return student.toString();
  }
}
