package entities;

import entitie.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order_140 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    private Date moments;
    private OrderStatus status;

    private Client_140 client;

    private List<OrderItem> items = new ArrayList<OrderItem>();

    public Order_140() {

    }

    public Order_140(Date moments, OrderStatus status, Client_140 client) {
        this.moments = moments;
        this.status = status;
        this.client = client;

    }

    public Date getMoments() {
        return moments;
    }

    public void setMoments(Date moments) {
        this.moments = moments;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client_140 getClient() {
        return client;
    }

    public void setClient(Client_140 client) {
        this.client = client;
    }

    public void addItems(OrderItem item) {
        items.add(item);

    }

    public void removeItems(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem it : items) {
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moments) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items: \n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
