package Maven_project.Kiran_Clean_2;

public class CalculateInterest implements Calculate {

	public double calculateSimpleInterest(double principleAmount, double time, double rateOfInterest) {
		// TODO Auto-generated method stub
		return (principleAmount * time * rateOfInterest) / 100.0;
	}

	public double calculateCompoundInterest(double principleAmount, double time, double rateOfInterest) {
		// TODO Auto-generated method stub
		return principleAmount * Math.pow((1+rateOfInterest/100), time);
	}
	
}
