package netdemo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class JSONDemo {

	public static void main(String[] args) throws Exception {
		//����URL����
		URL url=new URL("http://192.168.0.1:8080/test?format=json");
		//����������
		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
		//�����������
		conn.setRequestMethod("GET");
		conn.setConnectTimeout(5*1000);
		//��ȡ����������������ڻ��ͼƬ������
		InputStream is=conn.getInputStream();
		//�������������ݣ����ͼƬ����������
		byte[]data=readInputStream(is);
		String json=new String(data);
	/*	String json="[{id:1,name:\"zhangshan\",age:20},{id:2,name:\"lishi\",age:21}]";
		JSONArray array=new JSONArray(json);
		for (int i = 0; i < array.length(); i++) {
			JSONObject item=array.getJSONObject(i);
			int id=item.getInt("id");
			String name=item.getString("name");
			int age=item.getInt("age");
		}*/
		
	}
	
	//�������������ݵ�������������ֽ������С�
	public static byte[] readInputStream(InputStream is) throws Exception{
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		byte[] buffer=new byte[1024];
		int len=0;
		while((len=is.read(buffer))!=-1){
			baos.write(buffer,0,len);
		}
		is.close();
		return baos.toByteArray();
	}
	
	

}
