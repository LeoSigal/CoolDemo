package com.selectica.CanSee.eclm.definitions.shared.conditions;

import com.selectica.rcfscripts.AbstractBOWriteScript;
import com.selectica.rcfutils.RCFAttachmentInfoWrapper;

import java.util.List;

/**
 * Created by vshilkin on 21/01/2015.
 */
public class DownloadDocumentsPopUpFilterAction extends AbstractBOWriteScript<Boolean> {
    /*
                    <![CDATA[
                var iterator = documentInfoHolder.iterator();
                while (iterator.hasNext()) {
                    var info = iterator.next();
                    if ('ReqContractAttachment'.equals(info.getAttachmentComponentName())) {
                        info.select();
                    }
                }
                ]]>

     */
    @Override
    public Boolean process() throws Exception {
        List<RCFAttachmentInfoWrapper> documentsInfoList = getHelper().getDocumentInfoList();
        for (RCFAttachmentInfoWrapper documentInfo : documentsInfoList) {
            if ("ReqContractAttachment".equals(documentInfo.getAttachmentComponentName())) {
                documentInfo.select();
            }
        }
        return true;
    }
}
