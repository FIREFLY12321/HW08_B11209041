package DrinkStore;

// Drink 類別繼承自 Item 類別
public class Drink extends Item{
    // 類別成員變數，用於表示飲料的數量
    public int drinkAmount = 0;

    // Drink 類別的建構子，接收數量和名稱作為參數
    public Drink(int num, String name) {
        // 呼叫父類別的建構子，設定數量和名稱
        super(num, name);
    }

    // 重寫父類別的 getnum 方法，返回飲料數量
    @Override
    public int getnum() {
        return num;
    }

    // 重寫父類別的 getName 方法，返回飲料名稱
    @Override
    public String getName() {
        return name;
    }
}
