/*  1:   */ package com.wxws.sms.management;
/*  2:   */ 
/*  3:   */ import java.io.PrintStream;
/*  4:   */ import java.util.Scanner;
/*  5:   */ 
/*  6:   */ public class VerifyEqual
/*  7:   */ {
/*  8:   */   public boolean verify(String username, String password)
/*  9:   */   {
/* 10: 8 */     System.out.print("请输入用户名：");
/* 11: 9 */     Scanner input = new Scanner(System.in);
/* 12:10 */     String name = input.next();
/* 13:11 */     System.out.print("请输入密码：");
/* 14:12 */     input = new Scanner(System.in);
/* 15:13 */     String psw = input.next();
/* 16:14 */     if ((name.equals(username)) && (password.equals(psw))) {
/* 17:15 */       return true;
/* 18:   */     }
/* 19:17 */     return false;
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Users\Administrator\Desktop\魔界装备分发系统\
 * Qualified Name:     com.wxws.sms.management.VerifyEqual
 * JD-Core Version:    0.7.0.1
 */