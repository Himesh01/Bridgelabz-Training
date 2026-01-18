package genrics.DynamicOnlineMarketplace;

import java.util.ArrayList;
import java.util.List;

public class BookMarketplaceApp{
    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming", 600, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("Formal Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> mobile =
                new Product<>("Smartphone", 25000, new GadgetCategory());

        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(mobile);

        MarketplaceUtil.applyDiscount(book, 10);
        MarketplaceUtil.applyDiscount(shirt, 20);
        MarketplaceUtil.applyDiscount(mobile, 5);

        System.out.println("\n📦 Product Catalog:");
        for (Product<?> p : catalog) {
            System.out.println( "Category: " + p.getCategory().getCategoryName() +", Product: " + p.getName() + ", Price: ₹" + p.getPrice());
        }
    }
}