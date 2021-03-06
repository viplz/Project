package com.mr.zd;

	/**
	*s	*备注(数据表的comment字段)：举报积分表
	*@since 2016-02-23 09:11:52
	*/

	public class C_tb_reportpoints{
@FieldDesc("主键ID")
	private String ID;
@FieldDesc("年")
	private String YEARS;
@FieldDesc("人员ID")
	private String USER_ID;
@FieldDesc("积分说明")
	private String POINTS_EXPLAIN;
@FieldDesc("积分")
	private int POINTS;
@FieldDesc("业务表名")
	private String BUSIN_TNAME;
@FieldDesc("业务")
	private String BUSINESS;
@FieldDesc("备注")
	private String REMARKS;
@FieldDesc("采集时间")
	private String XT_CJSJ;
@FieldDesc("录入时间")
	private String XT_LRSJ;
@FieldDesc("录入人姓名")
	private String XT_LRRXM;
@FieldDesc("录入人ID")
	private String XT_LRRID;
@FieldDesc("录入人部门")
	private String XT_LRRBM;
@FieldDesc("录入人部门ID")
	private String XT_LRRBMID;
@FieldDesc("录入IP")
	private String XT_LRIP;
@FieldDesc("最后修改时间")
	private String XT_ZHXGSJ;
@FieldDesc("最后修改人姓名")
	private String XT_ZHXGRXM;
@FieldDesc("最后修改人ID")
	private String XT_ZHXGRID;
@FieldDesc("最后修改人部门")
	private String XT_ZHXGRBM;
@FieldDesc("最后修改人部门ID")
	private String XT_ZHXGRBMID;
@FieldDesc("最后修改IP")
	private String XT_ZHXGIP;
@FieldDesc("注销标志")
	private String XT_ZXBZ;
@FieldDesc("注销原因")
	private String XT_ZXYY;
	public String getID(){
		return this.ID;
	}
	public void setID(String ID){
		this.ID=ID;
	}
	public String getYEARS(){
		return this.YEARS;
	}
	public void setYEARS(String YEARS){
		this.YEARS=YEARS;
	}
	public String getUSER_ID(){
		return this.USER_ID;
	}
	public void setUSER_ID(String USER_ID){
		this.USER_ID=USER_ID;
	}
	public String getPOINTS_EXPLAIN(){
		return this.POINTS_EXPLAIN;
	}
	public void setPOINTS_EXPLAIN(String POINTS_EXPLAIN){
		this.POINTS_EXPLAIN=POINTS_EXPLAIN;
	}
	public int getPOINTS(){
		return this.POINTS;
	}
	public void setPOINTS(int POINTS){
		this.POINTS=POINTS;
	}
	public String getBUSIN_TNAME(){
		return this.BUSIN_TNAME;
	}
	public void setBUSIN_TNAME(String BUSIN_TNAME){
		this.BUSIN_TNAME=BUSIN_TNAME;
	}
	public String getBUSINESS(){
		return this.BUSINESS;
	}
	public void setBUSINESS(String BUSINESS){
		this.BUSINESS=BUSINESS;
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