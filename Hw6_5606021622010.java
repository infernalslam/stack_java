import java.awt.*;

import javax.swing.JOptionPane;
public class Hw6_5606021622010{
	public static void main (String [] args){
		Hw6_5606021622010 object = new Hw6_5606021622010(10);
		object.mainMeun();
		System.exit(0);
	}
	private String stack [];
	public Hw6_5606021622010 (int size){
		stack = new String [size];
		stack[0] = "";
		stack[1] = "";
		stack[2] = "";
		stack[3] = "";
		stack[4] = "";
		stack[5] = "";
		stack[6] = "";
		stack[7] = "";
		stack[8] = "";
		stack[9] = "";
	}
	private String choice;
	public void mainMeun () {
		do{
		choice = JOptionPane.showInputDialog(
				"MainMenu\n" +
				"1. Push Data\n" +
				"2. Pop Data\n" +
				"3. Show Store\n" +
				"4. Exit\n" +
				"input choice:>>\n"
				);
		switch (choice) {
		case	"1" :  if (isFull() == false) {
						    push();
						} else if (isFull() == true) {
							String str = "Stack list is Full";
							JOptionPane.showMessageDialog(null, str);
							count = 9;
						} 
					 break;
		case 	"2"	: if(isEmpty()== true) {
					  pop(); 
					 } else if (isEmpty() == false){
						 String str2 = "Stack list is Empty";
						 JOptionPane.showMessageDialog(null, str2);
					 }
		     		 break;
		case  	"3" : size(); break;
		}
	  }while(!"4".equals(choice));
	}
	private int count = 0;
	public  boolean isFull() {
			if (count > 9){
				return true;
			} else return false;
	}
	public void push() {
		stack[count] = JOptionPane.showInputDialog(
				"Enter Data"
				);
		String str = "Add Data to Stack list";
		JOptionPane.showMessageDialog(null, str);
		count++;
	}
	public void size () {
		String str = "";
		for (int i=0; i <= count; i++) {
			str = ""+stack[i]+"\n" + str ;
			System.out.println(i+ ":" + stack[i]);
		}
		JOptionPane.showMessageDialog(null, str);
	}
	public void pop () {
		String str = "pop data Stack value :" + stack[count-1];
	    JOptionPane.showMessageDialog(null, str);
	       stack[count-1] = "";
	       count = count - 1;
	       //System.out.println("list count" + count);
	}
	public boolean isEmpty () {
		if(count == 0) {
			return false;
		} else return true;
	}
}
