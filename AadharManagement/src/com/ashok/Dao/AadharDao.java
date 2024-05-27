package com.ashok.Dao;

import java.util.List;

import com.ashok.model.Aadhar;

public interface AadharDao {
	public void saveAadharDao(Aadhar aadhar);
	public Aadhar selectAadharByIdDao(int aadharId);
	public Aadhar selectAadharByNameDao(String aadharName);
	public List<Aadhar>selectAllAadharDao();
	public List<Aadhar>selectAllAadharIncomeLowToHighDao();
	public List<Aadhar>selectAllAadharIncomeHighToLowDao();
	public void DeleteAadharByIdDao(int aadharId);
	public Aadhar UpdateAadharDao(Aadhar aadhar);


}
