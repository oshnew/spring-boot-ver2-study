CREATE TABLE `member` (
  `user_id` varchar(50) NOT NULL COMMENT '유저ID',
  `name` varchar(50) NOT NULL COMMENT '유저이름',
  `reg_ymdt` datetime NOT NULL COMMENT '저장일시',
  `mod_ymdt` datetime NOT NULL COMMENT '수정일시',
  PRIMARY KEY (`user_id`)
) ;

insert into member
(user_id, name, reg_ymdt, mod_ymdt)
values
  ('seungha', 'Seung-ha EOM', NOW(), NOW());
