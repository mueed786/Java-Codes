class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name=name;
		this.age=age;
	}
	Student(Student s2){
		this.name=s2.name;
		this.age=s2.age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student("aman",24);
		Student s2=new Student(s1);
		Student s3=new Student(s2);
		s3.setName("mueed");
		System.out.println(s3.getName()+s3.age);

	}

}
