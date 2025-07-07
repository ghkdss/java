package 연습;

import java.util.Scanner;

public class MovieTicketMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MovieTicket ticket = new MovieTicket(12000);
		
		while(true) {
			System.out.println("[1] 예매하기");
			System.out.println("[2] 종료하기");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				ticket.selectSeat();
				break;
			case 2:
				int tot = ticket.totalAmount();
				System.out.println(tot);
				System.exit(0);
				break;
			}
		}
		
	}
}










