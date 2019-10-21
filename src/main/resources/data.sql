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
  ('CARDIOLOGIA', 'Hospital São Luiz', 'Rua Engenheiro Oscar Americano - Jardim Guedala, São Paulo - SP', -23.590819, -46.703088),
  ('DERMATOLOGIA', 'Dermaclínica', 'Rua Turiassú - Perdizes, São Paulo - SP', -23.534542, -46.664704),
  ('DERMATOLOGIA', 'Clinica Derma Line', 'Rua Conde de Itu, 550 - Alto da Boa Vista, São Paulo - SP',-23.648531, -46.700395),
  ('GERAL', 'Hospital Sírio Libanês', 'R. Joaquim Floriano, 533 - Itaim Bibi, São Paulo - SP', -23.584930, -46.674750),
  ('FISIOTERAPIA', 'Clínica Finit', 'R. Joaquim Floriano, 243 - Itaim Bibi, São Paulo', -23.533214, -46.774410),
  ('FISIOTERAPIA', 'Espaço Lufisio', 'Av. Fernando Arens, 1337 - Vila Arens/Vila Progresso, Jundiaí - SP', -23.204939, -46.867123),
  ('GERAL', 'Hospital Albert Sabin', 'R. Brg. Gavião Peixoto, 123 - Lapa, São Paulo - SP', -23.525363, -46.711577),
  ('GERAL', 'Hospital Villa-Lobos', 'R. Lituânia, 260 - Mooca, São Paulo - SP', -23.563015, -46.589917),
  ('OFTAMOLOGIA', 'AmpliVision', 'Av. Álvaro Ramos, 2411 - Água Rasa, São Paulo - SP', -23.556030, -46.577949),
  ('CARDIOLOGIA', 'Procardio', 'R. do Oratório, 1606 - Conjunto 1110 - Mooca, São Paulo - SP', -23.565725, -46.589298),
  ('ODONTOLOGIA', 'Uniodonto', 'Av. Brasil, 200 - Vila Itapura, Campinas - SP', -22.891739, -47.061867),
  ('ODONTOLOGIA', 'Riso Dentista', 'R. Antônio Maxímiano da Silva, 81 - Capão Redondo, São Paulo - SP', -23.673934, -46.787314),
  ('ORTOPEDIA', 'Medsul', 'R. Olívia Guedes Penteado, 120 - Socorro, São Paulo - SP', -23.667551, -46.712110),
  ('PEDIATRIA', 'Clínica Fares', 'R. Barão do Rio Branco, 303 - Santo Amaro, São Paulo - SP', -23.652276, -46.708781),
  ('PSIQUIATRIA', 'Essência da Mente', 'Av. Adolfo Pinheiro, 1029 - Santo Amaro, São Paulo - SP', -23.644285, -46.700585),
  ('PODOLOGIA', 'Daopé', 'Rua Moliére, 275 - Jardim Marajoara, São Paulo - SP', -23.657868, -46.692419),
  ('PODOLOGIA', 'P2 Podologia', 'Av. Adolfo Pinheiro, 384 - Santo Amaro, São Paulo - SP', -23.649610, -46.703418);