/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_008 {
	public static void main(String[] args){
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		int[][] brackets = {
				{8350, 33950, 82250, 171550, 372950},
				{16700, 67900, 137050, 20885, 372950},
				{8350, 33950, 68525, 104425, 186475},
				{11950, 45500, 117450, 190200, 372950}
		};
		
		Tax t1 = new Tax(0, brackets, rates, 50000);
		Tax t2 = new Tax(1, brackets, rates, 50000);
		Tax t3 = new Tax(2, brackets, rates, 50000);
		Tax t4 = new Tax(3, brackets, rates, 50000);
		
		for(int i = 0; i <= 10; i++){
			t1.setTaxableIncome(t1.getTaxableIncome() + 1000 * i);
			System.out.println("The people's status is " + t1.getFilingStatus() + ", the tax is " + t1.getTax());;
		}
		System.out.println();
		for(int i = 0; i <= 10; i++){
			t2.setTaxableIncome(t2.getTaxableIncome() + 1000 * i);
			System.out.println("The people's status is " + t2.getFilingStatus() + ", the tax is " + t2.getTax());;
		}
		System.out.println();
		for(int i = 0; i <= 10; i++){
			t3.setTaxableIncome(t3.getTaxableIncome() + 1000 * i);
			System.out.println("The people's status is " + t3.getFilingStatus() + ", the tax is " + t3.getTax());;
		}
		System.out.println();
		for(int i = 0; i <= 10; i++){
			t4.setTaxableIncome(t4.getTaxableIncome() + 1000 * i);
			System.out.println("The people's status is " + t4.getFilingStatus() + ", the tax is " + t4.getTax());;
		}
	}

}

class Tax{
	private int filingStatus;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;
	
	public Tax(){
		
	}
	
	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
	
	public int getFilingStatus(){
		return filingStatus;
	}
	
	public void setFilingStatus(int filingStatus){
		this.filingStatus = filingStatus;
	}
	
	public int[][] getBrackets(){
		return brackets;
	}
	
	public void setBrackets(int[][] brackets){
		this.brackets = brackets;
	}
	
	public double[] getRates(){
		return rates;
	}
	
	public void setRates(double[] rates){
		this.rates = rates;
	}
	
	public double getTaxableIncome(){
		return taxableIncome;
	}
	
	public void setTaxableIncome(double taxableIncome){
		this.taxableIncome = taxableIncome;
	}
	
	public double getTax(){
		double tax = 0;
		int status = this.getFilingStatus();
		double income = this.getTaxableIncome();
		if(status == 0){
			if(income <= brackets[0][0]){
				tax = income * rates[0];
			}else if(income <= brackets[0][1]){
				tax = brackets[0][0] * rates[0] + (income - brackets[0][1]) * rates[1];
			}else if(income <= brackets[0][2]){
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] + (income - brackets[0][1]) * rates[2];
			}else if(income <= brackets[0][3]){
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] + (brackets[0][2] - brackets[0][1]) * rates[2] + (income - brackets[0][2]) * rates[3];
			}else if(income <= brackets[0][4]){
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] + (brackets[0][2] - brackets[0][1]) * rates[2] + (brackets[0][3] - brackets[0][2]) * rates[3] + (income - brackets[0][3]) * rates[4];
			}else{
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] + (brackets[0][2] - brackets[0][1]) * rates[2] + (brackets[0][3] - brackets[0][2]) * rates[3] + (brackets[0][4] - brackets[0][3]) * rates[4] + (income - brackets[0][4]) * rates[5];
			}
		}else if(status == 1){
			if(income <= brackets[1][0]){
				tax = income * rates[0];
			}else if(income <= brackets[1][1]){
				tax = brackets[1][0] * rates[0] + (income - brackets[1][1]) * rates[1];
			}else if(income <= brackets[1][2]){
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] + (income - brackets[1][1]) * rates[2];
			}else if(income <= brackets[1][3]){
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] + (brackets[1][2] - brackets[1][1]) * rates[2] + (income - brackets[1][2]) * rates[3];
			}else if(income <= brackets[1][4]){
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] + (brackets[1][2] - brackets[1][1]) * rates[2] + (brackets[1][3] - brackets[1][2]) * rates[3] + (income - brackets[1][3]) * rates[4];
			}else{
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] + (brackets[1][2] - brackets[1][1]) * rates[2] + (brackets[1][3] - brackets[1][2]) * rates[3] + (brackets[1][4] - brackets[1][3]) * rates[4] + (income - brackets[1][4]) * rates[5];
			}
		}else if(status == 2){
			if(income <= brackets[2][0]){
				tax = income * rates[0];
			}else if(income <= brackets[2][1]){
				tax = brackets[2][0] * rates[0] + (income - brackets[2][1]) * rates[1];
			}else if(income <= brackets[2][2]){
				tax = brackets[2][0] * rates[0] + (brackets[2][1] - brackets[2][0]) * rates[1] + (income - brackets[2][1]) * rates[2];
			}else if(income <= brackets[2][3]){
				tax = brackets[2][0] * rates[0] + (brackets[2][1] - brackets[2][0]) * rates[1] + (brackets[2][2] - brackets[2][1]) * rates[2] + (income - brackets[2][2]) * rates[3];
			}else if(income <= brackets[2][4]){
				tax = brackets[2][0] * rates[0] + (brackets[2][1] - brackets[2][0]) * rates[1] + (brackets[2][2] - brackets[2][1]) * rates[2] + (brackets[2][3] - brackets[2][2]) * rates[3] + (income - brackets[2][3]) * rates[4];
			}else{
				tax = brackets[2][0] * rates[0] + (brackets[2][1] - brackets[2][0]) * rates[1] + (brackets[2][2] - brackets[2][1]) * rates[2] + (brackets[2][3] - brackets[2][2]) * rates[3] + (brackets[2][4] - brackets[2][3]) * rates[4] + (income - brackets[2][4]) * rates[5];
			}
		}else if(status == 3){
			if(income <= brackets[3][0]){
				tax = income * rates[0];
			}else if(income <= brackets[3][1]){
				tax = brackets[3][0] * rates[0] + (income - brackets[3][1]) * rates[1];
			}else if(income <= brackets[3][2]){
				tax = brackets[3][0] * rates[0] + (brackets[3][1] - brackets[3][0]) * rates[1] + (income - brackets[3][1]) * rates[2];
			}else if(income <= brackets[3][3]){
				tax = brackets[3][0] * rates[0] + (brackets[3][1] - brackets[3][0]) * rates[1] + (brackets[3][2] - brackets[3][1]) * rates[2] + (income - brackets[3][2]) * rates[3];
			}else if(income <= brackets[3][4]){
				tax = brackets[3][0] * rates[0] + (brackets[3][1] - brackets[3][0]) * rates[1] + (brackets[3][2] - brackets[3][1]) * rates[2] + (brackets[3][3] - brackets[3][2]) * rates[3] + (income - brackets[3][3]) * rates[4];
			}else{
				tax = brackets[3][0] * rates[0] + (brackets[3][1] - brackets[3][0]) * rates[1] + (brackets[3][2] - brackets[3][1]) * rates[2] + (brackets[3][3] - brackets[3][2]) * rates[3] + (brackets[3][4] - brackets[3][3]) * rates[4] + (income - brackets[3][4]) * rates[5];
			}
		}else{
			System.out.println("Error: invalid status");
			System.exit(0);
		}
		
		return tax;
	}
}
