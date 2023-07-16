
create table if not exists tag(
                                  id serial primary key,
                                  name varchar(50)
);
create table if not exists story(
                                      id serial primary key,
                                      name text
);

create table if not exists scene(
                                    id serial primary key,
                                    name text
);

create table if not exists clothing_type(
                                            id serial primary key,
                                            name varchar(50)
);

create table if not exists setting(
                                      id bigserial primary key,
                                      name text
);

create table if not exists tuple(
                                    id serial primary key,
                                    tag1_id integer references tag(id),
                                    tag2_id integer references tag(id)
);

create table if not exists cloth(
                                      id bigserial primary key,
                                      name text,
                                      stars integer,
                                      tuple_id integer references tuple(id),
                                      scene_id integer references scene(id),
                                      history_id integer references story(id),
                                      setting_id bigint references setting(id),
                                      type_id integer references clothing_type(id)
);