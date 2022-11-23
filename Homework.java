package Homework;

import java.util.Scanner;
public class Homework {
	
    public static void main(String[] args) {
    	
    	Homework hw = new Homework();
    	
        while(true){
        System.out.println("\n\nWelcome to H Cafe");
		System.out.println("==================");
		System.out.println("1 -> Order");
		System.out.println("2 -> Report");
		System.out.println("9 -> Exit");
		System.out.println("==================");

        Scanner sc = new Scanner(System.in);
		System.out.print("Your choice -> ");
		int choice = sc.nextInt();

        switch (choice) {
            case 1: 
                
                hw.Order();
                hw.menu();

                break;

            case 2:

                report();
                
                break;
            
            case 9: 
            	
            	System.out.println("Bye see you soon");
                System.exit(9);
                
                break;
        
            default:
                break;
        }
    }
    }

    private static  int SoldAmericano;
    private static int SoldLatte;
    private static int SoldCappucino;

    void Order() {
    	
		System.out.println("\nBeverage Menu"
				+"\n======================="
				+"\n1 -> Americano 40 baht"
				+"\n2 -> Latte 45 baht"
				+"\n3 -> Cappucino 50 baht"
				+"\n9 -> Quit"
				+"\n=======================");
		System.out.print("Your choice -> ");
}

    static void report(){

        System.out.println("\n****** Total Orders Today ******"
        +"\n====================================");

        if(SoldAmericano>0){
				System.out.println("Amount Americano sold : "+SoldAmericano);
        }if(SoldLatte>0){
            System.out.println("Amount Latte sold : "+SoldLatte);
        }if(SoldCappucino>0){
            System.out.println("Amount Cappucino sold : "+SoldCappucino);
        }else {
        	SoldAmericano = 0; 
        	SoldLatte =0;
        	SoldCappucino=0;
        	System.out.println("Can't sold");
        }

        System.out.println("====================================");
        int Total = (SoldAmericano+SoldLatte+SoldCappucino);
        System.out.println("Total : "+Total);
        System.out.println("====================================");

                
    }

    void menu(){
        Scanner sc = new Scanner(System.in);
        int choice2 = sc.nextInt();
			switch(choice2) {
			case 1: 
				if(choice2==1) {
					System.out.print("The number of Americano cups ->");
					int amountcup = sc.nextInt();
					int SoldAmericano=amountcup*40;
					System.out.print("**** Your bill -> "+(SoldAmericano)+" baht"+"****");
					break;
				}
			case 2: 
				if(choice2==2) {
					System.out.print("The number of Latte cups ->");
					int amountcup = sc.nextInt();
					int SoldLatte=amountcup*45;
					System.out.print("**** Your bill -> "+(SoldLatte)+" baht"+"****");
					break;
				}
			case 3: 
				if(choice2==3) {
					System.out.print("The number of Cappucino cups ->");
					int amountcup = sc.nextInt();
					int SoldCappucino=amountcup*50;
					System.out.print("**** Your bill -> "+(SoldCappucino)+" baht"+"****");
					break;
				}
			case 4:
				if(choice2==9) {
					System.out.print("Quit");
					
					break;
				}
				

        
    }

}

}
