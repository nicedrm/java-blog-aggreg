package kr.young.jba.repository;

import kr.young.jba.entity.Item;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer>{

}
