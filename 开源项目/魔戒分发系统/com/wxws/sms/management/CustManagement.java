/*   1:    */ package com.wxws.sms.management;
/*   2:    */ 
/*   3:    */ import com.wxws.sms.data.Customer;
/*   4:    */ import com.wxws.sms.data.Goods;
/*   5:    */ import java.io.PrintStream;
/*   6:    */ import java.util.Scanner;
/*   7:    */ 
/*   8:    */ public class CustManagement
/*   9:    */ {
/*  10: 10 */   public Goods[] goods = new Goods[50];
/*  11: 12 */   public Customer[] customers = new Customer[100];
/*  12:    */   
/*  13:    */   public void setData(Goods[] goods, Customer[] customers)
/*  14:    */   {
/*  15: 18 */     this.goods = goods;
/*  16: 19 */     this.customers = customers;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void returnLastMenu()
/*  20:    */   {
/*  21: 26 */     System.out.print("\n\n请按'n'返回上一级菜单:");
/*  22: 27 */     Scanner input = new Scanner(System.in);
/*  23: 28 */     boolean con = true;
/*  24:    */     do
/*  25:    */     {
/*  26: 30 */       if (input.next().equals("n"))
/*  27:    */       {
/*  28: 31 */         Menu menu = new Menu();
/*  29: 32 */         menu.setData(this.goods, this.customers);
/*  30: 33 */         menu.showCustMMenu();
/*  31:    */       }
/*  32:    */       else
/*  33:    */       {
/*  34: 35 */         System.out.print("输入错误, 请重新'n'返回上一级菜单：");
/*  35: 36 */         con = false;
/*  36:    */       }
/*  37: 29 */     } while (!
/*  38:    */     
/*  39:    */ 
/*  40:    */ 
/*  41:    */ 
/*  42:    */ 
/*  43:    */ 
/*  44:    */ 
/*  45:    */ 
/*  46: 38 */       con);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void add()
/*  50:    */   {
/*  51: 45 */     System.out.println("魔界饰品分发系统 > 客户信息管理 > 添加客户信息\n\n");
/*  52: 46 */     String con = "n";
/*  53:    */     
/*  54: 48 */     int index = -1;
/*  55: 49 */     for (int i = 0; i < this.customers.length; i++) {
/*  56: 50 */       if (this.customers[i].custNo == 0)
/*  57:    */       {
/*  58: 51 */         index = i;
/*  59: 52 */         break;
/*  60:    */       }
/*  61:    */     }
/*  62:    */     do
/*  63:    */     {
/*  64: 57 */       Scanner input = new Scanner(System.in);
/*  65: 58 */       System.out.print("请输入会员号(<4位整数>)：");
/*  66: 59 */       int no = input.nextInt();
/*  67: 60 */       System.out.print("请输入会员生日（月/日<用两位数表示>）：");
/*  68: 61 */       String birth = input.next();
/*  69: 62 */       System.out.print("请输入积分：");
/*  70: 63 */       int score = input.nextInt();
/*  71: 66 */       if ((no < 1000) || (no > 9999))
/*  72:    */       {
/*  73: 67 */         System.out.println("客户号" + no + "是无效会员号！");
/*  74: 68 */         System.out.println("录入信息失败\n");
/*  75: 69 */         System.out.println("继续添加会员吗？（y/n）");
/*  76: 70 */         con = input.next();
/*  77:    */       }
/*  78:    */       else
/*  79:    */       {
/*  80: 75 */         this.customers[index].custNo = no;
/*  81: 76 */         this.customers[index].custBirth = birth;
/*  82: 77 */         this.customers[(index++)].custScore = score;
/*  83: 78 */         System.out.println("新会员添加成功！");
/*  84: 79 */         System.out.println("继续添加会员吗？（y/n）");
/*  85: 80 */         con = input.next();
/*  86:    */       }
/*  87: 81 */     } while (("y".equals(con)) || ("Y".equals(con)));
/*  88: 82 */     returnLastMenu();
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void modify()
/*  92:    */   {
/*  93: 89 */     System.out.println("魔界饰品分发系统 > 客户信息管理 > 修改客户信息\n\n");
/*  94: 90 */     System.out.print("请输入会员号：");
/*  95: 91 */     Scanner input = new Scanner(System.in);
/*  96: 92 */     int no = input.nextInt();
/*  97: 93 */     System.out.println("  会员号            生日             积分      ");
/*  98: 94 */     System.out.println("------------|------------|---------------");
/*  99: 95 */     int index = -1;
/* 100: 96 */     for (int i = 0; i < this.customers.length; i++) {
/* 101: 97 */       if (this.customers[i].custNo == no)
/* 102:    */       {
/* 103: 98 */         System.out.println(this.customers[i].custNo + "\t\t" + 
/* 104: 99 */           this.customers[i].custBirth + "\t\t" + 
/* 105:100 */           this.customers[i].custScore);
/* 106:101 */         index = i;
/* 107:102 */         break;
/* 108:    */       }
/* 109:    */     }
/* 110:106 */     if (index != -1)
/* 111:    */     {
/* 112:    */       String flag;
/* 113:    */       do
/* 114:    */       {
/* 115:109 */         System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
/* 116:110 */         System.out.println("\t\t\t\t1.修 改 会 员 生 日.\n");
/* 117:111 */         System.out.println("\t\t\t\t2.修 改 会 员 积 分.\n");
/* 118:112 */         System.out
/* 119:113 */           .println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
/* 120:114 */         System.out.print("请选择，输入数字：");
/* 121:115 */         switch (input.nextInt())
/* 122:    */         {
/* 123:    */         case 1: 
/* 124:117 */           System.out.print("请输入修改后的生日：");
/* 125:118 */           this.customers[index].custBirth = input.next();
/* 126:119 */           System.out.println("生日信息已更改！");
/* 127:120 */           break;
/* 128:    */         case 2: 
/* 129:122 */           System.out.print("请输入修改后的会员积分：");
/* 130:123 */           this.customers[index].custScore = input.nextInt();
/* 131:124 */           System.out.println("会员积分已更改！");
/* 132:    */         }
/* 133:128 */         System.out.println("是否修改其他属性(y/n):");
/* 134:129 */         flag = input.next();
/* 135:131 */       } while (!"n".equalsIgnoreCase(flag));
/* 136:    */     }
/* 137:    */     else
/* 138:    */     {
/* 139:135 */       System.out.println("抱歉，没有你查询的会员。");
/* 140:    */     }
/* 141:139 */     returnLastMenu();
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void search()
/* 145:    */   {
/* 146:147 */     System.out.println("魔界饰品分发系统 > 客户信息管理 > 查询客户信息\n");
/* 147:148 */     String con = "y";
/* 148:149 */     Scanner input = new Scanner(System.in);
/* 149:150 */     while (con.equals("y"))
/* 150:    */     {
/* 151:151 */       System.out.print("请输入会员号：");
/* 152:152 */       int no = input.nextInt();
/* 153:153 */       System.out.println("  会员号            生日             积分      ");
/* 154:154 */       System.out.println("------------|------------|---------------");
/* 155:155 */       boolean isAvailable = false;
/* 156:156 */       for (int i = 0; i < this.customers.length; i++) {
/* 157:157 */         if (this.customers[i].custNo == no)
/* 158:    */         {
/* 159:158 */           System.out.println(this.customers[i].custNo + "\t\t" + 
/* 160:159 */             this.customers[i].custBirth + "\t\t" + 
/* 161:160 */             this.customers[i].custScore);
/* 162:161 */           isAvailable = true;
/* 163:162 */           break;
/* 164:    */         }
/* 165:    */       }
/* 166:165 */       if (!isAvailable) {
/* 167:166 */         System.out.println("抱歉，没有你查询的会员信息。");
/* 168:    */       }
/* 169:168 */       System.out.print("\n要继续查询吗（y/n）:");
/* 170:169 */       con = input.next();
/* 171:    */     }
/* 172:173 */     returnLastMenu();
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void show()
/* 176:    */   {
/* 177:180 */     System.out.println("魔界饰品分发系统 > 客户信息管理 > 显示客户信息\n\n");
/* 178:181 */     System.out.println("  会员号            生日             积分      ");
/* 179:182 */     System.out.println("------------|------------|---------------");
/* 180:183 */     int length = this.customers.length;
/* 181:184 */     for (int i = 0; i < length; i++)
/* 182:    */     {
/* 183:185 */       if (this.customers[i].custNo == 0) {
/* 184:    */         break;
/* 185:    */       }
/* 186:188 */       System.out.println(this.customers[i].custNo + "\t\t" + 
/* 187:189 */         this.customers[i].custBirth + "\t\t" + this.customers[i].custScore);
/* 188:    */     }
/* 189:193 */     returnLastMenu();
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void AgeRate(int ageline)
/* 193:    */   {
/* 194:200 */     int young = 0;
/* 195:201 */     int old = 0;
/* 196:202 */     int age = 0;
/* 197:203 */     Scanner input = new Scanner(System.in);
/* 198:204 */     for (int i = 0; i < 10; i++)
/* 199:    */     {
/* 200:205 */       System.out.print("请输入第" + (i + 1) + "位顾客的年龄：");
/* 201:206 */       age = input.nextInt();
/* 202:207 */       if ((age > 0) && (age <= 30)) {
/* 203:208 */         young++;
/* 204:    */       }
/* 205:    */     }
/* 206:211 */     System.out.println("30岁以下的比例是：" + young / 10.0D * 100.0D + "%");
/* 207:212 */     System.out.println("30岁以上的比例是：" + (1.0D - young / 10.0D) * 100.0D + "%");
/* 208:    */   }
/* 209:    */ }


/* Location:           C:\Users\Administrator\Desktop\魔界装备分发系统\
 * Qualified Name:     com.wxws.sms.management.CustManagement
 * JD-Core Version:    0.7.0.1
 */