package com.devon4j.application.smsj.studentmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon4j.application.smsj.studentmanagement.dataaccess.api.StudentEntity;
import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentEto;
import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentSearchCriteriaTo;
import com.devon4j.application.smsj.studentmanagement.logic.api.usecase.UcFindStudent;
import com.devon4j.application.smsj.studentmanagement.logic.base.usecase.AbstractStudentUc;

/**
 * Use case implementation for searching, filtering and getting Students
 */
@Named
@Validated
@Transactional
public class UcFindStudentImpl extends AbstractStudentUc implements UcFindStudent {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindStudentImpl.class);

  @Override
  public StudentEto findStudent(long id) {

    LOG.debug("Get Student with id {} from database.", id);
    Optional<StudentEntity> foundEntity = getStudentRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), StudentEto.class);
    else
      return null;
  }

  @Override
  public Page<StudentEto> findStudents(StudentSearchCriteriaTo criteria) {

    Page<StudentEntity> students = getStudentRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(students, StudentEto.class);
  }

}
