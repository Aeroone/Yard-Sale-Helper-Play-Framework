# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table item (
  id                        integer not null,
  sale_event_id             varchar(255),
  seller_name               varchar(255),
  item_name                 varchar(255),
  price                     varchar(255),
  minimum_price             varchar(255),
  location                  varchar(255),
  description               varchar(255),
  transaction_id            varchar(255),
  quantity                  integer,
  photo                     varchar(255),
  constraint pk_item primary key (id))
;

create table sale_event (
  id                        varchar(255) not null,
  user_id                   varchar(255),
  name                      varchar(255),
  address                   varchar(255),
  start_date                varchar(255),
  end_date                  varchar(255),
  item_count                integer,
  closed                    boolean,
  constraint pk_sale_event primary key (id))
;

create table transaction (
  id                        varchar(255) not null,
  sale_event_id             varchar(255),
  user_name                 varchar(255),
  date                      varchar(255),
  total                     double,
  constraint pk_transaction primary key (id))
;

create table user (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  address                   varchar(255),
  hobby                     varchar(255),
  job                       varchar(255),
  islocked                  boolean,
  login_time                integer,
  authority                 varchar(255),
  sale_event_id             varchar(255),
  constraint pk_user primary key (email))
;


create table user_sale_event (
  user_email                     varchar(255) not null,
  sale_event_id                  varchar(255) not null,
  constraint pk_user_sale_event primary key (user_email, sale_event_id))
;
create sequence item_seq;

create sequence sale_event_seq;

create sequence transaction_seq;

create sequence user_seq;




alter table user_sale_event add constraint fk_user_sale_event_user_01 foreign key (user_email) references user (email) on delete restrict on update restrict;

alter table user_sale_event add constraint fk_user_sale_event_sale_event_02 foreign key (sale_event_id) references sale_event (id) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists item;

drop table if exists sale_event;

drop table if exists transaction;

drop table if exists user;

drop table if exists user_sale_event;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists item_seq;

drop sequence if exists sale_event_seq;

drop sequence if exists transaction_seq;

drop sequence if exists user_seq;

