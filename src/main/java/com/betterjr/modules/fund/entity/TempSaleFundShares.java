package com.betterjr.modules.fund.entity;

import java.math.BigDecimal;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.betterjr.common.annotation.MetaData;
import com.betterjr.common.data.BaseRemoteEntity;
import com.betterjr.common.entity.BetterjrEntity;
import com.betterjr.common.utils.MathExtend;

@Access(AccessType.FIELD)
@Entity
@Table(name = "T_TMP_SALE_SHARES")
public class TempSaleFundShares implements BetterjrEntity, BaseRemoteEntity {

    /**
     * 编号
     */
    @Id
    @Column(name = "ID", columnDefinition = "INTEGER")
    @MetaData(value = "编号", comments = "编号")
    private Long id;

    /**
     * TA代码
     */
    @Column(name = "C_TANO", columnDefinition = "VARCHAR")
    @MetaData(value = "TA代码", comments = "TA代码")
    private String tano;

    /**
     * 客户编号
     */
    @Column(name = "L_CUSTNO", columnDefinition = "INTEGER")
    @MetaData(value = "客户编号", comments = "客户编号")
    private Long custNo;

    /**
     * 基金账户
     */
    @Column(name = "C_FUNDACCO", columnDefinition = "VARCHAR")
    @MetaData(value = "基金账户", comments = "基金账户")
    private String fundAccount;

    /**
     * 销售人代码
     */
    @Column(name = "C_AGENCYNO", columnDefinition = "VARCHAR")
    @MetaData(value = "销售人代码", comments = "销售人代码")
    private String agencyNo;

    /**
     * 网点编码
     */
    @Column(name = "C_NETNO", columnDefinition = "VARCHAR")
    @MetaData(value = "网点编码", comments = "网点编码")
    private String netNo;

    /**
     * 交易账户
     */
    @Column(name = "C_TRADEACCO", columnDefinition = "VARCHAR")
    @MetaData(value = "交易账户", comments = "交易账户")
    private String tradeAccount;

    /**
     * 成本金额
     */
    @Column(name = "F_COST", columnDefinition = "DOUBLE")
    @MetaData(value = "成本金额", comments = "成本金额")
    private BigDecimal costMoney;

    /**
     * 合同号 可填写定期定额协议号、信托合同号、合约编号、冻结的法律文书编号等
     */
    @Column(name = "C_CONTRACTNO", columnDefinition = "VARCHAR")
    @MetaData(value = "合同号  可填写定期定额协议号、信托合同号、合约编号、冻结的法律文书编号等", comments = "合同号  可填写定期定额协议号、信托合同号、合约编号、冻结的法律文书编号等")
    private String contractNo;

    /**
     * 基金代码
     */
    @Column(name = "C_FUNDCODE", columnDefinition = "VARCHAR")
    @MetaData(value = "基金代码", comments = "基金代码")
    @OrderBy
    private String fundCode;

