package entities;

import entities.enums.OrderStatusClass154;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderClass154 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatusClass154 status;

    private ClientClass154 client;

    private List<OrderItemClass154> items =  new ArrayList<OrderItemClass154>();

    public OrderClass154(Date date, OrderStatusClass154 status, ClientClass154 client) {
    }

    public OrderClass154(Date moment, OrderStatusClass154 status, ClientClass154 client, List<OrderItemClass154> items) {
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.items = items;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusClass154 getStatus() {
        return status;
    }

    public void setStatus(OrderStatusClass154 status) {
        this.status = status;
    }

    public ClientClass154 getClient() {
        return client;
    }

    public void setClient(ClientClass154 client) {
        this.client = client;
    }

    public void addItem(OrderItemClass154 item) {
        items.add(item);
    }

    public void removeItem(OrderItemClass154 item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItemClass154 it : items) {
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItemClass154 item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
