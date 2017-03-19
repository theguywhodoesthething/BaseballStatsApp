package data;

import java.util.Map;

public interface MLBDAO {
	
	static String[] positions = {"C","P","1B","2B","SS","3B","OF"};
	Map<String, Team> getTeams();

}
