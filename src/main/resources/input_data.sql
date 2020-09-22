insert into User(id,email, is_admin, password,MANAGER_ID) values (default,'dominik.dusinski@gmail.com', true,'$2y$12$.bKB5Bh0cF8kiN9g1OaQSuHy6ftMAvNR5XptDTzrmqdInIyapvaW2', null);
insert into User(id,email, is_admin, password,MANAGER_ID) values (default,'dusiud@gmail.com', false,'$2y$12$xm4L1sS7g90.nTX5LSATTOIcxZkceHbk9hU31i/HWMpzGSEYUX99i',1);

insert into Calendar_Event(event_id,title, start, end, user_Id, is_Enabled, event_Type)
values (default ,'event1','2020-08-21','2020-08-23',1, true,'HOLIDAY' );

insert into Calendar_Event(event_id,title, start, end, user_Id, is_Enabled, event_Type)
values (default,'event2', '2020-08-23','2020-08-25',1, true,'TRAINING');

insert into Calendar_Event(event_id,title, start, end, user_Id, is_Enabled, event_Type)
values (default ,'event3','2020-08-26','2020-08-28',1, true,'HOLIDAY' );

insert into Calendar_Event(event_id,title, start, end, user_Id, is_Enabled, event_Type)
values (default,'event4', '2020-08-29','2020-08-30',2, true,'TRAINING');


