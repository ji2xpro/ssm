package com.maoyan.ssm.model;

import java.sql.Timestamp;

/**
 * @Auther: maoyan
 * @Date: 2019/2/2 14:11
 * @Description:
 */
public class ConfigTest {
    private String id;
    private String value;
    private Timestamp setTime;
    private String setBy;

    public ConfigTest(String id, String value, Timestamp setTime, String setBy) {
        this.id = id;
        this.value = value;
        this.setTime = setTime;
        this.setBy = setBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Timestamp getSetTime() {
        return setTime;
    }

    public void setSetTime(Timestamp setTime) {
        this.setTime = setTime;
    }

    public String getSetBy() {
        return setBy;
    }

    public void setSetBy(String setBy) {
        this.setBy = setBy;
    }

    @Override
    public String toString() {
        return "configTest{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                ", setTime=" + setTime +
                ", setBy='" + setBy + '\'' +
                '}';
    }
}
