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
    constraint foreign key(reaId) references researchers(id)
);

