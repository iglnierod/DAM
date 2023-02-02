drop database if exists Kadoo;
create database Kadoo;
use Kadoo;

drop table if exists TEMPLE;
create table TEMPLE(
	NUMEM smallint(3) unsigned primary key
);

drop table if exists TDEPTO;
create table TDEPTO(
	NUMDE smallint(3) unsigned primary key
);

drop table if exists TCENTR;
create table TCENTR(
	NUMCE smallint(2) unsigned primary key
);