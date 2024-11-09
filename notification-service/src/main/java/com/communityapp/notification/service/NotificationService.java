package com.communityapp.notification.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.communityapp.notification.model.Notification;
import com.communityapp.notification.repository.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository notificationRepository;
	
	public Notification createNotification(Notification notification) {
		return notificationRepository.save(notification);
	}
	
	public List<Notification> getNotificationsByRole(String role){
		return notificationRepository.findByRecipientRole(role);
	}
}
