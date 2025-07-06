package com.atguigu.responsibilitychain;

public class Client {

	public static void main(String[] args) {
		//����һ������
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 7000, 1);
		
		//������ص�������
		DepartmentApprover departmentApprover = new DepartmentApprover("������");
		CollegeApprover collegeApprover = new CollegeApprover("��Ժ��");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("����У");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("١У��");

		//��Ҫ�����������������һ�����ú� (�����˹��ɻ���: )
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);

		//���������㽻���������е�һ���˴�����Ϊ�Ѿ����ɻ���
		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}

}
