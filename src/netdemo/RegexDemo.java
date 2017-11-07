package netdemo;

//java中使用正则表达式
public class RegexDemo {

	public static void main(String[] args) {
		//判断用户输入的是否全部是字母
		check1("hui791339970");

	}
	
	
	public static void check1(String str){
		//String regex="[a-zA-Z_]+";
		String regex="^[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]*){1,}.){1,3}[a-zA-z]{1,}$";
		if(str.matches(regex)){
			System.out.println("全字母");
		}else{
			System.out.println("含有非字母");
		}
		
	}
	
	
	
}
