package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	ArrayList<Student> list;//=new ArrayList<Student>();
	public ArrayListDemo1() {
		list=new ArrayList<Student>();
	}
	public void insert(int num, String name, int age){
		/*Student stu=new Student(num,name,age);
		list.add(stu);*/
		list.add(new Student(num,name,age));
	}
	//输入学号删除相应的值
	public void del(int num){
		int index=this.getIndex(num);
		list.remove(index);
	}
	//输入学号更新相应的值
	public void update(int num,Student stu){
		if(this.getIndex(num)!=-1)
		list.set(this.getIndex(num),stu);
	}
	
	public int getIndex(int num){
		int index=-1;
		for(int i=0;i<list.size();i++){
			if(list.get(i).getNum()==num){
				index=i;}
			break;
		}
		return index;
	}
	public void output(){
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
