package src;

public class CoffeeMaker {
	
	private boolean hasWorkToDo;

	public boolean isHasWorkToDo() {
		return hasWorkToDo;
	}


	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}


	public void brewCoffee() {
		if(hasWorkToDo) {
			System.out.println("Coffee is ready!");
			hasWorkToDo = false;
		}
		else System.out.println("Coffee machine is empty!");
	}
}
