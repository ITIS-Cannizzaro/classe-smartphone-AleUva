public class Smartphone {
	private String marca;
	private String modello;
	private double przLancio;
	private double pollici;
	private int ram;
	private boolean touchScreen;
	
	public Smartphone(String marca, String modello, double przLancio, double pollici, int ram, boolean touchScreen) {
		this.marca= marca;
		this.modello = modello;
		this.przLancio = przLancio;
		this.pollici = pollici;
		this.ram = ram;
		this.touchScreen = touchScreen;
	}
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	public double getPrzLancio() {
		return przLancio;
	}
	public double getPollici() {
		return pollici;
	}
	public int getRam() {
		return ram;
	}
	public boolean getTouchScreen() {
		return touchScreen;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public void setPrzLancio(double przLancio) {
		this.przLancio = przLancio;
	}
	public void setPollici(double pollici) {
		this.pollici = pollici;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}
	public String ottieniFasciaPrz() {
		if (przLancio>500) {
			return "Fascia ALTA";
		}
		else if (przLancio<500 && przLancio>200) {
			return "Fascia MEDIA";
		}
		else {
			return "Fascia BASSA";
		}
	}
	public String ottieniTipologiaSmartphone() {
		if (pollici>7) {
			return "Maxi";
		}
		else if (pollici<7 && pollici>5) {
			return "Normal";
		}
		else {
			return "Mini";
		}
	}
	public String toString() {
		return " Smartphone("+"marca='"+marca+'\''+",modello='"+modello+'\''+",przLancio="+przLancio+",pollici='"+pollici+",ram="+ram+",touchScreen="+touchScreen+",fasciadiprezzo="+ottieniFasciaPrz()+",tipologiasmartphone="+ottieniTipologiaSmartphone()+')';
	}


	}