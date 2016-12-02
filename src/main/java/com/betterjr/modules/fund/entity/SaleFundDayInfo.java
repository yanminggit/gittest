package com.betterjr.modules.fund.entity;

import com.betterjr.common.annotation.*;
import com.betterjr.common.data.BaseRemoteEntity;
import com.betterjr.common.entity.BetterjrEntity;
import com.betterjr.common.mapper.BeanMapper;
import com.betterjr.common.selectkey.SerialGenerator;
import com.betterjr.common.utils.BetterStringUtils;
import com.betterjr.common.utils.MathExtend;

import javax.persistence.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Access(AccessType.FIELD)
@Entity
@Table(name = "T_SALE_FUNDDAY")
public class SaleFundDayInfo implements BetterjrEntity, BaseRemoteEntity {
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
     * 基金代码
     */
    @Column(name = "C_FUNDCODE", columnDefinition = "VARCHAR")
    @MetaData(value = "基金代码", comments = "基金代码")
    private String fundCode;

    /**
     * 基金名称
     */
    @Column(name = "C_FUNDNAME", columnDefinition = "VARCHAR")
    @MetaData(value = "基金名称", comments = "基金名称")
    private String fundName;

    /**
     * 份额类别 'A'前收费 'B' 后收费
     */
    @Column(name = "C_SHARETYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "份额类别 'A'前收费 'B' 后收费", comments = "份额类别 'A'前收费 'B' 后收费")
    private String shareType;

    /**
     * 基金净值类型(QDII使用) '0'-普通净值 '1'-申购净值 '2'-赎回净值
     */
    @Column(name = "C_NETVALUETYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "基金净值类型(QDII使用) '0'-普通净值 '1'-申购净值 '2'-赎回净值", comments = "基金净值类型(QDII使用) '0'-普通净值 '1'-申购净值 '2'-赎回净值")
    private String netValueType;

    /**
     * 净值日期
     */
    @Column(name = "D_DATE", columnDefinition = "VARCHAR")
    @MetaData(value = "净值日期", comments = "净值日期")
    private String netDate;

    /**
     * 发布日期
     */
    @Column(name = "D_CDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "发布日期", comments = "发布日期")
    private String issueDate;

    /**
     * 昨日基金状态
     */
    @Column(name = "C_LAST_STATUS", columnDefinition = "VARCHAR")
    @MetaData(value = "昨日基金状态", comments = "昨日基金状态")
    private String lastStatus;

    /**
     * 当日基金状态 0-交易，1-发行 2-发行成功，3-发行失败 4-基金停止交易 5-停止申购 6-停止赎回 9-基金封闭，a-基金终止
     */
    @Column(name = "C_STATUS", columnDefinition = "VARCHAR")
    @MetaData(value = "当日基金状态 0-交易", comments = "当日基金状态 0-交易，1-发行 2-发行成功，3-发行失败 4-基金停止交易 5-停止申购 6-停止赎回 9-基金封闭，a-基金终止")
    private String status;

    /**
     * 下一日基金状态 0-交易，1-发行 2-发行成功，3-发行失败 4-基金停止交易 5-停止申购 6-停止赎回 9-基金封闭，a-基金终止
     */
    @Column(name = "C_NEXT_STATUS", columnDefinition = "VARCHAR")
    @MetaData(value = "下一日基金状态 0-交易", comments = "下一日基金状态 0-交易，1-发行 2-发行成功，3-发行失败 4-基金停止交易 5-停止申购 6-停止赎回 9-基金封闭，a-基金终止")
    private String nextStatus;

    /**
     * 当日总份额
     */
    @Column(name = "F_SHARES", columnDefinition = "DOUBLE")
    @MetaData(value = "当日总份额", comments = "当日总份额")
    private BigDecimal shares;

    /**
     * 当日总资产
     */
    @Column(name = "F_ASSET", columnDefinition = "DOUBLE")
    @MetaData(value = "当日总资产", comments = "当日总资产")
    private BigDecimal asset;

    /**
     * 昨日总份额
     */
    @Column(name = "F_LAST_SHARES", columnDefinition = "DOUBLE")
    @MetaData(value = "昨日总份额", comments = "昨日总份额")
    private BigDecimal lastShares;

    /**
     * 昨日总资产
     */
    @Column(name = "F_LAST_ASSET", columnDefinition = "DOUBLE")
    @MetaData(value = "昨日总资产", comments = "昨日总资产")
    private BigDecimal lastAsset;

    /**
     * 当日基金净值
     */
    @Column(name = "F_NETVALUE", columnDefinition = "DOUBLE")
    @MetaData(value = "当日基金净值", comments = "当日基金净值")
    private BigDecimal netValue;

    /**
     * 昨日基金净值
     */
    @Column(name = "F_LAST_NETVALUE", columnDefinition = "DOUBLE")
    @MetaData(value = "昨日基金净值", comments = "昨日基金净值")
    private BigDecimal lastNetValue;

    /**
     * 昨日基金收益
     */
    @Column(name = "F_INCOME", columnDefinition = "DOUBLE")
    @MetaData(value = "昨日基金收益", comments = "昨日基金收益")
    private BigDecimal income;

    /**
     * 万份单位收益
     */
    @Column(name = "F_INCOMEUNIT", columnDefinition = "DOUBLE")
    @MetaData(value = "万份单位收益", comments = "万份单位收益")
    private BigDecimal incomeUnit;

    /**
     * 七日年化收益，可能是7天平均年收益率0.03，表示3％
     */
    @Column(name = "F_INCOMERATIO", columnDefinition = "DOUBLE")
    @MetaData(value = "七日年化收益", comments = "七日年化收益，可能是7天平均年收益率0.03，表示3％")
    private BigDecimal incomeRatio;

    /**
     * 累计净值
     */
    @Column(name = "F_TOTALNETVALUE", columnDefinition = "DOUBLE")
    @MetaData(value = "累计净值", comments = "累计净值")
    private BigDecimal totalNetValue;

    /**
     * 保本净值
     */
    @Column(name = "F_GUARANTNETVALUE", columnDefinition = "DOUBLE")
    @MetaData(value = "保本净值", comments = "保本净值")
    private BigDecimal guarantNetValue;

    /**
     * 保本到期日
     */
    @Column(name = "D_GUARANTENDDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "保本到期日", comments = "保本到期日")
    private String guarantEndDate;

    /**
     * 销售服务费率
     */
    @Column(name = "F_SERVICERATIO", columnDefinition = "DOUBLE")
    @MetaData(value = "销售服务费率", comments = "销售服务费率")
    private BigDecimal serviceRatio;

    /**
     * 涨跌幅
     */
    @Column(name = "F_SWINRATE", columnDefinition = "DOUBLE")
    @MetaData(value = "涨跌幅", comments = "涨跌幅")
    private BigDecimal swingRate;

    /**
     * 当前激活状态
     */
    @Column(name = "C_ACTIVE", columnDefinition = "VARCHAR")
    @MetaData(value = "当前激活状态", comments = "当前激活状态")
    private Boolean activeRecord;

    @Column(name = "F_BUILDRATE", columnDefinition = "DOUBLE")
    @MetaData(value = "成立以来涨跌幅", comments = "成立以来涨跌幅")
    private BigDecimal buildRate = BigDecimal.ZERO;

    // 今年以来涨跌幅
    @Column(name = "F_YEARRATE", columnDefinition = "DOUBLE")
    @MetaData(value = "年涨跌幅", comments = "年涨跌幅")
    private BigDecimal yearRate = BigDecimal.ZERO;

    @Transient
    private SaleFundInfo fundInfo;

    private static final long serialVersionUID = 1442557610328L;

    public boolean checkBond(String anBond) {
        if (BetterStringUtils.isNotBlank(anBond) && this.fundInfo != null && BetterStringUtils.isNotBlank(this.fundInfo.getBrand())) {
            return anBond.equalsIgnoreCase(this.fundInfo.getBrand());
        }
        else {
            return true;
        }
    }

    public String findFundClass() {

        return this.fundInfo.getFundClass();
    }

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

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName == null ? null : fundName.trim();
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType == null ? null : shareType.trim();
    }

    public String getNetValueType() {
        return netValueType;
    }

    public void setNetValueType(String netValueType) {
        this.netValueType = netValueType == null ? null : netValueType.trim();
    }

    public String getNetDate() {
        return netDate;
    }

    public void setNetDate(String netDate) {
        this.netDate = netDate == null ? null : netDate.trim();
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate == null ? null : issueDate.trim();
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus == null ? null : lastStatus.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getNextStatus() {
        return nextStatus;
    }

    public void setNextStatus(String nextStatus) {
        this.nextStatus = nextStatus == null ? null : nextStatus.trim();
    }

    public BigDecimal getShares() {
        return shares;
    }

    public void setShares(BigDecimal shares) {
        this.shares = shares;
    }

    public BigDecimal getAsset() {
        return asset;
    }

    public void setAsset(BigDecimal asset) {
        this.asset = asset;
    }

    public BigDecimal getLastShares() {
        return lastShares;
    }

    public void setLastShares(BigDecimal lastShares) {
        this.lastShares = lastShares;
    }

    public BigDecimal getLastAsset() {
        return lastAsset;
    }

    public void setLastAsset(BigDecimal lastAsset) {
        this.lastAsset = lastAsset;
    }

    public BigDecimal getNetValue() {
        return netValue;
    }

    public void setNetValue(BigDecimal netValue) {
        this.netValue = netValue;
    }

    public BigDecimal getLastNetValue() {
        return lastNetValue;
    }

    public void setLastNetValue(BigDecimal lastNetValue) {
        this.lastNetValue = lastNetValue;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getIncomeUnit() {
        return incomeUnit;
    }

    public void setIncomeUnit(BigDecimal incomeUnit) {
        this.incomeUnit = incomeUnit;
    }

    public BigDecimal getIncomeRatio() {
        return incomeRatio;
    }

    public void setIncomeRatio(BigDecimal incomeRatio) {
        this.incomeRatio = incomeRatio;
    }

    public BigDecimal getTotalNetValue() {
        return totalNetValue;
    }

    public void setTotalNetValue(BigDecimal totalNetValue) {
        this.totalNetValue = totalNetValue;
    }

    public BigDecimal getGuarantNetValue() {
        return guarantNetValue;
    }

    public void setGuarantNetValue(BigDecimal guarantNetValue) {
        this.guarantNetValue = guarantNetValue;
    }

    public String getGuarantEndDate() {
        return guarantEndDate;
    }

    public void setGuarantEndDate(String guarantEndDate) {
        this.guarantEndDate = guarantEndDate == null ? null : guarantEndDate.trim();
    }

    public BigDecimal getServiceRatio() {
        return serviceRatio;
    }

    public void setServiceRatio(BigDecimal serviceRatio) {
        this.serviceRatio = serviceRatio;
    }

    public BigDecimal getSwingRate() {
        return swingRate;
    }

    public void setSwingRate(BigDecimal swingRate) {
        this.swingRate = swingRate;
    }

    public Boolean getActiveRecord() {
        return activeRecord;
    }

    public void setActiveRecord(Boolean activeRecord) {
        this.activeRecord = activeRecord;
    }

    public SaleFundInfo getFundInfo() {
        return fundInfo;
    }

    public void setFundInfo(SaleFundInfo fundInfo) {
        this.fundInfo = fundInfo;
    }

    public BigDecimal computeShares(BigDecimal anBalance) {

        return MathExtend.round(anBalance.divide(this.netValue,4,RoundingMode.UP));
    }

    public Integer findFundOrder() {
        if (this.fundInfo != null) {
            return this.fundInfo.getFundOrder();
        }
        return 0;
    }

    public BigDecimal getBuildRate() {
        return this.buildRate;
    }

    public void setBuildRate(BigDecimal anBuildRate) {
        this.buildRate = anBuildRate;
    }

    public BigDecimal getYearRate() {
        return this.yearRate;
    }

    public void setYearRate(BigDecimal anYearRate) {
        this.yearRate = anYearRate;
    }
//    public SaleFundDayInfo(TempSaleFundDay tempInfo) {
//        BeanMapper.copy(tempInfo, this);
//        this.setId(SerialGenerator.getLongValue("SaleFundDayInfo.id"));
//    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tano=").append(tano);
        sb.append(", fundCode=").append(fundCode);
        sb.append(", fundName=").append(fundName);
        sb.append(", shareType=").append(shareType);
        sb.append(", netValueType=").append(netValueType);
        sb.append(", netDate=").append(netDate);
        sb.append(", issueDate=").append(issueDate);
        sb.append(", lastStatus=").append(lastStatus);
        sb.append(", status=").append(status);
        sb.append(", nextStatus=").append(nextStatus);
        sb.append(", shares=").append(shares);
        sb.append(", asset=").append(asset);
        sb.append(", lastShares=").append(lastShares);
        sb.append(", lastAsset=").append(lastAsset);
        sb.append(", netValue=").append(netValue);
        sb.append(", lastNetValue=").append(lastNetValue);
        sb.append(", income=").append(income);
        sb.append(", incomeUnit=").append(incomeUnit);
        sb.append(", incomeRatio=").append(incomeRatio);
        sb.append(", totalNetValue=").append(totalNetValue);
        sb.append(", guarantNetValue=").append(guarantNetValue);
        sb.append(", guarantEndDate=").append(guarantEndDate);
        sb.append(", serviceRatio=").append(serviceRatio);
        sb.append(", swingRate=").append(swingRate);
        sb.append(", activeRecord=").append(activeRecord);
        sb.append(", buildRate=").append(buildRate);
        sb.append(", yearRate=").append(yearRate);
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
        SaleFundDayInfo other = (SaleFundDayInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getTano() == null ? other.getTano() == null : this.getTano().equals(other.getTano()))
                && (this.getFundCode() == null ? other.getFundCode() == null : this.getFundCode().equals(other.getFundCode()))
                && (this.getFundName() == null ? other.getFundName() == null : this.getFundName().equals(other.getFundName()))
                && (this.getShareType() == null ? other.getShareType() == null : this.getShareType().equals(other.getShareType()))
                && (this.getNetValueType() == null ? other.getNetValueType() == null : this.getNetValueType().equals(other.getNetValueType()))
                && (this.getNetDate() == null ? other.getNetDate() == null : this.getNetDate().equals(other.getNetDate()))
                && (this.getIssueDate() == null ? other.getIssueDate() == null : this.getIssueDate().equals(other.getIssueDate()))
                && (this.getLastStatus() == null ? other.getLastStatus() == null : this.getLastStatus().equals(other.getLastStatus()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getNextStatus() == null ? other.getNextStatus() == null : this.getNextStatus().equals(other.getNextStatus()))
                && (this.getShares() == null ? other.getShares() == null : this.getShares().equals(other.getShares()))
                && (this.getAsset() == null ? other.getAsset() == null : this.getAsset().equals(other.getAsset()))
                && (this.getLastShares() == null ? other.getLastShares() == null : this.getLastShares().equals(other.getLastShares()))
                && (this.getLastAsset() == null ? other.getLastAsset() == null : this.getLastAsset().equals(other.getLastAsset()))
                && (this.getNetValue() == null ? other.getNetValue() == null : this.getNetValue().equals(other.getNetValue()))
                && (this.getLastNetValue() == null ? other.getLastNetValue() == null : this.getLastNetValue().equals(other.getLastNetValue()))
                && (this.getIncome() == null ? other.getIncome() == null : this.getIncome().equals(other.getIncome()))
                && (this.getIncomeUnit() == null ? other.getIncomeUnit() == null : this.getIncomeUnit().equals(other.getIncomeUnit()))
                && (this.getIncomeRatio() == null ? other.getIncomeRatio() == null : this.getIncomeRatio().equals(other.getIncomeRatio()))
                && (this.getTotalNetValue() == null ? other.getTotalNetValue() == null : this.getTotalNetValue().equals(other.getTotalNetValue()))
                && (this.getGuarantNetValue() == null ? other.getGuarantNetValue() == null : this.getGuarantNetValue().equals(
                        other.getGuarantNetValue()))
                && (this.getGuarantEndDate() == null ? other.getGuarantEndDate() == null : this.getGuarantEndDate().equals(other.getGuarantEndDate()))
                && (this.getServiceRatio() == null ? other.getServiceRatio() == null : this.getServiceRatio().equals(other.getServiceRatio()))
                && (this.getSwingRate() == null ? other.getSwingRate() == null : this.getSwingRate().equals(other.getSwingRate()))
                && (this.getYearRate() == null ? other.getYearRate() == null : this.getYearRate().equals(other.getYearRate()))
                && (this.getBuildRate() == null ? other.getBuildRate() == null : this.getBuildRate().equals(other.getBuildRate()))
                && (this.getActiveRecord() == null ? other.getActiveRecord() == null : this.getActiveRecord().equals(other.getActiveRecord()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTano() == null) ? 0 : getTano().hashCode());
        result = prime * result + ((getFundCode() == null) ? 0 : getFundCode().hashCode());
        result = prime * result + ((getFundName() == null) ? 0 : getFundName().hashCode());
        result = prime * result + ((getShareType() == null) ? 0 : getShareType().hashCode());
        result = prime * result + ((getNetValueType() == null) ? 0 : getNetValueType().hashCode());
        result = prime * result + ((getNetDate() == null) ? 0 : getNetDate().hashCode());
        result = prime * result + ((getIssueDate() == null) ? 0 : getIssueDate().hashCode());
        result = prime * result + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getNextStatus() == null) ? 0 : getNextStatus().hashCode());
        result = prime * result + ((getShares() == null) ? 0 : getShares().hashCode());
        result = prime * result + ((getAsset() == null) ? 0 : getAsset().hashCode());
        result = prime * result + ((getLastShares() == null) ? 0 : getLastShares().hashCode());
        result = prime * result + ((getLastAsset() == null) ? 0 : getLastAsset().hashCode());
        result = prime * result + ((getNetValue() == null) ? 0 : getNetValue().hashCode());
        result = prime * result + ((getLastNetValue() == null) ? 0 : getLastNetValue().hashCode());
        result = prime * result + ((getIncome() == null) ? 0 : getIncome().hashCode());
        result = prime * result + ((getIncomeUnit() == null) ? 0 : getIncomeUnit().hashCode());
        result = prime * result + ((getIncomeRatio() == null) ? 0 : getIncomeRatio().hashCode());
        result = prime * result + ((getTotalNetValue() == null) ? 0 : getTotalNetValue().hashCode());
        result = prime * result + ((getGuarantNetValue() == null) ? 0 : getGuarantNetValue().hashCode());
        result = prime * result + ((getGuarantEndDate() == null) ? 0 : getGuarantEndDate().hashCode());
        result = prime * result + ((getServiceRatio() == null) ? 0 : getServiceRatio().hashCode());
        result = prime * result + ((getSwingRate() == null) ? 0 : getSwingRate().hashCode());
        result = prime * result + ((getActiveRecord() == null) ? 0 : getActiveRecord().hashCode());
        result = prime * result + ((getYearRate() == null) ? 0 : getYearRate().hashCode());
        result = prime * result + ((getBuildRate() == null) ? 0 : getBuildRate().hashCode());
        return result;
    }

    public String findRiskLevel() {
        if (this.fundInfo != null) {
            return this.fundInfo.getRiskLevel();
        }
        else {
            return "00";
        }
    }
}