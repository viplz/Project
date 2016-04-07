package com.lz.zd;

	/**
	**备注(数据表的comment字段)：培训需求调查基本表
	*@since 2016-03-03 15:14:02
	*/

public class C_tb_tdemandsurvey{
		
@FieldDesc("主键ID")
	private String ID;
@FieldDesc("调查主题")
	private String SURVEYTOPIC;
@FieldDesc("调查内容")
	private String SURVEYCONTENT;
@FieldDesc("发起人ID")
	private String SPONSORID;
@FieldDesc("发起人")
	private String SPONSOR;
@FieldDesc("发起部门ID")
	private String DEPARTMENTID;
@FieldDesc("发起部门")
	private String DEPARTMENT;
@FieldDesc("发起日期")
	private String STARTDATE;
@FieldDesc("调查对象")
	private String SURVEYOBJECT;
@FieldDesc("调查截止日期")
	private String DEADLINE;
@FieldDesc("备注")
	private String REMARKS;

	public String getID(){
		return this.ID;
	}
	public void setID(String ID){
		this.ID=ID;
	}
	public String getSURVEYTOPIC(){
		return this.SURVEYTOPIC;
	}
	public void setSURVEYTOPIC(String SURVEYTOPIC){
		this.SURVEYTOPIC=SURVEYTOPIC;
	}
	public String getSURVEYCONTENT(){
		return this.SURVEYCONTENT;
	}
	public void setSURVEYCONTENT(String SURVEYCONTENT){
		this.SURVEYCONTENT=SURVEYCONTENT;
	}
	public String getSPONSORID(){
		return this.SPONSORID;
	}
	public void setSPONSORID(String SPONSORID){
		this.SPONSORID=SPONSORID;
	}
	public String getSPONSOR(){
		return this.SPONSOR;
	}
	public void setSPONSOR(String SPONSOR){
		this.SPONSOR=SPONSOR;
	}
	public String getDEPARTMENTID(){
		return this.DEPARTMENTID;
	}
	public void setDEPARTMENTID(String DEPARTMENTID){
		this.DEPARTMENTID=DEPARTMENTID;
	}
	public String getDEPARTMENT(){
		return this.DEPARTMENT;
	}
	public void setDEPARTMENT(String DEPARTMENT){
		this.DEPARTMENT=DEPARTMENT;
	}
	public String getSTARTDATE(){
		return this.STARTDATE;
	}
	public void setSTARTDATE(String STARTDATE){
		this.STARTDATE=STARTDATE;
	}
	public String getSURVEYOBJECT(){
		return this.SURVEYOBJECT;
	}
	public void setSURVEYOBJECT(String SURVEYOBJECT){
		this.SURVEYOBJECT=SURVEYOBJECT;
	}
	public String getDEADLINE(){
		return this.DEADLINE;
	}
	public void setDEADLINE(String DEADLINE){
		this.DEADLINE=DEADLINE;
	}
	public String getREMARKS(){
		return this.REMARKS;
	}
	public void setREMARKS(String REMARKS){
		this.REMARKS=REMARKS;
	}
	public String getXT_CJSJ(){
		return this.XT_CJSJ;
	}
	public void setXT_CJSJ(String XT_CJSJ){
		this.XT_CJSJ=XT_CJSJ;
	}
	public String getXT_LRSJ(){
		return this.XT_LRSJ;
	}
	public void setXT_LRSJ(String XT_LRSJ){
		this.XT_LRSJ=XT_LRSJ;
	}
	public String getXT_LRRXM(){
		return this.XT_LRRXM;
	}
	public void setXT_LRRXM(String XT_LRRXM){
		this.XT_LRRXM=XT_LRRXM;
	}
	public String getXT_LRRID(){
		return this.XT_LRRID;
	}
	public void setXT_LRRID(String XT_LRRID){
		this.XT_LRRID=XT_LRRID;
	}
	public String getXT_LRRBM(){
		return this.XT_LRRBM;
	}
	public void setXT_LRRBM(String XT_LRRBM){
		this.XT_LRRBM=XT_LRRBM;
	}
	public String getXT_LRRBMID(){
		return this.XT_LRRBMID;
	}
	public void setXT_LRRBMID(String XT_LRRBMID){
		this.XT_LRRBMID=XT_LRRBMID;
	}
	public String getXT_LRIP(){
		return this.XT_LRIP;
	}
	public void setXT_LRIP(String XT_LRIP){
		this.XT_LRIP=XT_LRIP;
	}
	public String getXT_ZHXGSJ(){
		return this.XT_ZHXGSJ;
	}
	public void setXT_ZHXGSJ(String XT_ZHXGSJ){
		this.XT_ZHXGSJ=XT_ZHXGSJ;
	}
	public String getXT_ZHXGRXM(){
		return this.XT_ZHXGRXM;
	}
	public void setXT_ZHXGRXM(String XT_ZHXGRXM){
		this.XT_ZHXGRXM=XT_ZHXGRXM;
	}
	public String getXT_ZHXGRID(){
		return this.XT_ZHXGRID;
	}
	public void setXT_ZHXGRID(String XT_ZHXGRID){
		this.XT_ZHXGRID=XT_ZHXGRID;
	}
	public String getXT_ZHXGRBM(){
		return this.XT_ZHXGRBM;
	}
	public void setXT_ZHXGRBM(String XT_ZHXGRBM){
		this.XT_ZHXGRBM=XT_ZHXGRBM;
	}
	public String getXT_ZHXGRBMID(){
		return this.XT_ZHXGRBMID;
	}
	public void setXT_ZHXGRBMID(String XT_ZHXGRBMID){
		this.XT_ZHXGRBMID=XT_ZHXGRBMID;
	}
	public String getXT_ZHXGIP(){
		return this.XT_ZHXGIP;
	}
	public void setXT_ZHXGIP(String XT_ZHXGIP){
		this.XT_ZHXGIP=XT_ZHXGIP;
	}
	public String getXT_ZXBZ(){
		return this.XT_ZXBZ;
	}
	public void setXT_ZXBZ(String XT_ZXBZ){
		this.XT_ZXBZ=XT_ZXBZ;
	}
	public String getXT_ZXYY(){
		return this.XT_ZXYY;
	}
	public void setXT_ZXYY(String XT_ZXYY){
		this.XT_ZXYY=XT_ZXYY;
	}

}