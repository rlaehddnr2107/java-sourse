package project;

public class TeslaDTO {
private String teslamodle3;


public TeslaDTO(String teslamodle3) {
	super();
	this.teslamodle3 = teslamodle3;


}
public TeslaDTO() {
	super();
}
public String getTeslamodle3() {
	return teslamodle3;
}
public void setTeslamodle3(String teslamodle3) {
	this.teslamodle3 = teslamodle3;
}
@Override
public String toString() {
	return "TeslaDTO [teslamodle3=" + teslamodle3 + "]";
}




}


