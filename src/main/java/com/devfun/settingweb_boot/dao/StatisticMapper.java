package com.devfun.settingweb_boot.dao;
import java.util.HashMap;
 
import com.devfun.settingweb_boot.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
    public HashMap<String, Object> selectMonthLogin(String yearMonth);
    public HashMap<String, Object> selectDayLogin(String daily);
    public HashMap<String, Object> getAverageTotalLogin();
    public HashMap<String, Object> getLoginsExcludingHolidays();
    public HashMap<String, Object> selectDepartmentMonthLogin(String yearMonth, String hrDepart);
}
