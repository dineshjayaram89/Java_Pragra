package march02;

public final class Product {
    private final int prodId;
    private final String prodName;


    public int getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public Product(int prodId, String prodName) {
        this.prodId = prodId;
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Product ID, Name : " +
                "prodId ='" + prodId + '\'' +
                ", prodName ='" + prodName + '\'' +
                '.';
    }
}
