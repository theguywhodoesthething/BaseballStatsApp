package data;

public class Pitcher implements Player {

	private String lastName;
	private String firstName;
	private String team;
	private Integer g;
	private Double ip;
	private Integer gs;
	private Integer qs;
	private Double qsPercentage;
	private Double kPerBb;
	private Double kPer9;
	private Double bbPer9;
	private Double hrPer9;
	private Double babip;
	private Double strPercentage;
	private Double fbmph;
	private Double era;
	private Double fip;
	
	public Pitcher(){};

	public Pitcher(String lastName, String firstName, String team, Integer g, Double ip, Integer gs, Integer qs,
			Double qsPercentage, Double kPerBb, Double kPer9, Double bbPer9, Double hrPer9, Double babip,
			Double strPercentage, Double fbmph, Double era, Double fip) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.team = team;
		this.g = g;
		this.ip = ip;
		this.gs = gs;
		this.qs = qs;
		this.qsPercentage = qsPercentage;
		this.kPerBb = kPerBb;
		this.kPer9 = kPer9;
		this.bbPer9 = bbPer9;
		this.hrPer9 = hrPer9;
		this.babip = babip;
		this.strPercentage = strPercentage;
		this.fbmph = fbmph;
		this.era = era;
		this.fip = fip;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getG() {
		return g;
	}

	public void setG(Integer g) {
		this.g = g;
	}

	public Double getIp() {
		return ip;
	}

	public void setIp(Double ip) {
		this.ip = ip;
	}

	public Integer getGs() {
		return gs;
	}

	public void setGs(Integer gs) {
		this.gs = gs;
	}

	public Integer getQs() {
		return qs;
	}

	public void setQs(Integer qs) {
		this.qs = qs;
	}

	public Double getQsPercentage() {
		return qsPercentage;
	}

	public void setQsPercentage(Double qsPercentage) {
		this.qsPercentage = qsPercentage;
	}

	public Double getkPerBb() {
		return kPerBb;
	}

	public void setkPerBb(Double kPerBb) {
		this.kPerBb = kPerBb;
	}

	public Double getkPer9() {
		return kPer9;
	}

	public void setkPer9(Double kPer9) {
		this.kPer9 = kPer9;
	}

	public Double getBbPer9() {
		return bbPer9;
	}

	public void setBbPer9(Double bbPer9) {
		this.bbPer9 = bbPer9;
	}

	public Double getHrPer9() {
		return hrPer9;
	}

	public void setHrPer9(Double hrPer9) {
		this.hrPer9 = hrPer9;
	}

	public Double getBabip() {
		return babip;
	}

	public void setBabip(Double babip) {
		this.babip = babip;
	}

	public Double getStrPercentage() {
		return strPercentage;
	}

	public void setStrPercentage(Double strPercentage) {
		this.strPercentage = strPercentage;
	}

	public Double getFbmph() {
		return fbmph;
	}

	public void setFbmph(Double fbmph) {
		this.fbmph = fbmph;
	}

	public Double getEra() {
		return era;
	}

	public void setEra(Double era) {
		this.era = era;
	}

	public Double getFip() {
		return fip;
	}

	public void setFip(Double fip) {
		this.fip = fip;
	}

	@Override
	public String toString() {
		return "Pitcher [lastName=" + lastName + ", firstName=" + firstName + ", team=" + team + ", g=" + g + ", ip="
				+ ip + ", gs=" + gs + ", qs=" + qs + ", qsPercentage=" + qsPercentage + ", kPerBb=" + kPerBb
				+ ", kPer9=" + kPer9 + ", bbPer9=" + bbPer9 + ", hrPer9=" + hrPer9 + ", babip=" + babip
				+ ", strPercentage=" + strPercentage + ", fbmph=" + fbmph + ", era=" + era + ", fip=" + fip + "]";
	}
}
