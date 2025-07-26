public class Student {
  private String studentNo;
  private String studentName;
  private String studentPhoneNo;
  private String course;
  private boolean currentStatus;

  // Constructor
  public Student(String studentNo, String studentName, String studentPhoneNo, String course, boolean currentStatus) {
    this.studentNo = studentNo;
    this.studentName = studentName;
    this.studentPhoneNo = studentPhoneNo;
    this.course = course;
    this.currentStatus = currentStatus;
  }

  public static void main(String[] args) {
    // Creating new student to print to screen
    Student student = new Student(
        "x12345432",
        "Jack Black",
        "087 1234567",
        "Higher Diploma in Science in Computing",
        true);
    System.out.println(student);
  }

  // Getters
  public String getStudentNo() {
    return studentNo;
  }

  public String getStudentName() {
    return studentName;
  }

  public String getStudentPhoneNo() {
    return studentPhoneNo;
  }

  public String getCourse() {
    return course;
  }

  public boolean getCurrentStatus() {
    return currentStatus;
  }

  // Setters
  public void setStudentNo(String studentNo) {
    this.studentNo = studentNo;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public void setStudentPhoneNo(String studentPhoneNo) {
    this.studentPhoneNo = studentPhoneNo;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public void setCurrentStatus(boolean currentStatus) {
    this.currentStatus = currentStatus;
  }

  // Returns a student as a string and wether they are enrolled or not
  @Override
  public String toString() {
    String output = "Student\n";
    output += "StudentNo: " + this.studentNo + "\n";
    output += "StudentName: " + this.studentName + "\n";
    output += "StudentPhoneNo: " + this.studentPhoneNo + "\n";
    output += "Course: " + this.course + "\n";
    String enrolment = "";
    if (this.currentStatus) {
      enrolment = "Enrolled";
    } else {
      enrolment = "Not Enrolled";
    }
    output += "CurrentStatus: " + enrolment;

    return output;
  }
}