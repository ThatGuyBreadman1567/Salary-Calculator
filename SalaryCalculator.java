import javax.swing.*;


public class SalaryCalculator 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Salary Calculator");
		frame.setBounds(500,400,350,200);
		frame.setLayout(null);
		
		JLabel hourlyRate = new JLabel("Hourly Rate: ");
		hourlyRate.setBounds(30,30,75,15);
		frame.add(hourlyRate);
		
		JTextField hourly = new JTextField();
		hourly.setBounds(105,30,100,20);
		frame.add(hourly);
		
		JLabel hoursWeek = new JLabel("Hours/Week: ");
		hoursWeek.setBounds(30,52,80,15);
		frame.add(hoursWeek);
		
		JTextField hours = new JTextField();
		hours.setBounds(105,50,100,20);
		frame.add(hours);
		
		JCheckBox fullTime = new JCheckBox();
		fullTime.setBounds(35,70,20,20);
		frame.add(fullTime);
		
		JLabel fullT = new JLabel("Full Time");
		fullT.setBounds(60,72,60,15);
		frame.add(fullT);
		
		JButton calc = new JButton("Calculate");
		calc.setBounds(30,95,120,25);
		frame.add(calc);
		
		JLabel ann = new JLabel("Annual Salary: $");
		ann.setBounds(160,100,150,15);
		frame.add(ann);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
