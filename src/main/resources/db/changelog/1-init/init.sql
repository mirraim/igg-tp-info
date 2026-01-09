CREATE TABLE IF NOT EXISTS material(
    id uuid primary key default uuid_generate_v4(),
    code varchar(225) UNIQUE,
    name varchar(225)
);

CREATE TABLE IF NOT EXISTS gift(
    id uuid primary key default uuid_generate_v4(),
    code varchar(225) UNIQUE,
    name varchar(225)
);

CREATE TABLE IF NOT EXISTS material_gift(
    id serial primary key,
    gift_id uuid REFERENCES gift(id),
    material_id uuid REFERENCES material(id)
);

CREATE TABLE IF NOT EXISTS story(
    id uuid primary key default uuid_generate_v4(),
    name varchar(225)
);

CREATE TABLE IF NOT EXISTS companion(
    id uuid primary key default uuid_generate_v4(),
    name varchar(225),
    gift_id uuid REFERENCES gift(id),
    story_id uuid REFERENCES story(id)
);