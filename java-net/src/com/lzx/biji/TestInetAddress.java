package com.lzx.biji;
/*InetAddress类
 * */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia=InetAddress.getLocalHost();
		//获取本机的InetAddress对象(ip地址对象)；
		//后面根据这个对象来获取各种和这个ip有关的信息；
		System.out.println(ia.getHostAddress());
		//获得本机ip地址字符串；
		System.out.println(ia.getHostName());
		//获得本机名；	
		InetAddress ia1=InetAddress.getByName("baidu.com");
		//传入一个主机名字符串来获得对象
		System.out.println(ia1.getHostAddress());		
		InetAddress ia2=InetAddress.getByName("192.168.1.154");
		//传入一个ip地址字符串来获得对象，其实getByName()里可以传入ip地址，主机名，域名
		System.out.println(ia2.getHostAddress());
	}
}
