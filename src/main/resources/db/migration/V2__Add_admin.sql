insert into usr(id, username, password, active)
    values(2, 'admin', 'admin', true);

insert into user_role(user_id, roles)
values (2, 'USER'), (2, 'ADMIN');
