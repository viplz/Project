package com.yourcom.bean;

	/**
	*������MySQLToBean�����Զ����
	*��ע(��ݱ��comment�ֶ�)��举报管理表
	*@since 2016-02-22 15:54:57
	*/

	public class C_tb_reportmanage{
@FieldDesc("主键ID")
	private String ID;
@FieldDesc("发生时间")
	private String TIME_HAPPEN;
@FieldDesc("发生地点")
	private String PLACE_HAPPEN;
@FieldDesc("被举报人单位")
	private String PSDEPT_REPORTED;
@FieldDesc("举报描述")
	private String DESCRIBE_REPORT;
@FieldDesc("制定受理单位")
	private String SIGNUNIT_ACCEPT;
@FieldDesc("举报人ID")
	private String REPORT_ID;
@FieldDesc("举报人")
	private String REPORT_NAME;
@FieldDesc("举报人联系方式")
	private String REPORT_PHONE;
@FieldDesc("是否受理")
	private String IS_ACCEPT;
@FieldDesc("受理时间")
	private String ACCEPT_TIME;
@FieldDesc("受理人ID")
	private String ACCEPT_ID;
@FieldDesc("受理人")
	private String ACCPET_NAME;
@FieldDesc("是否回复")
	private String IS_ANS;
@FieldDesc("回复时间")
	private String ANS_TIME;
@FieldDesc("核实结果")
	private String RESULT_CHECK;
@FieldDesc("举报类型")
	private String REPORT_TYPE;
@FieldDesc("事故类型")
	private String AC_TYPE;
@FieldDesc("隐患类型")
	private String HDTR_TYPE;
@FieldDesc("隐患等级")
	private String HDTR_LEVEL;
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
	public String getID(){
		return this.ID;
	}
	public void setID(String ID){
		this.ID=ID;
	}
	public String getTIME_HAPPEN(){
		return this.TIME_HAPPEN;
	}
	public void setTIME_HAPPEN(String TIME_HAPPEN){
		this.TIME_HAPPEN=TIME_HAPPEN;
	}
	public String getPLACE_HAPPEN(){
		return this.PLACE_HAPPEN;
	}
	public void setPLACE_HAPPEN(String PLACE_HAPPEN){
		this.PLACE_HAPPEN=PLACE_HAPPEN;
	}
	public String getPSDEPT_REPORTED(){
		return this.PSDEPT_REPORTED;
	}
	public void setPSDEPT_REPORTED(String PSDEPT_REPORTED){
		this.PSDEPT_REPORTED=PSDEPT_REPORTED;
	}
	public String getDESCRIBE_REPORT(){
		return this.DESCRIBE_REPORT;
	}
	public void setDESCRIBE_REPORT(String DESCRIBE_REPORT){
		this.DESCRIBE_REPORT=DESCRIBE_REPORT;
	}
	public String getSIGNUNIT_ACCEPT(){
		return this.SIGNUNIT_ACCEPT;
	}
	public void setSIGNUNIT_ACCEPT(String SIGNUNIT_ACCEPT){
		this.SIGNUNIT_ACCEPT=SIGNUNIT_ACCEPT;
	}
	public String getREPORT_ID(){
		return this.REPORT_ID;
	}
	public void setREPORT_ID(String REPORT_ID){
		this.REPORT_ID=REPORT_ID;
	}
	public String getREPORT_NAME(){
		return this.REPORT_NAME;
	}
	public void setREPORT_NAME(String REPORT_NAME){
		this.REPORT_NAME=REPORT_NAME;
	}
	public String getREPORT_PHONE(){
		return this.REPORT_PHONE;
	}
	public void setREPORT_PHONE(String REPORT_PHONE){
		this.REPORT_PHONE=REPORT_PHONE;
	}
	public String getIS_ACCEPT(){
		return this.IS_ACCEPT;
	}
	public void setIS_ACCEPT(String IS_ACCEPT){
		this.IS_ACCEPT=IS_ACCEPT;
	}
	public String getACCEPT_TIME(){
		return this.ACCEPT_TIME;
	}
	public void setACCEPT_TIME(String ACCEPT_TIME){
		this.ACCEPT_TIME=ACCEPT_TIME;
	}
	public String getACCEPT_ID(){
		return this.ACCEPT_ID;
	}
	public void setACCEPT_ID(String ACCEPT_ID){
		this.ACCEPT_ID=ACCEPT_ID;
	}
	public String getACCPET_NAME(){
		return this.ACCPET_NAME;
	}
	public void setACCPET_NAME(String ACCPET_NAME){
		this.ACCPET_NAME=ACCPET_NAME;
	}
	public String getIS_ANS(){
		return this.IS_ANS;
	}
	public void setIS_ANS(String IS_ANS){
		this.IS_ANS=IS_ANS;
	}
	public String getANS_TIME(){
		return this.ANS_TIME;
	}
	public void setANS_TIME(String ANS_TIME){
		this.ANS_TIME=ANS_TIME;
	}
	public String getRESULT_CHECK(){
		return this.RESULT_CHECK;
	}
	public void setRESULT_CHECK(String RESULT_CHECK){
		this.RESULT_CHECK=RESULT_CHECK;
	}
	public String getREPORT_TYPE(){
		return this.REPORT_TYPE;
	}
	public void setREPORT_TYPE(String REPORT_TYPE){
		this.REPORT_TYPE=REPORT_TYPE;
	}
	public String getAC_TYPE(){
		return this.AC_TYPE;
	}
	public void setAC_TYPE(String AC_TYPE){
		this.AC_TYPE=AC_TYPE;
	}
	public String getHDTR_TYPE(){
		return this.HDTR_TYPE;
	}
	public void setHDTR_TYPE(String HDTR_TYPE){
		this.HDTR_TYPE=HDTR_TYPE;
	}
	public String getHDTR_LEVEL(){
		return this.HDTR_LEVEL;
	}
	public void setHDTR_LEVEL(String HDTR_LEVEL){
		this.HDTR_LEVEL=HDTR_LEVEL;
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

}