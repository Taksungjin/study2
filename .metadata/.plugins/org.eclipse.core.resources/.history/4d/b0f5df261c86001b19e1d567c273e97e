package com.example.demo.bbs.domain;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Table(name = "article")
public class Article{
	@Id
	@GeneratedValue
	@Column(name = "articleNo")
	private long articleNo;
	@Column(name = "userNo")
	private long userNo;
	@Column(name = "title")
	private String title;
	@Column(name = "content")
	private String content;
	@Column(name = "regdate")
	private String regdate;


}
