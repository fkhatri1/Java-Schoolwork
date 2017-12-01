Faysal Khatri
public class Activity3 {
	
	public static void main(String[] args) {
		Task[] tasks = new Task[5];
		tasks[0] = new Task("Snooze alarm", 1);
		tasks[1] = new Task("Brush teeth", 2);
		tasks[2] = new Task("Shower", 3);
		tasks[3] = new Task("Breakfast", 4);
		tasks[4] = new Task("Drive to work", 5);

		for (int i=0;i<tasks.length;i++) {
			System.out.println(tasks[i]);
		}
		
	}

}
