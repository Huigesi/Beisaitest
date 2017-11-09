package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1Test {

	public static void main(String[] args) {
		ArrayListDemo1 list=new ArrayListDemo1();
		list.insert(11,"aa",20);
		list.insert(22,"bb",21);
		list.insert(33,"aa",22);
		list.insert(44, "bb", 24);
		//list.del(11);
		//list.update(1, new Student(33,"ddd",22));
		list.sort3();
		list.output();
		

	}

}
