package pl.edu.agh.mwo.java1.product;

import java.math.BigDecimal;

public class TaxFreeProduct extends Product {
    public TaxFreeProduct(String name, BigDecimal price) {
        super(name, price, BigDecimal.ZERO);
    }
}

