package com.communityapp.notification.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.communityapp.notification.model.Notification;
import com.communityapp.notification.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/hello")
    public String hello() {
    	return "Welcome back";
    }

    // Endpoint for creating a notification
    @PostMapping
    public ResponseEntity<Notification> createNotification(@RequestBody Notification notification) {
            Notification createdNotification = notificationService.createNotification(notification);
            return new ResponseEntity<>(createdNotification, HttpStatus.CREATED);
    }

    // Endpoint for getting notifications based on user role
    @GetMapping("/{role}")
    public ResponseEntity<List<Notification>> getNotifications(@PathVariable String role) {
            List<Notification> notifications = notificationService.getNotificationsByRole(role);
            return new ResponseEntity<>(notifications, HttpStatus.OK);
        }


    
}
