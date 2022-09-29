package entities;

public class OrderItemClass154 {

    private Integer quantity;
    private Double price;

    private  ProductClass154 product;

    public OrderItemClass154() {
    }

    public OrderItemClass154(Integer quantity, Double price, ProductClass154 product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductClass154 getProduct() {
        return product;
    }

    public void setProduct(ProductClass154 product) {
        this.product = product;
    }

    public double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }

}
