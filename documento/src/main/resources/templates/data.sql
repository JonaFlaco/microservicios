INSCRIPCION 
INSERT INTO authorities (name, endpoint) values ('Document_Write', 'POST:/api/document/');
INSERT INTO authorities (name, endpoint) values ('Document_Read', 'GET:/api/document/');
INSERT INTO authorities (name, endpoint) values ('DocumentById_Read', 'GET:/api/document/{id}/');
INSERT INTO authorities (name, endpoint) values ('Document_Delete', 'DELETE:/api/document/{id}/');
INSERT INTO authorities (name, endpoint) values ('Document_Update', 'PUT:/api/document/{id}/');
INSERT INTO authorities (name, endpoint) values ('Document_PartialUpdate', 'PATCH:/api/document/');