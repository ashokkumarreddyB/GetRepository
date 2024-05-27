package com.ashok.service;

import java.util.List;

import com.ashok.model.Aadhar;

public interface AadharService {
	public void saveAadharService(Aadhar aadhar);
	public Aadhar selectAadharByIdService(int aadharId);
	public Aadhar selectAadharByNameService(String aadharName);
	public List<Aadhar>selectAllAadharService();
	public List<Aadhar>selectAllAadharIncomeLowToHighService();
	public List<Aadhar>selectAllAadharIncomeHighToLowService();
	public void DeleteAadharByIdService(int aadharId);
	public Aadhar UpdateAadharService(Aadhar aadhar);

}
