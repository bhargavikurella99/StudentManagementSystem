package com.devon4j.application.smsj.studentmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devon4j.application.smsj.general.logic.base.AbstractUc;
import com.devon4j.application.smsj.studentmanagement.dataaccess.api.repo.StudentRepository;

/**
 * Abstract use case for Students, which provides access to the commonly necessary data access objects.
 */
public abstract class AbstractStudentUc extends AbstractUc {

  /** @see #getStudentRepository() */
  @Inject
  private StudentRepository studentRepository;

  /**
   * @return the {@link StudentRepository} instance.
   */
  public StudentRepository getStudentRepository() {

    return this.studentRepository;
  }

}
