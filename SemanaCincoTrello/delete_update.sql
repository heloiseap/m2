UPDATE Paciente
	SET telefone = '(48)988856611'
	WHERE id = 2; 

DELETE FROM Paciente WHERE nome='Marco Santos';

UPDATE Nutricionista
	SET crn = 'CRN-5/9874'
	WHERE crn = 'CRN-5/9874/S'; 

DELETE FROM Nutricionista WHERE id=4;

UPDATE Consulta
	SET data_consulta = '2024-06-30'
	WHERE data_consulta = '2024-05-30'; 

DELETE FROM Consulta WHERE id=1;

