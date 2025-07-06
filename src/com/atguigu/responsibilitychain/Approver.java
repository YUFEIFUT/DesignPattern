package com.atguigu.responsibilitychain;

public abstract class Approver {

	Approver approver;  //��һ��������
	String name; // ��ǰ�����ߵ�����
	
	public Approver(String name) {
		this.name = name;
	}

	//��һ��������
	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	
	// ģ�巽����������������
	public final void processRequest(PurchaseRequest purchaseRequest) {
		if (canHandle(purchaseRequest)) {
			handle(purchaseRequest);
		} else if (approver != null) {
			approver.processRequest(purchaseRequest);
		}
	}

	// ����ʵ�֣��ܷ��������
	protected abstract boolean canHandle(PurchaseRequest purchaseRequest);

	// Ĭ�ϴ����߼�������ɸ���
	protected void handle(PurchaseRequest purchaseRequest) {
		System.out.println(" ������ id= " + purchaseRequest.getId() + " �� " + this.name + " ����");
	}
	
}
