drop database IF EXISTS management;
create database management;

use management;
create table user (
    id int(11) primary key auto_increment,
    username varchar(50),
    password varchar(50),
    name varchar(50),
    type int(5),
    email varchar(50)
);

create table researchers (
    id int(11) primary key auto_increment,
    name varchar(50),
    sex varchar(10),
    idCard varchar(20),
    birth varchar(20),
    researchUnit varchar(20),
    finalDegree varchar(20),
    finalEducation varchar(20),
    title varchar(20),
    researchDirection varchar(20),
    administrativeDuty varchar(20),
    country varchar(20),
    nation varchar(20),
    address varchar(50),
    postCode varchar(20),
    homePhone varchar(25),
    phone varchar(25),
    email varchar(50),
    officePhone varchar(50),
    academicPartTime varchar(50),
    academicSpecialty varchar(50)
);

create table researcher_path(
    reaId int,
    path varchar(200),
    constraint foreign key(reaId) references researchers(id) ON DELETE CASCADE
);

CREATE TABLE attendMeeting (
    id INT(11) PRIMARY KEY AUTO_INCREMENT,
    attendee VARCHAR(50),
    subordinateUnit VARCHAR(50),
    teachingResearchSection VARCHAR(100),
    conferenceName TEXT,
    sponsor VARCHAR(50),
    meetingType VARCHAR(50),
    disciplineCategory VARCHAR(50),
    participantAddress VARCHAR(50),
    participantDate VARCHAR(20),
    submitThesis VARCHAR(10),
    thesisTitle TEXT,
    invitedReport VARCHAR(10),
    reportTopic TEXT,
    auditStatus VARCHAR(20)
);

CREATE TABLE attendMeeting_path(
    atmId INT,
    path VARCHAR(200),
    CONSTRAINT FOREIGN KEY(atmId) REFERENCES attendMeeting(id) ON DELETE CASCADE
);

