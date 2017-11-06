package netdemo;


import java.io.*;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


//�������ȡ�������������ݸ�ʽ

public class NetDemo {

	public static void main(String[] args) throws Exception {
		//����URL����
		URL url=new URL("https://www.baidu.com/img/bd_logo1.png");
		//����������
		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
		//�����������
		conn.setRequestMethod("GET");
		conn.setConnectTimeout(5*1000);
		//��ȡ����������������ڻ��ͼƬ������
		InputStream is=conn.getInputStream();
		//�������������ݣ����ͼƬ����������
		byte[]data=readInputStream(is);
		//ͨ�������������д���ļ��У������µ��ļ�
		File file=new File("baidu.png");
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(data);
		fos.close();
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


