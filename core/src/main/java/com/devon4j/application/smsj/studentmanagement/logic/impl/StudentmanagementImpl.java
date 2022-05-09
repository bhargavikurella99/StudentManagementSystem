package com.devon4j.application.smsj.studentmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devon4j.application.smsj.general.logic.base.AbstractComponentFacade;
import com.devon4j.application.smsj.studentmanagement.logic.api.Studentmanagement;
import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentEto;
import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentSearchCriteriaTo;
import com.devon4j.application.smsj.studentmanagement.logic.api.usecase.UcFindStudent;
import com.devon4j.application.smsj.studentmanagement.logic.api.usecase.UcManageStudent;

/**
 * Implementation of component interface of studentmanagement
 */
@Named
public class StudentmanagementImpl extends AbstractComponentFacade implements Studentmanagement {

  @Inject
  private UcFindStudent ucFindStudent;

  @Inject
  private UcManageStudent ucManageStudent;

  @Override
  public StudentEto findStudent(long id) {

    return this.ucFindStudent.findStudent(id);
  }

  @Override
  public Page<StudentEto> findStudents(StudentSearchCriteriaTo criteria) {

    return this.ucFindStudent.findStudents(criteria);
  }

  @Override
  public StudentEto saveStudent(StudentEto student) {

    return this.ucManageStudent.saveStudent(student);
  }

  @Override
  public boolean deleteStudent(long id) {

    return this.ucManageStudent.deleteStudent(id);
  }
}
