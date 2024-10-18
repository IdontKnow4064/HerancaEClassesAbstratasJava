package Entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployes;

	public Company(String name, Double anualIncome, Integer numberOfEmployes) {
		super(name, anualIncome);
		this.numberOfEmployes = numberOfEmployes;
	}

	public Integer getNumberOfEmployes() {
		return numberOfEmployes;
	}

	public void setNumberOfEmployes(Integer numberOfEmployes) {
		this.numberOfEmployes = numberOfEmployes;
	}
	public Double tax() {
		if(numberOfEmployes > 10.0) {
			return anualIncome * (14.0/100.0);
		}else {
			return anualIncome * (16.0/100.0);
		}
	}
	
}
