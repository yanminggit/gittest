package com.betterjr.modules.loan;

import java.math.BigDecimal;
import java.util.Map;

public interface IScfRepaymentService {
    /**
     * 查询还款计划列表
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryPayPlanList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 修改还款计划
     * @param anMap
     * @param id
     * @return
     */
    String webSaveModifyPayPlan(Map<String, Object> anMap, Long id);

    /**
     * 查询还款计划详情
     * @param anMap
     * @param id
     * @return
     */
    String webFindPayPlanDetail(String anRequestNo);

    /**
     * 还款记录-分页查询
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryPayRecordList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 还款记录-修改
     * @param anMap
     * @param id
     * @return
     */
    String webSaveModifyPayRecord(Map<String, Object> anMap, Long id);

    /**
     * 还款记录-详情
     * @param anMap
     * @param id
     * @return
     */
    String webFindPayRecordDetail(Map<String, Object> anMap, Long id);

    /**
     * 还款分配记录-分页查询
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryRecordDetailList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 还款分配记录-修改
     * @param anMap
     * @param id
     * @return
     */
    String webSaveModifyRecordDetail(Map<String, Object> anMap, Long id);

    /**
     * 还款分配记录-详情
     * @param anMap
     * @param id
     * @return
     */
    String webFindRecordDetail(Map<String, Object> anMap, Long id);
    
    /**
     * 保存还款
     * @param anMap
     * @return
     */
    String webSaveRepayment(Map<String, Object> anMap);

    /**
     * 进入还款界面后，填充还款数据
     * @param anRequestNo
     * @param anPayType
     * @param anFactorNo
     * @param anPayDate 还款日期
     * @return
     */
    String webQueryRepaymentFee(String anRequestNo, String anPayType, String anFactorNo, String anPayDate, BigDecimal totalBalance);

    /**
     * 经销商还款 -计算利息 -填入(本次还款额) 时  调用
     * @param anMap
     * @return
     */
    String webQuerySellerRepaymentFee(String anRequestNo, String anPayType, String anPayDate, BigDecimal anTotalBalance);

    /**
     * 计算还款方式-还款时，在选择还款日期后调用，用于填充还款方式
     * @param anRequestNo
     * @param anPayDate
     * @return
     */
    String webCalculatPayType(String anRequestNo, String anPayDate);

    /**
     * 分页查询豁免记录
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryExemptList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 新增豁免记录
     * @param anMap
     * @return
     */
    String webAddExempt(Map<String, Object> anMap);

    /**
     * 分页查询催收记录
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryPressMoneyList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 新增催收记录
     * @param anMap
     * @return
     */
    String webAddPressMoney(Map<String, Object> anMap);

    /**
     * 计算贷款余额-填入展期开始日期后调用（填入的开始日期可能超过了计划还款日期所以要把罚息计算到总额里面）
     * @param anRequestNo
     * @param anStartDate
     * @return
     */
    String webCalculatLoanBalance(String anRequestNo, String anStartDate);
    
    /**
     * 填入展期期限后调用，用于计算结束日期
     * @param anStartDate
     * @param period
     * @param periodUnit
     * @return
     */
    String webCalculatExtensionEndDate(String anStartDate, Integer period, Integer periodUnit);

    /**
     * 展期时，填入本次还款金额后，将得到展期金额，根据展期利率可以 计算展期后的利息（利率若改变也要调用此方法）
     * @param ratio
     * @param managementRatio
     * @param extensionBalance
     * @return
     */
    String webCalculatExtensionFee(BigDecimal ratio, BigDecimal managementRatio, BigDecimal extensionBalance);

    /**
     * 展期时-填入本次还款金额后调用，用于填充还款分配
     * @param anRequestNo
     * @param anStartDate
     * @param payBalance
     * @return
     */ 
    String webPayAssigned(String anRequestNo, String anStartDate, BigDecimal payBalance);

    /**
     * 保存展期
     * @param anMap
     * @return
     */
    String webAddExtension(Map<String, Object> anMap);

    /**
     * 分页查询展期列表
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryExtensionList(Map<String, Object> anMap, String requestNo, int anFlag, int anPageNum, int anPageSize);

    /**
     * 无分页查展期列表
     * @param anMap
     * @return
     */
    String webFindExtensionList(Map<String, Object> anMap);

    /**
     * 无分页查询豁免列表
     * @param anMap
     * @return
     */
    String webFindExemptList(Map<String, Object> anMap);

    /**
     * 无分页查催收列表
     * @param anMap
     * @return
     */
    String webFindPressMoneyList(Map<String, Object> anMap);

    /**
     * 无分页查还款计划列表
     * @param anMap
     * @return
     */
    String webFindPlanList(Map<String, Object> anMap);

    /**
     * 无分页查还款记录列表
     * @param anMap
     * @return
     */
    String webFindPayRecordList(Map<String, Object> anMap);


    String webSaveModifyPressMoney(Map<String, Object> anMap, Long id);

    String webSaveDelPressMoney(Map<String, Object> map, Long id);

    /**
     * 还款提醒发送消息发送
     * @param anMap
     * @param requestNo
     * @return
     */
    String webNotifyPay(Map<String, Object> anMap, String requestNo);

    /**
     * 分配还款
     * @param anRequestNo
     * @param anPayType
     * @param anPayDate
     * @param anTotalBalance
     * @return
     */
    String webQueryDistributeFee(String anRequestNo, String anPayType, String anPayDate, BigDecimal anTotalBalance);

}
