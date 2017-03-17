package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import data.MLBDAO;
import data.Team;

@Controller
@SessionAttributes("sessionTeam")
public class MLBStatsController {

	@Autowired
	private MLBDAO mlbDAO;

	@ModelAttribute("sessionTeam")
	public Team initTeam() {
		return new Team();
	}

	public void setTeamDAO(MLBDAO t) {
		this.mlbDAO = t;
	}

	@RequestMapping(path = "welcome.do", method = RequestMethod.GET)
	public String getLeague(Model model) {
		model.addAttribute("teams", mlbDAO.getTeams().values());
		return "home";
	}

	@RequestMapping(path = "getteambyname.do", params = "name", method = RequestMethod.POST)
	public String getTeam(Model model, @RequestParam("name") String n, @ModelAttribute("sessionTeam") Team team) {

		for (Team t : mlbDAO.getTeams().values()) {
			String str = t.getAbr() + t.getCity() + t.getMascot();
			str = str.toLowerCase().trim();
			if (str.contains(n.toLowerCase())) {
				team = t;
			}
		}

		model.addAttribute("team", team);
		model.addAttribute("hitters", team.getHitterRoster());
		model.addAttribute("pitchers", team.getPitcherRoster());
		return "team";
	}

	@RequestMapping(path = "addnewteam.do", params = { "city", "mascot", "state", "league", "division",
			"picturePath" }, method = RequestMethod.POST)
	public String addTeam(Model model, String city, String mascot, String state, String league, String division,
			String picturePath) {

		Team team = new Team(city, mascot, state, league, division, picturePath);
		mlbDAO.getTeams().put(team.getAbr(), team);

		model.addAttribute("teams", mlbDAO.getTeams().values());
		return "home";
	}

	@RequestMapping(path = "removeteam.do", params = "abr", method = RequestMethod.GET)
	public String removeTeam(Model model, @RequestParam("abr") String a) {

		mlbDAO.getTeams().remove(a);
		model.addAttribute("teams", mlbDAO.getTeams().values());
		return "home";
	}

	@RequestMapping(path = "routeedit.do", params = "abr", method = RequestMethod.GET)
	public String editTeam(Model model, @RequestParam("abr") String a) {

		Team t = mlbDAO.getTeams().get(a);

		model.addAttribute("team", t);
		return "editteam";
	}
	
	@RequestMapping(path = "addplayer.do", params = "abr", method = RequestMethod.GET)
	public String addPlayer(Model model, @RequestParam("abr") String a) {
		
		Team t = mlbDAO.getTeams().get(a);
		
		model.addAttribute("team", t);
		return "addplayer";
	}

	@RequestMapping(path = "editteam.do", params = { "city", "mascot", "state", "league", "division",
			"picturePath" }, method = RequestMethod.POST)
	public String updateTeam(Model model, String city, String mascot, String state, String league, String division,
			String picturePath, @ModelAttribute("sessionTeam") Team team) {

		String str = team.getAbr();
		team = mlbDAO.getTeams().get(str);

		team.setCity(city);
		team.setMascot(mascot);
		team.setState(state);
		team.setLeague(league);
		team.setDivision(division);
		team.setPicturePath(picturePath);
		model.addAttribute("teams", mlbDAO.getTeams().values());
		return "home";
	}

	@RequestMapping(path = "retrieve.do", params = "abr", method = RequestMethod.GET)
	public String getTeamRoster(Model model, @RequestParam("abr") String a, @ModelAttribute("sessionTeam") Team team) {
		team = mlbDAO.getTeams().get(a);

		model.addAttribute("team", team);
		model.addAttribute("hitters", team.getHitterRoster());
		model.addAttribute("pitchers", team.getPitcherRoster());
		return "team";
	}
}
