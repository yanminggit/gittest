/**
 * 
 */
package com.betterjr.modules.remote;

import java.util.List;

import com.betterjr.common.annotation.AnnotRuleService;
import com.betterjr.modules.document.data.DownloadFileInfo;
import com.betterjr.modules.rule.annotation.AnnotRuleFunc;
import com.betterjr.modules.rule.entity.RuleFuncType;


@AnnotRuleService("fileWebServiceDubboService")
public interface IFileWebService {

    /**
     * 对应接口：queryDownloadList 供应链融资业务，查询下载的文件列表
     * 
     * @param anMap
     *            需要查询的条件，客户号，在保理的客户号和需要下载的文件类型必须
     * @return
     */
    @AnnotRuleFunc(name = "queryDownloadList", fundType = RuleFuncType.OBJECT)
    List<DownloadFileInfo> queryDownloadList(Long anCustNo, String anScfId, String anRequestNo, String anBusinType, String anFactorNo);

    /**
     * 对应接口：downloadFile 供应链融资业务，需要下载文件的信息，需要在control层做转换
     * 
     * @param anMap
     *            需要查询的条件，文件编号，客户号，在保理的客户号和需要下载的文件类型必须
     * @return
     */
    DownloadFileInfo downloadFileInfo(String anToken);

}