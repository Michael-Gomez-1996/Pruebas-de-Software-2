package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class calcularDescuento {

    public static BigDecimal aplicarDescuento(BigDecimal precio) {
        if (precio.compareTo(new BigDecimal("100000")) >= 0) {
            BigDecimal descuento = precio.multiply(new BigDecimal("0.10"));
            return precio.subtract(descuento).setScale(0, RoundingMode.HALF_UP);
        }
        return precio.setScale(0, RoundingMode.HALF_UP);
    }
}
