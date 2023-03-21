create table users
(
    id              uuid,
    email           varchar,
    password        varchar,
    birthday        timestamp,
    name            varchar,
    phone_number    varchar,
    surname         varchar
);

alter table users
    owner to postgres;

create table boxes
(
    id          uuid,
    available   integer,
    condition   integer,
    latitude    double precision,
    longitude   double precision
);

alter table boxes
    owner to postgres