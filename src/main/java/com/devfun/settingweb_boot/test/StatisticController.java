package com.devfun.settingweb_boot.test;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devfun.settingweb_boot.dto.AverageDailyLoginDTO;
import com.devfun.settingweb_boot.dto.DailyLoginDTO;
import com.devfun.settingweb_boot.dto.DepartmentMonthLoginDTO;
import com.devfun.settingweb_boot.dto.ExHolidaysLoginDTO;
import com.devfun.settingweb_boot.dto.MonthLoginDTO;
import com.devfun.settingweb_boot.dto.YearLoginDTO;
import com.devfun.settingweb_boot.service.StatisticService;





 
 
@Controller
public class StatisticController {
    
 
    @Autowired
    private StatisticService service;
    
    @ResponseBody 
    @RequestMapping("/yearStatistic")
    public YearLoginDTO sqltest(String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }
    
    @ResponseBody 
    @RequestMapping("/monthStatistic")
    public MonthLoginDTO getMonthLogin(String yearMonth) throws Exception{ 
        
        return service.monthloginNum(yearMonth);
    }
    
    @ResponseBody 
    @RequestMapping("/dailyStatistic")
    public DailyLoginDTO getDailyLogin(String daily) throws Exception{ 
        
        return service.dailyloginNum(daily);
    }
    
    @ResponseBody 
    @RequestMapping("/avgStatistic")
    public AverageDailyLoginDTO getAvgTotalLogin() throws Exception{ 
        
        return service.avgTotalLoginNum();
    }
    
    @ResponseBody 
    @RequestMapping("/exHolidaysStatistic")
    public ExHolidaysLoginDTO getExHolidaysLogin() throws Exception{ 
        
        return service.exHolidaysLoginNum();
    }
 
    
    @ResponseBody 
    @RequestMapping("/departMonthStatistic")
    public DepartmentMonthLoginDTO getDepartMonthLogin(String yearMonth, String hrDepart) throws Exception{ 
        
        return service.departMonthLoginNum(yearMonth, hrDepart);
    }
}