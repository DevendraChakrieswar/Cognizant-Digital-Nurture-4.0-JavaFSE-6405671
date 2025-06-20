// import java.util.Arrays;
package Week1_DataStructuresandAlgorithms.Handson2_EcommercePlatformSearchFunction.Code;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {
    public static Product search(List<Product> products, String targetName) {
        Collections.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        int left = 0, right = products.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            Product midProduct = products.get(mid);
            int cmp = midProduct.productName.compareToIgnoreCase(targetName);

            if (cmp == 0) return midProduct;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;

    }
}
