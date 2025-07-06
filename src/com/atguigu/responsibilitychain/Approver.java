package com.atguigu.responsibilitychain;

public abstract class Approver {

	Approver approver;  //下一个处理者
	String name; // 当前处理者的名字
	
	public Approver(String name) {
		this.name = name;
	}

	//下一个处理者
	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	
	// 模板方法：处理审批请求
	public final void processRequest(PurchaseRequest purchaseRequest) {
		if (canHandle(purchaseRequest)) {
			handle(purchaseRequest);
		} else if (approver != null) {
			approver.processRequest(purchaseRequest);
		}
	}

	// 子类实现：能否处理该请求
	protected abstract boolean canHandle(PurchaseRequest purchaseRequest);

	// 默认处理逻辑，子类可覆盖
	protected void handle(PurchaseRequest purchaseRequest) {
		System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
	}
	
}
