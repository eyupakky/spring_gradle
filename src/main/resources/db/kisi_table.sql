-- public.kisi definition

-- Drop table

-- DROP TABLE public.kisi;

CREATE TABLE public.kisi (
                             id int8 NOT NULL,
                             adi varchar(100) NULL,
                             soyadi varchar(100) NULL,
                             CONSTRAINT kisi_pkey PRIMARY KEY (id)
);
INSERT INTO public.kisi
(id, adi, soyadi)
VALUES(1, 'Eyup', 'Akkaya');
INSERT INTO public.kisi
(id, adi, soyadi)
VALUES(2, 'Eyup2', 'Akkaya2');