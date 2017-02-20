package com.denghb.spring.cloud.domain;

import com.denghb.dbhelper.annotation.Column;
import com.denghb.dbhelper.annotation.Id;
import com.denghb.dbhelper.annotation.Table;

/**
 * 
 * DDL
 * 
 <pre>
CREATE TABLE `user` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '名字',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8
 <pre>
 * @author DbHelper
 * @generateTime Mon Feb 20 20:14:00 CST 2017
 */
@Table(name="user",database="boot")
public class User implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	/**  */
	@Id@Column(name="id")
	private Long id;
	
	/** 名字 */
	@Column(name="name")
	private String name;
	
	/** 年龄 */
	@Column(name="age")
	private Integer age;
	

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Integer getAge(){
		return age;
	}

	public void setAge(Integer age){
		this.age = age;
	}

	@Override
	public String toString(){
		StringBuffer str = new StringBuffer("User [");
		str.append(",id=");
		str.append(id);
		str.append(",name=");
		str.append(name);
		str.append(",age=");
		str.append(age);
		str.append("]");
	
		return str.toString();
	}
}