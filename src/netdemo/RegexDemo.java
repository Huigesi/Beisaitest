package netdemo;

//java��ʹ��������ʽ
public class RegexDemo {

	public static void main(String[] args) {
		//�ж��û�������Ƿ�ȫ������ĸ
		check1("hui791339970");

	}
	
	
	public static void check1(String str){
		//String regex="[a-zA-Z_]+";
		String regex="^[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]*){1,}.){1,3}[a-zA-z]{1,}$";
		if(str.matches(regex)){
			System.out.println("ȫ��ĸ");
		}else{
			System.out.println("���з���ĸ");
		}
		
	}
	
	
	
}
