use wordmaster;
create table wm_word_example(
	id bigint AUTO_INCREMENT primary key not null, 
	example varchar(2048), 
	word_item_id bigint,
	index word_example_indx1(word_item_id),
 	foreign key (word_item_id) references wm_word_item(id) on delete cascade
);


