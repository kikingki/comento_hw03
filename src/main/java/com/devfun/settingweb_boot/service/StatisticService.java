package com.devfun.settingweb_boot.service;
 

import com.devfun.settingweb_boot.dto.AverageDailyLoginDTO;
import com.devfun.settingweb_boot.dto.DailyLoginDTO;
import com.devfun.settingweb_boot.dto.DepartmentMonthLoginDTO;
import com.devfun.settingweb_boot.dto.ExHolidaysLoginDTO;
import com.devfun.settingweb_boot.dto.MonthLoginDTO;
import com.devfun.settingweb_boot.dto.YearLoginDTO;
 
public interface StatisticService {
    public YearLoginDTO yearloginNum (String year);
    
    public MonthLoginDTO monthloginNum (String yearMonth);
    
    public DailyLoginDTO dailyloginNum (String daily);
    
    public AverageDailyLoginDTO avgTotalLoginNum ();
    
    public ExHolidaysLoginDTO exHolidaysLoginNum ();
    
    public DepartmentMonthLoginDTO departMonthLoginNum(String yearMonth, String hrDepart);
}