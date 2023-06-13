package S2_N3_DependencyInjection;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Zapatillas Quechua Escape 500 Fresh", 49.90),
                new Product("Zapatillas Quechua NH500 Fresh", 29.99),
                new Product("Zapatillas Salomon Saliba 23", 99.99)
        );

        System.out.println("\n**** American Store ****");
        Shop storeDollar = new Shop(products,new EurToDollar()); //dependency injection
        storeDollar.showProductPrices();

        System.out.println("\n**** Japanese Store ****");
        Shop storeYen = new Shop(products,new EurToYen()); //dependency injection
        storeYen.showProductPrices();

        System.out.println("\n**** Honduras Store ****");
        Shop storeLempira = new Shop(products,new EurToLempira()); //dependency injection
        storeLempira.showProductPrices();


    }
}
