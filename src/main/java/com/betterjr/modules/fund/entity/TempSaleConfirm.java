package com.betterjr.modules.fund.entity;

import java.math.BigDecimal;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.betterjr.common.annotation.MetaData;
import com.betterjr.common.selectkey.SerialGenerator;
import com.betterjr.common.utils.BetterStringUtils;
import com.betterjr.common.utils.MathExtend;
 
@Access(AccessType.FIELD)
@Entity
@Table(name = "T_TMP_SALE_CONFIRM")
public class TempSaleConfirm extends SaleConfirmInfo {

    /**
     * 基金公司资金账户
     */
    @Column(name = "C_SALE_MONEYACCOUNT", columnDefinition = "VARCHAR")
    @MetaData(value = "基金公司资金账户", comments = "基金公司资金账户")
    private String saleMoneyAccount;

    /**
     * 销售商交易账户
     */
    @Column(name = "C_SALE_TRADEACCO", columnDefinition = "VARCHAR")
    @MetaData(value = "销售商交易账户", comments = "销售商交易账户")
    private String saleTradeAccount;

    /**
     * 基金公司客户编号
     */
    @Column(name = "C_SALE_CUSTNO", columnDefinition = "VARCHAR")
    @MetaData(value = "基金公司客户编号", comments = "基金公司客户编号")
    private String saleCustNo;

    private static final long serialVersionUID = 7978351989117158254L;

    public String getSaleMoneyAccount() {
        return this.saleMoneyAccount;
    }

    public void setSaleMoneyAccount(String anSaleMoneyAccount) {
        this.saleMoneyAccount = anSaleMoneyAccount;
    }

    public String getSaleTradeAccount() {
        return this.saleTradeAccount;
    }

    public void setSaleTradeAccount(String anSaleTradeAccount) {
        this.saleTradeAccount = anSaleTradeAccount;
    }

    public String getSaleCustNo() {
        return this.saleCustNo;
    }

    public void setSaleCustNo(String anSaleCustNo) {
        this.saleCustNo = anSaleCustNo;
    }
}