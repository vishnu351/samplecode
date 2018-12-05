package com.mrcooper.digital.omnichannel.escrow.removal.guidelines;

import com.mrcooper.digital.omnichannel.escrow.removal.rules.GuidelineRule;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Getter
@Setter
@Component
public class ManufacturedGuideline extends Guideline<ManufacturedGuideline> {

    private int Manufactured;

    public ManufacturedGuideline(GuidelineRule<ManufacturedGuideline> rule) {
        super(rule);
    }

    @Override
    protected ManufacturedGuideline getInstance() {
        return this;
    }


}
