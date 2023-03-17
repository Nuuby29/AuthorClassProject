public class Store {
    private int maxInventory = 12;
    private int currentInventoryIndex = 0;
    int catelog = new int[maxInventory];
    public Store(int inv){
        maxInventory = inv;
        ItemForSale item = new ItemForSale();
    }
    public void importInventory(){
        catelog[currentInventoryIndex] = importInventory();
        currentInventoryIndex++;
    }
}
