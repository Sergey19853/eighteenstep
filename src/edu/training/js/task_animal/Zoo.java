package edu.training.js.task_animal;

import java.util.ArrayList;

public class Zoo {

	private ArrayList<Object> animals = new ArrayList<>();
	
	public void addAnimal(Object animal) {
		animals.add(animal);
	}
	
	public void simulateDay() {
		
		for (Object animal : animals) {		
			if (animal instanceof Lion) {	
				((Lion)animal).makeSound();
				((Lion)animal).makeSound();
				((Lion)animal).eat();
			}else if (animal instanceof Elephant) {
				((Elephant)animal).makeSound();
				((Elephant)animal).eat();
				((Elephant)animal).eat();
			}else if (animal instanceof Monkey) {
				((Monkey)animal).makeSound();
				((Monkey)animal).eat();
				((Monkey)animal).makeSound();
			}	
		}
		
	}
	
	
	
}
