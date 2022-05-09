-- Leave a large ID space reserved for master-data and test-data
CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1000000;

CREATE TABLE Student (
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  rollNumber INTEGER NOT NULL,
  firstName VARCHAR(255) NOT NULL,
  lastName VARCHAR(255) NOT NULL,
  fatherName VARCHAR(255) NOT NULL,
  course VARCHAR(255) NOT NULL,
  year VARCHAR(255) NOT NULL,
  section CHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  mobileNumber BIGINT NOT NULL,
  address VARCHAR(255) NOT NULL,
  pinCode INTEGER NOT NULL,
  CONSTRAINT PK_Student PRIMARY KEY(ID)
);

