package com.atguigu.responsibilitychain;

public class SchoolMasterApprover extends Approver {

	public SchoolMasterApprover(String name) {
		super(name);
	}
	
	@Override
	protected boolean canHandle(PurchaseRequest purchaseRequest) {
		return true;
	}

}
