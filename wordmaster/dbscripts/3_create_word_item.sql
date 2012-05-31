use wordmaster;
create table wm_word_item(
	id bigint AUTO_INCREMENT primary key not null, 
	word varchar(256) unique key, 
	chinese_translation varchar(1024) CHARACTER SET utf8,
	english_translation varchar(1024),
	note varchar(2048),
	type_id bigint,
	index word_item_indx1(word),
 	foreign key (type_id) references wm_word_type(id) on delete set null
);


