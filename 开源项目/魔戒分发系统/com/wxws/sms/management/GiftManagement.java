/*   1:    */ package com.wxws.sms.management;
/*   2:    */ 
/*   3:    */ import com.wxws.sms.data.Customer;
/*   4:    */ import com.wxws.sms.data.Gift;
/*   5:    */ import com.wxws.sms.data.Goods;
/*   6:    */ import java.io.PrintStream;
/*   7:    */ import java.util.Scanner;
/*   8:    */ 
/*   9:    */ public class GiftManagement
/*  10:    */ {
/*  11: 11 */   public Goods[] goods = new Goods[50];
/*  12: 13 */   public Customer[] customers = new Customer[100];
/*  13:    */   
/*  14:    */   public void setData(Goods[] goods, Customer[] customers)
/*  15:    */   {
/*  16: 19 */     this.goods = goods;
/*  17: 20 */     this.customers = customers;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void returnLastMenu()
/*  21:    */   {
/*  22: 28 */     System.out.print("\n\n请按'n'返回上一级菜单:");
/*  23: 29 */     Scanner input = new Scanner(System.in);
/*  24: 30 */     boolean con = true;
/*  25:    */     do
/*  26:    */     {
/*  27: 32 */       if (input.next().equals("n"))
/*  28:    */       {
/*  29: 33 */         Menu menu = new Menu();
/*  30: 34 */         menu.setData(this.goods, this.customers);
/*  31: 35 */         menu.showSendGMenu();
/*  32:    */       }
/*  33:    */       else
/*  34:    */       {
/*  35: 37 */         System.out.print("输入错误, 请重新'n'返回上一级菜单：");
/*  36: 38 */         con = false;
/*  37:    */       }
/*  38: 31 */     } while (!
/*  39:    */     
/*  40:    */ 
/*  41:    */ 
/*  42:    */ 
/*  43:    */ 
/*  44:    */ 
/*  45:    */ 
/*  46:    */ 
/*  47: 40 */       con);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void sendBirthCust()
/*  51:    */   {
/*  52: 47 */     System.out.println("魔界饰品分发系统 > 生日问候\n\n");
/*  53: 48 */     System.out.print("请输入今天的日期(月/日<用两位表示>)：");
/*  54: 49 */     Scanner input = new Scanner(System.in);
/*  55: 50 */     String date = input.next();
/*  56: 51 */     System.out.println(date);
/*  57: 52 */     String no = "";
/*  58: 53 */     boolean isAvailable = false;
/*  59: 54 */     for (int i = 0; i < this.customers.length; i++) {
/*  60: 55 */       if ((this.customers[i].custBirth != null) && (this.customers[i].custBirth.equals(date)))
/*  61:    */       {
/*  62: 56 */         no = no + this.customers[i].custNo + "\n";
/*  63: 57 */         isAvailable = true;
/*  64:    */       }
/*  65:    */     }
/*  66: 60 */     if (isAvailable)
/*  67:    */     {
/*  68: 61 */       System.out.println("过生日的会员是：");
/*  69: 62 */       System.out.println(no);
/*  70: 63 */       System.out.println("恭喜！获赠MP3一个！");
/*  71:    */     }
/*  72:    */     else
/*  73:    */     {
/*  74: 65 */       System.out.println("今天没有过生日的会员！");
/*  75:    */     }
/*  76: 69 */     returnLastMenu();
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void sendLuckyCust()
/*  80:    */   {
/*  81: 76 */     System.out.println("魔界饰品分发系统 > 幸运抽奖\n\n");
/*  82: 77 */     System.out.print("是否开始（y/n）：");
/*  83: 78 */     Scanner input = new Scanner(System.in);
/*  84: 79 */     if (input.next().equals("y"))
/*  85:    */     {
/*  86: 80 */       int random = (int)(Math.random() * 10.0D);
/*  87:    */       
/*  88:    */ 
/*  89: 83 */       boolean isAvailable = false;
/*  90: 84 */       String list = "";
/*  91: 85 */       for (int i = 0; i < this.customers.length; i++)
/*  92:    */       {
/*  93: 86 */         if (this.customers[i].custNo == 0) {
/*  94:    */           break;
/*  95:    */         }
/*  96: 89 */         int baiwei = this.customers[i].custNo / 100 % 10;
/*  97: 90 */         if (baiwei == random)
/*  98:    */         {
/*  99: 91 */           list = list + this.customers[i].custNo + "\t";
/* 100: 92 */           isAvailable = true;
/* 101:    */         }
/* 102:    */       }
/* 103: 95 */       if (isAvailable) {
/* 104: 96 */         System.out.println("幸运客户获赠MP3：" + list);
/* 105:    */       } else {
/* 106: 98 */         System.out.println("无幸运客户。");
/* 107:    */       }
/* 108:    */     }
/* 109:103 */     returnLastMenu();
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void sendGoldenCust()
/* 113:    */   {
/* 114:109 */     System.out.println("魔界饰品分发系统 > 幸运大放送\n\n");
/* 115:110 */     int index = 0;
/* 116:111 */     int max = this.customers[0].custScore;
/* 117:113 */     for (int i = 0; i < this.customers.length; i++)
/* 118:    */     {
/* 119:114 */       if (this.customers[i].custScore == 0) {
/* 120:    */         break;
/* 121:    */       }
/* 122:118 */       if (this.customers[i].custScore > max)
/* 123:    */       {
/* 124:119 */         max = this.customers[i].custScore;
/* 125:120 */         index = i;
/* 126:    */       }
/* 127:    */     }
/* 128:123 */     System.out.println("具有最高积分的会员是： " + this.customers[index].custNo + "\t" + this.customers[index].custBirth + "\t" + this.customers[index].custScore);
/* 129:    */     
/* 130:125 */     Gift laptop = new Gift();
/* 131:126 */     laptop.name = "苹果笔记本电脑";
/* 132:127 */     laptop.price = 12000.0D;
/* 133:128 */     System.out.print("恭喜！获赠礼品： ");
/* 134:129 */     System.out.println(laptop);
/* 135:    */     
/* 136:    */ 
/* 137:132 */     returnLastMenu();
/* 138:    */   }
/* 139:    */ }


/* Location:           C:\Users\Administrator\Desktop\魔界装备分发系统\
 * Qualified Name:     com.wxws.sms.management.GiftManagement
 * JD-Core Version:    0.7.0.1
 */