package com.betterjr.modules.fund.entity;

import com.betterjr.common.annotation.*;
import com.betterjr.common.data.BaseRemoteEntity;
import com.betterjr.common.entity.BetterjrEntity;
import com.betterjr.common.utils.BetterDateUtils;
import com.betterjr.modules.fund.data.SaleFundState;

import javax.persistence.*;

import java.math.BigDecimal;

@Access(AccessType.FIELD)
@Entity
@Table(name = "T_SALE_FUNDINFO")
public class SaleFundInfo implements BetterjrEntity, BaseRemoteEntity {
    /**
     * TA代码；对于中登的基金，管理人和TA代码不一致
     */
    @Column(name = "C_TANO", columnDefinition = "VARCHAR")
    @MetaData(value = "TA代码", comments = "TA代码；对于中登的基金，管理人和TA代码不一致")
    private String tano;

    /**
     * 基金代码
     */
    @Column(name = "C_FUNDCODE", columnDefinition = "VARCHAR")
    @MetaData(value = "基金代码", comments = "基金代码")
    @Id
    private String fundCode;

    /**
     * 基金名称
     */
    @Column(name = "C_FUNDNAME", columnDefinition = "VARCHAR")
    @MetaData(value = "基金名称", comments = "基金名称")
    private String fundName;

    /**
     * 基金全称
     */
    @Column(name = "C_FULLNAME", columnDefinition = "VARCHAR")
    @MetaData(value = "基金全称", comments = "基金全称")
    private String fullName;

    /**
     * 基金简称
     */
    @Column(name = "C_SHORTNAME", columnDefinition = "VARCHAR")
    @MetaData(value = "基金简称", comments = "基金简称")
    private String shortName;

    /**
     * 货币类型
     */
    @Column(name = "C_CURRENCY", columnDefinition = "VARCHAR")
    @MetaData(value = "货币类型", comments = "货币类型")
    private String currency;

    /**
     * 面值
     */
    @Column(name = "F_FACEVALUE",  columnDefinition="DOUBLE" )
    @MetaData( value="面值", comments = "面值")
    private BigDecimal faceValue;

    /**
     * 发行价格
     */
    @Column(name = "F_ISSUEPRICE",  columnDefinition="DOUBLE" )
    @MetaData( value="发行价格", comments = "发行价格")
    private BigDecimal issuePrice;

    /**
     * 管理人
     */
    @Column(name = "C_MANAGER", columnDefinition = "VARCHAR")
    @MetaData(value = "管理人", comments = "管理人")
    private String manager;

    /**
     * 托管人
     */
    @Column(name = "C_TRUSTEE", columnDefinition = "VARCHAR")
    @MetaData(value = "托管人", comments = "托管人")
    private String trustee;

    /**
     * 注册登记机构
     */
    @Column(name = "C_TANAME", columnDefinition = "VARCHAR")
    @MetaData(value = "注册登记机构", comments = "注册登记机构")
    private String taName;

