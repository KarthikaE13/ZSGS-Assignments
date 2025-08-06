package day_6;

public class PaymentTransaction {
private String transactionId;
private String payerName;
private String payeeName;
private double amount;
private String paymentMethod;
private String transactionStatus;

public String getTransactionId() {
	return transactionId;
	
}
public void setTransactionId(String transactionId) {
	this.transactionId= transactionId;	
}
public String getPayerName() {
	return payerName;
	
}
public void setPayerName(String payerName) {
	this.payerName=payerName;	
}

public String getPayeeName() {
	return payeeName;
}
public void setPayeeName(String payeeName) {
	this.payeeName=payeeName;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount=amount;
}
public String getPaymentMethod() {
	return paymentMethod;

}
public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod= paymentMethod;
}
public String getTransactionStatus(){
	return transactionStatus;
	
}
public void setTransactionStatus(String transactionStatus){
	this.transactionStatus=transactionStatus;
	
}
public void displayTransactionSummary() {
    System.out.println("Transaction Summary:");
    System.out.println("ID: " + transactionId);
    System.out.println("Payer: " + payerName);
    System.out.println("Payee: " + payeeName);
    System.out.println("Amount: $" + amount);
    System.out.println("Method: " + paymentMethod);
    System.out.println("Status: " + transactionStatus);
}
public static void main(String[] args) {
    PaymentTransaction pt = new PaymentTransaction();
    pt.setTransactionId("TXN123456");
    pt.setPayerName("karthi");
    pt.setPayeeName("Vasu");
    pt.setAmount(2500.75);
    pt.setPaymentMethod("UPI");
    pt.setTransactionStatus("Success");

    pt.displayTransactionSummary();
}
}
