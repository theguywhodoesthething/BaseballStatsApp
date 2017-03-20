package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

public class MLBDAOImpl implements MLBDAO {
	private static final String TEAMS_FILE_NAME = "/WEB-INF/Teams.csv";
	private static final String HITTERS_FILE_NAME = "/WEB-INF/Hitters.csv";
	private static final String PITCHERS_FILE_NAME = "/WEB-INF/Pitchers.csv";
	private static final String PRE_PATH = "http://mlb.mlb.com/mlb/images/team_logos/logo_";
	private static final String POST_PATH = "_79x76.jpg";
	
	private Map<String, Team> teams = new TreeMap<>();

	@Autowired
	private WebApplicationContext wac;

	@PostConstruct
	public void init() {

		try (InputStream is = wac.getServletContext().getResourceAsStream(TEAMS_FILE_NAME);
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				String city = tokens[0];
				String mascot = tokens[1];
				String state = tokens[2];
				String stadium = tokens[3];
				Integer capacity = Integer.parseInt(tokens[4]);
				String league = tokens[5];
				String division = tokens[6];
				String abr = tokens[7].toUpperCase();
				String picturePath = PRE_PATH + tokens[7] + POST_PATH;
				Team t = new Team(city, mascot, state, stadium, capacity,
						league, division, abr, picturePath);
				teams.put(abr, t);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		try (InputStream is = wac.getServletContext().getResourceAsStream(HITTERS_FILE_NAME);
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				String lastName = tokens[0].trim();
				String firstName = tokens[1].trim();
				String team = tokens[2];
				String pos = tokens[3];
				Integer g = Integer.parseInt(tokens[4]);
				Integer ab = Integer.parseInt(tokens[5]);
				Double ppPerA = Double.parseDouble(tokens[6]);
				Integer bunts = Integer.parseInt(tokens[7]);
				Integer gidp = Integer.parseInt(tokens[8]);
				Integer ibb = Integer.parseInt(tokens[9]);
				Integer bb = Integer.parseInt(tokens[10]);
				Integer k = Integer.parseInt(tokens[11]);
				Double bbPercentage = Double.parseDouble(tokens[12]);
				Double bbPerK = Double.parseDouble(tokens[13]);
				Double ctPercentage = Double.parseDouble(tokens[14]);
				Double sboPercentage = Double.parseDouble(tokens[15]);
				Double avg = Double.parseDouble(tokens[16]);
				Double babip = Double.parseDouble(tokens[17]);
				Player p = new Hitter(firstName, lastName, team, pos, g, ab, ppPerA, 
						bunts, gidp, ibb, bb, k, bbPercentage, bbPerK, ctPercentage, 
						sboPercentage, avg, babip);

				teams.get(tokens[2]).addPlayerToRoster(p);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		
		try (InputStream is = wac.getServletContext().getResourceAsStream(PITCHERS_FILE_NAME);
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
			String line = buf.readLine();
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				String lastName = tokens[0].trim();
				String firstName = tokens[1].trim();
				String team = tokens[2];
				Integer g = Integer.parseInt(tokens[3]);
				Double ip = Double.parseDouble(tokens[4]);
				Integer gs = Integer.parseInt(tokens[5]);
				Integer qs = Integer.parseInt(tokens[6]);
				Double qsPercentage = Double.parseDouble(tokens[7]);
				Double kPerBb = Double.parseDouble(tokens[8]);
				Double kPer9 = Double.parseDouble(tokens[9]);
				Double bbPer9 = Double.parseDouble(tokens[10]);
				Double hrPer9 = Double.parseDouble(tokens[11]);
				Double babip = Double.parseDouble(tokens[12]);
				Double strPercentage = Double.parseDouble(tokens[13]);
				Double fbmph = Double.parseDouble(tokens[14]);
				Double era = Double.parseDouble(tokens[15]);
				Double fip = Double.parseDouble(tokens[16]);
				Player p = new Pitcher(lastName, firstName, team, g, ip, gs, qs, qsPercentage, 
						kPerBb, kPer9, bbPer9, hrPer9, babip, strPercentage, fbmph, era, fip);

				teams.get(tokens[2]).addPlayerToRoster(p);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	@Override
	public Map<String,Team> getTeams() {
		return teams;
	}

}
