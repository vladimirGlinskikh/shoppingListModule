create table users
(
    id       bigserial
        primary key,
    password varchar(255) not null,
    username varchar(255) not null
        constraint uk_r43af9ap4edm43mmtq01oddj6
            unique
);

GO

alter table users
    owner to admin;

GO