package com.codeinvestigator.rabbitmqhighavailability.space;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpaceCargoTaxServiceTest {
    @Autowired
    SpaceCargoTaxService spaceCargoTaxService;

    @Test
    public void properties() {
        assertEquals(0.05, spaceCargoTaxService.properties().getProperty("bananas", Double.class));
        assertEquals("0.05", spaceCargoTaxService.properties().getProperty("bananas"));
        assertEquals("0.3", spaceCargoTaxService.properties().getProperty("carrots"));
        assertEquals("0.17", spaceCargoTaxService.properties().getProperty("tomatoes"));

        System.out.println(String.format("bananas %s",
                spaceCargoTaxService.properties().getProperty("bananas")));
    }

    @Test
    public void propertiesUtilities() {
        assertEquals("0.5", spaceCargoTaxService.properties().getProperty("transporter"));
        assertEquals("0.1", spaceCargoTaxService.properties().getProperty("asteroidremover"));
        assertEquals("0.9", spaceCargoTaxService.properties().getProperty("hyperspacedrive"));

        System.out.println(String.format("transporter %s",
                spaceCargoTaxService.properties().getProperty("transporter")));

    }

    @Test
    public void propertiesMinerals() {
        assertEquals("0.2", spaceCargoTaxService.properties().getProperty("gold"));
        assertEquals("0.15", spaceCargoTaxService.properties().getProperty("silver"));
        assertEquals("0.25", spaceCargoTaxService.properties().getProperty("platinum"));

        System.out.println(String.format("silver %s",
                spaceCargoTaxService.properties().getProperty("silver")));

    }
}