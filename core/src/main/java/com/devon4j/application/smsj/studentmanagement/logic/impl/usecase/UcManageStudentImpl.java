package com.devon4j.application.smsj.studentmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon4j.application.smsj.studentmanagement.dataaccess.api.StudentEntity;
import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentEto;
import com.devon4j.application.smsj.studentmanagement.logic.api.usecase.UcManageStudent;
import com.devon4j.application.smsj.studentmanagement.logic.base.usecase.AbstractStudentUc;

/**
 * Use case implementation for modifying and deleting Students
 */
@Named
@Validated
@Transactional
public class UcManageStudentImpl extends AbstractStudentUc implements UcManageStudent {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageStudentImpl.class);

  @Override
  public boolean deleteStudent(long studentId) {

    StudentEntity student = getStudentRepository().find(studentId);
    getStudentRepository().delete(student);
    LOG.debug("The student with id '{}' has been deleted.", studentId);
    return true;
  }

  @Override
  public StudentEto saveStudent(StudentEto student) {

    Objects.requireNonNull(student, "student");

    StudentEntity studentEntity = getBeanMapper().map(student, StudentEntity.class);

    // initialize, validate studentEntity here if necessary
    StudentEntity resultEntity = getStudentRepository().save(studentEntity);
    LOG.debug("Student with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, StudentEto.class);
  }
}
