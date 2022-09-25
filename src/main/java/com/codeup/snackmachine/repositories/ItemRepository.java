package com.codeup.snackmachine.repositories;

import com.codeup.snackmachine.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {


}
