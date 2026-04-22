package reforco_poo.bloco03;

public class Order {

    private int code;
    private String clientName;
    private String address;
    private double deliveryFee;
    private double itemsTotal;

    public Order(int code, String clientName, String address) {
        this.code = code;
        this.clientName = clientName;
        this.address = address;
        this.deliveryFee = 8.00;
    }

    public Order(int code, String clientName) {
        this.code = code;
        this.clientName = clientName;
        this.address = "Retirada no local";
        this.deliveryFee = 0.00;
    }

    public int getCode() {
        return code;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public double getItemsTotal() {
        return itemsTotal;
    }

    public void addItem(String name, double price) {
        itemsTotal += price;
    }

    public double totalAmount() {
        return itemsTotal + deliveryFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order #" + code + " - " + clientName + "\n");
        sb.append("Address: " + address + "\n");
        sb.append("Delivery fee: $ " + String.format("%.2f", deliveryFee) + "\n");
        sb.append("Items total: $ " + String.format("%.2f", itemsTotal) + "\n");
        sb.append("Total: $ " + String.format("%.2f", totalAmount()) + "\n");

        return sb.toString();
    }
}
