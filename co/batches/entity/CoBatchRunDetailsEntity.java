package com.ashokit.ies.co.batches.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data()
@Entity()
@Table(name = "CO_BATCH_RUN_DTLS")
public class CoBatchRunDetailsEntity {
	@Id()
	@GeneratedValue
	@Column(name = "BATCH_RUN_SEQ")
	private Integer runSeq;

	@Column(name = "BATCH_NAME")
	private String batchName;

	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "BATCH_RUN_STATUS")
	private String batchRunStatus;

}
