package J4Test;

public class BankAccout {
	Double BankAccout  ;
BankAccout(){
	 BankAccout = 0.0 ;
}
BankAccout(double amount){
	BankAccout = amount ;	
}
void deposit(double amount){
	BankAccout += amount;
}
void widthdraw(double amount){
	BankAccout -= amount;
}
void transfer(BankAccout other,double amount){
	other.deposit(amount);
	widthdraw(amount);
}
double showBalance() {
	return BankAccout;
}
}
