package com.company;


public class SubMealBuilderA extends MealBuilder {
    @Override
    public void BuildFood(){
        meal.setFood("Hambagar");
    }

    @Override
    public void BuildDrinks(){
        meal.setDrinks("kole" );
    }

}
