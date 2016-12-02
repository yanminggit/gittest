package com.betterjr.modules.fund.entity;

import com.betterjr.common.annotation.*;
import com.betterjr.common.data.BaseRemoteEntity;
import com.betterjr.common.entity.BetterjrEntity;

import javax.persistence.*;

@Access(AccessType.FIELD)
@Entity
@Table(name = "T_SALE_ACCOCONFIRM")
public class SaleAccoConfirmInfo implements BetterjrEntity,BaseRemoteEntity {
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
     * 业务代码
     */
    @Column(name = "C_BUSINFLAG",  columnDefinition="VARCHAR" )
    @MetaData( value="业务代码", comments = "业务代码")
    private String businFlag;

    /**
     * 确认业务代码
     */
    @Column(name = "C_CBUSINFLAG",  columnDefinition="VARCHAR" )
    @MetaData( value="确认业务代码", comments = "确认业务代码")
    private String businConfirmFlag;

    /**
     * 交易账户
     */
    @Column(name = "C_TRADEACCO",  columnDefinition="VARCHAR" )
    @MetaData( value="交易账户", comments = "交易账户")
    private String tradeAccount;

    /**
     * 基金账户
     */
    @Column(name = "C_FUNDACCO",  columnDefinition="VARCHAR" )
    @MetaData( value="基金账户", comments = "基金账户")
    private String fundAccount;

