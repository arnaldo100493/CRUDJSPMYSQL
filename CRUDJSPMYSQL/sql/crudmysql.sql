create database crudmysql;
use crudmysql;

create table producto(
  idProducto int auto_increment not null,
  nombreProducto varchar(700) not null,
  precioVenta decimal(8,2) not null,
  fechaVencimiento date not null,
  estado bool not null,
  fechaRegistro timestamp default current_timestamp not null,
  fechaModificacion timestamp default current_timestamp on update current_timestamp not null,
  primary key(idProducto)
);