package com.ashokit.ies.co.batches.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CO_TRIGGERS")
public class CoTriggersEntity {

	@Id
	@GeneratedValue
	@Column(name = "TRG_ID")
	private Integer triggerId;

	@Column(name = "CASE_NUM")
	private Long caseNum;

	@Column(name = "TRG_STATUS")
	private String triggerStatus;

	@Column(name = "CREATE_DATE")
	private Date createdDate;

	@Column(name = "UPDATE_DATE")
	private Date updatedDate;

}
