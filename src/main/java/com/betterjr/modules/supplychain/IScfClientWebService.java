package com.betterjr.modules.supplychain;

import java.util.List;
import java.util.Map;

import com.betterjr.common.annotation.AnnotRuleService;
import com.betterjr.modules.rule.annotation.AnnotRuleFunc;
import com.betterjr.modules.rule.entity.RuleFuncType;
import com.betterjr.modules.supplychain.data.ScfClientDataDetail;
import com.betterjr.modules.supplychain.data.ScfClientDataProcess;

@AnnotRuleService("scfClientWebServiceDubboService")
public interface IScfClientWebService {

    /**
     * 查询未注册的账户信息
     * 
     * @return
     */
    @AnnotRuleFunc(name = "findUnCheckAccount", fundType = RuleFuncType.OBJECT)
    public List<ScfClientDataDetail> findUnCheckAccount(Map anMap);

    /**
     * 查询处理的账户信息，如果在当天已经处理过，则不再处理
     * 
     * @param anCoreCustNo
     * @return
     */
    @AnnotRuleFunc(name = "findWorkAccount", fundType = RuleFuncType.OBJECT)
    public List<ScfClientDataDetail> findWorkAccount(Map anMap);
    /**
     * 处理从资金管理系统推送过来的数据
     * 
     * @param anMap
     * @return
     */
    @AnnotRuleFunc(name = "processPushData", fundType = RuleFuncType.OBJECT)
    public boolean saveProcessPushData(Map anMap);
    
    /**
     * 处理从资金管理系统推送过来的数据
     * 
     * @param anMap
     * @return
     */
    @AnnotRuleFunc(name = "processCoreCorp", fundType = RuleFuncType.OBJECT)
    public boolean saveProcessCoreCorp(Map anMap);
    /**
     * 处理业务数据，处理单个账户，用于注册信息的处理
     * 
     * @param anMap
     * @return
     */
    @AnnotRuleFunc(name = "processData", fundType = RuleFuncType.OBJECT)
    public boolean saveProcessData(Map anMap);
    
    /**
     * 处理业务数据，用于调度的批量信息的处理
     * 
     * @param anMap
     * @return
     */
    @AnnotRuleFunc(name = "batchProcessData", fundType = RuleFuncType.OBJECT)
    public boolean saveBatchProcessData(Map anMap);
    
    /**
     * 处理业务数据，用于调度的批量信息的处理
     * 
     * @param anMap
     * @return
     */
    @AnnotRuleFunc(name = "noticeProcess", fundType = RuleFuncType.OBJECT)
    public boolean noticeProcess(Map anMap);
    
    @AnnotRuleFunc(name = "findDataProcess", fundType = RuleFuncType.OBJECT)
    public List<ScfClientDataProcess> findDataProcess(Map anMap);
    
}
