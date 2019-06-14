package com.zcit.agent;

import com.zcit.agent.model.CbaCar;
import com.zcit.agent.service.CbaCarService;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootAgentProjectApplicationTests {

    @Autowired
    ApplicationContext ioc;

    @Autowired
    CbaCarService service;

    @Test
    public void contextLoads() {
        System.out.println(ioc.containsBean("WebMvcAutoConfiguration"));
        System.out.println(ioc.containsBean("EnableWebMvcConfiguration"));
        System.out.println(ioc.containsBean("DelegatingWebMvcConfiguration"));
        System.out.println(ioc.containsBean("WebMvcConfigurationSupport"));
    }

    @Test
    public void carTest() {
        CbaCar car = new CbaCar();
        car.setId(Integer.parseInt("1"));
        car.setApplyno("111");
        car.setUsername("张三");
        car.setTotalcount(12);
        service.addCbaCar(car);
    }


    @Test
    public void myTest() {
       File xlsFile  = new File("E:/2018J01.xlsx");
        try {
            Workbook workbook = new XSSFWorkbook(xlsFile);
            Sheet sheet = workbook.getSheetAt(0);
            for(int i=0;i< sheet.getLastRowNum();i++){
                Row  row =sheet.getRow(i);
                String name = row.getCell(0).getStringCellValue().trim();
                if(StringUtils.isEmpty(name)|| name.length()<10){
                    continue;
                }

                String[] arr =  name.split("\\s");
                CbaCar car = new CbaCar();
                car.setId(Integer.parseInt(arr[0]));
                car.setApplyno(arr[1]);
                car.setUsername("2018J1");
                car.setTotalcount(Integer.parseInt(arr[3]));
                service.addCbaCar(car);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }

    }

}
