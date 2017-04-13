/*   1:    */ package com.wxws.sms.management;
/*   2:    */ 
/*   3:    */ import com.wxws.sms.data.Customer;
/*   4:    */ import com.wxws.sms.data.Goods;
/*   5:    */ import java.io.PrintStream;
/*   6:    */ import java.util.Scanner;
/*   7:    */ 
/*   8:    */ public class Menu
/*   9:    */ {
/*  10: 13 */   public Goods[] goods = new Goods[50];
/*  11: 15 */   public Customer[] customers = new Customer[100];
/*  12:    */   
/*  13:    */   public void setData(Goods[] goods, Customer[] customers)
/*  14:    */   {
/*  15: 21 */     this.goods = goods;
/*  16: 22 */     this.customers = customers;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void showLoginMenu()
/*  20:    */   {
/*  21: 29 */     System.out.println("\n\n\t\t\t    欢迎使用魔界饰品分发系统\n\n");
/*  22: 30 */     System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
/*  23: 31 */     System.out.println("\t\t\t\t 1. 登 录 系 统\n\n");
/*  24: 32 */     System.out.println("\t\t\t\t 2. 更 改 管 理 员 密 码\n\n");
/*  25: 33 */     System.out.println("\t\t\t\t 3. 退 出\n\n");
/*  26:    */     
/*  27: 35 */     System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
/*  28: 36 */     System.out.print("请选择,输入数字:");
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void showMainMenu()
/*  32:    */   {
/*  33: 43 */     System.out.println("\n\n\t\t\t\t欢迎使用魔界饰品分发系统\n");
/*  34: 44 */     System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
/*  35: 45 */     System.out.println("\t\t\t\t 1. 客 户 信 息 管 理\n");
/*  36: 46 */     System.out.println("\t\t\t\t 2. 购 物 结 算\n");
/*  37: 47 */     System.out.println("\t\t\t\t 3. 真 情 回 馈\n");
/*  38: 48 */     System.out.println("\t\t\t\t 4. 注 销\n");
/*  39: 49 */     System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
/*  40: 50 */     System.out.print("请选择,输入数字:");
/*  41:    */     
/*  42: 52 */     Scanner input = new Scanner(System.in);
/*  43: 53 */     boolean con = false;
/*  44:    */     do
/*  45:    */     {
/*  46: 55 */       String num = input.next();
/*  47: 56 */       if (num.equals("1"))
/*  48:    */       {
/*  49: 58 */         showCustMMenu();
/*  50: 59 */         break;
/*  51:    */       }
/*  52: 60 */       if (num.equals("2"))
/*  53:    */       {
/*  54: 62 */         Pay pay = new Pay();
/*  55: 63 */         pay.setData(this.goods, this.customers);
/*  56: 64 */         pay.calcPrice();
/*  57: 65 */         break;
/*  58:    */       }
/*  59: 66 */       if (num.equals("3"))
/*  60:    */       {
/*  61: 68 */         showSendGMenu();
/*  62: 69 */         break;
/*  63:    */       }
/*  64: 70 */       if (num.equals("4"))
/*  65:    */       {
/*  66: 71 */         showLoginMenu();
/*  67: 72 */         break;
/*  68:    */       }
/*  69: 74 */       System.out.print("输入错误，请重新输入数字：");
/*  70: 75 */       con = false;
/*  71: 54 */     } while (!
/*  72:    */     
/*  73:    */ 
/*  74:    */ 
/*  75:    */ 
/*  76:    */ 
/*  77:    */ 
/*  78:    */ 
/*  79:    */ 
/*  80:    */ 
/*  81:    */ 
/*  82:    */ 
/*  83:    */ 
/*  84:    */ 
/*  85:    */ 
/*  86:    */ 
/*  87:    */ 
/*  88:    */ 
/*  89:    */ 
/*  90:    */ 
/*  91:    */ 
/*  92:    */ 
/*  93:    */ 
/*  94: 77 */       con);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void showCustMMenu()
/*  98:    */   {
/*  99: 85 */     System.out.println("魔界饰品分发系统 > 客户信息管理\n");
/* 100: 86 */     System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
/* 101: 87 */     System.out.println("\t\t\t\t 1. 显 示 所 有 客 户 信 息\n");
/* 102: 88 */     System.out.println("\t\t\t\t 2. 添 加 客 户 信 息\n");
/* 103: 89 */     System.out.println("\t\t\t\t 3. 修 改 客 户 信 息\n");
/* 104: 90 */     System.out.println("\t\t\t\t 4. 查 询 客 户 信 息\n");
/* 105: 91 */     System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
/* 106: 92 */     System.out.print("请选择,输入数字或按'n'返回上一级菜单:");
/* 107: 93 */     Scanner input = new Scanner(System.in);
/* 108:    */     
/* 109: 95 */     boolean con = true;
/* 110:    */     do
/* 111:    */     {
/* 112: 97 */       CustManagement cm = new CustManagement();
/* 113: 98 */       cm.setData(this.goods, this.customers);
/* 114: 99 */       String num = input.next();
/* 115:100 */       if (num.equals("1"))
/* 116:    */       {
/* 117:101 */         cm.show();
/* 118:102 */         break;
/* 119:    */       }
/* 120:103 */       if (num.equals("2"))
/* 121:    */       {
/* 122:104 */         cm.add();
/* 123:105 */         break;
/* 124:    */       }
/* 125:106 */       if (num.equals("3"))
/* 126:    */       {
/* 127:107 */         cm.modify();
/* 128:108 */         break;
/* 129:    */       }
/* 130:109 */       if (num.equals("4"))
/* 131:    */       {
/* 132:110 */         cm.search();
/* 133:111 */         break;
/* 134:    */       }
/* 135:113 */       if (num.equals("n"))
/* 136:    */       {
/* 137:114 */         showMainMenu();
/* 138:115 */         break;
/* 139:    */       }
/* 140:117 */       System.out.println("输入错误, 请重新输入数字：");
/* 141:118 */       con = false;
/* 142: 96 */     } while (!
/* 143:    */     
/* 144:    */ 
/* 145:    */ 
/* 146:    */ 
/* 147:    */ 
/* 148:    */ 
/* 149:    */ 
/* 150:    */ 
/* 151:    */ 
/* 152:    */ 
/* 153:    */ 
/* 154:    */ 
/* 155:    */ 
/* 156:    */ 
/* 157:    */ 
/* 158:    */ 
/* 159:    */ 
/* 160:    */ 
/* 161:    */ 
/* 162:    */ 
/* 163:    */ 
/* 164:    */ 
/* 165:    */ 
/* 166:120 */       con);
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void showSendGMenu()
/* 170:    */   {
/* 171:127 */     System.out.println("魔界饰品分发系统 > 真情回馈\n");
/* 172:128 */     System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
/* 173:129 */     System.out.println("\t\t\t\t 1. 幸 运 大 放 送\n");
/* 174:130 */     System.out.println("\t\t\t\t 2. 幸 运 抽 奖\n");
/* 175:131 */     System.out.println("\t\t\t\t 3. 生 日 问 候\n");
/* 176:132 */     System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
/* 177:133 */     System.out.print("请选择,输入数字或按'n'返回上一级菜单:");
/* 178:134 */     Scanner input = new Scanner(System.in);
/* 179:    */     
/* 180:136 */     boolean con = true;
/* 181:137 */     GiftManagement gm = new GiftManagement();
/* 182:138 */     gm.setData(this.goods, this.customers);
/* 183:    */     do
/* 184:    */     {
/* 185:140 */       String num = input.next();
/* 186:141 */       if (num.equals("1"))
/* 187:    */       {
/* 188:143 */         gm.sendGoldenCust();
/* 189:144 */         break;
/* 190:    */       }
/* 191:145 */       if (num.equals("2"))
/* 192:    */       {
/* 193:147 */         gm.sendLuckyCust();
/* 194:148 */         break;
/* 195:    */       }
/* 196:149 */       if (num.equals("3"))
/* 197:    */       {
/* 198:151 */         gm.sendBirthCust();
/* 199:152 */         break;
/* 200:    */       }
/* 201:153 */       if (num.equals("n"))
/* 202:    */       {
/* 203:154 */         showMainMenu();
/* 204:155 */         break;
/* 205:    */       }
/* 206:157 */       System.out.println("输入错误, 请重新输入数字：");
/* 207:158 */       con = false;
/* 208:139 */     } while (!
/* 209:    */     
/* 210:    */ 
/* 211:    */ 
/* 212:    */ 
/* 213:    */ 
/* 214:    */ 
/* 215:    */ 
/* 216:    */ 
/* 217:    */ 
/* 218:    */ 
/* 219:    */ 
/* 220:    */ 
/* 221:    */ 
/* 222:    */ 
/* 223:    */ 
/* 224:    */ 
/* 225:    */ 
/* 226:    */ 
/* 227:    */ 
/* 228:    */ 
/* 229:160 */       con);
/* 230:    */   }
/* 231:    */ }


/* Location:           C:\Users\Administrator\Desktop\魔界装备分发系统\
 * Qualified Name:     com.wxws.sms.management.Menu
 * JD-Core Version:    0.7.0.1
 */