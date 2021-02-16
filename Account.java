public class Account{

private String name;
private double balance;
private double depositAmount;
	

	
     public Account( String name, double balance){

	this.name = name;
	this.balance = balance;

}

public void setName(String name) {
this.name = name;
}
 public String getName(){
return name;
}
 public void deposit(double depositAmount){
if (depositAmount > 0.0)
balance = balance + depositAmount;
}

public double getBalance(){
 return balance;
}






}