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
		//�б�ֵΪ����ĵ�һ�ּӷ�
		Student stu=new Student(1,"aa",20);
		list.add(stu);
		//�ڶ���
		list.add(new Student(2,"bb",21));
		list.add(new Student(3,"cc",22));
		//��forѭ�����
		for(int i=0;i<list.size();i++){
			//toString()������Student����д
			System.out.println(list.get(i).toString());
		}
		//�õ��������
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
