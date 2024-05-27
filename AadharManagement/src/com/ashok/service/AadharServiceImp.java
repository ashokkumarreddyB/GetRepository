package com.ashok.service;

import java.util.List;

import com.ashok.Dao.AadharDao;
import com.ashok.Dao.AadharDaoImp;
import com.ashok.model.Aadhar;

public class AadharServiceImp implements AadharService {
	AadharDao aadhardao = new AadharDaoImp();

	@Override
	public void saveAadharService(Aadhar aadhar) {
			aadhardao.saveAadharDao(aadhar);
	}

	@Override
	public Aadhar selectAadharByIdService(int aadharId) {
		Aadhar aadhar = aadhardao.selectAadharByIdDao(aadharId);
			aadhardao.saveAadharDao(aadhar);
		return aadhar;
	}

	@Override
	public Aadhar selectAadharByNameService(String aadharName) {
		Aadhar aadhar2 = aadhardao.selectAadharByNameDao(aadharName);	
		aadhardao.saveAadharDao(aadhar2);
		return aadhar2;
	}
	@Override
	public List<Aadhar> selectAllAadharService() {
		List<Aadhar> adarlist = aadhardao.selectAllAadharDao();
		return adarlist;
	}

	@Override
	public List<Aadhar> selectAllAadharIncomeLowToHighService() {
		// TODO Auto-generated method stub
		List<Aadhar> list1 =aadhardao.selectAllAadharIncomeLowToHighDao();
		return list1;
	}

	@Override
	public List<Aadhar> selectAllAadharIncomeHighToLowService() {
		// TODO Auto-generated method stub
			List<Aadhar> adhar = aadhardao.selectAllAadharIncomeHighToLowDao();
			return adhar;
	}

	@Override
	public void DeleteAadharByIdService(int aadharId) {
		// TODO Auto-generated method stub
		aadhardao.DeleteAadharByIdDao(aadharId);

	}

	@Override
	public Aadhar UpdateAadharService(Aadhar aadhar) {
		Aadhar aadhar4 = aadhardao.UpdateAadharDao(aadhar);
		return aadhar4;
	}
}
