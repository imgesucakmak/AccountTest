package ders2;

public class Account {
	private String namesString;
	private String surnamesString;
	private int bakiye;
	
    public Account(String namesString,String surnamesString,int bakiye) {
    	this.namesString=namesString;
    	this.surnamesString=surnamesString;
    	if(bakiye<0)
    		System.out.println("Bakiye sifir olamaz!");
    	else {
			this.bakiye=bakiye;
		}
    	
    	
		
	}
    public void setName(String name) {
    	this.namesString=name;
    	
    }
    public String getName() {
    	return namesString;
    }

	public int getBakiye() {
		return bakiye;
	}
	public void depositMoney(int para) {
		bakiye=bakiye+para;
	}
	public String getSurname() {
		return surnamesString;
    	
    	
    }
    public void setSurname(String surname) {
    	
      this.surnamesString=surname;
    }
	
}
