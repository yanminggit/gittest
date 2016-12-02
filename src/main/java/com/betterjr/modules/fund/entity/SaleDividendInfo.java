package com.betterjr.modules.fund.entity;

import com.betterjr.common.annotation.*;
import com.betterjr.common.entity.BetterjrEntity;
import javax.persistence.*;
import java.math.BigDecimal;

@Access(AccessType.FIELD)
@Entity
@Table(name = "T_SALE_DIVIDEND")
public class SaleDividendInfo implements BetterjrEntity {
    /**
     * 编号
     */
    @Id
    @Column(name = "ID",  columnDefinition="INTEGER" )
    @MetaData( value="编号", comments = "编号")
    private Long id;

    /**
     * 客户编号
     */
    @Column(name = "L_CUSTNO",  columnDefinition="INTEGER" )
    @MetaData( value="客户编号", comments = "客户编号")
    private Long custNo;

    /**
     * TA代码
     */
    @Column(name = "C_TANO",  columnDefinition="VARCHAR" )
    @MetaData( value="TA代码", comments = "TA代码")
    private String tano;

    /**
     * 红利/红利再投资基数，登记日基金持有人的基金份数
     */
    @Column(name = "F_BASESHARES",  columnDefinition="DOUBLE" )
    @MetaData( value="红利/红利再投资基数", comments = "红利/红利再投资基数，登记日基金持有人的基金份数")
    private BigDecimal baseShares;

    /**
     * 交易确认日期 
     */
    @Column(name = "D_CDATE",  columnDefinition="VARCHAR" )
    @MetaData( value="交易确认日期 ", comments = "交易确认日期 ")
    private String confirmDate;

    /**
     * 结算币种
     */
    @Column(name = "C_CURRENCY",  columnDefinition="VARCHAR" )
    @MetaData( value="结算币种", comments = "结算币种")
    private String currency;

    /**
     * 基金账户红利再投资基金份数，投资人实得红股，含被续冻的红股 
     */
    @Column(name = "F_REALSHARES",  columnDefinition="DOUBLE" )
    @MetaData( value="基金账户红利再投资基金份数", comments = "基金账户红利再投资基金份数，投资人实得红股，含被续冻的红股 ")
    private BigDecimal realShares;

    /**
     * 分红日/发放日
     */
    @Column(name = "D_DATE",  columnDefinition="VARCHAR" )
    @MetaData( value="分红日/发放日", comments = "分红日/发放日")
    private String tradeDate;

    /**
     * 基金账户红利资金，红利总金额,含冻结红利及再投资的红利
     */
    @Column(name = "F_PROFIT",  columnDefinition="DOUBLE" )
    @MetaData( value="基金账户红利资金", comments = "基金账户红利资金，红利总金额,含冻结红利及再投资的红利")
    private BigDecimal profit;

    /**
     * 除权日 
     */
    @Column(name = "D_XRDATE",  columnDefinition="VARCHAR" )
    @MetaData( value="除权日 ", comments = "除权日 ")
    private String xrDate;

    /**
     * 每笔交易确认金额，实发红利资金，不含冻结红利及再投资的红利
     */
    @Column(name = "F_CONFIRMBALANCE",  columnDefinition="DOUBLE" )
    @MetaData( value="每笔交易确认金额", comments = "每笔交易确认金额，实发红利资金，不含冻结红利及再投资的红利")
    private BigDecimal confirmBalance;

    /**
     * 基金代码
     */
    @Column(name = "C_FUNDCODE",  columnDefinition="VARCHAR" )
    @MetaData( value="基金代码", comments = "基金代码")
    private String fundCode;

    /**
     * 分红登记日期
     */
    @Column(name = "D_REGDATE",  columnDefinition="VARCHAR" )
    @MetaData( value="分红登记日期", comments = "分红登记日期")
    private String regDate;

    /**
     * 交易账号
     */
    @Column(name = "C_TRADEACCO",  columnDefinition="VARCHAR" )
    @MetaData( value="交易账号", comments = "交易账号")
    private String tradeAccount;

    /**
     * 销售人代码
     */
    @Column(name = "C_AGENCYNO",  columnDefinition="VARCHAR" )
    @MetaData( value="销售人代码", comments = "销售人代码")
    private String agencyNo;

    /**
     * 网点编码
     */
    @Column(name = "C_NETNO",  columnDefinition="VARCHAR" )
    @MetaData( value="网点编码", comments = "网点编码")
    private String netNo;

    /**
     * 基金账户
     */
    @Column(name = "C_FUNDACCO",  columnDefinition="VARCHAR" )
    @MetaData( value="基金账户", comments = "基金账户")
    private String fundAccount;

