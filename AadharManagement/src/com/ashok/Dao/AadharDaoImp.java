package com.ashok.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ashok.model.Aadhar;
import com.ashok.model.Address;
import com.ashok.util.ConnectionUtil;
import com.ashok.util.IncomeHighToLowComparator;
import com.ashok.util.IncomeLowToHighComparator;

public class AadharDaoImp implements AadharDao {

	@Override
	public void saveAadharDao(Aadhar aadhar) {
		Connection connection = ConnectionUtil.getConnection();
		try {
			Statement stm = connection.createStatement();
			String insertAadharQuery = "insert into aadhar values(" + aadhar.getAdharId() + "," + "'"
					+ aadhar.getAadharHolderName() + "'" + "," + aadhar.getAge() + "," + "'" + aadhar.getGender() + "'"
					+ "," + aadhar.getIncome() + "," + "'" + aadhar.getAddress().getVillage() + "'" + "," + "'"
					+ aadhar.getAddress().getMandal() + "'" + "," + "'" + aadhar.getAddress().getDistrict() + "'" + ","
					+ "'" + aadhar.getAddress().getState() + "'" + "," + aadhar.getAddress().getPincode() + ")";
			stm.execute(insertAadharQuery);
			ConnectionUtil.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Aadhar selectAadharByIdDao(int adharId) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionUtil.getConnection();
		Aadhar duplicateadhar = new Aadhar();
		Address duplicateaddress = new Address();
		try {
			Statement stmt = connection.createStatement();
			String selectedQuary = "select * from aadhar where adharId = " + adharId;
			ResultSet rs = stmt.executeQuery(selectedQuary);

			while (rs.next()) {
				duplicateadhar.setAdharId(rs.getInt(1));
				duplicateadhar.setAadharHolderName(rs.getString(2));
				duplicateadhar.setAge(rs.getInt(3));
				duplicateadhar.setGender(rs.getString(4).charAt(0));
				duplicateadhar.setIncome(rs.getDouble(5));
				duplicateaddress.setVillage(rs.getString(6));
				duplicateaddress.setMandal(rs.getString(7));
				duplicateaddress.setDistrict(rs.getString(8));
				duplicateaddress.setState(rs.getString(9));
				;
				duplicateaddress.setPincode(rs.getLong(10));
				duplicateadhar.setAddress(duplicateaddress);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return duplicateadhar;
	}

	@Override
	public Aadhar selectAadharByNameDao(String aadharName) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionUtil.getConnection();
		Aadhar duplicateadhar = new Aadhar();
		Address duplicateaddress = new Address();
		try {
			Statement stmt = connection.createStatement();
			String selectedQuary = "select * from aadhar where aadharholderName = " + "'" + aadharName + "'";
			ResultSet rs = stmt.executeQuery(selectedQuary);
			while (rs.next()) {
				duplicateadhar.setAdharId(rs.getInt(1));
				duplicateadhar.setAadharHolderName(rs.getString(2));
				duplicateadhar.setAge(rs.getInt(3));
				duplicateadhar.setGender(rs.getString(4).charAt(0));
				duplicateadhar.setIncome(rs.getDouble(5));
				duplicateaddress.setVillage(rs.getString(6));
				duplicateaddress.setMandal(rs.getString(7));
				duplicateaddress.setDistrict(rs.getString(8));
				duplicateaddress.setState(rs.getString(9));
				;
				duplicateaddress.setPincode(rs.getLong(10));
				duplicateadhar.setAddress(duplicateaddress);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return duplicateadhar;

	}

	@Override
	public List<Aadhar> selectAllAadharDao() {
		// TODO Auto-generated method stub
		Connection connection = ConnectionUtil.getConnection();
		List<Aadhar> adharlist = new ArrayList<Aadhar>();
		try {
			Statement stmt = connection.createStatement();
			String selectedQuary = "select * from aadhar";
			ResultSet rs = stmt.executeQuery(selectedQuary);
			while (rs.next()) {
				Aadhar duplicateadhar = new Aadhar();
				Address duplicateaddress = new Address();
				duplicateadhar.setAdharId(rs.getInt(1));
				duplicateadhar.setAadharHolderName(rs.getString(2));
				duplicateadhar.setAge(rs.getInt(3));
				duplicateadhar.setGender(rs.getString(4).charAt(0));
				duplicateadhar.setIncome(rs.getDouble(5));
				duplicateaddress.setVillage(rs.getString(6));
				duplicateaddress.setMandal(rs.getString(7));
				duplicateaddress.setDistrict(rs.getString(8));
				duplicateaddress.setState(rs.getString(9));
				;
				duplicateaddress.setPincode(rs.getLong(10));
				duplicateadhar.setAddress(duplicateaddress);
				adharlist.add(duplicateadhar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch blockSS
			e.printStackTrace();
		}
		return adharlist;
	}

	@Override
	public List<Aadhar> selectAllAadharIncomeLowToHighDao() {
		List<Aadhar> adharlist1 = selectAllAadharDao();
		Collections.sort(adharlist1, new IncomeLowToHighComparator());
		return adharlist1;
	}

	@Override
	public List<Aadhar> selectAllAadharIncomeHighToLowDao() {
		List<Aadhar> adharlist2 = selectAllAadharDao();
		Collections.sort(adharlist2, new IncomeHighToLowComparator());
		return adharlist2;
	}

	@Override
	public void DeleteAadharByIdDao(int aadharId) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionUtil.getConnection();
		try {
			Statement stmt = connection.createStatement();
			String deleteQuary = "delete from aadhar where adharId = " + aadharId;
			stmt.execute(deleteQuary);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Aadhar UpdateAadharDao(Aadhar aadhar) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionUtil.getConnection();

		try {
			Statement stmt = connection.createStatement();
			String updateAadharQuery = "update Aadhar set aadharholdername = " + "'" + aadhar.getAadharHolderName()
					+ "'," + " age =" + aadhar.getAge() + " where adharid = " + aadhar.getAdharId();
			System.out.println(updateAadharQuery);
			stmt.execute(updateAadharQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return selectAadharByIdDao(aadhar.getAdharId());
	}

}
