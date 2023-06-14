package com.ll.exam.mbooks.app.email.repository;

import com.ll.exam.mbooks.app.email.entity.SendEmailLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SendEmailLogRepository extends JpaRepository<SendEmailLog, Long> {
}
