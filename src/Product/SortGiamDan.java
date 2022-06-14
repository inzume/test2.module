package Product;

import java.util.Comparator;

public class SortGiamDan implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (Double.parseDouble(o1.getPrice())<Double.parseDouble(o2.getPrice())){
            return 1;
        }
        return -1;
    }
}
