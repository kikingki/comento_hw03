package com.devfun.settingweb_boot.dto;

public class AverageDailyLoginDTO {
	private double average;
    private boolean isSuccess;
    
    public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
}
