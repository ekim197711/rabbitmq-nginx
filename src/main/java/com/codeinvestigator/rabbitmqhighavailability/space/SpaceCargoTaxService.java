package com.codeinvestigator.rabbitmqhighavailability.space;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Service;

@Service
public class SpaceCargoTaxService {

    private AnnotationConfigApplicationContext context = null;

    public ConfigurableEnvironment properties() {
        if (context == null) {
            context = new AnnotationConfigApplicationContext();
            context.register(SpaceCargoFoodProperties.class);
            context.register(SpaceCargoMineralsProperties.class);
            context.refresh();
        }
        return context.getEnvironment();
    }

}
