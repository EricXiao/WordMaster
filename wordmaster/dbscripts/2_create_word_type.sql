use wordmaster;
create table wm_word_type (id bigint primary key not null default 0, code varchar(10) unique key, description varchar(50));

