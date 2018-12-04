package com.javainuse.model;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String  LoanNumber;

	private List<Result> result;
	private List<FPIns> fPInsList=new ArrayList<FPIns>();
	
	public List<FPIns> getfPInsList() {
		return fPInsList;
	}
	public void setfPInsList(List<FPIns> fPInsList) {
		this.fPInsList = fPInsList;
	}
	public List<Result> getResult() {
		return result;
	}
	public void setResult(List<Result> result) {
		this.result = result;
	}
	private String OriginalUPB;
	private String UPB;
	private String CloseM;
	private String CloseD;
	private String CloseY;
	private String FloodIns;
	private String Investor;
	private String LoanType; 
	private String Appraisal;
	private String EscrowAdv;
	private String Manufactured;
	
	public String getLoanNumber() {
		return LoanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		LoanNumber = loanNumber;
	}
	public String getOriginalUPB() {
		return OriginalUPB;
	}
	public void setOriginalUPB(String originalUPB) {
		OriginalUPB = originalUPB;
	}
	public String getUPB() {
		return UPB;
	}
	public void setUPB(String uPB) {
		UPB = uPB;
	}
	public String getCloseM() {
		return CloseM;
	}
	public void setCloseM(String closeM) {
		CloseM = closeM;
	}
	public String getCloseD() {
		return CloseD;
	}
	public void setCloseD(String closeD) {
		CloseD = closeD;
	}
	public String getCloseY() {
		return CloseY;
	}
	public void setCloseY(String closeY) {
		CloseY = closeY;
	}
	public String getFloodIns() {
		return FloodIns;
	}
	public void setFloodIns(String floodIns) {
		FloodIns = floodIns;
	}
	public String getInvestor() {
		return Investor;
	}
	public void setInvestor(String investor) {
		Investor = investor;
	}
	public String getLoanType() {
		return LoanType;
	}
	public void setLoanType(String loanType) {
		LoanType = loanType;
	}
	public String getAppraisal() {
		return Appraisal;
	}
	public void setAppraisal(String appraisal) {
		Appraisal = appraisal;
	}
	public String getEscrowAdv() {
		return EscrowAdv;
	}
	public void setEscrowAdv(String escrowAdv) {
		EscrowAdv = escrowAdv;
	}
	public String getManufactured() {
		return Manufactured;
	}
	public void setManufactured(String manufactured) {
		Manufactured = manufactured;
	}
	
}