    /**
     * 单位基金分红金额（含税），每千份分两元，则此处填 2。 
     */
    @Column(name = "F_DIVIDENDPERUNIT",  columnDefinition="DOUBLE" )
    @MetaData( value="单位基金分红金额（含税）", comments = "单位基金分红金额（含税），每千份分两元，则此处填 2。 ")
    private BigDecimal dividentPerUnit;

    /**
     * 分红方式 0-红利转投，1-现金分红
     */
    @Column(name = "C_BONUSTYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="分红方式 0-红利转投", comments = "分红方式 0-红利转投，1-现金分红")
    private String bonusType;

    /**
     * 交易数据下传日期 
     */
    @Column(name = "D_ISSUEDDATE",  columnDefinition="VARCHAR" )
    @MetaData( value="交易数据下传日期 ", comments = "交易数据下传日期 ")
    private String issuedDate;

    /**
     * 手续费
     */
    @Column(name = "F_FARE",  columnDefinition="DOUBLE" )
    @MetaData( value="手续费", comments = "手续费")
    private BigDecimal fare;

    /**
     * 代理费
     */
    @Column(name = "F_AGENCYFARE",  columnDefinition="DOUBLE" )
    @MetaData( value="代理费", comments = "代理费")
    private BigDecimal agencyFare;

    /**
     * 再投资，需要冻结的份额。（由于原份额冻结）
     */
    @Column(name = "F_FROZENSHARES",  columnDefinition="DOUBLE" )
    @MetaData( value="再投资", comments = "再投资，需要冻结的份额。（由于原份额冻结）")
    private BigDecimal frozenShares;

    /**
     * 单位净值
     */
    @Column(name = "F_NETVALUE",  columnDefinition="DOUBLE" )
    @MetaData( value="单位净值", comments = "单位净值")
    private BigDecimal netValue;

    /**
     * 其他费用
     */
    @Column(name = "F_OTHERFARE",  columnDefinition="DOUBLE" )
    @MetaData( value="其他费用", comments = "其他费用")
    private BigDecimal otherFare;

    /**
     * 其他费用2
     */
    @Column(name = "F_OTHERFARE2",  columnDefinition="DOUBLE" )
    @MetaData( value="其他费用2", comments = "其他费用2")
    private BigDecimal otherFare2;

    /**
     * 客户类型；0个人，1机构
     */
    @Column(name = "C_CUSTTYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="客户类型", comments = "客户类型；0个人，1机构")
    private String custType;

    /**
     * 红利比例 
     */
    @Column(name = "F_DIVIDENDRATIO",  columnDefinition="DOUBLE" )
    @MetaData( value="红利比例 ", comments = "红利比例 ")
    private BigDecimal devidendRatio;

    /**
     * 确认单号
     */
    @Column(name = "C_CSERIALNO",  columnDefinition="VARCHAR" )
    @MetaData( value="确认单号", comments = "确认单号")
    private String confirmSerialno;

    /**
     * 印花税
     */
    @Column(name = "F_STAMPTAX",  columnDefinition="DOUBLE" )
    @MetaData( value="印花税", comments = "印花税")
    private BigDecimal stampTax;

    /**
     * 现金分红需要冻结的金额；由TA保管，不下发给销售机构
     */
    @Column(name = "F_FROZENBALANCE",  columnDefinition="DOUBLE" )
    @MetaData( value="现金分红需要冻结的金额", comments = "现金分红需要冻结的金额；由TA保管，不下发给销售机构")
    private BigDecimal frozenBalance;

    /**
     * 过户费
     */
    @Column(name = "F_TAFARE",  columnDefinition="DOUBLE" )
    @MetaData( value="过户费", comments = "过户费")
    private BigDecimal taFare;

    /**
     * 份额类型  A前收费,B后收费
     */
    @Column(name = "C_SHARETYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="份额类型  A前收费,B后收费", comments = "份额类型  A前收费,B后收费")
    private String shareType;

    /**
     * 分红类型 0-普通分红，1-质押基金分红，2-货币基金收益结转，3-保本基金赔付，4-专户到期处理
     */
    @Column(name = "C_DIVIDENDTYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="分红类型 0-普通分红", comments = "分红类型 0-普通分红，1-质押基金分红，2-货币基金收益结转，3-保本基金赔付，4-专户到期处理")
    private String dividendType;

    /**
     * 分红单位， 举例：每千份分多少，则分红单位就为一千
     */
    @Column(name = "F_DRAWBONUSUNIT",  columnDefinition="DOUBLE" )
    @MetaData( value="分红单位", comments = "分红单位， 举例：每千份分多少，则分红单位就为一千")
    private BigDecimal drawBonusUnit;

    private static final long serialVersionUID = 1443795724629L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustNo() {
        return custNo;
    }

    public void setCustNo(Long custNo) {
        this.custNo = custNo;
    }

    public String getTano() {
        return tano;
    }

    public void setTano(String tano) {
        this.tano = tano == null ? null : tano.trim();
    }

    public BigDecimal getBaseShares() {
        return baseShares;
    }

    public void setBaseShares(BigDecimal baseShares) {
        this.baseShares = baseShares;
    }

    public String getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate == null ? null : confirmDate.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getRealShares() {
        return realShares;
    }

    public void setRealShares(BigDecimal realShares) {
        this.realShares = realShares;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate == null ? null : tradeDate.trim();
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public String getXrDate() {
        return xrDate;
    }

    public void setXrDate(String xrDate) {
        this.xrDate = xrDate == null ? null : xrDate.trim();
    }

    public BigDecimal getConfirmBalance() {
        return confirmBalance;
    }

    public void setConfirmBalance(BigDecimal confirmBalance) {
        this.confirmBalance = confirmBalance;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate == null ? null : regDate.trim();
    }

    public String getTradeAccount() {
        return tradeAccount;
    }

    public void setTradeAccount(String tradeAccount) {
        this.tradeAccount = tradeAccount == null ? null : tradeAccount.trim();
    }

    public String getAgencyNo() {
        return agencyNo;
    }

    public void setAgencyNo(String agencyNo) {
        this.agencyNo = agencyNo == null ? null : agencyNo.trim();
    }

    public String getNetNo() {
        return netNo;
    }

    public void setNetNo(String netNo) {
        this.netNo = netNo == null ? null : netNo.trim();
    }

    public String getFundAccount() {
        return fundAccount;
    }

    public void setFundAccount(String fundAccount) {
        this.fundAccount = fundAccount == null ? null : fundAccount.trim();
    }

    public BigDecimal getDividentPerUnit() {
        return dividentPerUnit;
    }

    public void setDividentPerUnit(BigDecimal dividentPerUnit) {
        this.dividentPerUnit = dividentPerUnit;
    }

    public String getBonusType() {
        return bonusType;
    }

    public void setBonusType(String bonusType) {
        this.bonusType = bonusType == null ? null : bonusType.trim();
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate == null ? null : issuedDate.trim();
    }

    public BigDecimal getFare() {
        return fare;
    }

    public void setFare(BigDecimal fare) {
        this.fare = fare;
    }

    public BigDecimal getAgencyFare() {
        return agencyFare;
    }

    public void setAgencyFare(BigDecimal agencyFare) {
        this.agencyFare = agencyFare;
    }

    public BigDecimal getFrozenShares() {
        return frozenShares;
    }

    public void setFrozenShares(BigDecimal frozenShares) {
        this.frozenShares = frozenShares;
    }

    public BigDecimal getNetValue() {
        return netValue;
    }

    public void setNetValue(BigDecimal netValue) {
        this.netValue = netValue;
    }

    public BigDecimal getOtherFare() {
        return otherFare;
    }

    public void setOtherFare(BigDecimal otherFare) {
        this.otherFare = otherFare;
    }

    public BigDecimal getOtherFare2() {
        return otherFare2;
    }

    public void setOtherFare2(BigDecimal otherFare2) {
        this.otherFare2 = otherFare2;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType == null ? null : custType.trim();
    }

    public BigDecimal getDevidendRatio() {
        return devidendRatio;
    }

    public void setDevidendRatio(BigDecimal devidendRatio) {
        this.devidendRatio = devidendRatio;
    }

    public String getConfirmSerialno() {
        return confirmSerialno;
    }

    public void setConfirmSerialno(String confirmSerialno) {
        this.confirmSerialno = confirmSerialno == null ? null : confirmSerialno.trim();
    }

    public BigDecimal getStampTax() {
        return stampTax;
    }

    public void setStampTax(BigDecimal stampTax) {
        this.stampTax = stampTax;
    }

    public BigDecimal getFrozenBalance() {
        return frozenBalance;
    }

    public void setFrozenBalance(BigDecimal frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public BigDecimal getTaFare() {
        return taFare;
    }

    public void setTaFare(BigDecimal taFare) {
        this.taFare = taFare;
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType == null ? null : shareType.trim();
    }

    public String getDividendType() {
        return dividendType;
    }

    public void setDividendType(String dividendType) {
        this.dividendType = dividendType == null ? null : dividendType.trim();
    }

    public BigDecimal getDrawBonusUnit() {
        return drawBonusUnit;
    }

    public void setDrawBonusUnit(BigDecimal drawBonusUnit) {
        this.drawBonusUnit = drawBonusUnit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", custNo=").append(custNo);
        sb.append(", tano=").append(tano);
        sb.append(", baseShares=").append(baseShares);
        sb.append(", confirmDate=").append(confirmDate);
        sb.append(", currency=").append(currency);
        sb.append(", realShares=").append(realShares);
        sb.append(", tradeDate=").append(tradeDate);
        sb.append(", profit=").append(profit);
        sb.append(", xrDate=").append(xrDate);
        sb.append(", confirmBalance=").append(confirmBalance);
        sb.append(", fundCode=").append(fundCode);
        sb.append(", regDate=").append(regDate);
        sb.append(", tradeAccount=").append(tradeAccount);
        sb.append(", agencyNo=").append(agencyNo);
        sb.append(", netNo=").append(netNo);
        sb.append(", fundAccount=").append(fundAccount);
        sb.append(", dividentPerUnit=").append(dividentPerUnit);
        sb.append(", bonusType=").append(bonusType);
        sb.append(", issuedDate=").append(issuedDate);
        sb.append(", fare=").append(fare);
        sb.append(", agencyFare=").append(agencyFare);
        sb.append(", frozenShares=").append(frozenShares);
        sb.append(", netValue=").append(netValue);
        sb.append(", otherFare=").append(otherFare);
        sb.append(", otherFare2=").append(otherFare2);
        sb.append(", custType=").append(custType);
        sb.append(", devidendRatio=").append(devidendRatio);
        sb.append(", confirmSerialno=").append(confirmSerialno);
        sb.append(", stampTax=").append(stampTax);
        sb.append(", frozenBalance=").append(frozenBalance);
        sb.append(", taFare=").append(taFare);
        sb.append(", shareType=").append(shareType);
        sb.append(", dividendType=").append(dividendType);
        sb.append(", drawBonusUnit=").append(drawBonusUnit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SaleDividendInfo other = (SaleDividendInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustNo() == null ? other.getCustNo() == null : this.getCustNo().equals(other.getCustNo()))
            && (this.getTano() == null ? other.getTano() == null : this.getTano().equals(other.getTano()))
            && (this.getBaseShares() == null ? other.getBaseShares() == null : this.getBaseShares().equals(other.getBaseShares()))
            && (this.getConfirmDate() == null ? other.getConfirmDate() == null : this.getConfirmDate().equals(other.getConfirmDate()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getRealShares() == null ? other.getRealShares() == null : this.getRealShares().equals(other.getRealShares()))
            && (this.getTradeDate() == null ? other.getTradeDate() == null : this.getTradeDate().equals(other.getTradeDate()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getXrDate() == null ? other.getXrDate() == null : this.getXrDate().equals(other.getXrDate()))
            && (this.getConfirmBalance() == null ? other.getConfirmBalance() == null : this.getConfirmBalance().equals(other.getConfirmBalance()))
            && (this.getFundCode() == null ? other.getFundCode() == null : this.getFundCode().equals(other.getFundCode()))
            && (this.getRegDate() == null ? other.getRegDate() == null : this.getRegDate().equals(other.getRegDate()))
            && (this.getTradeAccount() == null ? other.getTradeAccount() == null : this.getTradeAccount().equals(other.getTradeAccount()))
            && (this.getAgencyNo() == null ? other.getAgencyNo() == null : this.getAgencyNo().equals(other.getAgencyNo()))
            && (this.getNetNo() == null ? other.getNetNo() == null : this.getNetNo().equals(other.getNetNo()))
            && (this.getFundAccount() == null ? other.getFundAccount() == null : this.getFundAccount().equals(other.getFundAccount()))
            && (this.getDividentPerUnit() == null ? other.getDividentPerUnit() == null : this.getDividentPerUnit().equals(other.getDividentPerUnit()))
            && (this.getBonusType() == null ? other.getBonusType() == null : this.getBonusType().equals(other.getBonusType()))
            && (this.getIssuedDate() == null ? other.getIssuedDate() == null : this.getIssuedDate().equals(other.getIssuedDate()))
            && (this.getFare() == null ? other.getFare() == null : this.getFare().equals(other.getFare()))
            && (this.getAgencyFare() == null ? other.getAgencyFare() == null : this.getAgencyFare().equals(other.getAgencyFare()))
            && (this.getFrozenShares() == null ? other.getFrozenShares() == null : this.getFrozenShares().equals(other.getFrozenShares()))
            && (this.getNetValue() == null ? other.getNetValue() == null : this.getNetValue().equals(other.getNetValue()))
            && (this.getOtherFare() == null ? other.getOtherFare() == null : this.getOtherFare().equals(other.getOtherFare()))
            && (this.getOtherFare2() == null ? other.getOtherFare2() == null : this.getOtherFare2().equals(other.getOtherFare2()))
            && (this.getCustType() == null ? other.getCustType() == null : this.getCustType().equals(other.getCustType()))
            && (this.getDevidendRatio() == null ? other.getDevidendRatio() == null : this.getDevidendRatio().equals(other.getDevidendRatio()))
            && (this.getConfirmSerialno() == null ? other.getConfirmSerialno() == null : this.getConfirmSerialno().equals(other.getConfirmSerialno()))
            && (this.getStampTax() == null ? other.getStampTax() == null : this.getStampTax().equals(other.getStampTax()))
            && (this.getFrozenBalance() == null ? other.getFrozenBalance() == null : this.getFrozenBalance().equals(other.getFrozenBalance()))
            && (this.getTaFare() == null ? other.getTaFare() == null : this.getTaFare().equals(other.getTaFare()))
            && (this.getShareType() == null ? other.getShareType() == null : this.getShareType().equals(other.getShareType()))
            && (this.getDividendType() == null ? other.getDividendType() == null : this.getDividendType().equals(other.getDividendType()))
            && (this.getDrawBonusUnit() == null ? other.getDrawBonusUnit() == null : this.getDrawBonusUnit().equals(other.getDrawBonusUnit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustNo() == null) ? 0 : getCustNo().hashCode());
        result = prime * result + ((getTano() == null) ? 0 : getTano().hashCode());
        result = prime * result + ((getBaseShares() == null) ? 0 : getBaseShares().hashCode());
        result = prime * result + ((getConfirmDate() == null) ? 0 : getConfirmDate().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getRealShares() == null) ? 0 : getRealShares().hashCode());
        result = prime * result + ((getTradeDate() == null) ? 0 : getTradeDate().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getXrDate() == null) ? 0 : getXrDate().hashCode());
        result = prime * result + ((getConfirmBalance() == null) ? 0 : getConfirmBalance().hashCode());
        result = prime * result + ((getFundCode() == null) ? 0 : getFundCode().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getTradeAccount() == null) ? 0 : getTradeAccount().hashCode());
        result = prime * result + ((getAgencyNo() == null) ? 0 : getAgencyNo().hashCode());
        result = prime * result + ((getNetNo() == null) ? 0 : getNetNo().hashCode());
        result = prime * result + ((getFundAccount() == null) ? 0 : getFundAccount().hashCode());
        result = prime * result + ((getDividentPerUnit() == null) ? 0 : getDividentPerUnit().hashCode());
        result = prime * result + ((getBonusType() == null) ? 0 : getBonusType().hashCode());
        result = prime * result + ((getIssuedDate() == null) ? 0 : getIssuedDate().hashCode());
        result = prime * result + ((getFare() == null) ? 0 : getFare().hashCode());
        result = prime * result + ((getAgencyFare() == null) ? 0 : getAgencyFare().hashCode());
        result = prime * result + ((getFrozenShares() == null) ? 0 : getFrozenShares().hashCode());
        result = prime * result + ((getNetValue() == null) ? 0 : getNetValue().hashCode());
        result = prime * result + ((getOtherFare() == null) ? 0 : getOtherFare().hashCode());
        result = prime * result + ((getOtherFare2() == null) ? 0 : getOtherFare2().hashCode());
        result = prime * result + ((getCustType() == null) ? 0 : getCustType().hashCode());
        result = prime * result + ((getDevidendRatio() == null) ? 0 : getDevidendRatio().hashCode());
        result = prime * result + ((getConfirmSerialno() == null) ? 0 : getConfirmSerialno().hashCode());
        result = prime * result + ((getStampTax() == null) ? 0 : getStampTax().hashCode());
        result = prime * result + ((getFrozenBalance() == null) ? 0 : getFrozenBalance().hashCode());
        result = prime * result + ((getTaFare() == null) ? 0 : getTaFare().hashCode());
        result = prime * result + ((getShareType() == null) ? 0 : getShareType().hashCode());
        result = prime * result + ((getDividendType() == null) ? 0 : getDividendType().hashCode());
        result = prime * result + ((getDrawBonusUnit() == null) ? 0 : getDrawBonusUnit().hashCode());
        return result;
    }
}