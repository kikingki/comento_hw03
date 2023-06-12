package com.devfun.settingweb_boot.service;
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.dto.AverageDailyLoginDTO;
import com.devfun.settingweb_boot.dto.DailyLoginDTO;
import com.devfun.settingweb_boot.dto.DepartmentMonthLoginDTO;
import com.devfun.settingweb_boot.dto.ExHolidaysLoginDTO;
import com.devfun.settingweb_boot.dto.MonthLoginDTO;
import com.devfun.settingweb_boot.dto.YearLoginDTO;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public YearLoginDTO yearloginNum(String year) {
        YearLoginDTO retVal = new YearLoginDTO();

        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.setYear(year);
            retVal.setSuccess(true);
        } catch (Exception e) {
            retVal.setTotCnt(-999);
            retVal.setYear(year);
            retVal.setSuccess(false);
        }

        return retVal;
    }
 
    @Override
    public MonthLoginDTO monthloginNum(String yearMonth) {
        MonthLoginDTO retVal = new MonthLoginDTO();

        try {
            retVal = uMapper.selectMonthLogin(yearMonth);
            retVal.setYearMonth(yearMonth);
            retVal.setSuccess(true);
        } catch (Exception e) {
            retVal.setTotCnt(-999);
            retVal.setYearMonth(yearMonth);
            retVal.setSuccess(false);
        }

        return retVal;
    }
    
    @Override
    public DailyLoginDTO dailyloginNum(String daily) {
    	DailyLoginDTO retVal = new DailyLoginDTO();

        try {
            retVal = uMapper.selectDayLogin(daily);
            retVal.setDaily(daily);
            retVal.setSuccess(true);
        } catch (Exception e) {
            retVal.setTotCnt(-999);
            retVal.setDaily(daily);
            retVal.setSuccess(false);
        }

        return retVal;
    }
    
    @Override
    public AverageDailyLoginDTO avgTotalLoginNum() {
    	AverageDailyLoginDTO retVal = new AverageDailyLoginDTO();

        try {
            retVal = uMapper.getAverageTotalLogin();
            retVal.setSuccess(true);
        } catch (Exception e) {
            retVal.setAverage(-999.0);
            retVal.setSuccess(false);
        }

        return retVal;
    }
    
    @Override
    public ExHolidaysLoginDTO exHolidaysLoginNum () {
    	ExHolidaysLoginDTO retVal = new ExHolidaysLoginDTO();

        try {
            retVal = uMapper.getLoginsExcludingHolidays();
            retVal.setSuccess(true);
        } catch (Exception e) {
            retVal.setExHolidaysCnt(-999);
            retVal.setSuccess(false);
        }

        return retVal;
    }
    
    @Override
    public DepartmentMonthLoginDTO departMonthLoginNum(String yearMonth, String hrDepart) {
    	DepartmentMonthLoginDTO retVal = new DepartmentMonthLoginDTO();

        try {
            retVal = uMapper.selectDepartmentMonthLogin(yearMonth, hrDepart);
            retVal.setYearMonth(yearMonth);
            retVal.setDepartment(hrDepart);
            retVal.setSuccess(true);
        } catch (Exception e) {
            retVal.setTotCnt(-999);
            retVal.setYearMonth(yearMonth);
            retVal.setDepartment(hrDepart);
            retVal.setSuccess(false);
        }

        return retVal;
    }
}