create table hospital(
    nombre varchar(100) primary key,
    ciudad varchar(100),
    especialidad varchar(100)
);

create table paciente(
    numero_ss varchar (20),
    domicilio varchar(50),
    telefono varchar(12),
    codigo_hc varchar(20),

    primary key(numero_ss)
);

create table historia_clinica(
    codigo varchar(20) primary key,
    numero_cama varchar(5),
    fecha_ingreso date,
    fecha_salida date,
    ingresos_anteriores integer,
    numero_ss_paciente varchar(20)
);

alter table paciente
add foreign key (codigo_hc) references historia_clinica(codigo);