    /**
     * 份额类别
     */
    @Column(name = "C_SHARETYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "份额类别", comments = "份额类别")
    private String shareType;

    /**
     * 昨日基金份数余额；日终时汇总的份额信息
     */
    @Column(name = "F_TOTAL_SHARES", columnDefinition = "DOUBLE")
    @MetaData(value = "总份额信息", comments = "总份额信息")
    private BigDecimal totalShares;

    /**
     * 当日份额变动份额[发生]；根据交易汇总的份额信息
     */
    @Column(name = "F_SHARES", columnDefinition = "DOUBLE")
    @MetaData(value = "可用份额信息", comments = "可用份额信息")
    private BigDecimal validShares;

    /**
     * 基金冻结总份数
     */
    @Column(name = "F_FROZEN", columnDefinition = "DOUBLE")
    @MetaData(value = "基金冻结总份数", comments = "基金冻结总份数")
    private BigDecimal frozen;

    /**
     * 通过交易的冻结份额信息
     */
    @Column(name = "F_TRD_FROZEN", columnDefinition = "DOUBLE")
    @MetaData(value = "通过交易的冻结份额信息", comments = "通过交易的冻结份额信息")
    private BigDecimal tradeFrozen;

    /**
     * 分红方式
     */
    @Column(name = "C_BONUSTYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "分红方式", comments = "分红方式")
    private String bonusType;

    /**
     * 首次认购日期
     */
    @Column(name = "D_REGDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "首次认购日期", comments = "首次认购日期")
    private String regDate;

    /**
     * 最后更新日期
     */
    @Column(name = "D_MODIDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "最后更新日期", comments = "最后更新日期")
    private String modiDate;

    /**
     * 未付收益
     */
    @Column(name = "F_INCOME", columnDefinition = "DOUBLE")
    @MetaData(value = "未付收益", comments = "未付收益")
    private BigDecimal income;

    /**
     * 兑付的未付收益，日终时和变动份额一起写入到昨日份额中
     */
    @Column(name = "F_INVESTINCOME", columnDefinition = "DOUBLE")
    @MetaData(value = "兑付的未付收益", comments = "兑付的未付收益，日终时和变动份额一起写入到昨日份额中")
    private BigDecimal investIncome;

    /**
     * 昨日收益
     */
    @Column(name = "F_CURRENTINCOME", columnDefinition = "DOUBLE")
    @MetaData(value = "昨日收益", comments = "昨日收益")
    private BigDecimal currentIncome;

    /**
     * 销售商交易账户
     */
    @Column(name = "C_SALE_TRADEACCO", columnDefinition = "VARCHAR")
    @MetaData(value = "销售商交易账户", comments = "销售商交易账户")
    private String saleTradeAccount;

    /**
     * 资金账户
     */
    @Column(name = "L_MONEYACCOUNT", columnDefinition = "INTEGER")
    @MetaData(value = "资金账户", comments = "资金账户")
    private Long moneyAccount;

    /**
     * 当前成本信息，日终时结转到总成本中
     */
    @Column(name = "F_CURRENTCOST", columnDefinition = "INTEGER")
    @MetaData(value = "当前成本信息", comments = "当前成本信息，日终时结转到总成本中")
    private BigDecimal currentCost;

    private static final long serialVersionUID = 1443496508362L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTano() {
        return tano;
    }

    public void setTano(String tano) {
        this.tano = tano == null ? null : tano.trim();
    }

    public Long getCustNo() {
        return custNo;
    }

    public void setCustNo(Long custNo) {
        this.custNo = custNo;
    }

    public String getFundAccount() {
        return fundAccount;
    }

    public void setFundAccount(String fundAccount) {
        this.fundAccount = fundAccount == null ? null : fundAccount.trim();
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

    public String getTradeAccount() {
        return tradeAccount;
    }

    public void setTradeAccount(String tradeAccount) {
        this.tradeAccount = tradeAccount == null ? null : tradeAccount.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType == null ? null : shareType.trim();
    }

    public BigDecimal getCurrentIncome() {
        return currentIncome;
    }

    public void setCurrentIncome(BigDecimal currentIncome) {
        this.currentIncome = currentIncome;
    }

    public String getSaleTradeAccount() {
        return this.saleTradeAccount;
    }

    public void setSaleTradeAccount(String anSaleTradeAccount) {
        this.saleTradeAccount = anSaleTradeAccount;
    }

    public BigDecimal getValidShares() {
        return this.validShares;
    }

    public void setValidShares(BigDecimal anValidShares) {
        this.validShares = anValidShares;
    }

    public Long getMoneyAccount() {
        return this.moneyAccount;
    }

    public void setMoneyAccount(Long anMoneyAccount) {
        this.moneyAccount = anMoneyAccount;
    }

    public BigDecimal getCurrentCost() {
        return this.currentCost;
    }

    public void setCurrentCost(BigDecimal anCurrentCost) {
        this.currentCost = anCurrentCost;
    }

    public BigDecimal getCostMoney() {
        return this.costMoney;
    }

    public void setCostMoney(BigDecimal anCostMoney) {
        this.costMoney = anCostMoney;
    }

    public BigDecimal getTotalShares() {
        return this.totalShares;
    }

    public void setTotalShares(BigDecimal anTotalShares) {
        this.totalShares = anTotalShares;
    }

    public BigDecimal getFrozen() {
        return this.frozen;
    }

    public void setFrozen(BigDecimal anFrozen) {
        this.frozen = anFrozen;
    }

    public BigDecimal getTradeFrozen() {
        return this.tradeFrozen;
    }

    public void setTradeFrozen(BigDecimal anTradeFrozen) {
        this.tradeFrozen = anTradeFrozen;
    }

    public String getBonusType() {
        return this.bonusType;
    }

    public void setBonusType(String anBonusType) {
        this.bonusType = anBonusType;
    }

    public String getRegDate() {
        return this.regDate;
    }

    public void setRegDate(String anRegDate) {
        this.regDate = anRegDate;
    }

    public String getModiDate() {
        return this.modiDate;
    }

    public void setModiDate(String anModiDate) {
        this.modiDate = anModiDate;
    }

    public BigDecimal getIncome() {
        return this.income;
    }

    public void setIncome(BigDecimal anIncome) {
        this.income = anIncome;
    }

    public BigDecimal getInvestIncome() {
        return this.investIncome;
    }

    public void setInvestIncome(BigDecimal anInvestIncome) {
        this.investIncome = anInvestIncome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("id=").append(id);
        sb.append(", tano=").append(tano);
        sb.append(", custNo=").append(custNo);
        sb.append(", fundAccount=").append(fundAccount);
        sb.append(", agencyNo=").append(agencyNo);
        sb.append(", netNo=").append(netNo);
        sb.append(", tradeAccount=").append(tradeAccount);
        sb.append(", contractNo=").append(contractNo);
        sb.append(", fundCode=").append(fundCode);
        sb.append(", shareType=").append(shareType);
        sb.append(", totalShares=").append(totalShares);
        sb.append(", validShares=").append(validShares);
        sb.append(", frozen=").append(frozen);
        sb.append(", tradeFrozen=").append(tradeFrozen);
        sb.append(", bonusType=").append(bonusType);
        sb.append(", regDate=").append(regDate);
        sb.append(", costMoney=").append(costMoney);
        sb.append(", modiDate=").append(modiDate);
        sb.append(", income=").append(income);
        sb.append(", investIncome=").append(investIncome);
        sb.append(", currentIncome=").append(currentIncome);
        sb.append(", saleTradeAccount=").append(saleTradeAccount);
        sb.append(", moneyAccount=").append(moneyAccount);
        sb.append(", currentCost=").append(currentCost);
        sb.append("]");
        return sb.toString();
    }
}
