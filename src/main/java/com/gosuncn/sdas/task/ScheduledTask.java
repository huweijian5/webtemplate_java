package com.gosuncn.sdas.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务示例
 */
@Component
public class ScheduledTask {

    /**
     * 零点执行
     */
    @Scheduled(cron = "0 0 0 * * ?")
    public void todo(){

    }
}
