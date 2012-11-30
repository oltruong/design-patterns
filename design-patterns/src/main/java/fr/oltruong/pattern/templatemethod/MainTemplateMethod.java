package fr.oltruong.pattern.templatemethod;

/**
 * Template method is a behavioral design pattern that defines the steps of an algorithm and defers some steps to
 * subclasses
 * 
 * @author oltruong
 */
public class MainTemplateMethod
{

    public static void main( String[] args )
    {
        AbstractRestaurant classyRestaurant = new ClassyRestaurant();
        AbstractRestaurant fastfoodRestaurant = new FastFoodRestaurant();

        classyRestaurant.haveDinner();
        fastfoodRestaurant.haveDinner();
    }
}
