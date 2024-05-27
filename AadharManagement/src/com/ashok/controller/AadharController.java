package com.ashok.controller;

import java.util.List;
import java.util.Scanner;
import com.ashok.model.Address;
import com.ashok.model.Address;
import com.ashok.model.Aadhar;
import com.ashok.model.Aadhar;
import com.ashok.model.Aadhar;
import com.ashok.model.Address;
import com.ashok.service.AadharService;
import com.ashok.service.AadharServiceImp;

public class AadharController {
	
	public static void main(String[] args) {		
		AadharService aadharservice = new AadharServiceImp();
		System.out.println("Enter the action you wannt to perform");
		Scanner sc = new Scanner(System.in);
//		while(true) {	
		System.out.println("1.Add Aadhar Details");
		System.out.println("2.Select Aadhar by id");
		System.out.println("3.Select Aadhar by name");
		System.out.println("4.Select All Aadhars ");
		System.out.println("5.Select all Aadhar by Income low to high");
		System.out.println("6.Select all Aadhar by Income high to low");
		System.out.println("7.Delete Aadhar By using Id");
		System.out.println("8.Update Aadhar By using Id");
		int choice = sc.nextInt();
		switch (choice) {
		
		case 1:
			System.out.println("Enter Aadhar Details ");
			Aadhar aadhar = new Aadhar();
			Address address = new Address();
		System.out.println("Enter the adharId");
		aadhar.setAdharId(sc.nextInt());
		System.out.println("Enter the AadharHolderName");
		aadhar.setAadharHolderName(sc.next());
		System.out.println("Enter the Age");
	    aadhar.setAge(sc.nextInt());
	    System.out.println("Enter the Gender");
	    aadhar.setGender(sc.next().charAt(0));
	    System.out.println("Enter the Income");
	    aadhar.setIncome(sc.nextDouble());
	    System.out.println("Enter the Village");
	    address.setVillage(sc.next());
	    System.out.println("Enter the Mandal");
	    address.setMandal(sc.next());
	    System.out.println("Enter the District");
	    address.setDistrict(sc.next());
	    System.out.println("Enter the State");
	    address.setState(sc.next());
	    System.out.println("Enter the Pincode");
	    address.setPincode(sc.nextLong());
	    aadhar.setAddress(address);
	    aadharservice.saveAadharService(aadhar);
	    break;
		case 2: System.out.println("Enter the adhar details by using Aadharid");
				int id = sc.nextInt();
				Aadhar selectedaadhar = aadharservice.selectAadharByIdService(id);
				System.out.println(selectedaadhar);
				break;
		case 3: System.out.println("Enter the adhar details by using AdharHolderName");
				String name =sc.next();
				Aadhar selectaadhar = aadharservice.selectAadharByNameService(name);
				System.out.println(selectaadhar);
				break;
		case 4: System.out.println("Enter the all adhars");
				List<Aadhar> las = aadharservice.selectAllAadharService();
				for(Aadhar list:las) {
					System.out.println(list);
				}
				break;
		case 5:	System.out.println("select all adhars income from low to high ");
				List<Aadhar> adharlist = aadharservice.selectAllAadharIncomeLowToHighService();
				for(Aadhar ls :adharlist) {
					System.out.println(ls);
				}
				break;
		case 6: System.out.println("select all adhars income from high to low ");
				List<Aadhar> adharlist1 = aadharservice.selectAllAadharIncomeHighToLowService();
				for(Aadhar ls :adharlist1) {
					System.out.println(ls);
				}
				break;
		case 7: System.out.println("delete adhar by using adharId");
				System.out.println("delete adharId");
				System.out.println("enter the adharId");
				int deleteid = sc.nextInt();
				aadharservice.DeleteAadharByIdService(deleteid);
				break;
		case 8:System.out.println("If you want to update , find the aadhars below");
				System.out.println("Please enter the adharId to update");
				int modifyaadharId  = sc.nextInt();
				Aadhar modifyingAadhardetails = aadharservice.selectAadharByIdService(modifyaadharId);
				System.out.println(modifyingAadhardetails);
				System.out.println("Enter the new aadharholdername to update");
				String newName = sc.next();
				modifyingAadhardetails.setAadharHolderName(newName);
				System.out.println("Enter the age to update");
				int age = sc.nextInt();
				modifyingAadhardetails.setAge(age);
				Aadhar modifiedAadhar = aadharservice.UpdateAadharService(modifyingAadhardetails);
				System.out.println(modifiedAadhar);
				break;
				
		}
		}
//	}
}
