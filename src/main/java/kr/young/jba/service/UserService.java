package kr.young.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.young.jba.entity.User;
import kr.young.jba.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    public List<User> findAll() {
        return userRepository.findAll();
    }

	public User findOne(int id) {
        return userRepository.findOne(id);

	}
}
