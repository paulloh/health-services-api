DROP TABLE IF EXISTS prestadores;
 
CREATE TABLE prestadores (
  id INT AUTO_INCREMENT PRIMARY KEY,
  especialidade VARCHAR(50) NOT NULL,
  nome VARCHAR(50) NOT NULL,
  endereco VARCHAR(250) NOT NULL,
  latitude VARCHAR(50) NOT NULL,
  longitude VARCHAR(50) NOT NULL
);
 
INSERT INTO prestadores (especialidade, nome, endereco, latitude, longitude) VALUES
  ('CARDIOLOGIA', 'HCor', 'R. Des. Eliseu Guilherme, 69 Mezanino 2 - Paraíso, São Paulo - SP, 04004-030, Brasil', -23.572663, -46.643659),
  ('ODONTOLOGIA', 'OdontoPrev', 'Avenida Marcos Penteado de Ulhoa Rodrigues - Tamboré, Barueri - SP', -23.505351, -46.837400),
  ('OFTAMOLOGIA', 'Oftalmoclinic', 'Rua Cipriano Taváres - Centro, Osasco - SP', -23.533214, -46.774410),
  ('CARDIOLOGIA', 'Hospital São Luiz', 'Rua Engenheiro Oscar Americano - Jardim Guedala, São Paulo - SP', -23.590819, -46.703088);