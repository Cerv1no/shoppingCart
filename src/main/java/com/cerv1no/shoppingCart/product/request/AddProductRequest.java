package com.cerv1no.shoppingCart.product.request;

import com.cerv1no.shoppingCart.category.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddProductRequest {

    private Long id;
    private String name;
    private String brand;
    private String description;
    private BigDecimal price;
    private int inventoryQuantity;
    private Category category;
}
