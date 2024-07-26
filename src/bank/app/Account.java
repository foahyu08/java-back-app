package bank.app;

public class Account {
	 private String ano;
	 private String owner;
	 private int balance;
	    
	 // 생성자
	 public Account(String ano, String owner, int balance) {
		 this.ano = ano;
	     this.owner = owner;
	     this.balance = balance;
	    }
	 
	 // ano Getter
	 public String getAno() {
	        return ano;
	    }
	    
	 // owner Getter
	 public String getOwner() {
	        return owner;
	    }
	 
	// balance Getter
	    public int getBalance() {
	        return balance;
	    }
	 
	// balance Setter
	    public void setBalance(int balance) {
	    	this.balance = balance;
	    }

	}