    /**
     * 申请单号
     */
    @Column(name = "C_REQUESTNO",  columnDefinition="VARCHAR" )
    @MetaData( value="申请单号", comments = "申请单号")
    private String requestNo;

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
     * 客户类型；0个人，1机构
     */
    @Column(name = "C_CUSTTYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="客户类型", comments = "客户类型；0个人，1机构")
    private String custType;

    /**
     * 客户姓名
     */
    @Column(name = "C_CUSTNAME",  columnDefinition="VARCHAR" )
    @MetaData( value="客户姓名", comments = "客户姓名")
    private String custName;

    /**
     * 客户简称
     */
    @Column(name = "C_SHORTNAME",  columnDefinition="VARCHAR" )
    @MetaData( value="客户简称", comments = "客户简称")
    private String shortName;

    /**
     * 证件类型
     */
    @Column(name = "C_IDENTTYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="证件类型", comments = "证件类型")
    private String identType;

    /**
     * 账户确认日期
     */
    @Column(name = "D_CDATE",  columnDefinition="VARCHAR" )
    @MetaData( value="账户确认日期", comments = "账户确认日期")
    private String confirmDate;

    /**
     * 账户申请日期
     */
    @Column(name = "D_DATE",  columnDefinition="VARCHAR" )
    @MetaData( value="账户申请日期", comments = "账户申请日期")
    private String tradeDate;

    /**
     * 账户申请时间
     */
    @Column(name = "T_TIME",  columnDefinition="VARCHAR" )
    @MetaData( value="账户申请时间", comments = "账户申请时间")
    private String tradeTime;

    /**
     * 申请状态
     */
    @Column(name = "C_STATUS",  columnDefinition="VARCHAR" )
    @MetaData( value="申请状态", comments = "申请状态")
    private String tradeStatus;

    /**
     * 证件号码
     */
    @Column(name = "C_IDENTNO",  columnDefinition="VARCHAR" )
    @MetaData( value="证件号码", comments = "证件号码")
    private String identNo;

    /**
     * 多渠道开户标志
     */
    @Column(name = "C_MULTIACCO",  columnDefinition="VARCHAR" )
    @MetaData( value="多渠道开户标志", comments = "多渠道开户标志")
    private Boolean muiltAcco;

    /**
     * TA发起业务标志 0-由代销商发起，1-由TA发起
     */
    @Column(name = "C_FROMTA",  columnDefinition="VARCHAR" )
    @MetaData( value="TA发起业务标志 0-由代销商发起", comments = "TA发起业务标志 0-由代销商发起，1-由TA发起")
    private Boolean fromTA;

    /**
     * TA客户编号
     */
    @Column(name = "C_TACUSTNO",  columnDefinition="VARCHAR" )
    @MetaData( value="TA客户编号", comments = "TA客户编号")
    private String taCustNo;

    /**
     * 确认单号
     */
    @Column(name = "C_CSERIALNO",  columnDefinition="VARCHAR" )
    @MetaData( value="确认单号", comments = "确认单号")
    private String confirmSerialno;

    /**
     * 对方交易帐号 对代理人申报008或058，此处赋值为新交易帐号
     */
    @Column(name = "C_TAGET_TRADEACCO",  columnDefinition="VARCHAR" )
    @MetaData( value="对方交易帐号 对代理人申报008或058", comments = "对方交易帐号 对代理人申报008或058，此处赋值为新交易帐号")
    private String tagetTradeAccount;

    /**
     * 交易处理返回代码系统处理后返回错误信息
     */
    @Column(name = "C_CAUSE",  columnDefinition="VARCHAR" )
    @MetaData( value="交易处理返回代码系统处理后返回错误信息", comments = "交易处理返回代码系统处理后返回错误信息")
    private String confirmCause;

    /**
     * 错误代码
     */
    @Column(name = "C_ERRCODE",  columnDefinition="VARCHAR" )
    @MetaData( value="错误代码", comments = "错误代码")
    private String errCode;

    /**
     * 摘要说明
     */
    @Column(name = "C_SPECIFICATION",  columnDefinition="VARCHAR" )
    @MetaData( value="摘要说明", comments = "摘要说明")
    private String specification;

    /**
     * 冻结截止日期  格式为：YYYYMMDD
     */
    @Column(name = "D_FROZENENDLINE",  columnDefinition="VARCHAR" )
    @MetaData( value="冻结截止日期  格式为：YYYYMMDD", comments = "冻结截止日期  格式为：YYYYMMDD")
    private String frozenEndLine;

    /**
     * 冻结原因  0-司法冻结，1-柜台冻结 2-质押冻结， 3-质押(司法冻结) 4-柜台(司法冻结)
     */
    @Column(name = "C_FROZENCAUSE",  columnDefinition="VARCHAR" )
    @MetaData( value="冻结原因  0-司法冻结", comments = "冻结原因  0-司法冻结，1-柜台冻结 2-质押冻结， 3-质押(司法冻结) 4-柜台(司法冻结)")
    private String frozenCause;

    /**
     * 基金账户卡的凭证号
     */
    @Column(name = "C_ACCOUNTCARDNO",  columnDefinition="VARCHAR" )
    @MetaData( value="基金账户卡的凭证号", comments = "基金账户卡的凭证号")
    private String accountCardNo;

    /**
     * 客户经理代码
     */
    @Column(name = "C_CUSTMANAGER",  columnDefinition="VARCHAR" )
    @MetaData( value="客户经理代码", comments = "客户经理代码")
    private String custManager;

    /**
     * 城市地区代码
     */
    @Column(name = "C_CITYNO",  columnDefinition="VARCHAR" )
    @MetaData( value="城市地区代码", comments = "城市地区代码")
    private String cityNo;

    /**
     * 操作员编码
     */
    @Column(name = "C_OPERNO",  columnDefinition="VARCHAR" )
    @MetaData( value="操作员编码", comments = "操作员编码")
    private String operNo;

    /**
     * 复核人编码
     */
    @Column(name = "C_CHECKNO",  columnDefinition="VARCHAR" )
    @MetaData( value="复核人编码", comments = "复核人编码")
    private String checkerNo;

    /**
     * 推荐人姓名
     */
    @Column(name = "C_REFERRAL",  columnDefinition="VARCHAR" )
    @MetaData( value="推荐人姓名", comments = "推荐人姓名")
    private String referral;

    /**
     * 推荐人手机号码
     */
    @Column(name = "C_REFERRALMOBILE",  columnDefinition="VARCHAR" )
    @MetaData( value="推荐人手机号码", comments = "推荐人手机号码")
    private String referralMobile;

    /**
     * 直销网点编码定义
     */
    @Column(name = "C_SALE_NETNO", columnDefinition = "VARCHAR")
    @MetaData(value = "网点编码", comments = "网点编码")
    private String saleNetNo;

    /**
     * 直销分中心编码定义
     */
    @Column(name = "C_SALE_PAYCENTER", columnDefinition = "VARCHAR")
    @MetaData(value = "分中心", comments = "分中心")
    private String salePayCenterNo;

    /**
     * 销售商交易账户
     */
    @Column(name = "C_SALE_TRADEACCO", columnDefinition = "VARCHAR")
    @MetaData(value = "销售商交易账户", comments = "销售商交易账户")
    private String saleTradeAccount;

    /**
     * 基金公司资金账户
     */
    @Column(name = "C_SALE_MONEYACCOUNT", columnDefinition = "VARCHAR")
    @MetaData(value = "基金公司资金账户", comments = "基金公司资金账户")
    private String saleMoneyAccount;

    /**
     * 基金公司客户编号
     */
    @Column(name = "C_SALE_CUSTNO", columnDefinition = "VARCHAR")
    @MetaData(value = "基金公司客户编号", comments = "基金公司客户编号")
    private String saleCustNo;

    /**
     * 基金公司申请单号
     */
    @Column(name = "C_SALE_REQUESTNO", columnDefinition = "VARCHAR")
    @MetaData(value = "基金公司申请单号", comments = "基金公司申请单号")
    private String saleRequestNo;

    private static final long serialVersionUID = 1440667936366L;

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

    public String getBusinFlag() {
        return businFlag;
    }

    public void setBusinFlag(String businFlag) {
        this.businFlag = businFlag == null ? null : businFlag.trim();
    }

    public String getBusinConfirmFlag() {
        return businConfirmFlag;
    }

    public void setBusinConfirmFlag(String businConfirmFlag) {
        this.businConfirmFlag = businConfirmFlag == null ? null : businConfirmFlag.trim();
    }

    public String getTradeAccount() {
        return tradeAccount;
    }

    public void setTradeAccount(String tradeAccount) {
        this.tradeAccount = tradeAccount == null ? null : tradeAccount.trim();
    }

    public String getFundAccount() {
        return fundAccount;
    }

    public void setFundAccount(String fundAccount) {
        this.fundAccount = fundAccount == null ? null : fundAccount.trim();
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
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

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType == null ? null : custType.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getIdentType() {
        return identType;
    }

    public void setIdentType(String identType) {
        this.identType = identType == null ? null : identType.trim();
    }

    public String getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate == null ? null : confirmDate.trim();
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate == null ? null : tradeDate.trim();
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime == null ? null : tradeTime.trim();
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    public String getIdentNo() {
        return identNo;
    }

    public void setIdentNo(String identNo) {
        this.identNo = identNo == null ? null : identNo.trim();
    }

    public Boolean getMuiltAcco() {
        return muiltAcco;
    }

    public void setMuiltAcco(Boolean muiltAcco) {
        this.muiltAcco = muiltAcco;
    }

    public Boolean getFromTA() {
        return fromTA;
    }

    public void setFromTA(Boolean fromTA) {
        this.fromTA = fromTA;
    }

    public String getTaCustNo() {
        return taCustNo;
    }

    public void setTaCustNo(String taCustNo) {
        this.taCustNo = taCustNo == null ? null : taCustNo.trim();
    }

    public String getConfirmSerialno() {
        return confirmSerialno;
    }

    public void setConfirmSerialno(String confirmSerialno) {
        this.confirmSerialno = confirmSerialno == null ? null : confirmSerialno.trim();
    }

    public String getTagetTradeAccount() {
        return tagetTradeAccount;
    }

    public void setTagetTradeAccount(String tagetTradeAccount) {
        this.tagetTradeAccount = tagetTradeAccount == null ? null : tagetTradeAccount.trim();
    }

    public String getConfirmCause() {
        return confirmCause;
    }

    public void setConfirmCause(String confirmCause) {
        this.confirmCause = confirmCause == null ? null : confirmCause.trim();
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getFrozenEndLine() {
        return frozenEndLine;
    }

    public void setFrozenEndLine(String frozenEndLine) {
        this.frozenEndLine = frozenEndLine == null ? null : frozenEndLine.trim();
    }

    public String getFrozenCause() {
        return frozenCause;
    }

    public void setFrozenCause(String frozenCause) {
        this.frozenCause = frozenCause == null ? null : frozenCause.trim();
    }

    public String getAccountCardNo() {
        return accountCardNo;
    }

    public void setAccountCardNo(String accountCardNo) {
        this.accountCardNo = accountCardNo == null ? null : accountCardNo.trim();
    }

    public String getCustManager() {
        return custManager;
    }

    public void setCustManager(String custManager) {
        this.custManager = custManager == null ? null : custManager.trim();
    }

    public String getCityNo() {
        return cityNo;
    }

    public void setCityNo(String cityNo) {
        this.cityNo = cityNo == null ? null : cityNo.trim();
    }

    public String getOperNo() {
        return operNo;
    }

    public void setOperNo(String operNo) {
        this.operNo = operNo == null ? null : operNo.trim();
    }

    public String getCheckerNo() {
        return checkerNo;
    }

    public void setCheckerNo(String checkerNo) {
        this.checkerNo = checkerNo == null ? null : checkerNo.trim();
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral == null ? null : referral.trim();
    }

    public String getReferralMobile() {
        return referralMobile;
    }

    public void setReferralMobile(String referralMobile) {
        this.referralMobile = referralMobile == null ? null : referralMobile.trim();
    }

    public String getSaleNetNo() {
        return this.saleNetNo;
    }

    public void setSaleNetNo(String anSaleNetNo) {
        this.saleNetNo = anSaleNetNo;
    }

    public String getSalePayCenterNo() {
        return this.salePayCenterNo;
    }

    public void setSalePayCenterNo(String anSalePayCenterNo) {
        this.salePayCenterNo = anSalePayCenterNo;
    }

    public String getSaleTradeAccount() {
        return this.saleTradeAccount;
    }

    public void setSaleTradeAccount(String anSaleTradeAccount) {
        this.saleTradeAccount = anSaleTradeAccount;
    }

    public String getSaleMoneyAccount() {
        return this.saleMoneyAccount;
    }

    public void setSaleMoneyAccount(String anSaleMoneyAccount) {
        this.saleMoneyAccount = anSaleMoneyAccount;
    }

    public String getSaleCustNo() {
        return this.saleCustNo;
    }

    public void setSaleCustNo(String anSaleCustNo) {
        this.saleCustNo = anSaleCustNo;
    }

    public String getSaleRequestNo() {
        return this.saleRequestNo;
    }

    public void setSaleRequestNo(String anSaleRequestNo) {
        this.saleRequestNo = anSaleRequestNo;
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
        sb.append(", businFlag=").append(businFlag);
        sb.append(", businConfirmFlag=").append(businConfirmFlag);
        sb.append(", tradeAccount=").append(tradeAccount);
        sb.append(", fundAccount=").append(fundAccount);
        sb.append(", requestNo=").append(requestNo);
        sb.append(", agencyNo=").append(agencyNo);
        sb.append(", netNo=").append(netNo);
        sb.append(", custType=").append(custType);
        sb.append(", custName=").append(custName);
        sb.append(", shortName=").append(shortName);
        sb.append(", identType=").append(identType);
        sb.append(", confirmDate=").append(confirmDate);
        sb.append(", tradeDate=").append(tradeDate);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", tradeStatus=").append(tradeStatus);
        sb.append(", identNo=").append(identNo);
        sb.append(", muiltAcco=").append(muiltAcco);
        sb.append(", fromTA=").append(fromTA);
        sb.append(", taCustNo=").append(taCustNo);
        sb.append(", confirmSerialno=").append(confirmSerialno);
        sb.append(", tagetTradeAccount=").append(tagetTradeAccount);
        sb.append(", confirmCause=").append(confirmCause);
        sb.append(", errCode=").append(errCode);
        sb.append(", specification=").append(specification);
        sb.append(", frozenEndLine=").append(frozenEndLine);
        sb.append(", frozenCause=").append(frozenCause);
        sb.append(", accountCardNo=").append(accountCardNo);
        sb.append(", custManager=").append(custManager);
        sb.append(", cityNo=").append(cityNo);
        sb.append(", operNo=").append(operNo);
        sb.append(", checkerNo=").append(checkerNo);
        sb.append(", referral=").append(referral);
        sb.append(", referralMobile=").append(referralMobile);
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
        SaleAccoConfirmInfo other = (SaleAccoConfirmInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustNo() == null ? other.getCustNo() == null : this.getCustNo().equals(other.getCustNo()))
            && (this.getTano() == null ? other.getTano() == null : this.getTano().equals(other.getTano()))
            && (this.getBusinFlag() == null ? other.getBusinFlag() == null : this.getBusinFlag().equals(other.getBusinFlag()))
            && (this.getBusinConfirmFlag() == null ? other.getBusinConfirmFlag() == null : this.getBusinConfirmFlag().equals(other.getBusinConfirmFlag()))
            && (this.getTradeAccount() == null ? other.getTradeAccount() == null : this.getTradeAccount().equals(other.getTradeAccount()))
            && (this.getFundAccount() == null ? other.getFundAccount() == null : this.getFundAccount().equals(other.getFundAccount()))
            && (this.getRequestNo() == null ? other.getRequestNo() == null : this.getRequestNo().equals(other.getRequestNo()))
            && (this.getAgencyNo() == null ? other.getAgencyNo() == null : this.getAgencyNo().equals(other.getAgencyNo()))
            && (this.getNetNo() == null ? other.getNetNo() == null : this.getNetNo().equals(other.getNetNo()))
            && (this.getCustType() == null ? other.getCustType() == null : this.getCustType().equals(other.getCustType()))
            && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
            && (this.getShortName() == null ? other.getShortName() == null : this.getShortName().equals(other.getShortName()))
            && (this.getIdentType() == null ? other.getIdentType() == null : this.getIdentType().equals(other.getIdentType()))
            && (this.getConfirmDate() == null ? other.getConfirmDate() == null : this.getConfirmDate().equals(other.getConfirmDate()))
            && (this.getTradeDate() == null ? other.getTradeDate() == null : this.getTradeDate().equals(other.getTradeDate()))
            && (this.getTradeTime() == null ? other.getTradeTime() == null : this.getTradeTime().equals(other.getTradeTime()))
            && (this.getTradeStatus() == null ? other.getTradeStatus() == null : this.getTradeStatus().equals(other.getTradeStatus()))
            && (this.getIdentNo() == null ? other.getIdentNo() == null : this.getIdentNo().equals(other.getIdentNo()))
            && (this.getMuiltAcco() == null ? other.getMuiltAcco() == null : this.getMuiltAcco().equals(other.getMuiltAcco()))
            && (this.getFromTA() == null ? other.getFromTA() == null : this.getFromTA().equals(other.getFromTA()))
            && (this.getTaCustNo() == null ? other.getTaCustNo() == null : this.getTaCustNo().equals(other.getTaCustNo()))
            && (this.getConfirmSerialno() == null ? other.getConfirmSerialno() == null : this.getConfirmSerialno().equals(other.getConfirmSerialno()))
            && (this.getTagetTradeAccount() == null ? other.getTagetTradeAccount() == null : this.getTagetTradeAccount().equals(other.getTagetTradeAccount()))
            && (this.getConfirmCause() == null ? other.getConfirmCause() == null : this.getConfirmCause().equals(other.getConfirmCause()))
            && (this.getErrCode() == null ? other.getErrCode() == null : this.getErrCode().equals(other.getErrCode()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()))
            && (this.getFrozenEndLine() == null ? other.getFrozenEndLine() == null : this.getFrozenEndLine().equals(other.getFrozenEndLine()))
            && (this.getFrozenCause() == null ? other.getFrozenCause() == null : this.getFrozenCause().equals(other.getFrozenCause()))
            && (this.getAccountCardNo() == null ? other.getAccountCardNo() == null : this.getAccountCardNo().equals(other.getAccountCardNo()))
            && (this.getCustManager() == null ? other.getCustManager() == null : this.getCustManager().equals(other.getCustManager()))
            && (this.getCityNo() == null ? other.getCityNo() == null : this.getCityNo().equals(other.getCityNo()))
            && (this.getOperNo() == null ? other.getOperNo() == null : this.getOperNo().equals(other.getOperNo()))
            && (this.getCheckerNo() == null ? other.getCheckerNo() == null : this.getCheckerNo().equals(other.getCheckerNo()))
            && (this.getReferral() == null ? other.getReferral() == null : this.getReferral().equals(other.getReferral()))
            && (this.getReferralMobile() == null ? other.getReferralMobile() == null : this.getReferralMobile().equals(other.getReferralMobile()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustNo() == null) ? 0 : getCustNo().hashCode());
        result = prime * result + ((getTano() == null) ? 0 : getTano().hashCode());
        result = prime * result + ((getBusinFlag() == null) ? 0 : getBusinFlag().hashCode());
        result = prime * result + ((getBusinConfirmFlag() == null) ? 0 : getBusinConfirmFlag().hashCode());
        result = prime * result + ((getTradeAccount() == null) ? 0 : getTradeAccount().hashCode());
        result = prime * result + ((getFundAccount() == null) ? 0 : getFundAccount().hashCode());
        result = prime * result + ((getRequestNo() == null) ? 0 : getRequestNo().hashCode());
        result = prime * result + ((getAgencyNo() == null) ? 0 : getAgencyNo().hashCode());
        result = prime * result + ((getNetNo() == null) ? 0 : getNetNo().hashCode());
        result = prime * result + ((getCustType() == null) ? 0 : getCustType().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getShortName() == null) ? 0 : getShortName().hashCode());
        result = prime * result + ((getIdentType() == null) ? 0 : getIdentType().hashCode());
        result = prime * result + ((getConfirmDate() == null) ? 0 : getConfirmDate().hashCode());
        result = prime * result + ((getTradeDate() == null) ? 0 : getTradeDate().hashCode());
        result = prime * result + ((getTradeTime() == null) ? 0 : getTradeTime().hashCode());
        result = prime * result + ((getTradeStatus() == null) ? 0 : getTradeStatus().hashCode());
        result = prime * result + ((getIdentNo() == null) ? 0 : getIdentNo().hashCode());
        result = prime * result + ((getMuiltAcco() == null) ? 0 : getMuiltAcco().hashCode());
        result = prime * result + ((getFromTA() == null) ? 0 : getFromTA().hashCode());
        result = prime * result + ((getTaCustNo() == null) ? 0 : getTaCustNo().hashCode());
        result = prime * result + ((getConfirmSerialno() == null) ? 0 : getConfirmSerialno().hashCode());
        result = prime * result + ((getTagetTradeAccount() == null) ? 0 : getTagetTradeAccount().hashCode());
        result = prime * result + ((getConfirmCause() == null) ? 0 : getConfirmCause().hashCode());
        result = prime * result + ((getErrCode() == null) ? 0 : getErrCode().hashCode());
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        result = prime * result + ((getFrozenEndLine() == null) ? 0 : getFrozenEndLine().hashCode());
        result = prime * result + ((getFrozenCause() == null) ? 0 : getFrozenCause().hashCode());
        result = prime * result + ((getAccountCardNo() == null) ? 0 : getAccountCardNo().hashCode());
        result = prime * result + ((getCustManager() == null) ? 0 : getCustManager().hashCode());
        result = prime * result + ((getCityNo() == null) ? 0 : getCityNo().hashCode());
        result = prime * result + ((getOperNo() == null) ? 0 : getOperNo().hashCode());
        result = prime * result + ((getCheckerNo() == null) ? 0 : getCheckerNo().hashCode());
        result = prime * result + ((getReferral() == null) ? 0 : getReferral().hashCode());
        result = prime * result + ((getReferralMobile() == null) ? 0 : getReferralMobile().hashCode());
        return result;
    }
}