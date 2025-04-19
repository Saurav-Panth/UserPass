package com.webwithserver.webtest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.webwithserver.webtest1.entity.UserPass;

@Service
public interface MyRepository extends JpaRepository<UserPass, Long>{

}
