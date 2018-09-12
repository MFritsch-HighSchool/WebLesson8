import java.util.*;

import javax.swing.JOptionPane;

public class Weblesson8_2 {
	public static void main(String[] args){
		final double LIM1=0;
		final double LIM2=27050;
		final double LIM3=65550;
		final double LIM4=136750;
		final double LIM5=297350;
		final double LIM6=45200;
		final double LIM7=109250;
		final double LIM8=166500;
		final double TAXADD1 = 0;
		final double TAXADD2 = 4057.50;
		final double TAXADD3 = 14645;
		final double TAXADD4 = 36361;
		final double TAXADD5 = 93374;
		final double TAXADD6 = 6780;
		final double TAXADD7 = 24393.75;
		final double TAXADD8 = 41855;
		final double TAXADD9 = 88306;
		final double TAX1 = 0.15;
		final double TAX2 = 0.275;
		final double TAX3 = 0.305;
		final double TAX4 = 0.355;
		final double TAX5 = 0.391;
		List<String> optionList = new ArrayList<String>();
		optionList.add("<MAKE SELECTION>");
		optionList.add("No");
		optionList.add("Yes");
		Object[] options = optionList.toArray(); 
		Object value = JOptionPane.showInputDialog(null, "Are you married?", "input box", 0, null, options, 0);
		int status = optionList.indexOf(value);
		String incomes = JOptionPane.showInputDialog("Enter your income");
		double income = Double.parseDouble(incomes);
		if(status == 0)
			System.out.println("You must make a decision!");
		else if(status == 1){
			if(income>LIM1 && income<=LIM2){
				System.out.println("Relationship Status: Single");
				System.out.println("Your taxable income is "+income);
				System.out.print("Federal tax is ");
				System.out.printf("%.2f", TAXADD1+TAX1*(income-LIM1));
			}
			else if(income>LIM2 && income<=LIM3){
				System.out.println("Relationship Status: Single");
				System.out.println("Your taxable income is "+income);
				System.out.print("Federal tax is ");
				System.out.printf("%.2f", TAXADD2+TAX2*(income-LIM2));
			}
			else if(income>LIM3 && income<=LIM4){
				System.out.println("Relationship Status: Single");
				System.out.println("Your taxable income is "+income);
				System.out.print("Federal tax is ");
				System.out.printf("%.2f", TAXADD3+TAX3*(income-LIM3));
			}
			else if(income>LIM4 && income<=LIM5){
				System.out.println("Relationship Status: Single");
				System.out.println("Your taxable income is "+income);
				System.out.print("Federal tax is ");
				System.out.printf("%.2f", TAXADD4+TAX4*(income-LIM4));
			}
			else if(income>LIM5){
				System.out.println("Relationship Status: Single");
				System.out.println("Your taxable income is "+income);
				System.out.print("Federal tax is ");
				System.out.printf("%.2f", TAXADD5+TAX5*(income-LIM5));
			}
		}
		else if(status == 2){
			if(income>LIM1 && income<=LIM6){
				System.out.println("Relationship Status: Married");
				System.out.println("Your taxable income is "+income);
				System.out.print("Federal tax is ");
				System.out.printf("%.2f", TAXADD1+TAX1*(income-LIM1));
			}
			else if(income>LIM6 && income<=LIM7){
				System.out.println("Relationship Status: Married");
				System.out.println("Your taxable income is "+income);
				System.out.print("Federal tax is ");
				System.out.printf("%.2f", TAXADD6+TAX2*(income-LIM6));
			}
			else if(income>LIM7 && income<=LIM8){
				System.out.println("Relationship Status: Married");
				System.out.println("Your taxable income is "+income);
				System.out.print("Federal tax is ");
				System.out.printf("%.2f", TAXADD7+TAX3*(income-LIM7));
			}
			else if(income>LIM8 && income<=LIM5){
				System.out.println("Relationship Status: Married");
				System.out.println("Your taxable income is "+income);
				System.out.print("Federal tax is ");
				System.out.printf("%.2f", TAXADD8+TAX4*(income-LIM8));
			}
			else if(income>LIM5){
				System.out.println("Relationship Status: Married");
				System.out.println("Your taxable income is "+income);
				System.out.print("Federal tax is ");
				System.out.printf("%.2f", TAXADD9+TAX5*(income-LIM5));
			}
		}
	}
}
