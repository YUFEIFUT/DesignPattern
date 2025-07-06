package com.atguigu.responsibilitychain;

public class ViceSchoolMasterApprover extends Approver {

	public ViceSchoolMasterApprover(String name) {
		super(name);
	}
	
	@Override
	protected boolean canHandle(PurchaseRequest purchaseRequest) {
		return purchaseRequest.getPrice() <= 30000;
	}

}
