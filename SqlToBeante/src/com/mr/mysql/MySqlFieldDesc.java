package com.mr.mysql;


public class MySqlFieldDesc {
public static void main(String[] args) {
	String str ="comment on column C_TB_ReportPoints.XT_LRSJ is 'bbb'";
	
	String[] ss = str.split("is");
	for (String string : ss) {
		
		System.out.println(string);
}
	}
	public void gettablesql(String sqlc){
		String str = "";
		String[] ss = str.split(",");
		for (String string : ss) {
			System.out.println(string);
	}
	}
	public void gettablecommet(String comment){
		String str =" comment on column C_TB_ReportPoints.XT_LRSJ is 'aaa'";
		String regex= "['']";
		String[] ss = str.split(regex);
		for (String string : ss) {
			System.out.println(string);
	}
		
		
	}
	








}
	
