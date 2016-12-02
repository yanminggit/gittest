package com.betterjr.modules.fund.entity;

import com.betterjr.common.annotation.*;
import com.betterjr.common.data.BaseRemoteEntity;
import com.betterjr.common.entity.BetterjrEntity;

import java.math.BigDecimal;

import javax.persistence.*;

@Access(AccessType.FIELD)
@Entity
@Table(name = "T_SALE_CONFIRM")
public class SaleConfirmInfo implements BetterjrEntity,BaseRemoteEntity {
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
     * 客户类型；0个人，1机构
     */
    @Column(name = "C_CUSTTYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="客户类型", comments = "客户类型；0个人，1机构")
    private String custType;

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
     * 销售人代码
     */
    @Column(name = "C_AGENCYNO",  columnDefinition="VARCHAR" )
    @MetaData( value="销售人代码", comments = "销售人代码")
    private String agencyNo;

    /**
     * 分中心
     */
    @Column(name = "C_PAYCENTER",  columnDefinition="VARCHAR" )
    @MetaData( value="分中心", comments = "分中心")
    private String payCenterNo;

    /**
     * 网点编码
     */
    @Column(name = "C_NETNO",  columnDefinition="VARCHAR" )
    @MetaData( value="网点编码", comments = "网点编码")
    private String netNo;

    /**
     * 申请日期
     */
    @Column(name = "D_DATE",  columnDefinition="VARCHAR" )
    @MetaData( value="申请日期", comments = "申请日期")
    private String tradeDate;

    /**
     * TA确认日期
     */
    @Column(name = "D_CDATE",  columnDefinition="VARCHAR" )
    @MetaData( value="TA确认日期", comments = "TA确认日期")
    private String confirmDate;

    /**
     * 申请单号
     */
    @Column(name = "C_REQUESTNO",  columnDefinition="VARCHAR" )
    @MetaData( value="申请单号", comments = "申请单号")
    private String requestNo;

    /**
     * 确认单号
     */
    @Column(name = "C_CSERIALNO",  columnDefinition="VARCHAR" )
    @MetaData( value="确认单号", comments = "确认单号")
    private String confirmSerialno;

    /**
     * 基金代码
     */
    @Column(name = "C_FUNDCODE",  columnDefinition="VARCHAR" )
    @MetaData( value="基金代码", comments = "基金代码")
    private String fundCode;

    /**
     * 份额类别
     */
    @Column(name = "C_SHARETYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="份额类别", comments = "份额类别")
    private String shareType;

    /**
     * 业务代码
     */
    @Column(name = "C_BUSINFLAG",  columnDefinition="VARCHAR" )
    @MetaData( value="业务代码", comments = "业务代码")
    private String businFlag;

    /**
     * 申请金额
     */
    @Column(name = "F_BALANCE",  columnDefinition="DOUBLE" )
    @MetaData( value="申请金额", comments = "申请金额")
    private BigDecimal balance;

    /**
     * 申请份额
     */
    @Column(name = "F_SHARE",  columnDefinition="DOUBLE" )
    @MetaData( value="申请份额", comments = "申请份额")
    private BigDecimal shares;

    /**
     * 确认金额
     */
    @Column(name = "F_CONFIRMBALANCE",  columnDefinition="DOUBLE" )
    @MetaData( value="确认金额", comments = "确认金额")
    private BigDecimal confirmBalance;

    /**
     * 确认份额
     */
    @Column(name = "F_CONFIRMSHARES",  columnDefinition="DOUBLE" )
    @MetaData( value="确认份额", comments = "确认份额")
    private BigDecimal confirmShares;

    /**
     * 净值
     */
    @Column(name = "F_NETVALUE",  columnDefinition="DOUBLE" )
    @MetaData( value="净值", comments = "净值")
    private BigDecimal netValue;

    /**
     * 折扣率
     */
    @Column(name = "F_DISCOUNT",  columnDefinition="DOUBLE" )
    @MetaData( value="折扣率", comments = "折扣率")
    private BigDecimal discount;

    /**
     * 后收手续费折扣率
     */
    @Column(name = "F_BACKDISCOUNT",  columnDefinition="DOUBLE" )
    @MetaData( value="后收手续费折扣率", comments = "后收手续费折扣率")
    private BigDecimal backDiscount;

    /**
     * 费率
     */
    @Column(name = "F_RATIO",  columnDefinition="DOUBLE" )
    @MetaData( value="费率", comments = "费率")
    private BigDecimal ratio;

    /**
     * 收益
     */
    @Column(name = "F_PROFIT",  columnDefinition="DOUBLE" )
    @MetaData( value="收益", comments = "收益")
    private BigDecimal profit;

    /**
     * 手续费
     */
    @Column(name = "F_FARE",  columnDefinition="DOUBLE" )
    @MetaData( value="手续费", comments = "手续费")
    private BigDecimal fare;

    /**
     * 交易费
     */
    @Column(name = "F_DEALFARE",  columnDefinition="DOUBLE" )
    @MetaData( value="交易费", comments = "交易费")
    private BigDecimal dealFare;

    /**
     * 过户费
     */
    @Column(name = "F_TAFARE",  columnDefinition="DOUBLE" )
    @MetaData( value="过户费", comments = "过户费")
    private BigDecimal taFare;

    /**
     * 后手续费
     */
    @Column(name = "F_AFTERFARE",  columnDefinition="DOUBLE" )
    @MetaData( value="后手续费", comments = "后手续费")
    private BigDecimal afterFare;

    /**
     * 代理费
     */
    @Column(name = "F_AGENCYFARE",  columnDefinition="DOUBLE" )
    @MetaData( value="代理费", comments = "代理费")
    private BigDecimal agencyFare;

    /**
     * 印花税
     */
    @Column(name = "F_STAMPTAX",  columnDefinition="DOUBLE" )
    @MetaData( value="印花税", comments = "印花税")
    private BigDecimal stampTax;

    /**
     * 税金
     */
    @Column(name = "F_TAX",  columnDefinition="DOUBLE" )
    @MetaData( value="税金", comments = "税金")
    private BigDecimal tax;

    /**
     * 分红方式
     */
    @Column(name = "C_BONUSTYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="分红方式", comments = "分红方式")
    private String bonusType;

    /**
     * 业务完成标志,0未完成,1已完成
     */
    @Column(name = "C_FINISHED",  columnDefinition="VARCHAR" )
    @MetaData( value="业务完成标志,0未完成,1已完成", comments = "业务完成标志,0未完成,1已完成")
    private Boolean finished;

    /**
     * TA发起业务标志 0-由代销商发起，1-由TA发起
     */
    @Column(name = "C_FROMTA",  columnDefinition="VARCHAR" )
    @MetaData( value="TA发起业务标志 0-由代销商发起", comments = "TA发起业务标志 0-由代销商发起，1-由TA发起")
    private Boolean fromTA;

    /**
     * 错误代码
     */
    @Column(name = "C_ERRCODE",  columnDefinition="VARCHAR" )
    @MetaData( value="错误代码", comments = "错误代码")
    private String errCode;

    /**
     * 交易处理返回代码系统处理后返回错误信息
     */
    @Column(name = "C_CAUSE",  columnDefinition="VARCHAR" )
    @MetaData( value="交易处理返回代码系统处理后返回错误信息", comments = "交易处理返回代码系统处理后返回错误信息")
    private String confirmCause;

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
     * 打印凭证
     */
    @Column(name = "C_VOUCHERFLAG",  columnDefinition="VARCHAR" )
    @MetaData( value="打印凭证", comments = "打印凭证")
    private Boolean voucherFlag;

    /**
     * 基金账户利息金额 
     */
    @Column(name = "F_INTEREST",  columnDefinition="DOUBLE" )
    @MetaData( value="基金账户利息金额 ", comments = "基金账户利息金额 ")
    private BigDecimal interest;

    /**
     * 利息税
     */
    @Column(name = "F_INTERESTTAX",  columnDefinition="DOUBLE" )
    @MetaData( value="利息税", comments = "利息税")
    private BigDecimal interestTax;

    /**
     * 利息产生的基金份数
     */
    @Column(name = "F_SHAREBYINTEREST",  columnDefinition="DOUBLE" )
    @MetaData( value="利息产生的基金份数", comments = "利息产生的基金份数")
    private BigDecimal shareByInterest;

    /**
     * 未付收益
     */
    @Column(name = "F_INCOME",  columnDefinition="DOUBLE" )
    @MetaData( value="未付收益", comments = "未付收益")
    private BigDecimal income;

    /**
     * 兑付的未付收益
     */
    @Column(name = "F_INVESTINCOME",  columnDefinition="DOUBLE" )
    @MetaData( value="兑付的未付收益", comments = "兑付的未付收益")
    private BigDecimal investIncome;

    /**
     * 交易价格
     */
    @Column(name = "F_PRICE",  columnDefinition="DOUBLE" )
    @MetaData( value="交易价格", comments = "交易价格")
    private BigDecimal price;

    /**
     * 对方基金交易价格
     */
    @Column(name = "F_TAGET_PRICE",  columnDefinition="DOUBLE" )
    @MetaData( value="对方基金交易价格", comments = "对方基金交易价格")
    private BigDecimal tagetPrice;

    /**
     * 对方基金代码
     */
    @Column(name = "C_TAGET_FUNDCODE",  columnDefinition="VARCHAR" )
    @MetaData( value="对方基金代码", comments = "对方基金代码")
    private String tagetFundCode;

    /**
     * 对方份额类别
     */
    @Column(name = "C_TAGET_SHARETYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="对方份额类别", comments = "对方份额类别")
    private String tagetShareType;

    /**
     * 对方交易账户
     */
    @Column(name = "C_TAGET_TRADEACCO",  columnDefinition="VARCHAR" )
    @MetaData( value="对方交易账户", comments = "对方交易账户")
    private String tagetTradeAccount;

    /**
     * 对方基金账号
     */
    @Column(name = "C_TAGET_FUNDACCO",  columnDefinition="VARCHAR" )
    @MetaData( value="对方基金账号", comments = "对方基金账号")
    private String tagetFundAccount;

    /**
     * 对方销售商
     */
    @Column(name = "C_TAGET_AGENCYNO",  columnDefinition="VARCHAR" )
    @MetaData( value="对方销售商", comments = "对方销售商")
    private String tagetAgencyNo;

    /**
     * 对方网点   转销售商、非交易过户时使用
     */
    @Column(name = "C_TAGET_NETNO",  columnDefinition="VARCHAR" )
    @MetaData( value="对方网点   转销售商、非交易过户时使用", comments = "对方网点   转销售商、非交易过户时使用")
    private String tagetNetNo;

    /**
     * 对方基金单位净值
     */
    @Column(name = "F_TAGET_NETVALUE",  columnDefinition="DOUBLE" )
    @MetaData( value="对方基金单位净值", comments = "对方基金单位净值")
    private BigDecimal tagetNetValue;

    /**
     * 对方基金确认份额
     */
    @Column(name = "F_TAGET_CONFIRMSHARE",  columnDefinition="DOUBLE" )
    @MetaData( value="对方基金确认份额", comments = "对方基金确认份额")
    private BigDecimal tagetConfirmShares;

    /**
     * 对方城市区域代码
     */
    @Column(name = "C_TAGET_CITYNO",  columnDefinition="VARCHAR" )
    @MetaData( value="对方城市区域代码", comments = "对方城市区域代码")
    private String tagetCityNo;

    /**
     * 补差费折扣率
     */
    @Column(name = "F_TAGET_DISCOUNT",  columnDefinition="DOUBLE" )
    @MetaData( value="补差费折扣率", comments = "补差费折扣率")
    private BigDecimal tagetDiscount;

    /**
     * 应收手续费
     */
    @Column(name = "F_ORIGINFARE",  columnDefinition="DOUBLE" )
    @MetaData( value="应收手续费", comments = "应收手续费")
    private BigDecimal originFare;

    /**
     * 经纪人
     */
    @Column(name = "C_BROKER",  columnDefinition="VARCHAR" )
    @MetaData( value="经纪人", comments = "经纪人")
    private String broker;

    /**
     * 城市地区代码
     */
    @Column(name = "C_CITYNO",  columnDefinition="VARCHAR" )
    @MetaData( value="城市地区代码", comments = "城市地区代码")
    private String cityNo;

    /**
     * 客户经理代码
     */
    @Column(name = "C_CUSTMANAGER",  columnDefinition="VARCHAR" )
    @MetaData( value="客户经理代码", comments = "客户经理代码")
    private String custManager;

    /**
     * 已兑付的份额
     */
    @Column(name = "F_INVESTSHARE",  columnDefinition="DOUBLE" )
    @MetaData( value="已兑付的份额", comments = "已兑付的份额")
    private BigDecimal investShare;

    /**
     * 原TA确认流水号
     */
    @Column(name = "C_OLD_CSERIALNO",  columnDefinition="VARCHAR" )
    @MetaData( value="原TA确认流水号", comments = "原TA确认流水号")
    private String originConfirmNo;

    /**
     * 原申请单编号
     */
    @Column(name = "C_OLD_REQUESTNO",  columnDefinition="VARCHAR" )
    @MetaData( value="原申请单编号", comments = "原申请单编号")
    private String originRequestNo;

    /**
     * 原申请日期
     */
    @Column(name = "D_OLD_DATE",  columnDefinition="VARCHAR" )
    @MetaData( value="原申请日期", comments = "原申请日期")
    private String originTradeDate;

    /**
     * 原销售佣金折扣率  对投资人的总佣金折扣率，取值为投资人实付佣金/投资人应付佣金
     */
    @Column(name = "F_OLD_DISCOUNT",  columnDefinition="DOUBLE" )
    @MetaData( value="原销售佣金折扣率  对投资人的总佣金折扣率", comments = "原销售佣金折扣率  对投资人的总佣金折扣率，取值为投资人实付佣金/投资人应付佣金")
    private BigDecimal originDiscount;

    /**
     * TA的原确认日期
     */
    @Column(name = "D_OLD_CDATE",  columnDefinition="VARCHAR" )
    @MetaData( value="TA的原确认日期", comments = "TA的原确认日期")
    private String originConfirmDate;

    /**
     * 预约赎回日期
     */
    @Column(name = "D_SUBREDEM_DATE",  columnDefinition="VARCHAR" )
    @MetaData( value="预约赎回日期", comments = "预约赎回日期")
    private String subRedemDate;

    /**
     * 交易申请有效天数
     */
    @Column(name = "N_VALIDPERIOD",  columnDefinition="INTEGER" )
    @MetaData( value="交易申请有效天数", comments = "交易申请有效天数")
    private Integer validPeriod;

    /**
     * 强制赎回原因；0-小于最低持有数，1-司法执行，2-政策原因
     */
    @Column(name = "C_REDEMRESON",  columnDefinition="VARCHAR" )
    @MetaData( value="强制赎回原因", comments = "强制赎回原因；0-小于最低持有数，1-司法执行，2-政策原因")
    private String redemReson;

    /**
     * TA客户编号
     */
    @Column(name = "C_TACUSTNO",  columnDefinition="VARCHAR" )
    @MetaData( value="TA客户编号", comments = "TA客户编号")
    private String taCustNo;

    /**
     * 份额注册日期
     */
    @Column(name = "D_REGDATE",  columnDefinition="VARCHAR" )
    @MetaData( value="份额注册日期", comments = "份额注册日期")
    private String regDate;

    /**
     * 业务种类，0普通业务，1预约业务，2赎回转认购，3钱柜充值提现，6赎回转申购
     */
    @Column(name = "C_BUSINCLASS",  columnDefinition="VARCHAR" )
    @MetaData( value="业务种类", comments = "业务种类，0普通业务，1预约业务，2赎回转认购，3钱柜充值提现，6赎回转申购")
    private String businClass;

    /**
     * 明细字段，默认0；1表示明细；只有在组合交易中，该字段才能为1
     */
    @Column(name = "C_DETAIL",  columnDefinition="VARCHAR" )
    @MetaData( value="明细字段", comments = "明细字段，默认0；1表示明细；只有在组合交易中，该字段才能为1")
    private Boolean detail;

    /**
     * 巨额赎回处理标志 0-取消，1-顺延
     */
    @Column(name = "C_LARGEREDEEM_FLAG",  columnDefinition="VARCHAR" )
    @MetaData( value="巨额赎回处理标志 0-取消", comments = "巨额赎回处理标志 0-取消，1-顺延")
    private Boolean largeRedeem;

    /**
     * 申请时间
     */
    @Column(name = "T_TIME",  columnDefinition="VARCHAR" )
    @MetaData( value="申请时间", comments = "申请时间")
    private String tradeTime;

    /**
     * 交易数据下传日期 
     */
    @Column(name = "D_ISSUEDDATE",  columnDefinition="VARCHAR" )
    @MetaData( value="交易数据下传日期 ", comments = "交易数据下传日期 ")
    private String issuedDate;

    /**
     * 预约赎回日期
     */
    @Column(name = "D_REDEEM_DATE",  columnDefinition="VARCHAR" )
    @MetaData( value="预约赎回日期", comments = "预约赎回日期")
    private String redeemDate;

    /**
     * 交易后端收费总额
     */
    @Column(name = "F_TOTALBACKFARE",  columnDefinition="DOUBLE" )
    @MetaData( value="交易后端收费总额", comments = "交易后端收费总额")
    private BigDecimal totalBackFare;

    /**
     * 转入/转出标识
     */
    @Column(name = "C_TRANSFERFLAG",  columnDefinition="VARCHAR" )
    @MetaData( value="转入/转出标识", comments = "转入/转出标识")
    private Boolean transferFlag;

    /**
     * 结算币种
     */
    @Column(name = "C_CURRENCY",  columnDefinition="VARCHAR" )
    @MetaData( value="结算币种", comments = "结算币种")
    private String currency;

    /**
     * 红利比例 
     */
    @Column(name = "F_DIVIDENDRATIO",  columnDefinition="DOUBLE" )
    @MetaData( value="红利比例 ", comments = "红利比例 ")
    private BigDecimal devidendRatio;

    /**
     * 促销活动代码
     */
    @Column(name = "C_PROMOTION",  columnDefinition="VARCHAR" )
    @MetaData( value="促销活动代码", comments = "促销活动代码")
    private String promotion;

    /**
     * 受理方式 ；0柜台，1电话，2网上交易，3传真，4手机，5其它
     */
    @Column(name = "C_ACCEPT",  columnDefinition="VARCHAR" )
    @MetaData( value="受理方式 ", comments = "受理方式 ；0柜台，1电话，2网上交易，3传真，4手机，5其它")
    private String acceptMode;

    /**
     * 冻结原因
     */
    @Column(name = "C_FROZENCAUSE",  columnDefinition="VARCHAR" )
    @MetaData( value="冻结原因", comments = "冻结原因")
    private String frozenCause;

    /**
     * 摘要/说明 
     */
    @Column(name = "C_SPECIFICATION",  columnDefinition="VARCHAR" )
    @MetaData( value="摘要/说明 ", comments = "摘要/说明 ")
    private String specification;

    /**
     * 解冻红利
     */
    @Column(name = "F_UNFROZENBALA",  columnDefinition="DECIMAL" )
    @MetaData( value="解冻红利", comments = "解冻红利")
    private BigDecimal fUnfrozenbala;

    /**
     * 冻结方式 ；0-原份额冻结，1-原份额+红股/红利冻结
     */
    @Column(name = "C_FROZENMETHOD",  columnDefinition="VARCHAR" )
    @MetaData( value="冻结方式 ", comments = "冻结方式 ；0-原份额冻结，1-原份额+红股/红利冻结")
    private String frozenMethod;

    /**
     * 冻结截止日期
     */
    @Column(name = "D_FROZENENDLINE",  columnDefinition="VARCHAR" )
    @MetaData( value="冻结截止日期", comments = "冻结截止日期")
    private String frozenEndLine;

    /**
     * 交易确认状态
     */
    @Column(name = "C_STATUS",  columnDefinition="VARCHAR" )
    @MetaData( value="交易确认状态", comments = "交易确认状态")
    private String tradeStatus;

    /**
     * 基金公司申请单号
     */
    @Column(name = "C_SALE_REQUESTNO", columnDefinition = "VARCHAR")
    @MetaData(value = "基金公司申请单号", comments = "基金公司申请单号")
    private String saleRequestNo;

    private static final long serialVersionUID = 1440667936383L;

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

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType == null ? null : custType.trim();
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

    public String getAgencyNo() {
        return agencyNo;
    }

    public void setAgencyNo(String agencyNo) {
        this.agencyNo = agencyNo == null ? null : agencyNo.trim();
    }

    public String getPayCenterNo() {
        return payCenterNo;
    }

    public void setPayCenterNo(String payCenterNo) {
        this.payCenterNo = payCenterNo == null ? null : payCenterNo.trim();
    }

    public String getNetNo() {
        return netNo;
    }

    public void setNetNo(String netNo) {
        this.netNo = netNo == null ? null : netNo.trim();
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate == null ? null : tradeDate.trim();
    }

    public String getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate == null ? null : confirmDate.trim();
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }

    public String getConfirmSerialno() {
        return confirmSerialno;
    }

    public void setConfirmSerialno(String confirmSerialno) {
        this.confirmSerialno = confirmSerialno == null ? null : confirmSerialno.trim();
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

    public String getBusinFlag() {
        return businFlag;
    }

    public void setBusinFlag(String businFlag) {
        this.businFlag = businFlag == null ? null : businFlag.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
 

    public BigDecimal getShares() {
        return this.shares;
    }

    public void setShares(BigDecimal anShares) {
        this.shares = anShares;
    }

    public BigDecimal getConfirmBalance() {
        return confirmBalance;
    }

    public void setConfirmBalance(BigDecimal confirmBalance) {
        this.confirmBalance = confirmBalance;
    }

    public BigDecimal getConfirmShares() {
        return confirmShares;
    }

    public void setConfirmShares(BigDecimal confirmShares) {
        this.confirmShares = confirmShares;
    }

    public BigDecimal getNetValue() {
        return netValue;
    }

    public void setNetValue(BigDecimal netValue) {
        this.netValue = netValue;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getBackDiscount() {
        return backDiscount;
    }

    public void setBackDiscount(BigDecimal backDiscount) {
        this.backDiscount = backDiscount;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getFare() {
        return fare;
    }

    public void setFare(BigDecimal fare) {
        this.fare = fare;
    }

    public BigDecimal getDealFare() {
        return dealFare;
    }

    public void setDealFare(BigDecimal dealFare) {
        this.dealFare = dealFare;
    }

    public BigDecimal getTaFare() {
        return taFare;
    }

    public void setTaFare(BigDecimal taFare) {
        this.taFare = taFare;
    }

    public BigDecimal getAfterFare() {
        return afterFare;
    }

    public void setAfterFare(BigDecimal afterFare) {
        this.afterFare = afterFare;
    }

    public BigDecimal getAgencyFare() {
        return agencyFare;
    }

    public void setAgencyFare(BigDecimal agencyFare) {
        this.agencyFare = agencyFare;
    }

    public BigDecimal getStampTax() {
        return stampTax;
    }

    public void setStampTax(BigDecimal stampTax) {
        this.stampTax = stampTax;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public String getBonusType() {
        return bonusType;
    }

    public void setBonusType(String bonusType) {
        this.bonusType = bonusType == null ? null : bonusType.trim();
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Boolean getFromTA() {
        return fromTA;
    }

    public void setFromTA(Boolean fromTA) {
        this.fromTA = fromTA;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    public String getConfirmCause() {
        return confirmCause;
    }

    public void setConfirmCause(String confirmCause) {
        this.confirmCause = confirmCause == null ? null : confirmCause.trim();
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

    public Boolean getVoucherFlag() {
        return voucherFlag;
    }

    public void setVoucherFlag(Boolean voucherFlag) {
        this.voucherFlag = voucherFlag;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getInterestTax() {
        return interestTax;
    }

    public void setInterestTax(BigDecimal interestTax) {
        this.interestTax = interestTax;
    }

    public BigDecimal getShareByInterest() {
        return shareByInterest;
    }

    public void setShareByInterest(BigDecimal shareByInterest) {
        this.shareByInterest = shareByInterest;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getInvestIncome() {
        return investIncome;
    }

    public void setInvestIncome(BigDecimal investIncome) {
        this.investIncome = investIncome;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTagetPrice() {
        return tagetPrice;
    }

    public void setTagetPrice(BigDecimal tagetPrice) {
        this.tagetPrice = tagetPrice;
    }

    public String getTagetFundCode() {
        return tagetFundCode;
    }

    public void setTagetFundCode(String tagetFundCode) {
        this.tagetFundCode = tagetFundCode == null ? null : tagetFundCode.trim();
    }

    public String getTagetShareType() {
        return tagetShareType;
    }

    public void setTagetShareType(String tagetShareType) {
        this.tagetShareType = tagetShareType == null ? null : tagetShareType.trim();
    }

    public String getTagetTradeAccount() {
        return tagetTradeAccount;
    }

    public void setTagetTradeAccount(String tagetTradeAccount) {
        this.tagetTradeAccount = tagetTradeAccount == null ? null : tagetTradeAccount.trim();
    }

    public String getTagetFundAccount() {
        return tagetFundAccount;
    }

    public void setTagetFundAccount(String tagetFundAccount) {
        this.tagetFundAccount = tagetFundAccount == null ? null : tagetFundAccount.trim();
    }

    public String getTagetAgencyNo() {
        return tagetAgencyNo;
    }

    public void setTagetAgencyNo(String tagetAgencyNo) {
        this.tagetAgencyNo = tagetAgencyNo == null ? null : tagetAgencyNo.trim();
    }

    public String getTagetNetNo() {
        return tagetNetNo;
    }

    public void setTagetNetNo(String tagetNetNo) {
        this.tagetNetNo = tagetNetNo == null ? null : tagetNetNo.trim();
    }

    public BigDecimal getTagetNetValue() {
        return tagetNetValue;
    }

    public void setTagetNetValue(BigDecimal tagetNetValue) {
        this.tagetNetValue = tagetNetValue;
    }

    public BigDecimal getTagetConfirmShares() {
        return tagetConfirmShares;
    }

    public void setTagetConfirmShares(BigDecimal tagetConfirmShares) {
        this.tagetConfirmShares = tagetConfirmShares;
    }

    public String getTagetCityNo() {
        return tagetCityNo;
    }

    public void setTagetCityNo(String tagetCityNo) {
        this.tagetCityNo = tagetCityNo == null ? null : tagetCityNo.trim();
    }

    public BigDecimal getTagetDiscount() {
        return tagetDiscount;
    }

    public void setTagetDiscount(BigDecimal tagetDiscount) {
        this.tagetDiscount = tagetDiscount;
    }

    public BigDecimal getOriginFare() {
        return originFare;
    }

    public void setOriginFare(BigDecimal originFare) {
        this.originFare = originFare;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker == null ? null : broker.trim();
    }

    public String getCityNo() {
        return cityNo;
    }

    public void setCityNo(String cityNo) {
        this.cityNo = cityNo == null ? null : cityNo.trim();
    }

    public String getCustManager() {
        return custManager;
    }

    public void setCustManager(String custManager) {
        this.custManager = custManager == null ? null : custManager.trim();
    }

    public BigDecimal getInvestShare() {
        return investShare;
    }

    public void setInvestShare(BigDecimal investShare) {
        this.investShare = investShare;
    }

    public String getOriginConfirmNo() {
        return originConfirmNo;
    }

    public void setOriginConfirmNo(String originConfirmNo) {
        this.originConfirmNo = originConfirmNo == null ? null : originConfirmNo.trim();
    }

    public String getOriginRequestNo() {
        return originRequestNo;
    }

    public void setOriginRequestNo(String originRequestNo) {
        this.originRequestNo = originRequestNo == null ? null : originRequestNo.trim();
    }

    public String getOriginTradeDate() {
        return originTradeDate;
    }

    public void setOriginTradeDate(String originTradeDate) {
        this.originTradeDate = originTradeDate == null ? null : originTradeDate.trim();
    }

    public BigDecimal getOriginDiscount() {
        return originDiscount;
    }

    public void setOriginDiscount(BigDecimal originDiscount) {
        this.originDiscount = originDiscount;
    }

    public String getOriginConfirmDate() {
        return originConfirmDate;
    }

    public void setOriginConfirmDate(String originConfirmDate) {
        this.originConfirmDate = originConfirmDate == null ? null : originConfirmDate.trim();
    }

    public String getSubRedemDate() {
        return subRedemDate;
    }

    public void setSubRedemDate(String subRedemDate) {
        this.subRedemDate = subRedemDate == null ? null : subRedemDate.trim();
    }

    public Integer getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(Integer validPeriod) {
        this.validPeriod = validPeriod;
    }

    public String getRedemReson() {
        return redemReson;
    }

    public void setRedemReson(String redemReson) {
        this.redemReson = redemReson == null ? null : redemReson.trim();
    }

    public String getTaCustNo() {
        return taCustNo;
    }

    public void setTaCustNo(String taCustNo) {
        this.taCustNo = taCustNo == null ? null : taCustNo.trim();
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate == null ? null : regDate.trim();
    }

    public String getBusinClass() {
        return businClass;
    }

    public void setBusinClass(String businClass) {
        this.businClass = businClass == null ? null : businClass.trim();
    }

    public Boolean getDetail() {
        return detail;
    }

    public void setDetail(Boolean detail) {
        this.detail = detail;
    }

    public Boolean getLargeRedeem() {
        return largeRedeem;
    }

    public void setLargeRedeem(Boolean largeRedeem) {
        this.largeRedeem = largeRedeem;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime == null ? null : tradeTime.trim();
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate == null ? null : issuedDate.trim();
    }

    public String getRedeemDate() {
        return redeemDate;
    }

    public void setRedeemDate(String redeemDate) {
        this.redeemDate = redeemDate == null ? null : redeemDate.trim();
    }

    public BigDecimal getTotalBackFare() {
        return totalBackFare;
    }

    public void setTotalBackFare(BigDecimal totalBackFare) {
        this.totalBackFare = totalBackFare;
    }

    public Boolean getTransferFlag() {
        return transferFlag;
    }

    public void setTransferFlag(Boolean transferFlag) {
        this.transferFlag = transferFlag;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getDevidendRatio() {
        return devidendRatio;
    }

    public void setDevidendRatio(BigDecimal devidendRatio) {
        this.devidendRatio = devidendRatio;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion == null ? null : promotion.trim();
    }

    public String getAcceptMode() {
        return acceptMode;
    }

    public void setAcceptMode(String acceptMode) {
        this.acceptMode = acceptMode == null ? null : acceptMode.trim();
    }

    public String getFrozenCause() {
        return frozenCause;
    }

    public void setFrozenCause(String frozenCause) {
        this.frozenCause = frozenCause == null ? null : frozenCause.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public BigDecimal getfUnfrozenbala() {
        return fUnfrozenbala;
    }

    public void setfUnfrozenbala(BigDecimal fUnfrozenbala) {
        this.fUnfrozenbala = fUnfrozenbala;
    }

    public String getFrozenMethod() {
        return frozenMethod;
    }

    public void setFrozenMethod(String frozenMethod) {
        this.frozenMethod = frozenMethod == null ? null : frozenMethod.trim();
    }

    public String getFrozenEndLine() {
        return frozenEndLine;
    }

    public void setFrozenEndLine(String frozenEndLine) {
        this.frozenEndLine = frozenEndLine == null ? null : frozenEndLine.trim();
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    public String getSaleRequestNo() {
        return this.saleRequestNo;
    }

    public void setSaleRequestNo(String anSaleRequestNo) {
        this.saleRequestNo = anSaleRequestNo;
    }

    public SaleConfirmInfo(){

    }
    public SaleConfirmInfo(SaleConfirmInfo confirmInfo){
        
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
        sb.append(", custType=").append(custType);
        sb.append(", tradeAccount=").append(tradeAccount);
        sb.append(", fundAccount=").append(fundAccount);
        sb.append(", agencyNo=").append(agencyNo);
        sb.append(", payCenterNo=").append(payCenterNo);
        sb.append(", netNo=").append(netNo);
        sb.append(", tradeDate=").append(tradeDate);
        sb.append(", confirmDate=").append(confirmDate);
        sb.append(", requestNo=").append(requestNo);
        sb.append(", confirmSerialno=").append(confirmSerialno);
        sb.append(", fundCode=").append(fundCode);
        sb.append(", shareType=").append(shareType);
        sb.append(", businFlag=").append(businFlag);
        sb.append(", balance=").append(balance);
        sb.append(", shares=").append(shares);
        sb.append(", confirmBalance=").append(confirmBalance);
        sb.append(", confirmShares=").append(confirmShares);
        sb.append(", netValue=").append(netValue);
        sb.append(", discount=").append(discount);
        sb.append(", backDiscount=").append(backDiscount);
        sb.append(", ratio=").append(ratio);
        sb.append(", profit=").append(profit);
        sb.append(", fare=").append(fare);
        sb.append(", dealFare=").append(dealFare);
        sb.append(", taFare=").append(taFare);
        sb.append(", afterFare=").append(afterFare);
        sb.append(", agencyFare=").append(agencyFare);
        sb.append(", stampTax=").append(stampTax);
        sb.append(", tax=").append(tax);
        sb.append(", bonusType=").append(bonusType);
        sb.append(", finished=").append(finished);
        sb.append(", fromTA=").append(fromTA);
        sb.append(", errCode=").append(errCode);
        sb.append(", confirmCause=").append(confirmCause);
        sb.append(", otherFare=").append(otherFare);
        sb.append(", otherFare2=").append(otherFare2);
        sb.append(", voucherFlag=").append(voucherFlag);
        sb.append(", interest=").append(interest);
        sb.append(", interestTax=").append(interestTax);
        sb.append(", shareByInterest=").append(shareByInterest);
        sb.append(", income=").append(income);
        sb.append(", investIncome=").append(investIncome);
        sb.append(", price=").append(price);
        sb.append(", tagetPrice=").append(tagetPrice);
        sb.append(", tagetFundCode=").append(tagetFundCode);
        sb.append(", tagetShareType=").append(tagetShareType);
        sb.append(", tagetTradeAccount=").append(tagetTradeAccount);
        sb.append(", tagetFundAccount=").append(tagetFundAccount);
        sb.append(", tagetAgencyNo=").append(tagetAgencyNo);
        sb.append(", tagetNetNo=").append(tagetNetNo);
        sb.append(", tagetNetValue=").append(tagetNetValue);
        sb.append(", tagetConfirmShares=").append(tagetConfirmShares);
        sb.append(", tagetCityNo=").append(tagetCityNo);
        sb.append(", tagetDiscount=").append(tagetDiscount);
        sb.append(", originFare=").append(originFare);
        sb.append(", broker=").append(broker);
        sb.append(", cityNo=").append(cityNo);
        sb.append(", custManager=").append(custManager);
        sb.append(", investShare=").append(investShare);
        sb.append(", originConfirmNo=").append(originConfirmNo);
        sb.append(", originRequestNo=").append(originRequestNo);
        sb.append(", originTradeDate=").append(originTradeDate);
        sb.append(", originDiscount=").append(originDiscount);
        sb.append(", originConfirmDate=").append(originConfirmDate);
        sb.append(", subRedemDate=").append(subRedemDate);
        sb.append(", validPeriod=").append(validPeriod);
        sb.append(", redemReson=").append(redemReson);
        sb.append(", taCustNo=").append(taCustNo);
        sb.append(", regDate=").append(regDate);
        sb.append(", businClass=").append(businClass);
        sb.append(", detail=").append(detail);
        sb.append(", largeRedeem=").append(largeRedeem);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", issuedDate=").append(issuedDate);
        sb.append(", redeemDate=").append(redeemDate);
        sb.append(", totalBackFare=").append(totalBackFare);
        sb.append(", transferFlag=").append(transferFlag);
        sb.append(", currency=").append(currency);
        sb.append(", devidendRatio=").append(devidendRatio);
        sb.append(", promotion=").append(promotion);
        sb.append(", acceptMode=").append(acceptMode);
        sb.append(", frozenCause=").append(frozenCause);
        sb.append(", specification=").append(specification);
        sb.append(", fUnfrozenbala=").append(fUnfrozenbala);
        sb.append(", frozenMethod=").append(frozenMethod);
        sb.append(", frozenEndLine=").append(frozenEndLine);
        sb.append(", tradeStatus=").append(tradeStatus);
        sb.append(", saleRequestNo=").append(saleRequestNo);
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
        SaleConfirmInfo other = (SaleConfirmInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustNo() == null ? other.getCustNo() == null : this.getCustNo().equals(other.getCustNo()))
            && (this.getTano() == null ? other.getTano() == null : this.getTano().equals(other.getTano()))
            && (this.getCustType() == null ? other.getCustType() == null : this.getCustType().equals(other.getCustType()))
            && (this.getTradeAccount() == null ? other.getTradeAccount() == null : this.getTradeAccount().equals(other.getTradeAccount()))
            && (this.getFundAccount() == null ? other.getFundAccount() == null : this.getFundAccount().equals(other.getFundAccount()))
            && (this.getAgencyNo() == null ? other.getAgencyNo() == null : this.getAgencyNo().equals(other.getAgencyNo()))
            && (this.getPayCenterNo() == null ? other.getPayCenterNo() == null : this.getPayCenterNo().equals(other.getPayCenterNo()))
            && (this.getNetNo() == null ? other.getNetNo() == null : this.getNetNo().equals(other.getNetNo()))
            && (this.getTradeDate() == null ? other.getTradeDate() == null : this.getTradeDate().equals(other.getTradeDate()))
            && (this.getConfirmDate() == null ? other.getConfirmDate() == null : this.getConfirmDate().equals(other.getConfirmDate()))
            && (this.getRequestNo() == null ? other.getRequestNo() == null : this.getRequestNo().equals(other.getRequestNo()))
            && (this.getConfirmSerialno() == null ? other.getConfirmSerialno() == null : this.getConfirmSerialno().equals(other.getConfirmSerialno()))
            && (this.getFundCode() == null ? other.getFundCode() == null : this.getFundCode().equals(other.getFundCode()))
            && (this.getShareType() == null ? other.getShareType() == null : this.getShareType().equals(other.getShareType()))
            && (this.getBusinFlag() == null ? other.getBusinFlag() == null : this.getBusinFlag().equals(other.getBusinFlag()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getShares() == null ? other.getShares() == null : this.getShares().equals(other.getShares()))
            && (this.getConfirmBalance() == null ? other.getConfirmBalance() == null : this.getConfirmBalance().equals(other.getConfirmBalance()))
            && (this.getConfirmShares() == null ? other.getConfirmShares() == null : this.getConfirmShares().equals(other.getConfirmShares()))
            && (this.getNetValue() == null ? other.getNetValue() == null : this.getNetValue().equals(other.getNetValue()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getBackDiscount() == null ? other.getBackDiscount() == null : this.getBackDiscount().equals(other.getBackDiscount()))
            && (this.getRatio() == null ? other.getRatio() == null : this.getRatio().equals(other.getRatio()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getFare() == null ? other.getFare() == null : this.getFare().equals(other.getFare()))
            && (this.getDealFare() == null ? other.getDealFare() == null : this.getDealFare().equals(other.getDealFare()))
            && (this.getTaFare() == null ? other.getTaFare() == null : this.getTaFare().equals(other.getTaFare()))
            && (this.getAfterFare() == null ? other.getAfterFare() == null : this.getAfterFare().equals(other.getAfterFare()))
            && (this.getAgencyFare() == null ? other.getAgencyFare() == null : this.getAgencyFare().equals(other.getAgencyFare()))
            && (this.getStampTax() == null ? other.getStampTax() == null : this.getStampTax().equals(other.getStampTax()))
            && (this.getTax() == null ? other.getTax() == null : this.getTax().equals(other.getTax()))
            && (this.getBonusType() == null ? other.getBonusType() == null : this.getBonusType().equals(other.getBonusType()))
            && (this.getFinished() == null ? other.getFinished() == null : this.getFinished().equals(other.getFinished()))
            && (this.getFromTA() == null ? other.getFromTA() == null : this.getFromTA().equals(other.getFromTA()))
            && (this.getErrCode() == null ? other.getErrCode() == null : this.getErrCode().equals(other.getErrCode()))
            && (this.getConfirmCause() == null ? other.getConfirmCause() == null : this.getConfirmCause().equals(other.getConfirmCause()))
            && (this.getOtherFare() == null ? other.getOtherFare() == null : this.getOtherFare().equals(other.getOtherFare()))
            && (this.getOtherFare2() == null ? other.getOtherFare2() == null : this.getOtherFare2().equals(other.getOtherFare2()))
            && (this.getVoucherFlag() == null ? other.getVoucherFlag() == null : this.getVoucherFlag().equals(other.getVoucherFlag()))
            && (this.getInterest() == null ? other.getInterest() == null : this.getInterest().equals(other.getInterest()))
            && (this.getInterestTax() == null ? other.getInterestTax() == null : this.getInterestTax().equals(other.getInterestTax()))
            && (this.getShareByInterest() == null ? other.getShareByInterest() == null : this.getShareByInterest().equals(other.getShareByInterest()))
            && (this.getIncome() == null ? other.getIncome() == null : this.getIncome().equals(other.getIncome()))
            && (this.getInvestIncome() == null ? other.getInvestIncome() == null : this.getInvestIncome().equals(other.getInvestIncome()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getTagetPrice() == null ? other.getTagetPrice() == null : this.getTagetPrice().equals(other.getTagetPrice()))
            && (this.getTagetFundCode() == null ? other.getTagetFundCode() == null : this.getTagetFundCode().equals(other.getTagetFundCode()))
            && (this.getTagetShareType() == null ? other.getTagetShareType() == null : this.getTagetShareType().equals(other.getTagetShareType()))
            && (this.getTagetTradeAccount() == null ? other.getTagetTradeAccount() == null : this.getTagetTradeAccount().equals(other.getTagetTradeAccount()))
            && (this.getTagetFundAccount() == null ? other.getTagetFundAccount() == null : this.getTagetFundAccount().equals(other.getTagetFundAccount()))
            && (this.getTagetAgencyNo() == null ? other.getTagetAgencyNo() == null : this.getTagetAgencyNo().equals(other.getTagetAgencyNo()))
            && (this.getTagetNetNo() == null ? other.getTagetNetNo() == null : this.getTagetNetNo().equals(other.getTagetNetNo()))
            && (this.getTagetNetValue() == null ? other.getTagetNetValue() == null : this.getTagetNetValue().equals(other.getTagetNetValue()))
            && (this.getTagetConfirmShares() == null ? other.getTagetConfirmShares() == null : this.getTagetConfirmShares().equals(other.getTagetConfirmShares()))
            && (this.getTagetCityNo() == null ? other.getTagetCityNo() == null : this.getTagetCityNo().equals(other.getTagetCityNo()))
            && (this.getTagetDiscount() == null ? other.getTagetDiscount() == null : this.getTagetDiscount().equals(other.getTagetDiscount()))
            && (this.getOriginFare() == null ? other.getOriginFare() == null : this.getOriginFare().equals(other.getOriginFare()))
            && (this.getBroker() == null ? other.getBroker() == null : this.getBroker().equals(other.getBroker()))
            && (this.getCityNo() == null ? other.getCityNo() == null : this.getCityNo().equals(other.getCityNo()))
            && (this.getCustManager() == null ? other.getCustManager() == null : this.getCustManager().equals(other.getCustManager()))
            && (this.getInvestShare() == null ? other.getInvestShare() == null : this.getInvestShare().equals(other.getInvestShare()))
            && (this.getOriginConfirmNo() == null ? other.getOriginConfirmNo() == null : this.getOriginConfirmNo().equals(other.getOriginConfirmNo()))
            && (this.getOriginRequestNo() == null ? other.getOriginRequestNo() == null : this.getOriginRequestNo().equals(other.getOriginRequestNo()))
            && (this.getOriginTradeDate() == null ? other.getOriginTradeDate() == null : this.getOriginTradeDate().equals(other.getOriginTradeDate()))
            && (this.getOriginDiscount() == null ? other.getOriginDiscount() == null : this.getOriginDiscount().equals(other.getOriginDiscount()))
            && (this.getOriginConfirmDate() == null ? other.getOriginConfirmDate() == null : this.getOriginConfirmDate().equals(other.getOriginConfirmDate()))
            && (this.getSubRedemDate() == null ? other.getSubRedemDate() == null : this.getSubRedemDate().equals(other.getSubRedemDate()))
            && (this.getValidPeriod() == null ? other.getValidPeriod() == null : this.getValidPeriod().equals(other.getValidPeriod()))
            && (this.getRedemReson() == null ? other.getRedemReson() == null : this.getRedemReson().equals(other.getRedemReson()))
            && (this.getTaCustNo() == null ? other.getTaCustNo() == null : this.getTaCustNo().equals(other.getTaCustNo()))
            && (this.getRegDate() == null ? other.getRegDate() == null : this.getRegDate().equals(other.getRegDate()))
            && (this.getBusinClass() == null ? other.getBusinClass() == null : this.getBusinClass().equals(other.getBusinClass()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()))
            && (this.getLargeRedeem() == null ? other.getLargeRedeem() == null : this.getLargeRedeem().equals(other.getLargeRedeem()))
            && (this.getTradeTime() == null ? other.getTradeTime() == null : this.getTradeTime().equals(other.getTradeTime()))
            && (this.getIssuedDate() == null ? other.getIssuedDate() == null : this.getIssuedDate().equals(other.getIssuedDate()))
            && (this.getRedeemDate() == null ? other.getRedeemDate() == null : this.getRedeemDate().equals(other.getRedeemDate()))
            && (this.getTotalBackFare() == null ? other.getTotalBackFare() == null : this.getTotalBackFare().equals(other.getTotalBackFare()))
            && (this.getTransferFlag() == null ? other.getTransferFlag() == null : this.getTransferFlag().equals(other.getTransferFlag()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getDevidendRatio() == null ? other.getDevidendRatio() == null : this.getDevidendRatio().equals(other.getDevidendRatio()))
            && (this.getPromotion() == null ? other.getPromotion() == null : this.getPromotion().equals(other.getPromotion()))
            && (this.getAcceptMode() == null ? other.getAcceptMode() == null : this.getAcceptMode().equals(other.getAcceptMode()))
            && (this.getFrozenCause() == null ? other.getFrozenCause() == null : this.getFrozenCause().equals(other.getFrozenCause()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()))
            && (this.getfUnfrozenbala() == null ? other.getfUnfrozenbala() == null : this.getfUnfrozenbala().equals(other.getfUnfrozenbala()))
            && (this.getFrozenMethod() == null ? other.getFrozenMethod() == null : this.getFrozenMethod().equals(other.getFrozenMethod()))
            && (this.getFrozenEndLine() == null ? other.getFrozenEndLine() == null : this.getFrozenEndLine().equals(other.getFrozenEndLine()))
            && (this.getTradeStatus() == null ? other.getTradeStatus() == null : this.getTradeStatus().equals(other.getTradeStatus()))
        && (this.getSaleRequestNo() == null ? other.getSaleRequestNo() == null : this.getSaleRequestNo().equals(other.getSaleRequestNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustNo() == null) ? 0 : getCustNo().hashCode());
        result = prime * result + ((getTano() == null) ? 0 : getTano().hashCode());
        result = prime * result + ((getCustType() == null) ? 0 : getCustType().hashCode());
        result = prime * result + ((getTradeAccount() == null) ? 0 : getTradeAccount().hashCode());
        result = prime * result + ((getFundAccount() == null) ? 0 : getFundAccount().hashCode());
        result = prime * result + ((getAgencyNo() == null) ? 0 : getAgencyNo().hashCode());
        result = prime * result + ((getPayCenterNo() == null) ? 0 : getPayCenterNo().hashCode());
        result = prime * result + ((getNetNo() == null) ? 0 : getNetNo().hashCode());
        result = prime * result + ((getTradeDate() == null) ? 0 : getTradeDate().hashCode());
        result = prime * result + ((getConfirmDate() == null) ? 0 : getConfirmDate().hashCode());
        result = prime * result + ((getRequestNo() == null) ? 0 : getRequestNo().hashCode());
        result = prime * result + ((getConfirmSerialno() == null) ? 0 : getConfirmSerialno().hashCode());
        result = prime * result + ((getFundCode() == null) ? 0 : getFundCode().hashCode());
        result = prime * result + ((getShareType() == null) ? 0 : getShareType().hashCode());
        result = prime * result + ((getBusinFlag() == null) ? 0 : getBusinFlag().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getShares() == null) ? 0 : getShares().hashCode());
        result = prime * result + ((getConfirmBalance() == null) ? 0 : getConfirmBalance().hashCode());
        result = prime * result + ((getConfirmShares() == null) ? 0 : getConfirmShares().hashCode());
        result = prime * result + ((getNetValue() == null) ? 0 : getNetValue().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getBackDiscount() == null) ? 0 : getBackDiscount().hashCode());
        result = prime * result + ((getRatio() == null) ? 0 : getRatio().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getFare() == null) ? 0 : getFare().hashCode());
        result = prime * result + ((getDealFare() == null) ? 0 : getDealFare().hashCode());
        result = prime * result + ((getTaFare() == null) ? 0 : getTaFare().hashCode());
        result = prime * result + ((getAfterFare() == null) ? 0 : getAfterFare().hashCode());
        result = prime * result + ((getAgencyFare() == null) ? 0 : getAgencyFare().hashCode());
        result = prime * result + ((getStampTax() == null) ? 0 : getStampTax().hashCode());
        result = prime * result + ((getTax() == null) ? 0 : getTax().hashCode());
        result = prime * result + ((getBonusType() == null) ? 0 : getBonusType().hashCode());
        result = prime * result + ((getFinished() == null) ? 0 : getFinished().hashCode());
        result = prime * result + ((getFromTA() == null) ? 0 : getFromTA().hashCode());
        result = prime * result + ((getErrCode() == null) ? 0 : getErrCode().hashCode());
        result = prime * result + ((getConfirmCause() == null) ? 0 : getConfirmCause().hashCode());
        result = prime * result + ((getOtherFare() == null) ? 0 : getOtherFare().hashCode());
        result = prime * result + ((getOtherFare2() == null) ? 0 : getOtherFare2().hashCode());
        result = prime * result + ((getVoucherFlag() == null) ? 0 : getVoucherFlag().hashCode());
        result = prime * result + ((getInterest() == null) ? 0 : getInterest().hashCode());
        result = prime * result + ((getInterestTax() == null) ? 0 : getInterestTax().hashCode());
        result = prime * result + ((getShareByInterest() == null) ? 0 : getShareByInterest().hashCode());
        result = prime * result + ((getIncome() == null) ? 0 : getIncome().hashCode());
        result = prime * result + ((getInvestIncome() == null) ? 0 : getInvestIncome().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getTagetPrice() == null) ? 0 : getTagetPrice().hashCode());
        result = prime * result + ((getTagetFundCode() == null) ? 0 : getTagetFundCode().hashCode());
        result = prime * result + ((getTagetShareType() == null) ? 0 : getTagetShareType().hashCode());
        result = prime * result + ((getTagetTradeAccount() == null) ? 0 : getTagetTradeAccount().hashCode());
        result = prime * result + ((getTagetFundAccount() == null) ? 0 : getTagetFundAccount().hashCode());
        result = prime * result + ((getTagetAgencyNo() == null) ? 0 : getTagetAgencyNo().hashCode());
        result = prime * result + ((getTagetNetNo() == null) ? 0 : getTagetNetNo().hashCode());
        result = prime * result + ((getTagetNetValue() == null) ? 0 : getTagetNetValue().hashCode());
        result = prime * result + ((getTagetConfirmShares() == null) ? 0 : getTagetConfirmShares().hashCode());
        result = prime * result + ((getTagetCityNo() == null) ? 0 : getTagetCityNo().hashCode());
        result = prime * result + ((getTagetDiscount() == null) ? 0 : getTagetDiscount().hashCode());
        result = prime * result + ((getOriginFare() == null) ? 0 : getOriginFare().hashCode());
        result = prime * result + ((getBroker() == null) ? 0 : getBroker().hashCode());
        result = prime * result + ((getCityNo() == null) ? 0 : getCityNo().hashCode());
        result = prime * result + ((getCustManager() == null) ? 0 : getCustManager().hashCode());
        result = prime * result + ((getInvestShare() == null) ? 0 : getInvestShare().hashCode());
        result = prime * result + ((getOriginConfirmNo() == null) ? 0 : getOriginConfirmNo().hashCode());
        result = prime * result + ((getOriginRequestNo() == null) ? 0 : getOriginRequestNo().hashCode());
        result = prime * result + ((getOriginTradeDate() == null) ? 0 : getOriginTradeDate().hashCode());
        result = prime * result + ((getOriginDiscount() == null) ? 0 : getOriginDiscount().hashCode());
        result = prime * result + ((getOriginConfirmDate() == null) ? 0 : getOriginConfirmDate().hashCode());
        result = prime * result + ((getSubRedemDate() == null) ? 0 : getSubRedemDate().hashCode());
        result = prime * result + ((getValidPeriod() == null) ? 0 : getValidPeriod().hashCode());
        result = prime * result + ((getRedemReson() == null) ? 0 : getRedemReson().hashCode());
        result = prime * result + ((getTaCustNo() == null) ? 0 : getTaCustNo().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getBusinClass() == null) ? 0 : getBusinClass().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        result = prime * result + ((getLargeRedeem() == null) ? 0 : getLargeRedeem().hashCode());
        result = prime * result + ((getTradeTime() == null) ? 0 : getTradeTime().hashCode());
        result = prime * result + ((getIssuedDate() == null) ? 0 : getIssuedDate().hashCode());
        result = prime * result + ((getRedeemDate() == null) ? 0 : getRedeemDate().hashCode());
        result = prime * result + ((getTotalBackFare() == null) ? 0 : getTotalBackFare().hashCode());
        result = prime * result + ((getTransferFlag() == null) ? 0 : getTransferFlag().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getDevidendRatio() == null) ? 0 : getDevidendRatio().hashCode());
        result = prime * result + ((getPromotion() == null) ? 0 : getPromotion().hashCode());
        result = prime * result + ((getAcceptMode() == null) ? 0 : getAcceptMode().hashCode());
        result = prime * result + ((getFrozenCause() == null) ? 0 : getFrozenCause().hashCode());
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        result = prime * result + ((getfUnfrozenbala() == null) ? 0 : getfUnfrozenbala().hashCode());
        result = prime * result + ((getFrozenMethod() == null) ? 0 : getFrozenMethod().hashCode());
        result = prime * result + ((getFrozenEndLine() == null) ? 0 : getFrozenEndLine().hashCode());
        result = prime * result + ((getTradeStatus() == null) ? 0 : getTradeStatus().hashCode());
        result = prime * result + ((getSaleRequestNo() == null) ? 0 : getSaleRequestNo().hashCode());
        return result;
    }
}