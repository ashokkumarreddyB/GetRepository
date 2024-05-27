package com.ashok.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	private static Connection connection;
	private static Properties properties;

	static {
		properties = new Properties();
		try {
			properties.load(new FileInputStream(new File("C:\\properties\\databaseproperties.properties")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		try {

			connection = DriverManager.getConnection(properties.getProperty("databaseUrl"),
					properties.getProperty("databaseUsername"), properties.getProperty("databasePassword"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	public static void closeConnection() {
		try {
			if (connection != null) {
				connection.close();
				System.out.println("Connection closed successfully");
			} else {
				System.out.println("Connection is null: You cannot close it");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
