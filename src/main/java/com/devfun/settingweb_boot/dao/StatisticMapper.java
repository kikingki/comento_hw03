package com.devfun.settingweb_boot.dao;
import com.devfun.settingweb_boot.dto.AverageDailyLoginDTO;
import com.devfun.settingweb_boot.dto.DailyLoginDTO;
import com.devfun.settingweb_boot.dto.DepartmentMonthLoginDTO;
import com.devfun.settingweb_boot.dto.ExHolidaysLoginDTO;
import com.devfun.settingweb_boot.dto.MonthLoginDTO;
import com.devfun.settingweb_boot.dto.YearLoginDTO;
 
 
public interface  StatisticMapper {
	public YearLoginDTO selectYearLogin(String year);
    public MonthLoginDTO selectMonthLogin(String yearMonth);
    public DailyLoginDTO selectDayLogin(String daily);
    public AverageDailyLoginDTO getAverageTotalLogin();
    public ExHolidaysLoginDTO getLoginsExcludingHolidays();
    public DepartmentMonthLoginDTO selectDepartmentMonthLogin(String yearMonth, String hrDepart);
}
