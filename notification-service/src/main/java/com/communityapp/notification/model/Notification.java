package com.communityapp.notification.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="notifications")
public class Notification {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long notifications;
	
	private String content;
	private Date date;
	
	@Column(nullable=false)
	private String recipientRole; //Resident
}
