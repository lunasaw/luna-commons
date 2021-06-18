package com.luna.api.city;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class ProvinceDO {

    private String name;

    private List<CityDO> citys;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<CityDO> getCitys() {
        return citys;
    }

    public void setCitys(List<CityDO> citys) {
        this.citys = citys;
    }
}
