package com.training.myexceptions;

public class Customer {

	private int customerId;
	private String customerName;
	private String email_Id;
	private long handPhone;
	
	
	
	public Customer() {
		super();
	}

	//Declare Rule
	
	public Customer(int customerId, String customerName, String email_Id, long handPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email_Id = email_Id;
		if(handPhone>999999999L || handPhone<1111111111L){
			try{
				throw new RangeCheckException(handPhone);
			}catch(RangeCheckException e){
				System.out.println(e.getMessage());
			}
		}
		else
		{
			this.handPhone = handPhone;
		}
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) throws RangeCheckException {
		
		if(handPhone>9999999999L)
		{
			throw new RangeCheckException(handPhone);
		}
		else
		{
			this.handPhone = handPhone;
		}
	}
	
	public String showCustomer(){
		
		String custDetails = customerId + " : " + customerName + " : " + email_Id + " : " + handPhone;
		
		return custDetails;
		
	}

	
}