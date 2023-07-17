create table if not exists tag
(
    id   serial primary key,
    name varchar(50)
);
create table if not exists story
(
    id   serial primary key,
    name text
);

create table if not exists scene
(
    id   serial primary key,
    name text
);

create table if not exists color
(
    id   serial primary key,
    name text
);

create table if not exists clothing_type
(
    id   serial primary key,
    name varchar(50)
);

create table if not exists tuple
(
    id serial primary key
);

create table if not exists tuple_tag
(
    id serial primary key ,
   tuple_id integer references tuple (id),
   tag_id integer references tag (id)
);

create table if not exists setting
(
    id   bigserial primary key,
    name text,
    tuple_id   integer references tuple (id),
    scene_id   integer references scene (id),
    history_id integer references story (id)
);

create table if not exists cloth
(
    id         bigserial primary key,
    name       text,
    stars      integer,
    setting_id bigint references setting (id),
    type_id    integer references clothing_type (id),
    source     text,
    color_id   varchar(255)
);