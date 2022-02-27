package com.yasufa.business.abstracts;

import java.util.List;


import com.yasufa.core.utilities.result.DataResult;
import com.yasufa.core.utilities.result.Result;
import com.yasufa.entities.concretes.User;

public interface UserService {
		
	DataResult<List<User>> getAll();
	Result add(User user);
	
}
