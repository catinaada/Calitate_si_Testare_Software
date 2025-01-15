import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OShop oShop = new OShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product product1 = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product product2 = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product product3 = new Product(product1);

        product3.setQuantity(5);
        product3.setName("Paine");

        oShop.modifyProductsList(1,product1);
        oShop.modifyProductsList(1,product2);

        oShop.modifyProductsList(2, product1);
        System.out.println(product1.equals(product2));
    }
}

class OShop {
    private String name;
    private String image;
    private ArrayList<Product> products;

    OShop(String name, String image, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.image = image;
        this.name = name;
    }

    public void modifyProductsList(int what, Product product)
    {
        if(what == 1)
        {
            this.products.add(product);
        }
        else
            this.products.remove(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

class Product
{
    private int id;
    private String name;
    private double price;
    private int type;
    private int category;
    private int quantity;
    private String expiryDate=new SimpleDateFormat("YYYY/MM/DD").format(new Date()); //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, int category, int id, String expiryDate)
    {
        this.name = name;
        this.price = price;
        this.type = type;
        this.category = category;
        this.id = id;
        this.expiryDate = expiryDate;
    }

    public Product(Product product)
    {
        this.name = product.name;
        this.price = product.price;
        this.type = product.type;
        this.category = product.category;
        this.id = product.id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isEqualsCategory(Product product)
    {
        if(product.category != this.category)
            return false;

        return true;
    }

    public boolean isEqualsId(Product product)
    {
        if(product.id != this.id)
            return false;
        return true;
    }

    public boolean isEqualsPrice(Product product)
    {
        if(product.price != this.price)
            return false;
        return true;
    }

    public boolean isEqualsName(Product product)
    {
        if(!product.name.equals(this.name))
            return false;
        return true;
    }

    public boolean isEqualsType(Product product)
    {
        if(product.type != this.type)
            return false;
        return true;
    }

    public void modifyPrice(boolean flag, double val)
    {
        if(flag)
            this.price +=this.price *val;
        if(!flag)
            this.price -=this.price *val/100;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String name;
    private String id;
    private ArrayList<Order> orders;
    private ArrayList<Order> commandList;

    public User(String name, String id)
    {
        this.name = name;
        this.id = id;
        orders =new ArrayList<Order>();
        commandList=new ArrayList<Order>();
    }

    public void addOrderList(Order order)
    {
        this.orders.add(order);
    }

    public void addCommandList(Order order)
    {
        this.commandList.add(order);
    }
}

class Order
{
    private ArrayList<Product> listProduct;
    private String address;

    public Order()
    {
        this.listProduct = new ArrayList<Product>();
    }
    public void addProduct(Product product)
    {
        if(listProduct.size() > 99)
            return;

        listProduct.add(product);
    }

    public void removeProduct(Product product)
    {
        listProduct.remove(product);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Inventory
{
    private Product product;
    private int quantity;

    public Inventory(Product product, int quantity)
    {
        this.product = new Product(product);
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


