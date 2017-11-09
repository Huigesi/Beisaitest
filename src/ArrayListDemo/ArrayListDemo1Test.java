package ArrayListDemo;

import java.util.Iterator;

public class ArrayListDemo1Test {

	public static void main(String[] args) {
		ArrayListDemo1 list=new ArrayListDemo1();
		list.insert(11, "aa", 20);
		list.insert(22, "bb", 21);
		list.insert(32, "cc", 22);
		//list.del(2);
		list.update(1, new Student(11,"aaa",20));
		list.output();
		

	}

}
