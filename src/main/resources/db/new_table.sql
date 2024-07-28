-- public.new_table definition

-- Drop table

-- DROP TABLE public.new_table;

CREATE TABLE public.new_table (
                             id int8 NOT NULL,
                             adi varchar(100) NULL,
                             soyadi varchar(100) NULL,
                             CONSTRAINT new_table_pkey PRIMARY KEY (id)
);
INSERT INTO public.new_table
(id, adi, soyadi)
VALUES(1, 'Eyup', 'Akkaya');
INSERT INTO public.new_table
(id, adi, soyadi)
VALUES(2, 'Eyup2', 'Akkaya2');