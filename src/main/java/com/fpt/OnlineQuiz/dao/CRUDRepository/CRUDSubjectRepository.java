package com.fpt.OnlineQuiz.dao.CRUDRepository;

import com.fpt.OnlineQuiz.model.LessonType;
import com.fpt.OnlineQuiz.model.Subject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRUDSubjectRepository extends CrudRepository<Subject,Integer> {

    @Query("select s from Subject s where s.name = ?1")
    Subject findByName(String name);
}
