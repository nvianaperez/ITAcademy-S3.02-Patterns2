package S2_N3_DependencyInjection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Product> products;
    private IConversor converter;

    public Shop(List<Product> products, IConversor converter) {
        this.products = products;
        this.converter = converter;
    }

    public void showProductPrices () {
        products.forEach(product -> {
            double convertedPrice = this.converter.converse(product.getPrice());
            System.out.printf("The price of the product "+product.getName()+" is: "+"%.2f %n",convertedPrice);

        });
    }
}
