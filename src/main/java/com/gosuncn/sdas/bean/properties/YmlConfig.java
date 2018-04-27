package com.gosuncn.sdas.bean.properties;

import groovy.transform.EqualsAndHashCode;
import groovy.transform.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@ConfigurationProperties(prefix = "prairieManage")
@EqualsAndHashCode
@ToString
public class YmlConfig {
    HashMap mapProps = new HashMap<String, String>();

    public HashMap getMapProps() {
        return mapProps;
    }

    public void setMapProps(HashMap mapProps) {
        this.mapProps = mapProps;
    }
}
