public class Student {
	private String name;
	private double GPA;
	private double[] testScore = new double[4];
	private double[] testWeight = new double[4];
	
	public Student() {
	}
	
	public Student(String name, double GPA, double[] testScore, double[] testWeight) {
		this.name = name;
		this.GPA = GPA;
		this.testScore = testScore;
		this.testWeight = testWeight;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setGPA(double newGPA) {
		this.GPA = newGPA;
	}
	
	public double getGPA() {
		return this.GPA;
	}
	
	public void setTestScore(double[] newTestScore) {
		this.testScore = newTestScore;
	}
	
	public double[] getTestScore() {
		return this.testScore;
	}
	
	public void setTestWeight(double[] newTestWeight) {
		this.testScore = newTestWeight;
	}
	
	public double[] getTestWeight() {
		return this.testWeight;
	}
	
	public static double calculateAvgScore(double[] testScore, double[] testWeight) {
		double AvgScore =  testScore[0] * testWeight[0] +
						   testScore[1] * testWeight[1] +
						   testScore[2] * testWeight[2] +
						   testScore[3] * testWeight[3];
		return AvgScore;
	}
	public static double calculateGPA(double AvgScore) {
		if (AvgScore >= 90) return 4.0;
		else if (AvgScore >= 80) return 3.0;
		else if (AvgScore >= 70) return 2.0;
		else if (AvgScore >= 60) return 1.0;
		else return 0.0;
	}
	
}