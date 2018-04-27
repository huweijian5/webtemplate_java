package com.gosuncn.sdas.common;

import com.gosuncn.sdas.bean.properties.CustomProperties;
import com.gosuncn.sdas.bean.properties.YmlConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 服务启动后执行指定代码,可用于测试时模拟数据加载
 */
@Component
public class Startup implements CommandLineRunner {
    @Autowired
    CustomProperties customProperties;

    @Autowired
    YmlConfig ymlConfig;
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void run(String... args) throws Exception {
        logger.info("Startup begin");
        logger.info(""+customProperties.getFirstField());//print 1
        logger.info(ymlConfig.getMapProps().get("key1")+"");//print value1
    }
}
