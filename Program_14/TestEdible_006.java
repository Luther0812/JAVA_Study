/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_14;

/**
 * @author LiuYu
 *
 */
public class TestEdible_006 {
	public static void main(String[] args){
		Object[] objects = {new Tiger(), new Chicken(), new Apple()};
		for(int i = 0; i < objects.length; i++){
			if(objects[i] instanceof Interface_001){
				System.out.println(((Interface_001)objects[i]).howToEat());
			}
		}
	}

}

class Animal{
	
}

class Chicken extends Animal implements Interface_001{
	public String howToEat(){
		return "Chicken: Fry it";
	}
}

class Tiger extends Animal{
	
}

abstract class Fruit implements Interface_001{
	
}

class Apple extends Fruit{
	public String howToEat(){
		return "Apple: Make apple cider";
	}
}

class Orange extends Fruit{
	public String howToEat(){
		return "Orange: Make orange juice";
	}
}

