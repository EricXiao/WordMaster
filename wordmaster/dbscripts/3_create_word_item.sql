use wordmaster;
create table wm_word_item(
	id bigint AUTO_INCREMENT primary key not null, 
	word varchar(256) unique key, 
	chinese_translation varchar(1024) CHARACTER SET utf8,
	english_translation varchar(1024),
	note varchar(2048)
);

