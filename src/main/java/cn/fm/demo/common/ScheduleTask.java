package cn.fm.demo.common;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@EnableScheduling
public class ScheduleTask {
    @Scheduled(fixedRate = 60000)
    public void printTime(){
        System.out.println(new Date());
    }
}
