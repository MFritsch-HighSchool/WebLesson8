import java.util.*;

import javax.swing.JOptionPane;

public class Weblesson8_1 {
	public static void main(String[] args){
		String dim01 = JOptionPane.showInputDialog("Enter the first dimension of the box");
		double dim1 = Double.parseDouble(dim01);
		
		String dim02 = JOptionPane.showInputDialog("Enter the second dimension of the box");
		double dim2 = Double.parseDouble(dim02);
		
		String dim03 = JOptionPane.showInputDialog("Enter the third dimension of the box");
		double dim3 = Double.parseDouble(dim03);
		
		double length = 0;
		double width = 0;
		double height = 0;
		
		String weighto = JOptionPane.showInputDialog("Enter the weight of the box");
		double weight = Double.parseDouble(weighto);
		
		if(dim1>dim2 && dim1>dim3){
			length = dim1;
			width = dim2;
			height = dim3;
		}
		if(dim2>dim1 && dim2>dim3){
			length = dim2;
			width = dim3;
			height = dim1;
		}
		if(dim3>dim1 && dim3>dim2){
			length = dim3;
			width = dim2;
			height = dim1;
		}
		if(dim1 == dim2 && dim2 == dim3){
			length = dim1;
			width = dim2;
			height = dim3;
		}
		double girth = (width+height)*2;
		System.out.println("The length is "+length);
		System.out.println("The girth is "+girth);
		System.out.println("The weight is "+weight);
		if(length+girth>=100 && weight>=70)
			System.out.println("The box is too large and too heavy for First Class");
		else if(length+girth>=100)
			System.out.println("The box is too large for First Class");
		else if(weight>=70)
			System.out.println("The box is too heavy for First Class");
		else if(length+girth<100 && weight<70)
			System.out.println("The box is ship-shape and ready for First Class");
	}
}
