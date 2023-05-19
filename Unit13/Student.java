//name and favorite number (int)
public class Student
{
  public Student(String studentName, int favNum)
  {
    this.studentName = studentName;
    this.favNum = favNum;
  }

  public String getStudentName()
  {
    return studentName;
  }

  public int getFavNum()
  {
    return favNum;
  }

  public String toString()
  {
    return studentName;
  }

  private String studentName;
  private int favNum;
}
