package Tp3_1_2;

import java.io.Serializable;

public class Operation implements Serializable {
	private int op1;
	private int op2;
	private int res;
	private char oper;
	
	public Operation(int op1, int op2, char oper) {
		this.op1 = op1;
		this.op2 = op2;
		this.oper = oper;
	}
	public int getOp1() {
		return op1;
	}
	public void setOp1(int op1) {
		this.op1 = op1;
	}
	public int getOp2() {
		return op2;
	}
	public void setOp2(int op2) {
		this.op2 = op2;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	public char getOper() {
		return oper;
	}
	public void setOper(char oper) {
		this.oper = oper;
	}
	
	

}
