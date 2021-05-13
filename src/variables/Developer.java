package variables;

public class Developer {

	static byte numbDev;
	static final String ENTERPRISE = "EVERIS";
	String name;
	private byte vacDays = 21;
	private final byte CODEMPL;

	public Developer(String name) {
		super();
		this.name = name;
		CODEMPL = (byte) (numbDev + 1);
		numbDev++;
	}

	public byte getVacDays() {
		return this.vacDays;
	}

	public boolean setVacDays(byte days) {
		boolean sol = false;
		if (days <= 21 && days >= 0) {
			this.vacDays = days;
			sol = true;
		} else if (days > 21) {
			this.vacDays = 21;
		} else {
			this.vacDays = 0;
		}
		return sol;
	}

	// Metodo para restar varios dias de vacaciones, se le pasa por parametros el numero de dias a restar
	public byte subtractVacDays(int days) {
		if (days > 0 && days <= this.vacDays) {
			this.vacDays = (byte) (this.vacDays - days);
		} else {
			System.out.println("No tienes suficientes dias");
		}
		return this.vacDays;
	}

	// Metodo sobrecargado del anterior, en este caso no se le pasan dias por parametros y simplemente resta 1
	public byte subtractVacDays() {
		if (this.vacDays > 0) {
			this.vacDays--;
		}
		return this.vacDays;
	}

	public byte getCodEmpl() {
		return this.CODEMPL;
	}

	public static byte getNumbDev() {
		return numbDev;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	static String getEnterprise() {
		return ENTERPRISE;
	}

}
