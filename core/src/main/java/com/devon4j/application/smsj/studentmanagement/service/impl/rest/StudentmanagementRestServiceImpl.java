package com.devon4j.application.smsj.studentmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devon4j.application.smsj.studentmanagement.logic.api.Studentmanagement;
import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentEto;
import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentSearchCriteriaTo;
import com.devon4j.application.smsj.studentmanagement.service.api.rest.StudentmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Studentmanagement}.
 */
@Named("StudentmanagementRestService")
public class StudentmanagementRestServiceImpl implements StudentmanagementRestService {

  @Inject
  private Studentmanagement studentmanagement;

  @Override
  public StudentEto getStudent(long id) {

    return this.studentmanagement.findStudent(id);
  }

  @Override
  public StudentEto saveStudent(StudentEto student) {

    return this.studentmanagement.saveStudent(student);
  }

  @Override
  public void deleteStudent(long id) {

    this.studentmanagement.deleteStudent(id);
  }

  @Override
  public Page<StudentEto> findStudents(StudentSearchCriteriaTo searchCriteriaTo) {

    return this.studentmanagement.findStudents(searchCriteriaTo);
  }
}