package edu.training.js.task_animal;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		Lion lion = new Lion("Leo", 5);
		Elephant elephant = new Elephant("Dumbo", 10);
		Monkey monkey = new Monkey("George", 3);
		
		zoo.addAnimal(lion);
		zoo.addAnimal(elephant);
		zoo.addAnimal(monkey);
		zoo.simulateDay();
		
		System.out.println(lion.toString());
		System.out.println(elephant.toString());
		System.out.println(monkey.toString());
	}
	
}
