package netdemo;

//java��ʹ��������ʽ
public class RegexDemo {

	public static void main(String[] args) {
		//�ж��û�������Ƿ�ȫ������ĸ
		check1("aaa1");

	}
	
	
	public static void check1(String str){
		String regex="[a-zA-Z]+";
		if(str.matches(regex)){
			System.out.println("ȫ��ĸ");
		}else{
			System.out.println("���з���ĸ");
		}
		
	}
	
	
	
}
