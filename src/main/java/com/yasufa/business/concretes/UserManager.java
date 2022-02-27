package com.yasufa.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yasufa.business.abstracts.UserService;
import com.yasufa.core.utilities.result.DataResult;
import com.yasufa.core.utilities.result.Result;
import com.yasufa.core.utilities.result.SuccessDataResult;
import com.yasufa.core.utilities.result.SuccessResult;
import com.yasufa.dataAccess.abtracts.UserDao;
import com.yasufa.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(userDao.findAll());
	}
	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı başarılı şekilde eklendi");
	}

	
}
