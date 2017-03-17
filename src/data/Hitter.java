package data;

public class Hitter implements Player{

	private String firstName;
	private String lastName;
	private String team;
	private String pos;
	private Integer g;
	private Integer ab;
	private Double ppPerA;
	private Integer bunts;
	private Integer gidp;
	private Integer ibb;
	private Integer bb;
	private Integer k;
	private Double bbPercentage;
	private Double bbPerK;
	private Double ctPercentage;
	private Double sboPercentage;
	private Double avg;
	private Double babip;
	
	public Hitter(){}
	
	public Hitter(String lastName, String firstName, String team, String pos) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.team = team;
		this.pos = pos;
	}

	public Hitter(String firstName, String lastName, String team, String pos, Integer g, Integer ab, Double ppPerA,
			Integer bunts, Integer gidp, Integer ibb, Integer bb, Integer k, Double bbPercentage, Double bbPerK,
			Double ctPercentage, Double sboPercentage, Double avg, Double babip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.pos = pos;
		this.g = g;
		this.ab = ab;
		this.ppPerA = ppPerA;
		this.bunts = bunts;
		this.gidp = gidp;
		this.ibb = ibb;
		this.bb = bb;
		this.k = k;
		this.bbPercentage = bbPercentage;
		this.bbPerK = bbPerK;
		this.ctPercentage = ctPercentage;
		this.sboPercentage = sboPercentage;
		this.avg = avg;
		this.babip = babip;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public Integer getG() {
		return g;
	}

	public void setG(Integer g) {
		this.g = g;
	}

	public Integer getAb() {
		return ab;
	}

	public void setAb(Integer ab) {
		this.ab = ab;
	}

	public Double getPpPerA() {
		return ppPerA;
	}

	public void setPpPerA(Double ppPerA) {
		this.ppPerA = ppPerA;
	}

	public Integer getBunts() {
		return bunts;
	}

	public void setBunts(Integer bunts) {
		this.bunts = bunts;
	}

	public Integer getGidp() {
		return gidp;
	}

	public void setGidp(Integer gidp) {
		this.gidp = gidp;
	}

	public Integer getIbb() {
		return ibb;
	}

	public void setIbb(Integer ibb) {
		this.ibb = ibb;
	}

	public Integer getBb() {
		return bb;
	}

	public void setBb(Integer bb) {
		this.bb = bb;
	}

	public Integer getK() {
		return k;
	}

	public void setK(Integer k) {
		this.k = k;
	}

	public Double getBbPercentage() {
		return bbPercentage;
	}

	public void setBbPercentage(Double bbPercentage) {
		this.bbPercentage = bbPercentage;
	}

	public Double getBbPerK() {
		return bbPerK;
	}

	public void setBbPerK(Double bbPerK) {
		this.bbPerK = bbPerK;
	}

	public Double getCtPercentage() {
		return ctPercentage;
	}

	public void setCtPercentage(Double ctPercentage) {
		this.ctPercentage = ctPercentage;
	}

	public Double getSboPercentage() {
		return sboPercentage;
	}

	public void setSboPercentage(Double sboPercentage) {
		this.sboPercentage = sboPercentage;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	public Double getBabip() {
		return babip;
	}

	public void setBabip(Double babip) {
		this.babip = babip;
	}

	@Override
	public String toString() {
		return "Hitter [firstName=" + firstName + ", lastName=" + lastName + ", team=" + team + ", pos=" + pos + ", g="
				+ g + ", ab=" + ab + ", ppPerA=" + ppPerA + ", bunts=" + bunts + ", gidp=" + gidp + ", ibb=" + ibb
				+ ", bb=" + bb + ", k=" + k + ", bbPercentage=" + bbPercentage + ", bbPerK=" + bbPerK
				+ ", ctPercentage=" + ctPercentage + ", sboPercentage=" + sboPercentage + ", avg=" + avg + ", babip="
				+ babip + "]";
	}
	
}
