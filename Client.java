package com.epam.Logger;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client{

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		final Logger log=LogManager.getLogger(Client.class);
		int ch,principal,time;
		float rate_interest;
		log.info("Choose one\n1.Simple Interest\n2.Compound interest");
		ch=s.nextInt();
		BusinessInterest b=new BusinessInterest();
		log.info("Enter PrincipalAmount:");
		principal=s.nextInt();
		log.info("Enter Time period:");
		time=s.nextInt();
		log.info("Enter Rate Of Interest:");
		rate_interest=s.nextFloat();
		if(ch==1) {
		log.info("---------SIMPLE INTEREST---------");
		log.info("\nSimple Interest:"+b.simple_interest(principal,time,rate_interest)+"rupees");
		}
		if(ch==2) {
		log.info("---------COMPOUND INTEREST---------");
		log.info("\nCompound Interest:"+b.compound_interest(principal,time,rate_interest)+"rupees");
		}
		
		BusinessHome h=new BusinessHome();
		int area;
		log.info("\n-----HOUSE CONSTRUCTION COST-----");
		log.info("\nEnter area in square feet:");
		area=s.nextInt();
		log.info("\nSelect a Material Standard:");
		log.info("\n1.1200 INR--- Standard Materials\n2.1500 INR--- Above Standard Materials\n3.1800 INR---	High Standard Material\n4.2500 INR--- High Standard Material+Fully Automated Home");
		int c=s.nextInt();
		if(c==1){
			log.info("\nTotal Construction cost of the house with Standard Materials is "+h.construction_cost(1200,area)+"rupees");
		}
		else if(c==2){
			log.info("\nTotal Construction cost of the house with Above Standard Materials is "+h.construction_cost(1500,area)+"rupees");
		}
		else if(c==3){
			log.info("\nTotal Construction cost of the house with High Standard Materials is "+h.construction_cost(1800,area)+"rupees");
		}
		else if(c==4){
			log.info("\nTotal Construction cost of the house with High Standard Materials along with fully Automated home is "+h.construction_cost(2500,area)+"rupees");
		}
		else {
			log.info("Invalid Choice");
		}
	}
}