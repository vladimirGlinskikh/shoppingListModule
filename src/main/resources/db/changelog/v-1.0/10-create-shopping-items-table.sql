create table shopping_items
(
    id      bigserial
        primary key,
    name    varchar(255) not null,
    user_id bigint
        constraint fktpkopyby8qwu1noj4n4t3yuig
            references users
);

GO

alter table shopping_items
    owner to admin;

GO