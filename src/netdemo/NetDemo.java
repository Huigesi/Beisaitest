package netdemo;


import java.io.*;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


//从网络获取二进制数据数据格式

public class NetDemo {

	public static void main(String[] args) throws Exception {
		//定义URL对象
		URL url=new URL("https://www.baidu.com/img/bd_logo1.png");
		//打开网络链接
		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
		//设置网络参数
		conn.setRequestMethod("GET");
		conn.setConnectTimeout(5*1000);
		//获取网络的输入流，用于获得图片的数据
		InputStream is=conn.getInputStream();
		//从输入流读数据，获得图片二进制数据
		byte[]data=readInputStream(is);
		//通过输出流将数据写到文件中，生成新的文件
		File file=new File("baidu.png");
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(data);
		fos.close();
	}
	
	//从输入流读数据到缓冲区存放在字节数组中。
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


