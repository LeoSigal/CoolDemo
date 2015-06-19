package com.selectica.CanSee.eclm.definitions.CProcBO.actions;

import com.selectica.CanSee.eclm.definitions.ContractStatus;
import com.selectica.CanSee.stubs.CPDetails;
import com.selectica.rcfscripts.AbstractBOWriteScript;

/**
 * Created by vshilkin on 24/12/2014.
 */
public class SetStatusActiveAction extends AbstractBOWriteScript<Boolean> {
    /*
                    thisComponent.setValue("CProcData/ReqCProcDetails/contractStatus","Executed");
                thisComponent.save();

     */
    @Override
    public Boolean process() throws Exception {
        CPDetails info = getHelper().getInfoComponentStub();
        info.setContractStatus(ContractStatus.EXECUTED.getStatus());
        return getHelper().saveComponent(info);
    }
}
