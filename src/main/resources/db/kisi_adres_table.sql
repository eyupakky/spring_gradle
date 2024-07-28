-- public.kisi_adres definition

-- Drop table

-- DROP TABLE public.kisi_adres;

CREATE TABLE public.kisi_adres (
                                   id int8 NOT NULL,
                                   adres varchar(500) NULL,
                                   adres_tip int4 NULL,
                                   aktif bool NULL,
                                   kisi_adres_id int8 NULL,
                                   CONSTRAINT kisi_adres_pkey PRIMARY KEY (id),
                                   CONSTRAINT fk4e2h40fdn2b8tdaxytnyadrig FOREIGN KEY (kisi_adres_id) REFERENCES public.kisi(id)
);

INSERT INTO public.kisi_adres
(id, adres, adres_tip, aktif, kisi_adres_id)
VALUES(1, 'asdasdasdasd', 2, true, 1);
INSERT INTO public.kisi_adres
(id, adres, adres_tip, aktif, kisi_adres_id)
VALUES(2, 'asdasdasdasdasd2', 2, true, 1);
INSERT INTO public.kisi_adres
(id, adres, adres_tip, aktif, kisi_adres_id)
VALUES(3, 'asdasdasd3', 2, true, 1);
INSERT INTO public.kisi_adres
(id, adres, adres_tip, aktif, kisi_adres_id)
VALUES(4, 'asdasdasdasd', 2, true, 2);
INSERT INTO public.kisi_adres
(id, adres, adres_tip, aktif, kisi_adres_id)
VALUES(5, 'asdasdasdasdasd2', 2, true, 2);
INSERT INTO public.kisi_adres
(id, adres, adres_tip, aktif, kisi_adres_id)
VALUES(6, 'asdasdasd3', 2, true, 2);