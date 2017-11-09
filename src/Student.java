
public class Student {
	int num;
	String name;
	int age;

	public Student(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
@Override
public String toString() {
	
	return this.getNum()+"\t"+this.getName()+"\t"+this.getAge();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
