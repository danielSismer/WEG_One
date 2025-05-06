-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: weg_one
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `orientacoes`
--

DROP TABLE IF EXISTS `orientacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orientacoes` (
  `id` int NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `descricao` text,
  `exemplo` text,
  `tipo_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tipo_id` (`tipo_id`),
  CONSTRAINT `orientacoes_ibfk_1` FOREIGN KEY (`tipo_id`) REFERENCES `tipos_orientacao` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orientacoes`
--

LOCK TABLES `orientacoes` WRITE;
/*!40000 ALTER TABLE `orientacoes` DISABLE KEYS */;
INSERT INTO `orientacoes` VALUES (1,'Motores Elétricos WEG','Antes de iniciar a operação do motor, verifique a integridade dos cabos de alimentaçãoe a conexão correta à rede elétrica. Aumente gradualmente a carga no motor para evitar picos de corrente no início da operação. Monitore a temperatura do motor durante as primeiras horas de operação, especialmente em motores de alta potência.','Em motores WEG de indução, sempre verifique a configuração de partida (estrela-triângulo ou partida direta) conforme a especificação do fabricante para evitar sobrecarga no momento da partida.',1),(2,'Operação de Geradores WEG','Certifique-se de que o gerador está corretamente instalado e com os níveis de óleo e combustível adequados. Durante operação, monitore constantemente os parâmetros de tensão e corrente. Evite sobrecarga, pois pode danificar o gerador e reduzir a vida útil dos componentes.','Para geradores WEG de maior capacidade, é recomendado o uso de sistemas de monitoramento remoto para verificar a performance e o status dos componentes, como nível de combustível e temperatura.',1),(3,'Procedimento de Segurança para Instalação de Equipamentos Elétricos','Antes de iniciar a instalação de qualquer equipamento elétrico, como motores e transformadores WEG, desconecte toda a alimentação elétrica e realize o aterramento adequado. Utilize ferramentas isoladas e verifique o ambiente quanto à presença de materiais inflamáveis ou risco de curto-circuito.','Durante a instalação de um transformador WEG, garanta que o painel de controle esteja devidamente identificado e sinalizado para evitar conexões erradas que possam causar falhas no sistema.',2),(4,'Operações com Risco de Choque Elétrico','Sempre use equipamentos de proteção individual (EPIs) adequados, como luvas isolantes e botas de segurança, antes de realizar qualquer manutenção ou inspeção em equipamentos energizados. Durante a operação de equipamentos de alta tensão, siga os procedimentos de bloqueio e etiquetagem (LOTO) para garantir que o sistema esteja desligado.','Exemplo Prático: No caso de manutenção de transformadores WEG de alta tensão, desconecte a alimentação elétrica, utilize chaves de bloqueio e verifique com um multímetro a ausência de tensão nos terminais.',2),(5,'Manutenção de Motores Elétricos','Realize inspeções regulares nos rolamentos, verificando ruídos anormais ou aquecimento excessivo Lubrifique os rolamentos conforme as instruções do fabricante e substitua-os se necessário Verifique a conexão dos terminais elétricos e a presença de sinais de desgaste ou corrosão.',' Para motores WEG, recomenda-se a realização de manutenção preventiva a cada 1.000 horas de operação, incluindo a verificação do alinhamento do motor e o teste de resistência do isolamento.',3),(6,' Reparo de Transformadores',' Quando realizar reparos em transformadores WEG, sempre faça uma análise cuidadosa da situação de cada componente, como bobinas e buchas. Caso haja falha nas buchas ou nos isoladores,\n  substitua-os imediatamente. Em caso de curto-circuito no interior do transformador,\n  realize testes de resistência de isolamento e verifique o nível de óleo.',' Se um transformador WEG apresentar aquecimento excessivo,\n  além de verificar o nível de óleo, examine o radiador e limpe as ventoinhas para garantir uma boa dissipação de calor.',3),(7,'Testes de Funcionamento de Motores','Para garantir que o motor WEG está operando corretamente, execute testes de partida em vazio,\n  monitorando a corrente elétrica e a rotação. Após a operação,\n  verifique a temperatura do motor e as vibrações para identificar possíveis falhas mecânicas.','Durante os testes de carga, monitore a eficiência do motor e se a corrente está\n  dentro dos parâmetros especificados pelo fabricante para evitar danos ao equipamento.',4),(8,'Diagnóstico de Falhas em Sistemas de Automação','No diagnóstico de falhas em sistemas de automação da WEG, como controladores e inversores de frequência,\n  utilize ferramentas de diagnóstico de comunicação como modbus ou ethernet para verificar possíveis falhas de comunicação.\n  Revise os logs de erros e teste os sensores e atuadores para garantir que todos os sistemas estão funcionando corretamente.','Para sistemas de automação WEG com inversores de frequência,\n  execute um teste de carga variável para identificar falhas em processos de controle de velocidade e torque.',4),(9,'Conduta no Setor de Montagem',' No setor de montagem, os colaboradores devem seguir rigorosamente os procedimentos de segurança e as normas de qualidade da WEG.\n  Devem garantir que as ferramentas e equipamentos estejam sempre em boas condições,\n  realizando inspeções periódicas e manutenções preventivas.','Ao montar motores elétricos WEG, é fundamental verificar se as peças estão corretamente\n  alinhadas e se todas as conexões elétricas estão firmemente apertadas, prevenindo falhas e retrabalho.',5),(10,'Procedimentos Operacionais no Setor de Manutenção',' No setor de manutenção, os técnicos devem seguir processos específicos de diagnóstico e reparo, sempre utilizando os EPIs adequados e ferramentas apropriadas.\n  É obrigatório registrar todas as manutenções e trocas de componentes no sistema de gestão da empresa de forma precisa e atualizada.','Durante a manutenção de um inversor de frequência WEG,\n  o técnico deve inspecionar cuidadosamente os componentes eletrônicos internos\n  (como resistores e capacitores) e realizar testes de isolamento, assegurando a integridade e segurança do equipamento.',5);
/*!40000 ALTER TABLE `orientacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos_orientacao`
--

DROP TABLE IF EXISTS `tipos_orientacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos_orientacao` (
  `id` int NOT NULL,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos_orientacao`
--

LOCK TABLES `tipos_orientacao` WRITE;
/*!40000 ALTER TABLE `tipos_orientacao` DISABLE KEYS */;
INSERT INTO `tipos_orientacao` VALUES (1,'Manual de operação'),(2,'Procedimento de Segurança'),(3,'Manutenção e Reparos'),(4,'Testes e Diagnóstico'),(5,'Manual de Conduta e Operações Setoriais');
/*!40000 ALTER TABLE `tipos_orientacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'teste_admin','Bitcoin2025','2025-05-02 21:32:29');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios_inativo`
--

DROP TABLE IF EXISTS `usuarios_inativo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios_inativo` (
  `id` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `deleted_at` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios_inativo`
--

LOCK TABLES `usuarios_inativo` WRITE;
/*!40000 ALTER TABLE `usuarios_inativo` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios_inativo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'weg_one'
--

--
-- Dumping routines for database 'weg_one'
--
/*!50003 DROP PROCEDURE IF EXISTS `Cadastrar_Usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`DanielAdmin`@`%` PROCEDURE `Cadastrar_Usuario`(IN email VARCHAR (255), IN senha VARCHAR (255))
BEGIN

INSERT INTO usuarios (email, senha )
VALUES (email, senha);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Deletar_Usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`DanielAdmin`@`%` PROCEDURE `Deletar_Usuario`(IN id_deletar INT)
BEGIN
   
    INSERT INTO usuarios_inativo (id, email, senha)
    SELECT id, email, senha
    FROM usuarios
    WHERE id = id_deletar;

    DELETE FROM usuarios
    WHERE id = id_deletar;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-02 18:33:56
