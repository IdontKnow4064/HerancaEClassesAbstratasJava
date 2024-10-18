package Entities;

public class individual extends TaxPayer{
	
	private Double healthExpenditures;

	public individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	public Double tax() {
		if(anualIncome < 20000.00) {
			return anualIncome * (15.0/100.0)-(getHealthExpenditures() *(50/100));
		}else {
			return anualIncome * (25.0/100.0)-(getHealthExpenditures() *(50/100));
		}
	}

}
