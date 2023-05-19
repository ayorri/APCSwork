// name and subject
public class Teacher
{
  /* public Teacher(String teacherName, String subject)
  {
    this.teacherName = teacherName;
    this.subject = subject;
  }*/

  public void setName(String teacherName)
  {
    this.teacherName = teacherName;
  }

  public void setSubject(String subject)
  {
    this.subject = subject;
  }

  public String getTeacherName()
  {
    return teacherName;
  }

  public String getSubject()
  {
    return subject;
  }

  private String teacherName;
  private String subject;
}
