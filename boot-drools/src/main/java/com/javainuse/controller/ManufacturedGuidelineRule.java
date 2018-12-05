package com.mrcooper.digital.omnichannel.escrow.removal.rules;

import com.mrcooper.digital.omnichannel.escrow.removal.GuidelineType;
import com.mrcooper.digital.omnichannel.escrow.removal.Message;
import com.mrcooper.digital.omnichannel.escrow.removal.ResultType;
import com.mrcooper.digital.omnichannel.escrow.removal.guidelines.ManufacturedGuideline;
import com.mrcooper.digital.omnichannel.escrow.removal.utils.Localization;
import org.springframework.stereotype.Component;

@Component
public class ManufacturedGuidelineRule implements GuidelineRule<ManufacturedGuideline> {

    private Localization localization;

    public ManufacturedGuidelineRule(Localization localization){
        this.localization = localization;
    }

    @Override
    public Message validate(ManufacturedGuideline manufacturedGuideline) {
        int manfactured = manufacturedGuideline.getManufactured();
        if (isCustomerValid(manfactured))
            return new Message
                    .MessageBuilder()
                    .setGuideline(GuidelineType.Manufactured)
                    .setResult(ResultType.PASS)
                    .setVerbiage(localization.getValues(GuidelineType.Manufactured, ResultType.PASS))
                    .build();

        return new Message
                .MessageBuilder()
                .setGuideline(GuidelineType.Manufactured)
                .setResult(ResultType.FAIL)
                .setVerbiage(localization.getValues(GuidelineType.Manufactured, ResultType.FAIL))
                .build();
    }

    private boolean isCustomerValid(int manfactured) {
        
            return !(manfactured>07);
            
    }
}
