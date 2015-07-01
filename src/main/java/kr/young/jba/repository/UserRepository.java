package kr.young.jba.repository;


import kr.young.jba.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

}
