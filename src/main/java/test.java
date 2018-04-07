import java.util.UUID;

import com.tscode.lawyersreckoner.dbHandling.DatabaseHandler;
import com.tscode.lawyersreckoner.models.Case;

public class test {
public static void main(String[] args) {
	DatabaseHandler databaseHandler = new DatabaseHandler();
	databaseHandler.loadDatabase();
	Case case1= new Case();
	case1.setCaseNumber(1);
	case1.setClientName("ram");
	case1.setCourtName("Karjat");
	case1.setDescription("Test");
	case1.setId(UUID.randomUUID().toString());
	case1.setOppositePartyName("shyam");
	
	databaseHandler.createCase(case1);
	databaseHandler.save("CASES");
	
}
}
