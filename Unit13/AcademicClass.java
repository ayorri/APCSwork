import java.util.*;
//represents course you take in school
public class AcademicClass
{
  public AcademicClass()
  {
    students = new ArrayList<Student>();
  }

  //set teacher
  /* public setTeacher(String teacherName, String subject)
  {
    this.teacherName = teacherName;
    this.subject = subject;
  }*/

  //add a student to the list
  public void addStudent(String studentName, int favNum)
  {
    Student student = new Student(studentName, favNum);
    students.add(student);
  }

  //prints info about the class (print the teacher and all student names)
  public void classInfo()
  {
    System.out.println("Students in this class: ");
      for(Student s : students)
      {
        System.out.println(s.getStudentName());
      }
  }

  //takes single integer n and returns an ArrayList of names of students
  //whose favorite number is n
  public ArrayList<Student> numIsN()
  {
    ArrayList<Student> num = new ArrayList<Student>();
    int n = 18;
    for(Student s : students)
    {
      if(s.getFavNum() == n)
      {
        num.add(s);
      }
    }
    return num;
  }

  public ArrayList<Student> numIsOdd()
  {
    ArrayList<Student> odd = new ArrayList<Student>();

    for(Student s : students)
    {
      if(s.getFavNum() % 2 == 1)
      {
        odd.add(s);
      }
    }
    return odd;
  }

  private ArrayList<Student> students;
  //private String teacherName;
  //private String subject;

  public static void main(String[] args)
  {
    AcademicClass classes = new AcademicClass();
    Teacher teacher = new Teacher();

    classes.addStudent("Maddie", 23);
    classes.addStudent("Chloe", 17);
    classes.addStudent("Allie", 18);
    classes.addStudent("Brielle", 321);
    classes.addStudent("Kate", 6);
    classes.addStudent("Claire", 1207);

    teacher.setName("Ms.Contreras");
    teacher.setSubject("English");
    System.out.println("Teacher: " + teacher.getTeacherName() + " - Subject: " + teacher.getSubject());
    classes.classInfo();

    System.out.println("Students with n as favorite number " + classes.numIsN());
    System.out.println("Students whose favorite number is odd: " + classes.numIsOdd());
  }
}
