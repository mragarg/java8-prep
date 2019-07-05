public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	
	static double taxRate;
	
	// Static initialization block
	static {
		taxRate = 0.05;
	}
	
	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate = d;
		orderAmount = amt;
		customer = c;
		product = p;
		quantity = q;
	}
	
	public Order(MyDate d, double amt, String c){
		this.orderDate = d;
		this.orderAmount = amt;
		this.customer = c;
		this.product = "Anvil";
		quantity = 1;
	}
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
	
	// Sets the taxRate with the newRate
	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}
	
	// Returns a statement with the price with tax of an amount
	public static void computeTaxOn(double anAmount) {
		System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
	}
	
	// Computes tax for an Order Object
	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}
	
}
