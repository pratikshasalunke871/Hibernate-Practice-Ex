package Com.jbk;

public class Student {
  private String S_name;
  private int age;
  private String address;
  
  public Student() {
}
  public Student(String S_name,int age,String address) {
	  super();
  }
public String getS_name() {
	return S_name;
}
public void setS_name(String s_name) {
	S_name = s_name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
