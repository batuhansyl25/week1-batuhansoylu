package com.ImmutableCarClass;

import java.awt.*;
import java.util.Date;

public final class ImmutableCarClass {
    public enum Model{
        TOYOTA,
        FORD,
        BMW
    };

    private final String model;

    private final Integer year;

    private final Integer numOfPerson;

    private final Date productionDate;

    private final Integer km;

    private final Color color;

    public ImmutableCarClass(Integer year, Integer numOfPerson, Date productionDate, Integer km, Color color, String model) {
        this.model = model;
        this.year = year;
        this.numOfPerson = numOfPerson;
        this.productionDate = new Date(productionDate.getTime());
        this.km = km;
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getNumOfPerson() {
        return numOfPerson;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public Integer getKm() {
        return km;
    }

    public Color getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
