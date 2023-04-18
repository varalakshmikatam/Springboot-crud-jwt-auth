package com.bezkoder.spring.security.jwt.productrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.security.jwt.productmodel.Tutorial;
@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	List<Tutorial> findByPublished(boolean published);
	  List<Tutorial> findByTitleContaining(String title);

}
