import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
	/*	list.add("1");
		list.add("2");
		list.add("3");
		list.remove(1);
		list.set(1, "4");*/
		//列表值为对象的第一种加法
		Student stu=new Student(1,"aa",20);
		list.add(stu);
		//第二种
		list.add(new Student(2,"bb",21));
		list.add(new Student(3,"cc",22));
		//用for循环输出
		for(int i=0;i<list.size();i++){
			//toString()方法在Student类里写
			System.out.println(list.get(i).toString());
		}
		//用迭代器输出
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
