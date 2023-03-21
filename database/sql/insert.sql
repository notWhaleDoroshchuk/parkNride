-- users
create table if not exists the_table
(
    j jsonb
);
copy the_table (j)
    from '/data/users'
    csv quote e'\x01' delimiter e'\x02';

insert into users(id, email, password, birthday, name, phone_number, surname)
select x.id, x.email, x.password, x.birthday, x.name, x.phone_number, x.surname
from the_table,
     jsonb_to_record(the_table.j)
         as x(
             id              uuid,
             email           varchar,
             password        varchar,
             birthday        timestamp,
             name            varchar,
             phone_number    varchar,
             surname         varchar
         );

drop table the_table;


-- boxes
create table if not exists the_table
(
    j jsonb
);
copy the_table (j)
    from '/data/boxes'
    csv quote e'\x01' delimiter e'\x02';

insert into boxes(id, available, condition, latitude, longitude)
select x.id, x.available, x.condition, x.latitude, x.longitude
from the_table,
     jsonb_to_record(the_table.j)
         as x(
              id          uuid,
              available   integer,
              condition   integer,
              latitude    double precision,
              longitude   double precision
         );

drop table the_table;