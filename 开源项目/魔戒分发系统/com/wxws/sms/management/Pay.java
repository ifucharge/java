/*   1:    */ package com.wxws.sms.management;
/*   2:    */ 
/*   3:    */ import com.wxws.sms.data.Customer;
/*   4:    */ import com.wxws.sms.data.Goods;
/*   5:    */ import java.io.PrintStream;
/*   6:    */ import java.util.Scanner;
/*   7:    */ 
/*   8:    */ public class Pay
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
/*  19:    */   public double getDiscount(int curCustNo, Customer[] customers)
/*  20:    */   {
/*  21: 27 */     int index = -1;
/*  22: 28 */     for (int i = 0; i < customers.length; i++) {
/*  23: 29 */       if (curCustNo == customers[i].custNo)
/*  24:    */       {
/*  25: 30 */         index = i;
/*  26: 31 */         break;
/*  27:    */       }
/*  28:    */     }
/*  29:    */     double discount;
/*  30:    */     double discount;
/*  31: 35 */     if (index == -1)
/*  32:    */     {
/*  33: 36 */       discount = -1.0D;
/*  34:    */     }
/*  35:    */     else
/*  36:    */     {
/*  37: 41 */       int curscore = customers[index].custScore;
/*  38:    */       double discount;
/*  39: 42 */       if (curscore < 1000)
/*  40:    */       {
/*  41: 43 */         discount = 0.95D;
/*  42:    */       }
/*  43:    */       else
/*  44:    */       {
/*  45:    */         double discount;
/*  46: 44 */         if ((1000 <= curscore) && (curscore < 2000))
/*  47:    */         {
/*  48: 45 */           discount = 0.9D;
/*  49:    */         }
/*  50:    */         else
/*  51:    */         {
/*  52:    */           double discount;
/*  53: 46 */           if ((2000 <= curscore) && (curscore < 3000))
/*  54:    */           {
/*  55: 47 */             discount = 0.85D;
/*  56:    */           }
/*  57:    */           else
/*  58:    */           {
/*  59:    */             double discount;
/*  60: 48 */             if ((3000 <= curscore) && (curscore < 4000))
/*  61:    */             {
/*  62: 49 */               discount = 0.8D;
/*  63:    */             }
/*  64:    */             else
/*  65:    */             {
/*  66:    */               double discount;
/*  67: 50 */               if ((4000 <= curscore) && (curscore < 6000))
/*  68:    */               {
/*  69: 51 */                 discount = 0.75D;
/*  70:    */               }
/*  71:    */               else
/*  72:    */               {
/*  73:    */                 double discount;
/*  74: 52 */                 if ((6000 <= curscore) && (curscore < 8000)) {
/*  75: 53 */                   discount = 0.7D;
/*  76:    */                 } else {
/*  77: 55 */                   discount = 0.6D;
/*  78:    */                 }
/*  79:    */               }
/*  80:    */             }
/*  81:    */           }
/*  82:    */         }
/*  83:    */       }
/*  84:    */     }
/*  85: 58 */     return discount;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void calcPrice()
/*  89:    */   {
/*  90: 67 */     int goodsNo = 0;
/*  91:    */     
/*  92:    */ 
/*  93:    */ 
/*  94:    */ 
/*  95: 72 */     String goodsList = "";
/*  96: 73 */     double total = 0.0D;
/*  97: 74 */     double finalPay = 0.0D;
/*  98:    */     
/*  99:    */ 
/* 100: 77 */     System.out.println("魔界饰品分发系统 > 购物结算\n\n");
/* 101:    */     
/* 102:    */ 
/* 103: 80 */     System.out.println("*************************************");
/* 104: 81 */     System.out.println("请选择购买的商品编号：");
/* 105: 82 */     int i = 0;
/* 106: 82 */     for (int p = 0; (i < this.goods.length) && (this.goods[i].goodsName != null); i++)
/* 107:    */     {
/* 108: 83 */       p++;
/* 109: 84 */       System.out.println(p + ": " + this.goods[i].goodsName + "\t");
/* 110:    */     }
/* 111: 86 */     System.out.println("*************************************\n");
/* 112:    */     
/* 113:    */ 
/* 114: 89 */     Scanner input = new Scanner(System.in);
/* 115: 90 */     System.out.print("\t请输入会员号：");
/* 116: 91 */     int curCustNo = input.nextInt();
/* 117: 92 */     double discount = getDiscount(curCustNo, this.customers);
/* 118: 93 */     if (discount == -1.0D)
/* 119:    */     {
/* 120: 94 */       System.out.println("会员号输入错误。");
/* 121:    */     }
/* 122:    */     else
/* 123:    */     {
/* 124:    */       String choice;
/* 125:    */       do
/* 126:    */       {
/* 127: 98 */         System.out.print("\t请输入商品编号：");
/* 128: 99 */         goodsNo = input.nextInt();
/* 129:100 */         System.out.print("\t请输入数目：");
/* 130:101 */         int count = input.nextInt();
/* 131:    */         
/* 132:    */ 
/* 133:104 */         double price = this.goods[(goodsNo - 1)].goodsPrice;
/* 134:105 */         String name = this.goods[(goodsNo - 1)].goodsName;
/* 135:106 */         total += price * count;
/* 136:    */         
/* 137:    */ 
/* 138:109 */         goodsList = goodsList + "\n" + name + "\t" + "￥" + price + 
/* 139:110 */           "\t\t" + count + "\t\t" + "￥" + price * count + 
/* 140:111 */           "\t";
/* 141:    */         
/* 142:113 */         System.out.print("\t是否继续（y/n）");
/* 143:114 */         choice = input.next();
/* 144: 97 */       } while (
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
/* 162:115 */         choice.equals("y"));
/* 163:118 */       finalPay = total * discount;
/* 164:    */       
/* 165:    */ 
/* 166:121 */       System.out.println("\n");
/* 167:122 */       System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊消费清单＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
/* 168:123 */       System.out.println("物品\t\t单价\t\t个数\t\t金额\t");
/* 169:124 */       System.out.print(goodsList);
/* 170:125 */       System.out.println("\n折扣：\t" + discount);
/* 171:126 */       System.out.println("金额总计:\t￥" + finalPay);
/* 172:127 */       System.out.print("实际交费:\t￥");
/* 173:128 */       double payment = input.nextDouble();
/* 174:129 */       System.out.println("找钱:\t￥" + (payment - finalPay));
/* 175:    */       
/* 176:    */ 
/* 177:132 */       int score = (int)finalPay / 100 * 3;
/* 178:135 */       for (int i = 0; i < this.customers.length; i++) {
/* 179:136 */         if (this.customers[i].custNo == curCustNo)
/* 180:    */         {
/* 181:137 */           this.customers[i].custScore += score;
/* 182:138 */           System.out.println("本次购物所获的积分是： " + score);
/* 183:139 */           break;
/* 184:    */         }
/* 185:    */       }
/* 186:    */     }
/* 187:144 */     System.out.print("\n请'n'返回上一级菜单:");
/* 188:145 */     if (input.next().equals("n"))
/* 189:    */     {
/* 190:146 */       Menu menu = new Menu();
/* 191:147 */       menu.setData(this.goods, this.customers);
/* 192:148 */       menu.showMainMenu();
/* 193:    */     }
/* 194:    */   }
/* 195:    */ }


/* Location:           C:\Users\Administrator\Desktop\魔界装备分发系统\
 * Qualified Name:     com.wxws.sms.management.Pay
 * JD-Core Version:    0.7.0.1
 */