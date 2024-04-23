package DrinkStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	
	static void deleting(int selectModify) {
		for(int i=0;i<3;i++)cart.remove(3*(selectModify-1));
		drinkAmountList.remove(selectModify-1);
	}
	static void modify(int selectModify) {

		Scanner sc=new Scanner(System.in);
		System.out.println("請選擇要變更的項目\r\n( 1 ) 數量 ( 2 ) 冰量 ( 3 ) 甜度");
		int modifyItem=sc.nextInt();
		int modifySugarAmount,modifyIceAmount,modifyDrinkAmount;
		switch(modifyItem) {
		
		case 1:
			while(true) {
				System.out.println("請輸入變更後的數量");
				modifyDrinkAmount=sc.nextInt();
				if(modifyDrinkAmount<1) {
					System.out.println("請輸入範圍內號碼 !");
					continue;
				}
				else {
					drinkAmountList.set(selectModify-1,modifyDrinkAmount);
					break;
				}
			}
			break;
		case 2:
			while(true) {
				
				System.out.println("請輸入變更後的冰量 :\r\n( 1 ) 正常冰 ( 2 ) 少冰 ( 3 ) 去冰");
				modifyIceAmount=sc.nextInt();
				if(modifyIceAmount>3||modifyIceAmount<1) {
					System.out.println("請輸入範圍內號碼 !");
					continue;
				}
				else {
					cart.set(3*(selectModify-1)+1,ice[--modifyIceAmount]);
					break;
				}
			}
			break;
		
		case 3:
			while(true) {
				System.out.println("請輸入變更後的甜度 :\r\n( 1 ) 正常糖 ( 2 ) 少糖 ( 3 ) 半糖 ( 4 ) 微糖 ( 5 )");
				modifySugarAmount=sc.nextInt();
				if (modifySugarAmount<1||modifySugarAmount>5) {
					System.out.println("請輸入範圍內號碼 !");
					continue;
				}
				else {
					cart.set(3*(selectModify-1)+2,sugar[--modifySugarAmount]);
					break;
				}
			}
			break;
			
		}
		
	}
	static void ordering() {
		
		Scanner sc=new Scanner(System.in);
		int choose,iceAmount,sugarAmount,drinkAmount,modifyItem=0;
		
		while(true) {
			System.out.println("******** 菜單 ********\n"
					+ "編號\t品名\t價格\n"
					+ "1\t珍珠紅茶\t$ 35\n"
					+ "2\t珍珠奶茶\t$ 45\n"
					+ "3\t柳丁綠茶\t$ 60\n"
					//我不知道你PPT在寫什麼
					+"**********************\n"
					+"請選擇飲料編號 :");
					
				
			choose=sc.nextInt();
			if(choose<1||choose>3) {
				System.out.println("請輸入範圍內號碼 !");
				continue;
			}
			break;
		}
		while(true) {
			System.out.println("( 1 ) 正常冰 ( 2 ) 少冰 ( 3 ) 去冰\r\n"
					+ "請選擇飲料冰量[1,2,3]");
			iceAmount=sc.nextInt();
			if(iceAmount<1||iceAmount>3) {
				System.out.println("請輸入範圍內號碼 !");
				continue;
			}
			break;
		}
		while(true) {
			System.out.println("( 1 ) 正常糖 ( 2 ) 少糖 ( 3 ) 半糖 ( 4 ) 微糖 ( 5 ) 無糖\r\n"
				+ "請選擇飲料甜度 [1,2,3,4,5]: ");
			sugarAmount=sc.nextInt();
			if (sugarAmount<1||sugarAmount>5) {
				System.out.println("請輸入範圍內號碼 !");
				continue;
			}
			break;
		}
		System.out.println("請輸入數量 :");
		drinkAmount=sc.nextInt();
		System.out.printf("已將%d杯%s加入購物車\n",drinkAmount,drink[--choose].getName());
		
		drink[choose].drinkAmount=drinkAmount;
		cart.add(drink[choose]);
		cart.add(ice[--iceAmount]);
		cart.add(sugar[--sugarAmount]);
		drinkAmountList.add(drinkAmount);
	
		
		
	}
	static Drink drink[] = { new Drink(35, "珍珠紅茶"), new Drink(45, "珍珠奶茶"), new Drink(60, "柳丁綠茶") };

	
	static Ice ice[] = {
			new Ice(1, "正常冰"), new Ice(2, "少冰"), new Ice(3, "去冰") 
	};
	static Sugar sugar[] = { 
			new Sugar(1, "正常糖"), new Sugar(2, "少糖"), new Sugar(3, "半糖"), new Sugar(4, "微糖"),
	new Sugar(5, "無糖") 
	};
	static ArrayList<Item> cart = new ArrayList<>();
	static ArrayList<Integer>drinkAmountList=new ArrayList<>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true){
			int select;
			System.out.println("* * * * * * * * 歡迎來到大台科飲料店 * * * * * * * *\r\n"
					+ "( 1 ) 點餐\r\n"
					+ "( 2 ) 查看購物車\r\n"
					+ "( 0 ) 結帳並退出系統\r\n"
					+ "請選擇功能 [ 0 , 1 , 2 〕 :");
			select=sc.nextInt();
			
			switch(select) {
			case 1:
				ordering();
				
				break;
			case 2:
				System.out.println("編號\t品名\t冰量\t甜度\t數量\t單價\t總價\t");
				for(int i=0;i<cart.size();i+=3) {
					System.out.printf("%d\t%s\t%s\t%s\t%d\t$%d\t$%d\t\n",i/3+1
							,cart.get(i).getName(),cart.get(i+1).getName(),cart.get(i+2).getName(),drinkAmountList.get(i/3),cart.get(i).getnum(),drinkAmountList.get(i/3)*cart.get(i).getnum());
				}
				System.out.println("請選擇飲料編號進行修改 , 輸入0則回到上一層：");
				
				while(true) {
					
					
					int selectModify=sc.nextInt();
					if(selectModify>cart.size()/3||selectModify<0) {
						System.out.println("請輸入範圍內號碼 !");
						continue;
					}
					else if(selectModify==0)break;
					else {
						System.out.println("( 1 ) 編輯 ( 2 ) 刪除 ( 0 ) 取消動作\r\n"
								+ "請選擇功能 〔 1 , 2 , 0〕 : ");
						int selectModify2=sc.nextInt();
						
						System.out.println(cart);
						if(selectModify2==1) {
							modify(selectModify);
							break;
						}
						else if(selectModify2==2) {
							deleting(selectModify);
							break;
						}
						else if(selectModify2==0)break;
						else {
							System.out.println("請輸入範圍內號碼 !");
						}
					}
				}
				
				break;
			
			case 0:
				int totalAmount=0;
				for(int i=0;i<cart.size();i+=3) totalAmount+=drinkAmountList.get(i/3)*cart.get(i).getnum();
				System.out.printf("謝謝光臨 ,一共是：%d元\n",totalAmount);
				System.exit(0);
			default:
				System.out.println("請輸入範圍內數");
				break;
			}
			
		}
		
	}

}
