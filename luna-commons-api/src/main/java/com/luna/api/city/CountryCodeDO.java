package com.luna.api.city;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.luna.file.file.FileEditUtil;

import java.util.List;

public class CountryCodeDO {

    private List<ProvinceDO> provinces;

    public List<ProvinceDO> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<ProvinceDO> provinces) {
        this.provinces = provinces;
    }

    public static void main(String[] args) {
        String s = FileEditUtil.readFile("/Users/luna_mac/Documents/luna-project/luna-commons/luna-commons-api/src/main/java/com/luna/api/city/city.json");
        CountryCodeDO countryCodeDO = JSON.parseObject(s, CountryCodeDO.class);
        System.out.println(JSON.toJSONString(countryCodeDO));
    }
}
