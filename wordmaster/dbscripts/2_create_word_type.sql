use wordmaster;
create table wm_word_type (
	id bigint AUTO_INCREMENT primary key not null, 
	code varchar(10) unique key, 
	description varchar(50));

