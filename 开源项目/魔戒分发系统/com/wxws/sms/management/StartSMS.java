/*  1:   */ package com.wxws.sms.management;
/*  2:   */ 
/*  3:   */ import com.wxws.sms.data.Data;
/*  4:   */ import com.wxws.sms.data.Manager;
/*  5:   */ import java.io.PrintStream;
/*  6:   */ import java.util.Scanner;
/*  7:   */ 
/*  8:   */ public class StartSMS
/*  9:   */ {
/* 10:   */   public static void main(String[] args)
/* 11:   */   {
/* 12:13 */     Data initial = new Data();
/* 13:14 */     initial.ini();
/* 14:   */     
/* 15:   */ 
/* 16:   */ 
/* 17:18 */     Menu menu = new Menu();
/* 18:19 */     menu.setData(initial.goods, initial.customers);
/* 19:20 */     menu.showLoginMenu();
/* 20:   */     
/* 21:   */ 
/* 22:23 */     boolean con = true;
/* 23:24 */     while (con)
/* 24:   */     {
/* 25:25 */       Scanner input = new Scanner(System.in);
/* 26:26 */       int choice = input.nextInt();
/* 27:27 */       VerifyEqual pv = new VerifyEqual();
/* 28:28 */       switch (choice)
/* 29:   */       {
/* 30:   */       case 1: 
/* 31:31 */         System.out.println("(测试账户:manager 密码:0000)");
/* 32:32 */         for (int i = 3; i >= 1; i--)
/* 33:   */         {
/* 34:33 */           if (pv.verify(initial.manager.username, initial.manager.password))
/* 35:   */           {
/* 36:34 */             menu.showMainMenu();
/* 37:35 */             break;
/* 38:   */           }
/* 39:36 */           if (i != 1)
/* 40:   */           {
/* 41:37 */             System.out.println("\n用户名和密码不匹配，请重新输入：");
/* 42:   */           }
/* 43:   */           else
/* 44:   */           {
/* 45:39 */             System.out.println("\n您没有权限进入系统！谢谢！");
/* 46:40 */             con = false;
/* 47:   */           }
/* 48:   */         }
/* 49:43 */         break;
/* 50:   */       case 2: 
/* 51:45 */         if (pv.verify(initial.manager.username, initial.manager.password))
/* 52:   */         {
/* 53:46 */           System.out.print("请输入新的用户名：");
/* 54:47 */           String name = input.next();
/* 55:48 */           System.out.print("请输入新的密码：");
/* 56:49 */           String pwd = input.next();
/* 57:   */           
/* 58:51 */           System.out.print("请再次输入新的密码：");
/* 59:52 */           String repwd = input.next();
/* 60:53 */           if (pwd.equals(repwd))
/* 61:   */           {
/* 62:54 */             initial.manager.username = name;
/* 63:55 */             initial.manager.password = pwd;
/* 64:56 */             System.out.println("用户名和密码已更改！");
/* 65:   */           }
/* 66:   */           else
/* 67:   */           {
/* 68:59 */             System.out.println("两次密码不一致。");
/* 69:   */           }
/* 70:62 */           System.out.println("\n请选择，输入数字：");
/* 71:   */         }
/* 72:   */         else
/* 73:   */         {
/* 74:64 */           System.out.println("抱歉，你没有权限修改！");
/* 75:65 */           con = false;
/* 76:   */         }
/* 77:67 */         break;
/* 78:   */       case 3: 
/* 79:69 */         System.out.println("谢谢您的使用！");
/* 80:70 */         con = false;
/* 81:71 */         break;
/* 82:   */       default: 
/* 83:73 */         System.out.print("\n输入有误！请重新选择，输入数字: ");
/* 84:   */       }
/* 85:75 */       if (!con) {
/* 86:   */         break;
/* 87:   */       }
/* 88:   */     }
/* 89:   */   }
/* 90:   */ }


/* Location:           C:\Users\Administrator\Desktop\魔界装备分发系统\
 * Qualified Name:     com.wxws.sms.management.StartSMS
 * JD-Core Version:    0.7.0.1
 */