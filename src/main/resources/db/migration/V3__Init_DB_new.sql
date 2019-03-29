alter table if exists docx_context(
        id int8 not null,
        doc_date timestamp not null,
        doc_money int8,
        doc_money_ua varchar(255),
        doc_number varchar(255) not null,
        doc_service varchar(255),
        doc_works varchar(255),
        fop_address varchar(255),
        fop_date timestamp,
        fop_fio varchar(255) not null,
        fop_money_number varchar(255),
        fop_number varchar(255) not null,
        fop_passport varchar(255),
        fop_passport_number int8,
        fop_telephone varchar(255),
        primary key (id)
);

create table user_role(
        user_id int8 not null,
        roles varchar(255)
);

create table usr(id int8 not null,
        active boolean not null,
        password varchar(255),
        username varchar(255),
        primary key (id)
);

