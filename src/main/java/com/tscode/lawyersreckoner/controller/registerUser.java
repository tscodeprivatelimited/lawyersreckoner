package com.tscode.lawyersreckoner.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.tscode.lawyersreckoner.model.LicenseDetails;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class registerUser {
	String licensePath = System.getProperty("user.home") + "\\tsCode\\license.txt";

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public boolean register(@RequestBody LicenseDetails licenseDetails) {
		System.out.println("Inside method....!!");
		// createPropertyFile(licenseDetails);
		String licenseData = "LicenseNumber: " + licenseDetails.getLicenseNumber() + "|" + "UserName :"
				+ licenseDetails.getUserName() + "|" + "password :" + licenseDetails.getPassword() + "|"
				+ "security Que1 :" + licenseDetails.getQue1() + "|" + "Ans1 : " + licenseDetails.getAns1() + "|"
				+ "security Que2 :" + licenseDetails.getQue2() + "|" + "Ans2 : " + licenseDetails.getAns2();
		File file = new File(System.getProperty("user.home") + "\\tsCode");
		file.mkdirs();
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("tscode");
		String encrypted = encryptor.encrypt(licenseData);
		FileWriter fw = null;
		try {
			fw = new FileWriter(licensePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			bw.write(encrypted);
			bw.close();
			fw.close();
			System.out.println("Done");
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private void createPropertyFile(LicenseDetails licenseDetails) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream("config.properties");

			// set the properties value
			prop.setProperty("USERNAME", licenseDetails.getUserName());
			prop.setProperty("PASSWORD", licenseDetails.getPassword());
			prop.setProperty("LICENSE_NUMBER", licenseDetails.getLicenseNumber());
			prop.setProperty("QUE1", licenseDetails.getQue1());
			prop.setProperty("ANS1", licenseDetails.getQue2());
			prop.setProperty("QUS2", licenseDetails.getAns1());
			prop.setProperty("ANS2", licenseDetails.getAns2());
			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	@RequestMapping(value = "/getLicenseDetails", method = RequestMethod.GET)
	public LicenseDetails getLicenseDetails() throws IOException {
		// TODO Auto-generated method stub
		LicenseDetails licenseDetails = new LicenseDetails();
		String everything = "";
		File file = new File(licensePath);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(licensePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} finally {
			br.close();
		}

		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("tscode");

		String decrypted = encryptor.decrypt(everything);

		String[] details = decrypted.split("\\|");
		for (String detail : details) {
			String[] elements = detail.split(":");
			String key = elements[0];
			String value = elements[1];

			if (key.contains("LicenseNumber")) {
				licenseDetails.setLicenseNumber(value);
			}
			if (key.contains("UserName")) {
				licenseDetails.setUserName(value);
			}
			if (key.contains("password")) {
				licenseDetails.setPassword(value);
			}
			if (key.contains("security Que1")) {
				licenseDetails.setQue1(value);
			}
			if (key.contains("security Que2")) {
				licenseDetails.setQue2(value);
			}

			if (key.contains("Ans1")) {
				licenseDetails.setAns1(value);
			}
			if (key.contains("Ans2")) {
				licenseDetails.setAns2(value);
			}

		}

		System.out.println(decrypted);
		return licenseDetails;
	}

}
