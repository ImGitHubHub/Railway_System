package com.haichaoaixuexi.entity;

import java.sql.Timestamp;

public class Eq_check {
    private int EQ_CHECK_ID;
    private String JCLX;
    private int SBBH;
    private int GZLX;
    private String GZMS;
    private int BXR;
    private Timestamp BXSJ;
    private int YSR;
    private Timestamp YSSJ;
    private String GZTP;
    private String ABC;

    private String imgString;
    
    private String BXR_NAME;
    
    private String YSJG;
    
    
	public String getBXR_NAME() {
		return BXR_NAME;
	}
	public void setBXR_NAME(String bXR_NAME) {
		BXR_NAME = bXR_NAME;
	}
	
	public String getYSJG() {
		return YSJG;
	}
	public void setYSJG(String ySJG) {
		YSJG = ySJG;
	}
	public int getEQ_CHECK_ID(){
        return this.EQ_CHECK_ID;
    }
    public void setEQ_CHECK_ID(int EQ_CHECK_ID){
        this.EQ_CHECK_ID = EQ_CHECK_ID;
    }
    public String getJCLX(){
        return this.JCLX;
    }
    public void setJCLX(String JCLX){
        this.JCLX = JCLX;
    }
    public int getSBBH(){
        return this.SBBH;
    }
    public void setSBBH(int SBBH){
        this.SBBH = SBBH;
    }
    public int getGZLX(){
        return this.GZLX;
    }
    public void setGZLX(int GZLX){
        this.GZLX = GZLX;
    }
    public String getGZMS(){
        return this.GZMS;
    }
    public void setGZMS(String GZMS){
        this.GZMS = GZMS;
    }
    public int getBXR(){
        return this.BXR;
    }
    public void setBXR(int BXR){
        this.BXR = BXR;
    }
    public Timestamp getBXSJ(){
        return this.BXSJ;
    }
    public void setBXSJ(Timestamp BXSJ){
        this.BXSJ = BXSJ;
    }
    public int getYSR(){
        return this.YSR;
    }
    public void setYSR(int YSR){
        this.YSR = YSR;
    }
    public Timestamp getYSSJ(){
        return this.YSSJ;
    }
    public void setYSSJ(Timestamp YSSJ){
        this.YSSJ = YSSJ;
    }
    public String getGZTP(){
        return this.GZTP;
    }
    public void setGZTP(String GZTP){
        this.GZTP = GZTP;
    }
    public String getABC(){
        return this.ABC;
    }
    public void setABC(String ABC){
        this.ABC = ABC;
    }
	public String getImgString() {
		return imgString;
	}
	public void setImgString(String imgString) {
		this.imgString = imgString;
	}
    
}
