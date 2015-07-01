package kr.young.jba.repository;

import kr.young.jba.entity.Blog;


import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer>{

}
