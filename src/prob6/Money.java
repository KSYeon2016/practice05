package prob6;

public class Money {
	private int n;
	
	public Money(int n){
		this.n = n;
	}
	
	public Money add(Money money){
		int amount = n+money.n;
		Money result = new Money(amount);
		return result;
	}
	
	public Money minus(Money money){
		int amount = n-money.n;
		Money result = new Money(amount);
		return result;
	}
	
	public Money multiply(Money money){
		int amount = n*money.n;
		Money result = new Money(amount);
		return result;
	}
	
	public Money devide(Money money){
		int amount = n/money.n;
		Money result = new Money(amount);
		return result;
	}

	// Generate
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + n;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Money other = (Money) obj;
//		if (n != other.n)
//			return false;
//		return true;
//	}
	
	// 직접 코딩
	public boolean equals(Object obj){
		// Money 객체가 아닐 경우 false
		if(this.getClass() != obj.getClass()){
			return false;
		}
		
		// 금액(n)이 동일하면 true
		Money other = (Money) obj;
		if(this.n == other.n){
			return true;
		}
		
		return true;
	}
	
}
