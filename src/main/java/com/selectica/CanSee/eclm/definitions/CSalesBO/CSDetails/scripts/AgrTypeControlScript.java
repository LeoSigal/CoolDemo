package com.selectica.CanSee.eclm.definitions.CSalesBO.CSDetails.scripts;

import com.selectica.CanSee.stubs.CSDetails;
import com.selectica.rcfscripts.AbstractDataReadScript;

/**
 * Created by vshilkin on 08/01/2015.
 */
public class AgrTypeControlScript extends AbstractDataReadScript<Boolean> {
    /*
            <![CDATA[
            result = thisComponent.getParameterValueObject("agrType") != 'Master';
            ]]>
     */
    @Override
    public Boolean process() throws Exception {
        CSDetails details = getHelper().getCurrentComponentStub();
        return !details.getAgrType().equals("Master");
    }
}

