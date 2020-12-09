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

create table cuarto(
    numero_cuarto varchar(20) primary key,
    cantidad_pacientes varchar(10),
    cantidad_camas varchar(10),
    n_hospital varchar(100)
);

create table medico(
    codigo_id varchar(20) primary key,
    especialidad varchar(100),
    apellido varchar(100),
    cargo varchar(100),
    nombre varchar(100)
);


alter table paciente
add foreign key (codigo_hc) references historia_clinica(codigo);

alter table historia_clinica
add foreign key (numero_ss_paciente) references paciente(numero_ss);

alter table cuarto
add foreign key (n_hospital) references hospital(nombre);


insert into hospital values("Sanitas","Cali","Vacunas");
insert into paciente (numero_ss, telefono, codigo_hc) values("ABC1234","3156789012","DEF5678");