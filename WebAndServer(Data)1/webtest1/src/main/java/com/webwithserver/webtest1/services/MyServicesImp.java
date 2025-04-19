package com.webwithserver.webtest1.services;

import com.webwithserver.webtest1.entity.UserPass;
import com.webwithserver.webtest1.repository.MyRepository;

import static com.tools.AppLogger.logger;

import org.springframework.stereotype.Service;

@Service
public class MyServicesImp implements MyServeices {
	
	private  MyRepository myRepository;
	public MyServicesImp(MyRepository myRepository) {
		this.myRepository=myRepository;
	}
	
	
	@Override
	public boolean addUserPass(UserPass userPass) {
		try {
			myRepository.save(userPass);
			return true;
		} catch (Exception e) {
			logger.error("{}",e);
		}
		return false;
	}

}
