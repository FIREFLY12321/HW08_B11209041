package DrinkStore;

// Item 類別是一個抽象類別
public abstract class Item {
    // 保護屬性，表示物品的數量和名稱
    protected int num;
    protected String name;

    // Item 類別的建構子，接收數量和名稱作為參數
    public Item(int num, String name) {
        // 初始化物品的數量和名稱
        this.num = num;
        this.name = name;
    }

    // 抽象方法，用於獲取物品的數量
    public abstract int getnum();

    // 抽象方法，用於獲取物品的名稱
    public abstract String getName();
}
