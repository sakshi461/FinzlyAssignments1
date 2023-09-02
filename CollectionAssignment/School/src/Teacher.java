
public class Teacher {
private String tname;
private String Subject;
 private int tId;
@Override
public String toString() {
	return "Teacher [tname=" + tname + ", Subject=" + Subject + ", tId=" + tId + "]";
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getSubject() {
	return Subject;
}
public void setSubject(String subject) {
	Subject = subject;
}
public int gettId() {
	return tId;
}
public void settId(int tId) {
	this.tId = tId;
}
public Teacher(String tname, String subject, int tId) {
	super();
	this.tname = tname;
	Subject = subject;
	this.tId = tId;
}
 public Teacher()
 {
	 
 }
}
