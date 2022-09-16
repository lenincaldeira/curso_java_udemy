package entities;

import entities.enums.OrderStatusClass147;

import java.util.Date;

public class OrderClass147 {

    private Integer id;
    private Date moment;
    private OrderStatusClass147 status;

    public OrderClass147() {
    }

    public OrderClass147(Integer id, Date moment, OrderStatusClass147 status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusClass147 getStatus() {
        return status;
    }

    public void setStatus(OrderStatusClass147 status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderClass147{" +
                "id = " + id +
                ", moment = " + moment +
                ", status = " + status +
                '}';
    }
}
