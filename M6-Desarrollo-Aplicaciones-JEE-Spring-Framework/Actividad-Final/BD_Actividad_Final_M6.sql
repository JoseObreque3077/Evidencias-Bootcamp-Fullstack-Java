-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: libreria
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `apellido1` varchar(50) COLLATE utf8_bin NOT NULL,
  `apellido2` varchar(50) COLLATE utf8_bin NOT NULL,
  `biografia` varchar(250) COLLATE utf8_bin DEFAULT NULL,
  `nacionalidad` varchar(50) COLLATE utf8_bin NOT NULL,
  `nombres` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_v3hi8f8stj8ea0s82cj5dr19` (`biografia`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (1,'Allende','Llona','Isabel Allende es una escritora chilena con nacionalidad estadounidense, nacida en Perú. Desde 2004 es miembro de la Academia Estadounidense de las Artes y las Letras. Obtuvo el Premio Nacional de Literatura de su país en 2010.','Estadounidense','Isabel'),(2,'Tolkien',' ','John Ronald Reuel Tolkien, fue un escritor, poeta, filólogo, lingüista y profesor universitario británico, conocido principalmente por ser el autor de las novelas clásicas de fantasía heroica El hobbit, El Silmarillion y El Señor de los Anillos.','Británico','J.R.R.');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro` (
  `isbn` varchar(17) COLLATE utf8_bin NOT NULL,
  `anio` int NOT NULL,
  `categoria` varchar(50) COLLATE utf8_bin NOT NULL,
  `edicion` varchar(255) COLLATE utf8_bin NOT NULL,
  `editorial` varchar(75) COLLATE utf8_bin NOT NULL,
  `idioma` varchar(30) COLLATE utf8_bin NOT NULL,
  `paginas` int NOT NULL,
  `titulo` varchar(75) COLLATE utf8_bin NOT NULL,
  `autor_fk` int NOT NULL,
  PRIMARY KEY (`isbn`),
  KEY `FKbrwpq7hoxew7ekwsm9xaod75b` (`autor_fk`),
  CONSTRAINT `FKbrwpq7hoxew7ekwsm9xaod75b` FOREIGN KEY (`autor_fk`) REFERENCES `autor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES ('9788445073810',2003,'Narrativa Fantástica','1ra Edición','Minotauro','Español',416,'El Silmarillón',2),('9789500766647',2022,'Ficción','1ra Edición','Sudamericana','Español',400,'Violeta',1),('9789562476171',2013,'Infantil/Juvenil','4ta Edición','Minotauro','Español',320,'El Hobbit',2),('9789562477062',2013,'Infantil/Juvenil','4ta Edición','Minotauro','Español',547,'El Señor de los Anillos: La Comunidad del Anillo',2),('9789871138906',2004,'Ficción','2da Edición','Debolsillo','Español',456,'La casa de los espíritus',1);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-18 21:24:36
