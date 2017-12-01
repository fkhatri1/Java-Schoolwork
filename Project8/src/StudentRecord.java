
public class StudentRecord implements Comparable<StudentRecord> {
	
	private String Name;
	private int studentNo;
	private double gpa;
	
	private static int nextNum = 1000;
	
	public StudentRecord(String name) {
		super();
		Name = name;
		this.studentNo = nextNum;
		nextNum++;
		gpa = 0.0;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "StudentRecord [Name=" + Name + ", studentNo=" + studentNo + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(StudentRecord that) {
		return this.Name.compareTo(that.Name);
	}

	@Override
	public boolean equals(Object that) {
		return this.Name.equals(((StudentRecord)that).Name);
	}

}
