/**
 * 
 */
package com.betterjr.modules.agreement;

import com.betterjr.common.annotation.AnnotRuleService;
import com.betterjr.modules.remote.entity.SignRequestInfo;
import com.betterjr.modules.rule.annotation.AnnotRuleFunc;
import com.betterjr.modules.rule.entity.RuleFuncType;

@AnnotRuleService("scfElecAgreementWebServiceDubboService")
public interface IScfElecAgreementWebService {
    /**
     * 沃通推送文件接口
     */
    @AnnotRuleFunc(name = "PushSignedDoc", fundType = RuleFuncType.OBJECT)
    String pushSignedDoc(SignRequestInfo input);

    /**
     * 沃通推送身份验证结果
     */
    @AnnotRuleFunc(name = "PushValidation", fundType = RuleFuncType.OBJECT)
    String pushValidation(SignRequestInfo anInput);

}