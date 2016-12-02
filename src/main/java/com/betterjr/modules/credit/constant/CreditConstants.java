package com.betterjr.modules.credit.constant;

public interface CreditConstants {

    /**
     * 授信对象:1-供应商;
     */
    String CREDIT_TYPE_SUPPLIER = "1";
    /**
     * 授信对象:2-经销商;
     */
    String CREDIT_TYPE_SELLER = "2";
    /**
     * 授信对象:3-核心企业;
     */
    String CREDIT_TYPE_CORE = "3";

    /**
     * 授信状态:0-未生效;
     */
    String CREDIT_STATUS_INEFFECTIVE = "0";
    /**
     * 授信状态:1-已生效;
     */
    String CREDIT_STATUS_EFFECTIVE = "1";
    /**
     * 授信状态:2-已失效;
     */
    String CREDIT_STATUS_INVALID = "2";
    /**
     * 收支方向:0-收入;
     */
    String CREDIT_DIRECTION_INCOME = "0";
    /**
     * 收支方向:1-支出;
     */
    String CREDIT_DIRECTION_EXPEND = "1";
    /**
     * 授信方式:1-信用授信(循环);
     */
    String CREDIT_MODE_CYCLE_GENERAL = "1";
    /**
     * 授信方式:2-信用授信(一次性);
     */
    String CREDIT_MODE_TMP_GENERAL = "2";
    /**
     * 授信方式:3-担保信用(循环);
     */
    String CREDIT_MODE_CYCLE_GUARANTEE = "3";
    /**
     * 授信方式:4-担保授信(一次性);
     */
    String CREDIT_MODE_TMP_GUARANTEE = "4";
    /**
     * 授信变动状态:0-已完成;
     */
    String CREDIT_CHANGE_STATUS_DONE = "0";
    /**
     * 授信变动状态:1-冻结中;
     */
    String CREDIT_CHANGE_STATUS_FREEZE = "1";
    /**
     * 业务类型:1-应收账款融资;
     */
    String CREDIT_BUSIN_STATUS_ARF = "1";
    /**
     * 业务类型:2-应收账款票据质押融资;
     */
    String CREDIT_BUSIN_STATUS_ARBPF = "2";
    /**
     * 业务类型:3-预付款融资;
     */
    String CREDIT_BUSIN_STATUS_APF = "3";

}
