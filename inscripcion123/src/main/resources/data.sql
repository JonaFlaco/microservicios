INSCRIPCION 
INSERT INTO authorities (name, endpoint) values ('Inscripcion_Write', 'POST:/api/inscripcion/');
INSERT INTO authorities (name, endpoint) values ('Inscripcion_Read', 'GET:/api/inscripcion/');
INSERT INTO authorities (name, endpoint) values ('InscripcionById_Read', 'GET:/api/inscripcion/{id}/');
INSERT INTO authorities (name, endpoint) values ('Inscripcion_Delete', 'DELETE:/api/inscripcion/{id}/');
INSERT INTO authorities (name, endpoint) values ('Inscripcion_Update', 'PUT:/api/inscripcion/{id}/');
INSERT INTO authorities (name, endpoint) values ('Inscripcion_PartialUpdate', 'PATCH:/api/inscripcion/');