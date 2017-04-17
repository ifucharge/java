package com.lzx.iolianxi;
/*查找.ini的文件，并显示所有内容：
 * */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FindFile {
	public static void main(String[] args) {
		FindFile ff=new FindFile();
		ff.find("c:/windows");
	}
	public void find(String path){
		//File[] fil=new File[];
		int len=0;
		File file=new File(path);
		byte[] bb=new byte[1024];
		
		for(File fi:file.listFiles()){
			if(fi.isDirectory()){
				try{
				find(fi.getAbsolutePath());}
				catch(NullPointerException e){
					System.out.println("空指针");
				}
			}else if(fi.getName().contains(".ini")){
				System.out.println(fi.getName());
				FileInputStream fis=null;
				try {
					fis=new FileInputStream(fi);
					while((len=fis.read(bb))!=-1){
						System.out.println(new String(bb,0,len));
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(fis!=null){
						try {
							fis.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
			}
		}
	}

}
