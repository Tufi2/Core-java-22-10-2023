package fawadPackage;

import java.time.LocalDate;

public class CarPriceEstimator {
	
	public double getSalePrice(String makeAndModel,int yearManufactured ,double milesDriven,double expectedMilesdriven, double additionalMiles,boolean hasAbs, boolean hasEbd,
			 boolean hasRearViewCamera,int airBagsCount,boolean hasSunRoof, boolean hasAutoAc, boolean hasAccidentHistory ) {
		
	
	double salePrice = getPrice(makeAndModel,yearManufactured);
	int currentYear = LocalDate.now().getYear();
	int ageOfCar = currentYear - yearManufactured +1;
	System.out.println("ageOfCar: " + ageOfCar);
	
	
	
	     
	//  1. Compute based on yearly depreciation value:
    //2. if age of car is less than or equal to 10 the
    //	 price depreciates by 5% of original sale price every year
    //	e.g,.. if original price is 10000, then for 3 year old car
    //	   price depreciated would be 1500,. sale price would be 8500
   //	 else
   //	 return salePrice * 0.1(i.e., 10% of current salePrice)
   //	Note: Use compound arithmetic assignment opertors.
	
	if (ageOfCar <= 10) {
		salePrice = salePrice - (ageOfCar * salePrice * 0.05);
	} else {
		return salePrice * 0.1;
	}
	
	 System.out.println("salePrice after depreciation: " + salePrice);
	  
//	 2. security Features
//	 if car does NOT have atleast two airbags AND abs AND ebd
//	 then reduce price by $1000
	 
	 if (!(airBagsCount >= 2 && hasAbs && hasEbd)) {
		 salePrice -= 1000;
	 }
	 
	 System.out.println("salePrice after accounting for comfort features: " + salePrice);
	 
//	 3. Comfort Features
//	 if car has rear-view camera AND either sunroof OR auto AC then
//	 increment price by $500
	 
	 if (hasRearViewCamera && (hasSunRoof || hasAutoAc)) {
		 salePrice += 500;
	 }
	 
	 System.out.println("sale after accounting for comfort features: " + salePrice);
	 
//	  4. Past accidents 
//	 if car was involved in an accident then
//	 reduce price by $500
	 
	if(hasAccidentHistory) {
		salePrice -= 500;
	}

	 System.out.println("salePrice after accounting for past accidents: " + salePrice);
	 
//5. Based on additional miles driven
	 
	 double expectedDriven = ageOfCar * 10000.0;
	 double additonalMiles = milesDriven - expectedMilesdriven;
	 
// a) if miles over driven is greater than 1000 AND less than or equal to 100000
//	 then reduce sale price by 500
	 
	 if(additionalMiles > 1000 && additionalMiles <= 10000) {
		 salePrice -= 500;
	 }
	 
//	 b) if miles over driven is greater than 10000 AND less than or equal to 30000 then 
//	 reduce sale price by 100
       
	  if(additionalMiles > 10000 && additionalMiles <= 30000) {
		  salePrice -= 100;
	  }
	 
//	 c) if miles over driven is greater than 30000 then
//	   reduce sale price by 1500
	  
	  if(additionalMiles > 3000) {
		  salePrice -= 1500;
	  }
	  
	 System.out.println("salePrice after accounting for miles riven: "  + salePrice);
	  return salePrice;
	}
	
	private double getPrice(String makeAndModel, int yearManufactured) {
		if(makeAndModel.equalsIgnoreCase("ford ecosport")) {
			return 20000.0;
		} else if (makeAndModel.equalsIgnoreCase("honda city")) {
			return 25000.0;
		} else if (makeAndModel.equalsIgnoreCase("toyota camry hybrid")) {
			return 30000.0;
		}
		return 20000.0;
		}
	
	 public static void main(String[] args) {
		 CarPriceEstimator carPriceEstimator = new CarPriceEstimator();
		 double salePrice = carPriceEstimator.getSalePrice("ford ecosport", 2018,200000.0, 2, true, false, true, 0, false, false, false);
		

	}

}
