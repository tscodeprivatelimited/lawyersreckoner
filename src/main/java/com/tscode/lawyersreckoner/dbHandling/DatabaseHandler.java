package com.tscode.lawyersreckoner.dbHandling;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com.tscode.lawyersreckoner.models.Case;
import com.tscode.lawyersreckoner.models.CaseHistories;
import com.tscode.lawyersreckoner.models.CaseHistory;
import com.tscode.lawyersreckoner.models.Cases;
import com.tscode.lawyersreckoner.models.Client;
import com.tscode.lawyersreckoner.models.Clients;
import com.tscode.lawyersreckoner.utility.LoggerCreation;

@Service
public class DatabaseHandler {

	String casepath = "";
	String clientpath = "";
	String caseHistorypath = "";
	Cases cases = new Cases();

	Clients clients = new Clients();

	CaseHistories caseHistories = new CaseHistories();

	Map<String, Case> caseMap = new HashMap<>();

	Map<String, Client> clientMap = new HashMap<>();

	Map<String, CaseHistory> caseHistoryMap = new HashMap<>();

	public boolean isUpdated = false;

	private String home = System.getProperty("user.home");

	public void loadDatabase() {
		// TODO Auto-generated method stub
		casepath = this.home + File.separator + "tscode" + File.separator + "LawyersReckoner"
				+ File.separator + "db" + File.separator + "cases.xml";

		clientpath = this.home + File.separator + "tscode" + File.separator + "LawyersReckoner"
				+ File.separator + "db" + File.separator + "clients.xml";


		caseHistorypath = this.home + File.separator + "tscode" + File.separator + "LawyersReckoner"
				+ File.separator + "db" + File.separator + "caseHistory.xml";
		

		
		loadCases();
		loadCaseHistories();
		loadClients();
		createMaps();
		createDirs();
	}

	private void createDirs() {
		try {
			File file= new File(this.casepath);
			if (!file.exists()) {
				file.mkdirs();
			}
			file.createNewFile();
			
			File file1= new File(this.caseHistorypath);
			if (!file1.exists()) {
				file1.mkdirs();
			}
			file.createNewFile();
			File file2= new File(this.clientpath);
			if (!file2.exists()) {
				file2.mkdirs();
			}
			file2.createNewFile();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private void createMaps() {
		if (this.cases != null) {
			List<Case> caseList = this.cases.getCase();
			if (caseList != null && !caseList.isEmpty()) {
				for (Case case1 : caseList) {
					this.caseMap.put(case1.getId(), case1);
				}
			}
		}
		if (this.clients != null) {
			List<Client> clientList = this.clients.getClient();

			if (clientList != null && !clientList.isEmpty()) {
				for (Client cl : clientList) {
					this.clientMap.put(cl.getId(), cl);
				}
			}
		}
		if (this.caseHistories != null) {
			List<CaseHistory> caseHistoryList = this.caseHistories.getCaseHistory();
			if (caseHistoryList != null && !caseHistoryList.isEmpty()) {
				for (CaseHistory case1 : caseHistoryList) {
					this.caseHistoryMap.put(case1.getId(), case1);
				}
			}
		}
	}

	private void loadClients() {
		if (!isUpdated) {
			File cleintPath = new File(clientpath);
			if (cleintPath.exists()) {
				try {
					JAXBContext context = JAXBContext.newInstance(Clients.class);
					Unmarshaller un = context.createUnmarshaller();
					Clients clientRev = (Clients) un.unmarshal(cleintPath);
					this.clients = clientRev;
				} catch (Exception e) {
					LoggerCreation.log("Failed to get Cases");
				}
			} else {
				cleintPath.mkdirs();
				this.clients = new Clients();
			}
		}
	}

	private void loadCaseHistories() {
		if (!isUpdated) {
			File caseHistoryPath = new File(caseHistorypath );
			if (caseHistoryPath.exists()) {
				try {
					JAXBContext context = JAXBContext.newInstance(CaseHistories.class);
					Unmarshaller un = context.createUnmarshaller();
					CaseHistories caseHistories = (CaseHistories) un.unmarshal(caseHistoryPath);
					this.caseHistories = caseHistories;
				} catch (Exception e) {
					LoggerCreation.log("Failed to get Cases");
				}
			} else {
				caseHistoryPath.mkdirs();
				this.caseHistories = new CaseHistories();
			}
		}
	}

	private void loadCases() {
		if (!isUpdated) {
			File cases = new File(casepath);
			if (cases.exists()) {
				try {
					JAXBContext context = JAXBContext.newInstance(Cases.class);
					Unmarshaller un = context.createUnmarshaller();
					Cases casesRev = (Cases) un.unmarshal(cases);
					this.cases = casesRev;
				} catch (Exception e) {
					LoggerCreation.log("Failed to get Cases");
				}
			} else {
				cases.mkdirs();
				this.cases = new Cases();
			}
		}
	}

	public Cases getCases() {
		return cases;
	}

	public void setCases(Cases cases) {
		this.cases = cases;
	}

	public Clients getClients() {
		return clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	public CaseHistories getCaseHistories() {
		return caseHistories;
	}

	public void setCaseHistories(CaseHistories caseHistories) {
		this.caseHistories = caseHistories;
	}

	public boolean isUpdated() {
		return isUpdated;
	}

	public void setUpdated(boolean isUpdated) {
		this.isUpdated = isUpdated;
	}

	public String getDatabasePath() {
		return home;
	}

	public void setDatabasePath(String databasePath) {
		this.home = databasePath;
	}

	public Map<String, Case> getCaseMap() {
		return caseMap;
	}

	public void setCaseMap(Map<String, Case> caseMap) {
		this.caseMap = caseMap;
	}

	public Map<String, Client> getClientMap() {
		return clientMap;
	}

	public void setClientMap(Map<String, Client> clientMap) {
		this.clientMap = clientMap;
	}

	public Map<String, CaseHistory> getCaseHistoryMap() {
		return caseHistoryMap;
	}

	public void setCaseHistoryMap(Map<String, CaseHistory> caseHistoryMap) {
		this.caseHistoryMap = caseHistoryMap;
	}

	
	public  void save(String docType) {
		if (docType.equalsIgnoreCase("CASES")) {
			try {
				JAXBContext context = JAXBContext.newInstance(Cases.class);
				Marshaller m = context.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
				m.marshal(this.cases,new File(casepath));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}else if (docType.equalsIgnoreCase("CASEHISTORY")) {
			try {
				JAXBContext context = JAXBContext.newInstance(Cases.class);
				Marshaller m = context.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
				m.marshal(this.cases,new File(caseHistorypath));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}else if (docType.equalsIgnoreCase("CLIENT")) {
			try {
				JAXBContext context = JAXBContext.newInstance(Cases.class);
				Marshaller m = context.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
				m.marshal(this.cases,new File(casepath));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
				
	}
	
	public void createCase(Case case1) {
		caseMap.put(case1.getId(), case1);
		Collection<Case> values = caseMap.values();
		cases.setCase(new ArrayList<>(values));		
	}
	
	public void createCaseHistory(CaseHistory caseHist) {
		caseHistoryMap.put(caseHist.getId(), caseHist);
		Collection<CaseHistory> values = caseHistoryMap.values();
		caseHistories.setCaseHistory(new ArrayList<>(values));		
	}
	
	public void createClient(Client client) {
		clientMap.put(client.getId(), client);
		Collection<Client> values = clientMap.values();
		clients.setClient(new ArrayList<>(values));		
	}
	
	
}
