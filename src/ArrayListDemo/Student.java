package ArrayListDemo;

public class Student {
	Integer num;
	String name;
	Integer age;


public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
public Student(Integer num, String name, Integer age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
@Override
public String toString() {
	
	return this.getNum()+"\t"+this.getName()+"\t"+this.getAge();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
