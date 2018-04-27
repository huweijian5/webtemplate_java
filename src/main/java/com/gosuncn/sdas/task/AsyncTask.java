package com.gosuncn.sdas.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 异步任务示例
 */
@Component
public class AsyncTask {

    @Async
    public void todoInThread(){
    }
}