    /**
     * 发行日期
     */
    @Column(name = "D_ISSUEDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "发行日期", comments = "发行日期")
    private String issueDate;

    /**
     * 成立日期
     */
    @Column(name = "D_SETUPDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "成立日期", comments = "成立日期")
    private String setupDate;

    /**
     * 管理费率
     */
    @Column(name = "F_MANAGERATIO",  columnDefinition="DOUBLE" )
    @MetaData( value="管理费率", comments = "管理费率")
    private BigDecimal managerRatio;

    /**
     * 销售服务费率
     */
    @Column(name = "F_SERVICERATIO",  columnDefinition="DOUBLE" )
    @MetaData( value="销售服务费率", comments = "销售服务费率")
    private BigDecimal serviceRatio;

    /**
     * 状态； 0停用，1启用
     */
    @Column(name = "C_STATUS",  columnDefinition="VARCHAR" )
    @MetaData( value="状态", comments = "状态； 0停用，1启用")
    private String fundStatus;

    /**
     * 费用计算方式
     */
    @Column(name = "C_FEETYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "费用计算方式", comments = "费用计算方式")
    private String feeType;

    /**
     * 份额类别 A-前收费,B-后收费(销售专用)
     */
    @Column(name = "C_SHARETYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "份额类别  A-前收费,B-后收费(销售专用)", comments = "份额类别  A-前收费,B-后收费(销售专用)")
    private String shareType;

    /**
     * 基金类别基金品牌0-普通基金 1-货币市场基金 2-短债类基金 3-债券型基金 4-指数型基金 5-保本基金 6-QDII基金,
     * 11利得盈/12建行财富/13乾图/14乾元/21汇得盈/22 QDII
     * /23对公债券产品/24本外币组合产品/31自动理财账户-新股随心打/41龙信/XX组合产品
     */
    @Column(name = "C_TYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "基金类别基金品牌0-普通基金 1-货币市场基金 2-短债类基金 3-债券型基金 4-指数型基金 5-保本基金 6-QDII基金, 11利得盈/12建行财富/13乾图/14乾元/21汇得盈/22 QDII /23对公债券产品/24本外币组合产品/31自动理财账户-新股随心打/41龙信/XX组合产品", comments = "基金类别基金品牌0-普通基金 1-货币市场基金 2-短债类基金 3-债券型基金 4-指数型基金 5-保本基金 6-QDII基金, 11利得盈/12建行财富/13乾图/14乾元/21汇得盈/22 QDII /23对公债券产品/24本外币组合产品/31自动理财账户-新股随心打/41龙信/XX组合产品")
    private String type;

    /**
     * 最小持有份额
     */
    @Column(name = "F_MINSHARE",  columnDefinition="DOUBLE" )
    @MetaData( value="最小持有份额", comments = "最小持有份额")
    private BigDecimal minShare;

    /**
     * 风险级别
     */
    @Column(name = "C_RISKLEVEL", columnDefinition = "VARCHAR")
    @MetaData(value = "风险级别", comments = "风险级别")
    private String riskLevel;

    /**
     * 交易清算天数；普通基金是1天，QDII基金是2天
     */
    @Column(name = "N_LIQUIDATE", columnDefinition = "INTEGER")
    @MetaData(value = "交易清算天数", comments = "交易清算天数；普通基金是1天，QDII基金是2天")
    private Integer liquiDate;

    /**
     * 登记日期
     */
    @Column(name = "D_REGDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "登记日期", comments = "登记日期")
    private String regDate;

    /**
     * 修改日期
     */
    @Column(name = "D_MODIDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "修改日期", comments = "修改日期")
    private String modiDate;

    /**
     * 产品描述
     */
    @Column(name = "C_DESCRIPTION", columnDefinition = "VARCHAR")
    @MetaData(value = "产品描述", comments = "产品描述")
    private String description;

    /**
     * 基金分组
     */
    @Column(name = "C_GROUP", columnDefinition = "VARCHAR")
    @MetaData(value = "基金分组", comments = "基金分组")
    private String fundGroup;

    /**
     * 自定义分类
     */
    @Column(name = "C_BRAND", columnDefinition = "VARCHAR")
    @MetaData(value = "自定义分类", comments = "自定义分类")
    private String brand;

    /**
     * 支持的基金分级(数据字段)--复选 A-前收费,B-后收费
     */
    @Column(name = "C_SHARECLASS", columnDefinition = "VARCHAR")
    @MetaData(value = "支持的基金分级(数据字段)--复选 A-前收费,B-后收费", comments = "支持的基金分级(数据字段)--复选 A-前收费,B-后收费")
    private String shareClass;

    /**
     * 证监会基金代码，主要用于分级基金
     */
    @Column(name = "C_CRSCCODE", columnDefinition = "VARCHAR")
    @MetaData(value = "证监会基金代码", comments = "证监会基金代码，主要用于分级基金")
    private String crsCode;

    /**
     * 产品子类型,11 - 固定期限债券及货币市场工具类:7天/14天/1个月/2个月/3个月(期限类别应可扩展)/12 -
     * 滚动发行债券及货币市场工具类/21 - 挂钩利率结构类/22 - 挂钩汇率结构类/23 - 挂钩信用结构类/24 - 挂钩股票结构类/25 -
     * 挂钩商品结构类/26 - 挂钩指数结构类/ 27 –挂钩基金结构类/28 - 挂钩其他标的类/29 -
     * 组合挂钩结构类（注：上述挂钩标的的组合）/31 - 基于票据资产理财类/41 - 资本市场打新股信托类/42 - 资本市场基金信托类/43 -
     * 资本市场股权投资信托类/44 - 资本市场二级市场信托类/45 - 资本市场股权质押信托类/46 - 资本市场组合信托类/47 -
     * 资本市场A+H类/ 48 - 准REITS信托类/49 - 龙信－新股通/4a - 龙信－基金通/51 - 增量信贷市场信托类/52 -
     * 存量信贷市场信托类/53 - 应收帐款信托类/ 54 - 龙信－融资通/ 55 - 龙信－账款通/61 - QDII债券货币市场工具及基金类/62
     * - QDII股票及股票型基金类/63 - QDII结构性票据类/64 - QDII其他类/81 - 其他信托类/ 82 - 其他理财产品其他类
     */
    @Column(name = "C_SUBTYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "产品子类型,11 - 固定期限债券及货币市场工具类:7天/14天/1个月/2个月/3个月(期限类别应可扩展)/12 - 滚动发行债券及货币市场工具类/21 - 挂钩利率结构类/22 - 挂钩汇率结构类/23 - 挂钩信用结构类/24 - 挂钩股票结构类/25 - 挂钩商品结构类/26 - 挂钩指数结构类/ 27 –挂钩基金结构类/28 - 挂钩其他标的类/29 - 组合挂钩结构类（注：上述挂钩标的的组合）/31 - 基于票据资产理财类/41 - 资本市场打新股信托类/42 - 资本市场基金信托类/43 - 资本市场股权投资信托类/44 - 资本市场二级市场信托类/45 - 资本市场股权质押信托类/46 - 资本市场组合信托类/47 - 资本市场A+H类/ 48 - 准REITS信托类/49 - 龙信－新股通/4a - 龙信－基金通/51 - 增量信贷市场信托类/52 - 存量信贷市场信托类/53 - 应收帐款信托类/ 54 - 龙信－融资通/ 55 - 龙信－账款通/61 - QDII债券货币市场工具及基金类/62 - QDII股票及股票型基金类/63 - QDII结构性票据类/64 - QDII其他类/81 - 其他信托类/ 82 - 其他理财产品其他类", comments = "产品子类型,11 - 固定期限债券及货币市场工具类:7天/14天/1个月/2个月/3个月(期限类别应可扩展)/12 - 滚动发行债券及货币市场工具类/21 - 挂钩利率结构类/22 - 挂钩汇率结构类/23 - 挂钩信用结构类/24 - 挂钩股票结构类/25 - 挂钩商品结构类/26 - 挂钩指数结构类/ 27 –挂钩基金结构类/28 - 挂钩其他标的类/29 - 组合挂钩结构类（注：上述挂钩标的的组合）/31 - 基于票据资产理财类/41 - 资本市场打新股信托类/42 - 资本市场基金信托类/43 - 资本市场股权投资信托类/44 - 资本市场二级市场信托类/45 - 资本市场股权质押信托类/46 - 资本市场组合信托类/47 - 资本市场A+H类/ 48 - 准REITS信托类/49 - 龙信－新股通/4a - 龙信－基金通/51 - 增量信贷市场信托类/52 - 存量信贷市场信托类/53 - 应收帐款信托类/ 54 - 龙信－融资通/ 55 - 龙信－账款通/61 - QDII债券货币市场工具及基金类/62 - QDII股票及股票型基金类/63 - QDII结构性票据类/64 - QDII其他类/81 - 其他信托类/ 82 - 其他理财产品其他类")
    private String subType;

    /**
     * 默认分红方式；分红方式 0-现金分红 1-红利再投
     */
    @Column(name = "C_BONUSTYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "默认分红方式", comments = "默认分红方式；分红方式  0-现金分红 1-红利再投")
    private String bonusType;

    /**
     * 最高持有份额
     */
    @Column(name = "F_MAXSHARE",  columnDefinition="DOUBLE" )
    @MetaData( value="最高持有份额", comments = "最高持有份额")
    private BigDecimal maxShare;

    /**
     * (销售专用)  申购期收市时间    空或者全0 表示无设置
     */
    @Column(name = "T_TIME",  columnDefinition="VARCHAR" )
    @MetaData( value="(销售专用)  申购期收市时间    空或者全0 表示无设置", comments = "(销售专用)  申购期收市时间    空或者全0 表示无设置")
    private String tradeTime;

    /**
     * (销售专用)  认购最后一天收市时间  空或者全0 表示无设置
     */
    @Column(name = "T_SUBSLASTTIME",  columnDefinition="VARCHAR" )
    @MetaData( value="(销售专用)  认购最后一天收市时间  空或者全0 表示无设置", comments = "(销售专用)  认购最后一天收市时间  空或者全0 表示无设置")
    private String subLastTime;

    /**
     * (销售专用)  认购收市时间       空或者全0 表示无设置
     */
    @Column(name = "T_SUBSTIME",  columnDefinition="VARCHAR" )
    @MetaData( value="(销售专用)  认购收市时间       空或者全0 表示无设置", comments = "(销售专用)  认购收市时间       空或者全0 表示无设置")
    private String subTime;

    /**
     * 受理方式 ；0柜台，1电话，2网上交易，3传真，4手机，5其它
     */
    @Column(name = "C_ACCEPT", columnDefinition = "VARCHAR")
    @MetaData(value = "受理方式 ", comments = "受理方式 ；0柜台，1电话，2网上交易，3传真，4手机，5其它")
    private String acceptMode;

    /**
     * (销售专用)理财产品周期 0 按月 1 按季
     */
    @Column(name = "C_CYCLE", columnDefinition = "VARCHAR")
    @MetaData(value = "(销售专用)理财产品周期 0 按月  1 按季	", comments = "(销售专用)理财产品周期 0 按月  1 按季	")
    private String financeCycle;

    /**
     * (销售专用) 基金募集结束日期
     */
    @Column(name = "D_IPOENDDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "(销售专用) 基金募集结束日期", comments = "(销售专用) 基金募集结束日期")
    private String ipoEndDate;

    /**
     * (销售专用)业务开关
     */
    @Column(name = "C_BUSINFLAG", columnDefinition = "VARCHAR")
    @MetaData(value = "(销售专用)业务开关", comments = "(销售专用)业务开关")
    private String businFlag;

    /**
     * 管理人代码
     */
    @Column(name = "C_MANAGERNO", columnDefinition = "VARCHAR")
    @MetaData(value = "管理人代码", comments = "管理人代码")
    private String managerNo;

    /**
     * 产品大类，00普通基金，01理财产品，02专户基金，03封闭基金，04QDII基金；10普通组合基金
     */
    @Column(name = "C_CLASS", columnDefinition = "VARCHAR")
    @MetaData(value = "产品大类", comments = "产品大类，00普通基金，01理财产品，02专户基金，03封闭基金，04QDII基金；10普通组合基金")
    private String fundClass;

    /**
     * 托管人代码
     */
    @Column(name = "C_TRUSTEENO", columnDefinition = "VARCHAR")
    @MetaData(value = "托管人代码", comments = "托管人代码")
    private String trusteeNo;

    /**
     * 显示顺序
     */
    @Column(name = "N_ORDER", columnDefinition = "INTEGER")
    @MetaData(value = "显示顺序", comments = "显示顺序")
    private Integer fundOrder = 0;

    @Transient
    private SaleFundDayInfo fundDayInfo;

    private static final long serialVersionUID = 1440667936389L;

    public String getTano() {
        return tano;
    }

    public SaleFundState findFundState() {

        return SaleFundState.checking(fundDayInfo.getStatus());
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(BigDecimal faceValue) {
        this.faceValue = faceValue;
    }

    public BigDecimal getIssuePrice() {
        return issuePrice;
    }

    public void setIssuePrice(BigDecimal issuePrice) {
        this.issuePrice = issuePrice;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public String getTrustee() {
        return trustee;
    }

    public void setTrustee(String trustee) {
        this.trustee = trustee == null ? null : trustee.trim();
    }

    public String getTaName() {
        return taName;
    }

    public void setTaName(String taName) {
        this.taName = taName == null ? null : taName.trim();
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate == null ? null : issueDate.trim();
    }

    public String getSetupDate() {
        return setupDate;
    }

    public void setSetupDate(String setupDate) {
        this.setupDate = setupDate == null ? null : setupDate.trim();
    }

    public BigDecimal getManagerRatio() {
        return managerRatio;
    }

    public void setManagerRatio(BigDecimal managerRatio) {
        this.managerRatio = managerRatio;
    }

    public BigDecimal getServiceRatio() {
        return serviceRatio;
    }

    public void setServiceRatio(BigDecimal serviceRatio) {
        this.serviceRatio = serviceRatio;
    }
 

    public String getFundStatus() {
        return this.fundStatus;
    }

    public void setFundStatus(String anFundStatus) {
        this.fundStatus = anFundStatus;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType == null ? null : shareType.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getMinShare() {
        return minShare;
    }

    public void setMinShare(BigDecimal minShare) {
        this.minShare = minShare;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel == null ? null : riskLevel.trim();
    }

    public Integer getLiquiDate() {
        return liquiDate;
    }

    public void setLiquiDate(Integer liquiDate) {
        this.liquiDate = liquiDate;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate == null ? null : regDate.trim();
    }

    public String getModiDate() {
        return modiDate;
    }

    public void setModiDate(String modiDate) {
        this.modiDate = modiDate == null ? null : modiDate.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFundGroup() {
        return fundGroup;
    }

    public void setFundGroup(String fundGroup) {
        this.fundGroup = fundGroup == null ? null : fundGroup.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String Brand) {
        this.brand = Brand == null ? null : Brand.trim();
    }

    public String getShareClass() {
        return shareClass;
    }

    public void setShareClass(String shareClass) {
        this.shareClass = shareClass == null ? null : shareClass.trim();
    }

    public String findIpoTime() {
        if (BetterDateUtils.getNumDate().equals(this.ipoEndDate)) {
            return this.subLastTime;
        }
        else {
            return this.subTime;
        }
    }

    public String getCrsCode() {
        return crsCode;
    }

    public void setCrsCode(String crsCode) {
        this.crsCode = crsCode == null ? null : crsCode.trim();
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType == null ? null : subType.trim();
    }

    public String getBonusType() {
        return bonusType;
    }

    public void setBonusType(String bonusType) {
        this.bonusType = bonusType == null ? null : bonusType.trim();
    }

    public BigDecimal getMaxShare() {
        return maxShare;
    }

    public void setMaxShare(BigDecimal maxShare) {
        this.maxShare = maxShare;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime == null ? null : tradeTime.trim();
    }

    public String getSubLastTime() {
        return subLastTime;
    }

    public void setSubLastTime(String subLastTime) {
        this.subLastTime = subLastTime == null ? null : subLastTime.trim();
    }

    public String getSubTime() {
        return subTime;
    }

    public void setSubTime(String subTime) {
        this.subTime = subTime == null ? null : subTime.trim();
    }

    public String getAcceptMode() {
        return acceptMode;
    }

    public void setAcceptMode(String acceptMode) {
        this.acceptMode = acceptMode == null ? null : acceptMode.trim();
    }

    public String getFinanceCycle() {
        return financeCycle;
    }

    public void setFinanceCycle(String financeCycle) {
        this.financeCycle = financeCycle == null ? null : financeCycle.trim();
    }

    public String getIpoEndDate() {
        return ipoEndDate;
    }

    public void setIpoEndDate(String ipoEndDate) {
        this.ipoEndDate = ipoEndDate == null ? null : ipoEndDate.trim();
    }

    public String getBusinFlag() {
        return businFlag;
    }

    public void setBusinFlag(String businFlag) {
        this.businFlag = businFlag == null ? null : businFlag.trim();
    }

    public String getManagerNo() {
        return managerNo;
    }

    public void setManagerNo(String managerNo) {
        this.managerNo = managerNo == null ? null : managerNo.trim();
    }

    public String getFundClass() {
        return fundClass;
    }

    public void setFundClass(String fundClass) {
        this.fundClass = fundClass == null ? null : fundClass.trim();
    }

    public String getTrusteeNo() {
        return trusteeNo;
    }

    public void setTrusteeNo(String trusteeNo) {
        this.trusteeNo = trusteeNo == null ? null : trusteeNo.trim();
    }

    public SaleFundDayInfo getFundDayInfo() {
        return fundDayInfo;
    }

    public Integer getFundOrder() {
        return fundOrder;
    }

    public void setFundOrder(Integer fundOrder) {
        this.fundOrder = fundOrder;
    }

    public void setFundDayInfo(SaleFundDayInfo anFundDayInfo) {
        if (anFundDayInfo != null) {
            fundDayInfo = anFundDayInfo;
            fundDayInfo.setFundInfo(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tano=").append(tano);
        sb.append(", fundCode=").append(fundCode);
        sb.append(", fundName=").append(fundName);
        sb.append(", fullName=").append(fullName);
        sb.append(", shortName=").append(shortName);
        sb.append(", currency=").append(currency);
        sb.append(", faceValue=").append(faceValue);
        sb.append(", issuePrice=").append(issuePrice);
        sb.append(", manager=").append(manager);
        sb.append(", trustee=").append(trustee);
        sb.append(", taName=").append(taName);
        sb.append(", issueDate=").append(issueDate);
        sb.append(", setupDate=").append(setupDate);
        sb.append(", managerRatio=").append(managerRatio);
        sb.append(", serviceRatio=").append(serviceRatio);
        sb.append(", status=").append(fundStatus);
        sb.append(", feeType=").append(feeType);
        sb.append(", shareType=").append(shareType);
        sb.append(", type=").append(type);
        sb.append(", minShare=").append(minShare);
        sb.append(", riskLevel=").append(riskLevel);
        sb.append(", liquiDate=").append(liquiDate);
        sb.append(", regDate=").append(regDate);
        sb.append(", modiDate=").append(modiDate);
        sb.append(", description=").append(description);
        sb.append(", fundGroup=").append(fundGroup);
        sb.append(", Brand=").append(brand);
        sb.append(", shareClass=").append(shareClass);
        sb.append(", crsCode=").append(crsCode);
        sb.append(", subType=").append(subType);
        sb.append(", bonusType=").append(bonusType);
        sb.append(", maxShare=").append(maxShare);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", subLastTime=").append(subLastTime);
        sb.append(", subTime=").append(subTime);
        sb.append(", acceptMode=").append(acceptMode);
        sb.append(", financeCycle=").append(financeCycle);
        sb.append(", ipoEndDate=").append(ipoEndDate);
        sb.append(", businFlag=").append(businFlag);
        sb.append(", managerNo=").append(managerNo);
        sb.append(", fundClass=").append(fundClass);
        sb.append(", trusteeNo=").append(trusteeNo);
        sb.append(", fundOrder=").append(fundOrder);
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
        SaleFundInfo other = (SaleFundInfo) that;
        return (this.getTano() == null ? other.getTano() == null : this.getTano().equals(other.getTano()))
                && (this.getFundCode() == null ? other.getFundCode() == null : this.getFundCode().equals(other.getFundCode()))
                && (this.getFundName() == null ? other.getFundName() == null : this.getFundName().equals(other.getFundName()))
                && (this.getFullName() == null ? other.getFullName() == null : this.getFullName().equals(other.getFullName()))
                && (this.getShortName() == null ? other.getShortName() == null : this.getShortName().equals(other.getShortName()))
                && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
                && (this.getFaceValue() == null ? other.getFaceValue() == null : this.getFaceValue().equals(other.getFaceValue()))
                && (this.getIssuePrice() == null ? other.getIssuePrice() == null : this.getIssuePrice().equals(other.getIssuePrice()))
                && (this.getManager() == null ? other.getManager() == null : this.getManager().equals(other.getManager()))
                && (this.getTrustee() == null ? other.getTrustee() == null : this.getTrustee().equals(other.getTrustee()))
                && (this.getTaName() == null ? other.getTaName() == null : this.getTaName().equals(other.getTaName()))
                && (this.getIssueDate() == null ? other.getIssueDate() == null : this.getIssueDate().equals(other.getIssueDate()))
                && (this.getSetupDate() == null ? other.getSetupDate() == null : this.getSetupDate().equals(other.getSetupDate()))
                && (this.getManagerRatio() == null ? other.getManagerRatio() == null : this.getManagerRatio().equals(other.getManagerRatio()))
                && (this.getServiceRatio() == null ? other.getServiceRatio() == null : this.getServiceRatio().equals(other.getServiceRatio()))
                && (this.getFundStatus() == null ? other.getFundStatus() == null : this.getFundStatus().equals(other.getFundStatus()))
                && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
                && (this.getShareType() == null ? other.getShareType() == null : this.getShareType().equals(other.getShareType()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getMinShare() == null ? other.getMinShare() == null : this.getMinShare().equals(other.getMinShare()))
                && (this.getRiskLevel() == null ? other.getRiskLevel() == null : this.getRiskLevel().equals(other.getRiskLevel()))
                && (this.getLiquiDate() == null ? other.getLiquiDate() == null : this.getLiquiDate().equals(other.getLiquiDate()))
                && (this.getRegDate() == null ? other.getRegDate() == null : this.getRegDate().equals(other.getRegDate()))
                && (this.getModiDate() == null ? other.getModiDate() == null : this.getModiDate().equals(other.getModiDate()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
                && (this.getFundGroup() == null ? other.getFundGroup() == null : this.getFundGroup().equals(other.getFundGroup()))
                && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
                && (this.getShareClass() == null ? other.getShareClass() == null : this.getShareClass().equals(other.getShareClass()))
                && (this.getCrsCode() == null ? other.getCrsCode() == null : this.getCrsCode().equals(other.getCrsCode()))
                && (this.getSubType() == null ? other.getSubType() == null : this.getSubType().equals(other.getSubType()))
                && (this.getBonusType() == null ? other.getBonusType() == null : this.getBonusType().equals(other.getBonusType()))
                && (this.getMaxShare() == null ? other.getMaxShare() == null : this.getMaxShare().equals(other.getMaxShare()))
                && (this.getTradeTime() == null ? other.getTradeTime() == null : this.getTradeTime().equals(other.getTradeTime()))
                && (this.getSubLastTime() == null ? other.getSubLastTime() == null : this.getSubLastTime().equals(other.getSubLastTime()))
                && (this.getSubTime() == null ? other.getSubTime() == null : this.getSubTime().equals(other.getSubTime()))
                && (this.getAcceptMode() == null ? other.getAcceptMode() == null : this.getAcceptMode().equals(other.getAcceptMode()))
                && (this.getFinanceCycle() == null ? other.getFinanceCycle() == null : this.getFinanceCycle().equals(other.getFinanceCycle()))
                && (this.getIpoEndDate() == null ? other.getIpoEndDate() == null : this.getIpoEndDate().equals(other.getIpoEndDate()))
                && (this.getBusinFlag() == null ? other.getBusinFlag() == null : this.getBusinFlag().equals(other.getBusinFlag()))
                && (this.getManagerNo() == null ? other.getManagerNo() == null : this.getManagerNo().equals(other.getManagerNo()))
                && (this.getFundClass() == null ? other.getFundClass() == null : this.getFundClass().equals(other.getFundClass()))
                && (this.getTrusteeNo() == null ? other.getTrusteeNo() == null : this.getTrusteeNo().equals(other.getTrusteeNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTano() == null) ? 0 : getTano().hashCode());
        result = prime * result + ((getFundCode() == null) ? 0 : getFundCode().hashCode());
        result = prime * result + ((getFundName() == null) ? 0 : getFundName().hashCode());
        result = prime * result + ((getFullName() == null) ? 0 : getFullName().hashCode());
        result = prime * result + ((getShortName() == null) ? 0 : getShortName().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getFaceValue() == null) ? 0 : getFaceValue().hashCode());
        result = prime * result + ((getIssuePrice() == null) ? 0 : getIssuePrice().hashCode());
        result = prime * result + ((getManager() == null) ? 0 : getManager().hashCode());
        result = prime * result + ((getTrustee() == null) ? 0 : getTrustee().hashCode());
        result = prime * result + ((getTaName() == null) ? 0 : getTaName().hashCode());
        result = prime * result + ((getIssueDate() == null) ? 0 : getIssueDate().hashCode());
        result = prime * result + ((getSetupDate() == null) ? 0 : getSetupDate().hashCode());
        result = prime * result + ((getManagerRatio() == null) ? 0 : getManagerRatio().hashCode());
        result = prime * result + ((getServiceRatio() == null) ? 0 : getServiceRatio().hashCode());
        result = prime * result + ((getFundStatus() == null) ? 0 : getFundStatus().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getShareType() == null) ? 0 : getShareType().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getMinShare() == null) ? 0 : getMinShare().hashCode());
        result = prime * result + ((getRiskLevel() == null) ? 0 : getRiskLevel().hashCode());
        result = prime * result + ((getLiquiDate() == null) ? 0 : getLiquiDate().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getModiDate() == null) ? 0 : getModiDate().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getFundGroup() == null) ? 0 : getFundGroup().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getShareClass() == null) ? 0 : getShareClass().hashCode());
        result = prime * result + ((getCrsCode() == null) ? 0 : getCrsCode().hashCode());
        result = prime * result + ((getSubType() == null) ? 0 : getSubType().hashCode());
        result = prime * result + ((getBonusType() == null) ? 0 : getBonusType().hashCode());
        result = prime * result + ((getMaxShare() == null) ? 0 : getMaxShare().hashCode());
        result = prime * result + ((getTradeTime() == null) ? 0 : getTradeTime().hashCode());
        result = prime * result + ((getSubLastTime() == null) ? 0 : getSubLastTime().hashCode());
        result = prime * result + ((getSubTime() == null) ? 0 : getSubTime().hashCode());
        result = prime * result + ((getAcceptMode() == null) ? 0 : getAcceptMode().hashCode());
        result = prime * result + ((getFinanceCycle() == null) ? 0 : getFinanceCycle().hashCode());
        result = prime * result + ((getIpoEndDate() == null) ? 0 : getIpoEndDate().hashCode());
        result = prime * result + ((getBusinFlag() == null) ? 0 : getBusinFlag().hashCode());
        result = prime * result + ((getManagerNo() == null) ? 0 : getManagerNo().hashCode());
        result = prime * result + ((getFundClass() == null) ? 0 : getFundClass().hashCode());
        result = prime * result + ((getTrusteeNo() == null) ? 0 : getTrusteeNo().hashCode());
        return result;
    }
}