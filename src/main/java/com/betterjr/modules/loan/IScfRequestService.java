package com.betterjr.modules.loan;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


public interface IScfRequestService {

    /**
     * 查询融资申请列表
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryRequestList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 添加融资申请
     * @param anMap
     * @return
     */
    String webAddRequest(Map<String, Object> anMap);

    /**
     * 保存融资申请
     * @param anMap
     * @param anRequestNo
     * @return
     */
    String webSaveModifyRequest(Map<String, Object> anMap, String anRequestNo);

    /**
     * 融资详情
     * @param anMap
     * @param anRequestNo
     * @return
     */
    String webFindRequestDetail(Map<String, Object> anMap, String anRequestNo);

    /**
     * 查询融资审批详情
     * @param anRequestNo
     * @param anFactorNo
     * @return
     */
    String webFindSchemeDetail(String anRequestNo);

    /**
     * 修改融资审批
     * @param anMap
     * @param anId
     * @return
     */
    String webSaveModifyScheme(Map<String, Object> anMap);

    /**
     * 分页查询融资审批
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQuerySchemeList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 审批申请
     * @param anMap
     * @return
     */
    String webApproveRequest(String anRequestNo, String anApprovalResult, String anReturnNode, String anDescription);

    /**
     * 资方-出具融资方案（供应商融资：生成《 应收账款转让通知书》，经销商融资：生成《三方协议》供下一步  融资企业 确认融资资方    使用）
     * @param anMap
     * @param anApprovalResult 审批结果
     * @param anReturnNode     打回节点
     * @param anDescription    备注
     * @return
     */
    String webOfferScheme(Map<String, Object> anMap, String anApprovalResult, String anReturnNode, String anDescription);
    
    /**
     * 融资企业-确认融资方案（供应商融资 ：签署应收账款转让通知书。销商融资：签署《保兑仓业务三方合作协议》）
     * @param anRequestNo
     * @param anBusinStatus
     * @return
     */
    String webConfirmScheme(String anRequestNo, String anBusinStatus, String anSmsCode);

    /**
     * 资方--发起贸易背景确认（供应商融资：生成《应收账款转让通知书》 供下一步（核心企业确认融资背景）使用。销商融资：资方签署《保兑仓业务三方合作协议》）
     * @param anRequestNo
     * @return
     */
    String webRequestTradingBackgrand(String anRequestNo, String anAduitStatus, String anReturnNode, String anDescription, String anSmsCode);

    /**
     * 核心企业确认贸易背景，（供应商融资：签署《 应收账款转让确认意见书》，经销商融资：签署《保兑仓业务三方合作协议》）
     * @param anRequestNo
     * @param anAduit
     * @return
     */
    String webConfirmTradingBackgrand(String anRequestNo, String anBusinStatus, String anSmsCode);


    /**
     * 保理公司-放款确认（生成还款计划）
     * @param anMap
     * @param anApprovalResult 审批结果
     * @param anReturnNode     打回节点
     * @param anDescription    备注
     * @return
     */
    String webConfirmLoan(Map<String, Object> anMap, String anApprovalResult, String anReturnNode, String anDescription);

    /**
     * 计算手续费
     * @param anRequestNo
     * @param loanBalance
     * @return
     */
    String webGetServiecFee(String anRequestNo, BigDecimal loanBalance);

    /**
     * 计算结束日期
     * @param anRequestNo
     * @param startDate
     * @return
     */
    String webGetEndDate(String anRequestNo, String startDate);

    /**
     * 计算利息 和管理费
     * @param anRequestNo
     * @param loanBalance
     * @return
     */
    String webGetInsterest(String anRequestNo, BigDecimal loanBalance, String anLoanDate, String endDate);

    /**
     * 查询待批融资
     */
    String webQueryPendingRequest(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);
    
    /**
     * 查询还款融资
     */
    String webQueryRepaymentRequest(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);
    
    /**
     * 查询历史融资
     */
    String webQueryCompletedRequest(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);
    
    /**
     * 核心企业进行融资查询
     */
    String webQueryCoreEnterpriseRequest(Map<String, Object> anMap, String anRequestType, String anFlag, int anPageNum, int anPageSize);

    /**
     * 查询当前用户任务
     * @param type 1：待办，2：已办
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryWorkTask(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 获取申请状态结果集
     * @return
     */
    String webQueryTradeStatus();

    String webFindPayPlan(Long anId);
    
    
    public List<Long> findVoucherBatchNo(String anRequest);
    /**
     * 发送申请单状态给保理公司
     * 
     * @param anRequestNo
     *            申请单编号
     * @param anStatus
     *            申请单状态
     */
    public void updateAndSendRequestStatus(String anRequestNo, String anStatus) ;

    /**
     * 查询供应商融资
     */
    public String webQuerySupplierRequestByCore(Map<String, Object> anMap, String anBusinStatus, String anFlag, int anPageNum, int anPageSize);

    /**
     * 查询经销商融资
     */
    public String webQuerySellerRequestByCore(Map<String, Object> anMap, String anBusinStatus, String anFlag, int anPageNum, int anPageSize);

    
  
}
