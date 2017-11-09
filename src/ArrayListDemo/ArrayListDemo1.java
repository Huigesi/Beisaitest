package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListDemo1 {
	ArrayList<Student> list;
	ArrayListDemo1(){
		list=new ArrayList<Student>();
	}
	public void insert(int num,String name,int age){
		list.add(new Student(num,name,age));
	}
	public void del(int num){
		int index=this.getNum(num);
		list.remove(index);
	}
	public void update(int index,Student stu){
		if(index!=-1){
			list.set(index, stu);
		}
	}
	public int getNum(int num){
		int index=-1;
		for(int i=0;i<list.size();i++){
			if(list.get(i).getNum()==num){
			index=i;
			}
		}
		return index;
	}
	public void output(){
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	public void sort1(){
		Collections.sort(list,new Comparator<Student>(){

			@Override
			public int compare(Student stu1, Student stu2) {
				
				return stu1.getName().compareTo(stu2.getName());
			}
		});
	}
	public void sort2(){
		Collections.sort(list,new Comparator<Student>(){

			@Override
			public int compare(Student stu1, Student stu2) {
				/*if(stu1.getNum()>stu2.getNum()){
					return -1;
				}else if(stu1.getNum()<stu2.getNum()){
					return 1;
				}else{
					return 0;
				}*/
				return -stu1.getNum().compareTo(stu2.getNum());
			}
		});
	}
	public void sort3(){
		Collections.sort(list,new Comparator<Student>(){

			@Override
			public int compare(Student stu1, Student stu2) {
				if(stu1.getName().equals(stu2.getName())){
					if(stu1.getNum()>stu2.getNum()){
						return -1;
					}else if(stu1.getNum()<stu2.getNum()){
						return 1;
					}else{
						return 0;
					}
				}else{
					return stu1.getName().compareTo(stu2.getName());
				}
				//return -stu1.getNum().compareTo(stu2.getNum());
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
