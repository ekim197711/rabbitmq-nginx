package com.codeinvestigator.rabbitmqhighavailability.space;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:/space_cargo_food.properties"),
        @PropertySource("classpath:/space_cargo_utility.properties")

})

        public class SpaceCargoFoodProperties {
}
