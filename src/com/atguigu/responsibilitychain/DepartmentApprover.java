package com.atguigu.responsibilitychain;

public class DepartmentApprover extends Approver {

	public DepartmentApprover(String name) {
		super(name);
	}
	
	@Override
	protected boolean canHandle(PurchaseRequest purchaseRequest) {
		return purchaseRequest.getPrice() <= 5000;
	}

}
