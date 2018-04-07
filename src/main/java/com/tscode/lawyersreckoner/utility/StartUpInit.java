package com.tscode.lawyersreckoner.utility;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tscode.lawyersreckoner.dbHandling.DatabaseHandler;

@Component
public class StartUpInit {
  @Autowired
  DatabaseHandler databaseHandler;
  @PostConstruct
  public void init(){
	  LoggerCreation.init();
	  databaseHandler.loadDatabase();
  }
}