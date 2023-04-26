package Entity;

public class Product {
    private String productName;
    private String category;
    private double pricePerUnit;
    private int quantity;


    public Product(String productName, String category, double pricePerUnit, int quantity){
        this.productName = productName;
        this.category = category;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;

    }

    public String getProductName() {return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }





    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", pricePerUnit='" + pricePerUnit + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
