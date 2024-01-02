package edu.training.js.task_animal;

import java.util.Objects;

public class Lion {

	private String name;
	private int age;
	private int energy;
	
	public Lion(String name, int age) {
		this.name = name;
		this.age = age;
		this.energy = 100;
	}
	
	public void makeSound() {
		energy -= 15;
	}
	
	public void eat() {
		energy += 20;
	}
	
	public void eat(int extraEnergy) {
		energy += extraEnergy;
	}
	
	public int getEnergy() {
		return energy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, energy, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lion other = (Lion) obj;
		return age == other.age && energy == other.energy && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Lion [name=" + name + ", age=" + age + ", energy=" + energy + "]";
	}
	
}
