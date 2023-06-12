package com.devfun.settingweb_boot.dto;

public class ExHolidaysLoginDTO {
	private int exHolidaysCnt;
    private boolean isSuccess;
    
	public int getExHolidaysCnt() {
		return exHolidaysCnt;
	}
	public void setExHolidaysCnt(int exHolidaysCnt) {
		this.exHolidaysCnt = exHolidaysCnt;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
}
