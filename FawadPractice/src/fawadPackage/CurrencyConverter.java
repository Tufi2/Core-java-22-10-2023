package fawadPackage;

public class CurrencyConverter {
	
	double [] exchangeRates;
	void setExchangeRates(double[] rates) {
		exchangeRates = rates;
	}
		
	void updateExchangeRate(int arrayIndex,double newVal) {
			exchangeRates[arrayIndex] = newVal;
	}
	double getExchangeRate(int arrayIndex) {
		return exchangeRates[arrayIndex];
		
}
	double computeTransferAmount(int arrayIndex, double amount) {
		return amount* getExchangeRate(arrayIndex);
	}
//    double MoneyTransferService()
	
	void printcurrencies() {
		System.out.println("\nrupee: " + exchangeRates[0]);
		System.out.println("dirham: " + exchangeRates[1]);
		System.out.println("real: " + exchangeRates[2]);
		System.out.println("chilean_pesco: " + exchangeRates[3]);
		System.out.println("maxican_pesco: " + exchangeRates[4]);
		System.out.println("_yen: " + exchangeRates[5]);
		System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]);
			
	}
	

	public static void main(String[] args) {
		CurrencyConverter obj = new CurrencyConverter();
		// Jan Ist
		double[] rates = { 63.0, 3.0, 3.0, 595.5, 10.0, 107.0, 2.0};
		obj.setExchangeRates(rates); 
		obj.printcurrencies();
		// Jan 2nd
		rates = new double[]{ 65.0, 5.0, 3.0, 595.5, 10.0, 107.0, 2.0};
		obj.setExchangeRates(rates); 
		obj.printcurrencies();
//		Update ExchangeRates
		
		obj.updateExchangeRate(0,66.0);
		obj.printcurrencies();
		
		double amount = obj.computeTransferAmount(0,1000);
		System.out.println("\nTransferred amount: " + amount);

	}

}
