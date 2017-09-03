create database dbproducto;
use dbproducto;


create table tproducto(
  idProducto int auto_increment not null,
  nombreProducto varchar(700) not null,
  precioVenta decimal(8,2) not null,
  fechaVencimiento date not null,
  estado bool not null,
  fechaRegistro timestamp default current_timestamp not null,
  fechaModificacion timestamp default current_timestamp on update current_timestamp not null,
  primary key(idProducto)
);

create table tusuario(
  idUsuario int auto_increment not null,
  usuario varchar(700) not null unique,
  contrasenia varchar(700) not null,
  nombreUsuario varchar(700) not null,
  apellidoPaterno varchar(700) not null,
  apellidoMaterno varchar(700) not null,
  estado bool not null,
  fechaNacimiento date not null,
  primary key(idUsuario)
);

insert into tusuario(idUsuario, usuario, contrasenia, nombreUsuario, apellidoPaterno, apellidoMaterno, estado, fechaNacimiento)values(1, 'arnaldo100493', '100493', 'Arnaldo Andres', 'Barrios', 'Mena', true, '1993-04-10');

select * from tusuario;