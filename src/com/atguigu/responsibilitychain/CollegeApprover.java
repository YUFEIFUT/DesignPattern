package com.atguigu.responsibilitychain;

public class CollegeApprover extends Approver {

	public CollegeApprover(String name) {
		super(name);
	}
	
	@Override
	protected boolean canHandle(PurchaseRequest purchaseRequest) {
		return purchaseRequest.getPrice() <= 10000;
	}

}
