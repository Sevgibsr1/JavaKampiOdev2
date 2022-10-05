public class ProductTest {
    public static void main(String[] args) {

            Product product=new Product();
            product.name="Laptop";
            product.id=1;
            product.description="Asus laptop";
            product.price=5000;
            product.stockAmount=3;

            System.out.println(product.name);
            ProductManager productManager=new ProductManager();
            productManager.Add(product);


            Product2 product2=new Product2();
            System.out.println(product2.getKod());

        }
    }

