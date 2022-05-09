package com.devon4j.application.smsj.studentmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentEto;
import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentSearchCriteriaTo;

public interface UcFindStudent {

  /**
   * Returns a Student by its id 'id'.
   *
   * @param id The id 'id' of the Student.
   * @return The {@link StudentEto} with id 'id'
   */
  StudentEto findStudent(long id);

  /**
   * Returns a paginated list of Students matching the search criteria.
   *
   * @param criteria the {@link StudentSearchCriteriaTo}.
   * @return the {@link List} of matching {@link StudentEto}s.
   */
  Page<StudentEto> findStudents(StudentSearchCriteriaTo criteria);

}
