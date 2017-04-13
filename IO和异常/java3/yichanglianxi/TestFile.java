package java3.yichanglianxi;

import java.io.File;
/*文件操作：
 * */
public class TestFile {
	public static void main(String[] args) {
		//File f=new File("D:/新建文件夹");
		TestFile tf=new TestFile();
		tf.create("d:/hhhh/hhh/hh");
		tf.find("D:/新建文件夹/beijing.png");
		
		
		
	}
	public void create(String a){
		File f=new File(a);
		System.out.println(f.mkdirs());
	}
	public void find(String a){
		File f=new File(a);
		if(f.exists()){
		System.out.println("文件名："+f.getName()+"\n路径："+f.getPath());
		System.out.println("目录下有：");
		if(f.isDirectory()){
			for(int i=0;i<f.list().length;i++){
				System.out.println(f.list()[i]);
			}
			
		}else
		System.out.println("大小："+f.getTotalSpace());
		
		}
	}

}
