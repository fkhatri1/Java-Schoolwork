//Faysal Khatri
public class Task implements Priority {
private int priority;
private String name;
	public Task(String n, int p) {
		this.name = n;
		setPriority(p);
	}
	
	@Override
	public int getPriority() {
		return this.priority;
	}

	@Override
	public void setPriority(int p) {
		this.priority = p;

	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name=n;
	}
	
	public String toString() {
		return "Priority #" + getPriority() + ": " + getName();
	}

}
