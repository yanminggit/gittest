package com.betterjr.modules.product.constant;

public interface ProductConstants {

    /**
     * 状态:0-登记;
     */
    String PRO_STATUS_REG = "0";
    /**
     * 状态:1-上架;
     */
    String PRO_STATUS_SHELVES = "1";
    /**
     * 状态:2-下架;
     */
    String PRO_STATUS_OFFLINE = "2";
    /**
     * 保理类型:1-应收账款融资;
     */
    String PRO_FACTOR_TYPE_RECEIVABLE = "1";
    /**
     * 保理类型:2-应收账款票据质押融资;
     */
    String PRO_FACTOR_TYPE_RECEIVABLE_BILL = "1";
    /**
     * 保理类型:3-预付款融资;
     */
    String PRO_FACTOR_TYPE_ADVPAY = "1";

}
