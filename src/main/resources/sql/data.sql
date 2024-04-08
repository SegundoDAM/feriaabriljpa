-- Insertar usuarios
INSERT INTO Usuario (nombreUsuario, email) VALUES 
('programatico', 'programatico@example.com'),
('datosDeBase', 'datosdebase@example.com'),
('AwesomeService', 'awesomeservice@example.com');

-- Insertar mensajes del usuario 'programatico'
INSERT INTO Mensaje (campo, likes, usuario_nombreUsuario) VALUES 
('Me encanta aprender los fundamentos de programación', true, 'programatico'),
('La programación es fascinante', true, 'programatico'),
('Cada día descubro algo nuevo en el mundo de la programación', false, 'programatico'),
('Los fundamentos de la programación son la base de todo', true, 'programatico'),
('Aprender a programar ha sido una experiencia increíble', true, 'programatico'),
('No puedo imaginar mi vida sin la programación', true, 'programatico'),
('La lógica detrás de la programación es fascinante', true, 'programatico'),
('La programación me permite crear cosas maravillosas', false, 'programatico'),
('Cada línea de código es un mundo de posibilidades', true, 'programatico'),
('La programación es un arte que todos pueden aprender', true, 'programatico');

-- Insertar mensajes del usuario 'datosDeBase'
INSERT INTO Mensaje (campo, likes, usuario_nombreUsuario) VALUES 
('Las bases de datos son esenciales en el mundo digital', true, 'datosDeBase'),
('Las bases de datos hacen que todo funcione de manera más eficiente', false, 'datosDeBase'),
('La importancia de las bases de datos en la gestión de información', true, 'datosDeBase'),
('Los datos son el corazón de cualquier aplicación', false, 'datosDeBase'),
('Las bases de datos nos permiten almacenar y recuperar información de manera rápida', true, 'datosDeBase'),
('Sin bases de datos, la mayoría de las aplicaciones modernas serían inútiles', true, 'datosDeBase'),
('Las bases de datos nos permiten tomar decisiones informadas', true, 'datosDeBase'),
('La evolución de las bases de datos a lo largo del tiempo', false, 'datosDeBase'),
('La importancia de diseñar una base de datos adecuada desde el principio', true, 'datosDeBase'),
('Las bases de datos son el pilar de la informática moderna', true, 'datosDeBase');

-- Insertar mensajes del usuario 'AwesomeService'
INSERT INTO Mensaje (campo, likes, usuario_nombreUsuario) VALUES 
('Los hilos en programación son fascinantes', true, 'AwesomeService'),
('La programación funcional es una forma elegante de resolver problemas', true, 'AwesomeService'),
('JavaScript es un lenguaje versátil y poderoso', false, 'AwesomeService'),
('Los hilos permiten que las aplicaciones realicen múltiples tareas simultáneamente', true, 'AwesomeService'),
('La programación funcional nos permite escribir código más claro y legible', true, 'AwesomeService'),
('JavaScript es el lenguaje de la web', true, 'AwesomeService'),
('La concurrencia en la programación es un tema apasionante', true, 'AwesomeService'),
('La programación funcional nos ayuda a evitar efectos secundarios no deseados', false, 'AwesomeService'),
('JavaScript es la puerta de entrada a la programación moderna', true, 'AwesomeService'),
('Los hilos nos permiten aprovechar al máximo la potencia de nuestros dispositivos', true, 'AwesomeService');
