package DrinkStore;

// Ice 類別繼承自 Item 類別
public class Ice extends Item {

    // Ice 類別的建構子，接收數量和名稱作為參數
    public Ice(int num, String name) {
        // 呼叫父類別的建構子，設定數量和名稱
        super(num, name);
    }

    // 重寫父類別的 getnum 方法，返回冰塊的數量
    @Override
    public int getnum() {
        return num;
    }

    // 重寫父類別的 getName 方法，返回冰塊的名稱
    @Override
    public String getName() {
        return name;
    }
}
