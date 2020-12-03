package com.hybris.caas.dto.order.enums;

public enum CreditType {

    PRODUCT_RETURN("Product return", 1),
    SHIPPING_FEE("Shipping fee", 2),
    MANUAL_ADJUSTMENT("Manual adjustment", 3),
    ORDER_LINE_REFUND("Order line refund", 4),
    SYSTEM_ADJUSTMENT("System adjustment", 5);

    CreditType(String description, int returnProcessOrder) {
        this.description = description;
        this.returnProcessOrder = returnProcessOrder;
    }

    private String description;

    private int    returnProcessOrder;

    public String getDescription() {
        return this.description;
    }

    public int getReturnProcessOrder() {
        return returnProcessOrder;
    }


}
