package Chapter01Week01;

public class Guitar {

    private String model, brand, backwood, neckwood, productNo ;
     private double price;

    public Guitar(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBackwood() {
        return backwood;
    }

    public void setBackwood(String backwood) {
        this.backwood = backwood;
    }

    public String getNeckwood() {
        return neckwood;
    }

    public void setNeckwood(String neckwood) {
        this.neckwood = neckwood;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
