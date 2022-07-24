package com.ImmutableCarClass;

import java.awt.*;
import java.util.Date;

public class ImmutableMain {
    public static void main(String[] args){
        ImmutableCarClass.Model model = ImmutableCarClass.Model.FORD;
        ImmutableCarClass car = new ImmutableCarClass(2021,4,new Date(),1010, Color.BLACK,model.name());
        System.out.println(car.getModel()+" "+car.getYear()+ " " +car.getNumOfPerson()+" "+car.getYear()+" "+car.getKm()+" "+car.getColor());
    }
}
