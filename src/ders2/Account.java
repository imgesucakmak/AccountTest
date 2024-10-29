package ders2;

  public class Account {
	private String namesString;
	private String surnamesString;
	private int bakiye;
	
	
  public Account(String namesString,String surnamesString,int bakiye) {
    this.namesString=namesString;
    this.surnamesString=surnamesString;
    this.bakiye=bakiye;}  
			
		
  public void setName(String name) {
  	 this.namesString=name;  }
	
  	
 public void setSurname(String surname) {
  	 this.surnamesString=surname;  }    
	  
 
 public String getName() {
  	return namesString; }
  
  
public String getSurname() {
	return surnamesString; }  
  
	  
public int getBakiye() {  
        return bakiye; }  
  
 
public void depositMoney(int para) { 
         bakiye=bakiye+para; }	         }
		
		
		
	
	

	

  
