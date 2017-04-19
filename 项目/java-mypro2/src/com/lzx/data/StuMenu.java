package com.lzx.data;

import com.lzx.manager.StudentManager;
import java.util.Scanner;
public class StuMenu {
	Scanner in=new Scanner(System.in);
	StudentManager sm=new StudentManager();
	public void zhuMenu(){
		System.out.println("----------------学院管理系统----------------");
		System.out.println("		1.查询所有学员");
		System.out.println("		2.新增学员信息");
		System.out.println("		3.修改学员信息");
		System.out.println("		4.删除学员信息");
		System.out.println("		5.查询特定学员");
		System.out.println("		6.按照成绩排序");
		System.out.println("-----------------------------------------");
		System.out.println("请输入您的操作：");
	}
	public void op(){
		zhuMenu();
		switch(in.nextInt()){
		case 1:
			stu1();
			sm.findStu();
			stu2();
			System.out.println("按任意键返回");
			in.next();
			op();
			break;
		case 2:
			System.out.println("name:");
			String name=in.next();
			System.out.println("sex:");
			boolean sex;
			if(in.nextInt()==1){
			 sex=true;
			}else{
			 sex=false;
			}			
			System.out.println("age:");
			int age=in.nextInt();
			System.out.println("className:");
			String className=in.next();
			System.out.println("score:");
			int score=in.nextInt();
			sm.addStu(name, sex, age, className, score);
			stu2();
			System.out.println("按任意键返回");
			in.next();
			op();
			break;
		case 3:
			sm.findStu();			
			System.out.println("输入ID");
			int id=in.nextInt();
			System.out.println("new Name:(~不修改)");
			String name1=in.next();
			if(!(name1.equals("~"))){
				sm.alterStu(id,name1);
			}
			System.out.println("new Age:(0不修改)");
			int age1=in.nextInt();
			if(age1!=0){
				sm.alterStu(id, age1);
			}
			System.out.println("new Sex:");
			int ss=in.nextInt();
			if(ss==1){
				sm.alterStu(id,true);
			}else sm.alterStu(id,false);
			stu2();
			System.out.println("按任意键返回");
			in.next();
			op();
			break;
		case 4:
			System.out.println("输入ID");
			int id2=in.nextInt();
			if(sm.checkStu(id2)){
				System.out.println("学员已经找到，要删除（Y/n）");
				if(in.next().equals("y")){
					sm.deleteStu(id2);
					}
				else{
					System.out.println("取消删除");
				}
				}
			else{
				System.out.println("学员未找到");
			}
			stu2();
			System.out.println("按任意键返回");
			in.next();
			op();
			break;
		case 5:
			System.out.println("请输入ID");
			sm.checkStu(in.nextInt());
			stu2();
			System.out.println("按任意键返回");
			in.next();
			op();
			break;
		case 6:
			sm.sortStu();
			stu2();
			System.out.println("按任意键返回");
			in.next();
			op();
			break;
			
			}
		
		
		
		
			
	}

	public void stu1(){
		System.out.println("=============================================");
		System.out.println("         学员信息列表");
		System.out.println("=============================================");
	}
	public void stu2(){
		System.out.println("=============================================");
		System.out.println("输入任意数字：");
	}
}

