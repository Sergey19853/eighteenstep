package edu.training.js.task_animal;

import java.util.Objects;

public class Monkey {

	private String name;
	private int age;
	private int energy;
	
	public Monkey(String name, int age) {
		this.name = name;
		this.age = age;
		this.energy = 100;
	}
	
	public void makeSound() {
		energy -= 25;
	}
	
	public void eat() {
		energy += 30;
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
		Monkey other = (Monkey) obj;
		return age == other.age && energy == other.energy && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Monkey [name=" + name + ", age=" + age + ", energy=" + energy + "]";
	}
	
}
