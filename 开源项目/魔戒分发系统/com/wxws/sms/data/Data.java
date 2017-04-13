/*  1:   */ package com.wxws.sms.data;
/*  2:   */ 
/*  3:   */ public class Data
/*  4:   */ {
/*  5: 8 */   public Goods[] goods = new Goods[50];
/*  6:10 */   public Customer[] customers = new Customer[100];
/*  7:12 */   public Manager manager = new Manager();
/*  8:   */   
/*  9:   */   public void ini()
/* 10:   */   {
/* 11:15 */     for (int i = 0; i < this.goods.length; i++) {
/* 12:16 */       this.goods[i] = new Goods();
/* 13:   */     }
/* 14:20 */     this.goods[0].goodsName = "黄金战衣";
/* 15:21 */     this.goods[0].goodsPrice = 880.0D;
/* 16:   */     
/* 17:   */ 
/* 18:24 */     this.goods[1].goodsName = "死亡之努";
/* 19:25 */     this.goods[1].goodsPrice = 200.0D;
/* 20:   */     
/* 21:   */ 
/* 22:28 */     this.goods[2].goodsName = "水杖";
/* 23:29 */     this.goods[2].goodsPrice = 780.0D;
/* 24:   */     
/* 25:   */ 
/* 26:   */ 
/* 27:33 */     this.goods[3].goodsName = "隐身衣";
/* 28:34 */     this.goods[3].goodsPrice = 420.77999999999997D;
/* 29:   */     
/* 30:   */ 
/* 31:   */ 
/* 32:38 */     this.goods[4].goodsName = "魔血球";
/* 33:39 */     this.goods[4].goodsPrice = 900.0D;
/* 34:   */     
/* 35:   */ 
/* 36:   */ 
/* 37:43 */     this.goods[5].goodsName = "风暴之怒";
/* 38:44 */     this.goods[5].goodsPrice = 45.0D;
/* 39:   */     
/* 40:   */ 
/* 41:   */ 
/* 42:48 */     this.goods[6].goodsName = "征战裤腿";
/* 43:49 */     this.goods[6].goodsPrice = 245.0D;
/* 44:52 */     for (int i = 0; i < this.customers.length; i++) {
/* 45:53 */       this.customers[i] = new Customer();
/* 46:   */     }
/* 47:55 */     this.customers[0].custNo = 1900;
/* 48:56 */     this.customers[0].custBirth = "08/05";
/* 49:57 */     this.customers[0].custScore = 2000;
/* 50:   */     
/* 51:59 */     this.customers[1].custNo = 1711;
/* 52:60 */     this.customers[1].custBirth = "07/13";
/* 53:61 */     this.customers[1].custScore = 4000;
/* 54:   */     
/* 55:63 */     this.customers[2].custNo = 1623;
/* 56:64 */     this.customers[2].custBirth = "06/26";
/* 57:65 */     this.customers[2].custScore = 5000;
/* 58:   */     
/* 59:67 */     this.customers[3].custNo = 1545;
/* 60:68 */     this.customers[3].custBirth = "04/08";
/* 61:69 */     this.customers[3].custScore = 2200;
/* 62:   */     
/* 63:71 */     this.customers[4].custNo = 1464;
/* 64:72 */     this.customers[4].custBirth = "08/16";
/* 65:73 */     this.customers[4].custScore = 1000;
/* 66:   */     
/* 67:75 */     this.customers[5].custNo = 1372;
/* 68:76 */     this.customers[5].custBirth = "12/23";
/* 69:77 */     this.customers[5].custScore = 3000;
/* 70:   */     
/* 71:79 */     this.customers[6].custNo = 1286;
/* 72:80 */     this.customers[6].custBirth = "12/21";
/* 73:81 */     this.customers[6].custScore = 10080;
/* 74:   */   }
/* 75:   */ }


/* Location:           C:\Users\Administrator\Desktop\魔界装备分发系统\
 * Qualified Name:     com.wxws.sms.data.Data
 * JD-Core Version:    0.7.0.1
 */