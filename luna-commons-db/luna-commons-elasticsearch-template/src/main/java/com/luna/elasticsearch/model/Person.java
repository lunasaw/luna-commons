package com.luna.elasticsearch.model;

import com.luna.elasticsearch.constants.EsConsts;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * <p>
 * 用户实体类
 * </p>
 *
 * @package: com.luna.elasticsearch.model
 * @description: 用户实体类
 * @author: luna
 * @date: Created in 2018-12-20 17:29
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: luna
 */
@Document(indexName = EsConsts.INDEX_NAME, type = EsConsts.TYPE_NAME, shards = 1, replicas = 0)
public class Person {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 名字
     */
    @Field(type = FieldType.Keyword)
    private String name;

    /**
     * 国家
     */
    @Field(type = FieldType.Keyword)
    private String country;

    /**
     * 年龄
     */
    @Field(type = FieldType.Integer)
    private Integer age;

    /**
     * 生日
     */
    @Field(type = FieldType.Date)
    private Date birthday;

    /**
     * 介绍
     */
    @Field(type = FieldType.Text, analyzer = "ik_smart")
    private String remark;

    public Person() {
    }

    public Person(Long id, String name, String country, Integer age, Date birthday, String remark) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
        this.birthday = birthday;
        this.remark = remark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static final class PersonBuilder {
        private Long id;
        private String name;
        private String country;
        private Integer age;
        private Date birthday;
        private String remark;

        private PersonBuilder() {
        }

        public static PersonBuilder aPerson() {
            return new PersonBuilder();
        }

        public PersonBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder country(String country) {
            this.country = country;
            return this;
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder birthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public PersonBuilder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public Person build() {
            return new Person(id, name, country, age, birthday, remark);
        }
    }
}