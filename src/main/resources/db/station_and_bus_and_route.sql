-- public.route definition

-- Drop table

-- DROP TABLE public.route;

CREATE TABLE public.route (
                              id int8 NOT NULL,
                              route_name varchar(255) NOT NULL,
                              CONSTRAINT route_pkey PRIMARY KEY (id)
);
-- public.station definition

-- Drop table

-- DROP TABLE public.station;

CREATE TABLE public.station (
                                id int8 NOT NULL,
                                station_code varchar(255) NOT NULL,
                                station_name varchar(255) NOT NULL,
                                station_x varchar(255) NULL,
                                station_y varchar(255) NULL,
                                route_id int8  NOT NULL,
                                CONSTRAINT station_pkey PRIMARY KEY (id),
                                CONSTRAINT fk9y8el64ewnhgt8x9hflaxuppc FOREIGN KEY (route_id) REFERENCES public.route(id)
);
-- public.bus definition

-- Drop table

-- DROP TABLE public.bus;

CREATE TABLE public.bus (
                            id int8 NOT NULL,
                            code varchar(255) NOT NULL,
                            plate_code varchar(255) NOT NULL,
                            route_id int8 NOT NULL,
                            CONSTRAINT bus_pkey PRIMARY KEY (id),
                            CONSTRAINT fkmrkjerbucw6j8sy8xewrig9wj FOREIGN KEY (route_id) REFERENCES public.route(id)
);