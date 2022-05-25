CREATE DATABASE  IF NOT EXISTS `servicio_tecnico` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `servicio_tecnico`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: servicio_tecnico
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
-- Table structure for table `estados`
--

DROP TABLE IF EXISTS `estados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estados` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estados`
--

LOCK TABLES `estados` WRITE;
/*!40000 ALTER TABLE `estados` DISABLE KEYS */;
INSERT INTO `estados` VALUES (1,'Pendiente'),(2,'En Reparación'),(3,'Reparado'),(4,'Sin Solución');
/*!40000 ALTER TABLE `estados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordenes`
--

DROP TABLE IF EXISTS `ordenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ordenes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre1` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `nombre2` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `apellido1` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `apellido2` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `direccion` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `comuna` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `region` int NOT NULL,
  `telefono` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `producto` int NOT NULL,
  `fecha_ingreso` date NOT NULL,
  `estado` int NOT NULL,
  `fecha_mod` date NOT NULL,
  `observaciones` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `rut` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL,
  PRIMARY KEY (`id`),
  KEY `region` (`region`),
  KEY `producto` (`producto`),
  KEY `estado` (`estado`),
  CONSTRAINT `ordenes_ibfk_1` FOREIGN KEY (`region`) REFERENCES `regiones` (`id`),
  CONSTRAINT `ordenes_ibfk_2` FOREIGN KEY (`producto`) REFERENCES `productos` (`id`),
  CONSTRAINT `ordenes_ibfk_3` FOREIGN KEY (`estado`) REFERENCES `estados` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordenes`
--

LOCK TABLES `ordenes` WRITE;
/*!40000 ALTER TABLE `ordenes` DISABLE KEYS */;
INSERT INTO `ordenes` VALUES (1,'Francisco','Javier','Lagos','Rojas','Puente Viejo 642','La Unión',14,'945235522',7,'2022-04-11',3,'2022-04-16','Equipo reparado. Todo funciona normal.','12333444-5'),(2,'Francisco','Javier','Lagos','Rojas','Puente Viejo 642','La Unión',14,'945235522',4,'2022-04-13',1,'2022-04-13','El ciclo de centrifugado no funciona.','12333444-5'),(3,'José','Manuel','Echeverría','Martinez','Av Las Desapariciones 404','Talca',9,'945936672',1,'2022-04-14',1,'2022-04-14','Cable de alimentación eléctrica en mal estado.','18606404-5'),(4,'Luis','Alberto','Muñoz','Espinoza','Av Estación 693','Villarrica',12,'966552323',3,'2022-04-13',4,'2022-04-15','Motor en estado irreparable. No hay repuestos disponibles.','16403652-4'),(5,'Francisco','Javier','Lagos','Rojas','Puente Viejo 642','La Unión',14,'945235522',2,'2022-04-15',1,'2022-04-15','Al funcionar, la licuadora hace un sonido extraño.','12333444-5'),(6,'Christine','Rose','Palmer','McAdams','Bleecker Street 177A','Santiago',7,'943225502',3,'2022-04-08',1,'2022-04-08','El motor opera de forma continuada por muchas horas, emitiendo un sonido molesto.','18903622-1'),(7,'Eleuterio','Raimundo','Faúndez','Lobos','Los Pastores 703','Melipeuco',12,'955220763',6,'2022-04-12',3,'2022-04-16','Se han reemplazado los puertos HDMI dañados.','9565333-K'),(8,'Federico','Arturo','Contreras','Villalobos','Gabriela Mistral 200','Punta Arenas',16,'945700101',7,'2022-04-01',1,'2022-04-01','El tostador no regula correctamente la temperatura y el tiempo de tostado.','20133222-0'),(9,'Norma','Carolina','Gutierrez','Montenegro','Arturo Prat 2105','Iquique',2,'921051879',6,'2022-04-05',1,'2022-04-16','Equipo restaurado a su condición de fábrica. La conexión a internet está operativa.','15602344-7'),(10,'Raúl','Alejandro','Almunátegui','San Martín','Los Cipreses 402','Colina',7,'977663344',3,'2022-03-31',3,'2022-04-16','Luces interiores reemplazadas.','17646225-2'),(11,'Manuel','Renato','Villarroel','Troncoso','Av Las Encinas 2103','Temuco',12,'954236076',1,'2022-03-31',1,'2022-03-31','En enrollado automático del cable de la aspiradora, se dañó.','15606232-2'),(12,'José','Cristobal','Contreras','Fuentes','Luis Advis 1212','Pucón',12,'977445522',6,'2022-04-04',1,'2022-04-04','Hay pixeles quemados en la pantalla.','18434636-2'),(13,'Camila','Alejandra','Cerda','Fernandez','Chinook 777','Osorno',14,'977665511',1,'2022-04-16',1,'2022-04-16','Sale olor a quemado cada vez que se enciende.','19607978-5'),(14,'Claudio','Alberto','Arredondo','Martinez','Los Álamos 211','Cunco',12,'999223344',1,'2022-04-16',1,'2022-04-16','La aspiradora no enciende.','10664555-1'),(15,'Carlos','Santiago','Ibáñez','Undurraga','Carlos Martinez 222','Villarrica',12,'977665588',2,'2022-04-16',1,'2022-04-16','Las cuchillas giran en sentido contrario.','12333444-5'),(16,'Claudio','Felipe','Soto','Menares','Arroyo 123','Villarrica',12,'945231111',6,'2022-04-15',1,'2022-04-15','No funciona el audio.','19444333-2'),(17,'José','Eduardo','Obreque','Fuentes','Costanera 1001','Villarrica',12,'973829966',1,'2022-04-16',1,'2022-04-16','No funciona el ajuste de velocidad.','18434636-2'),(18,'Carolina','Alejandra','Cisternas','Mella','Las Araucanas 444','Pucón',12,'977454522',5,'2022-04-16',1,'2022-04-16','No encienden las barras superiores.','12888444-1'),(19,'José','Pedro','Obando','Muñoz','Volcán Osorno 211','Villarrica',12,'922113344',7,'2022-04-16',1,'2022-04-16','El tostador no tuesta el pan.','10664555-6'),(20,'Felipe','Javier','Torobayo','Pereira','Los Andes 211','Linares',9,'966907702',4,'2022-04-15',1,'2022-04-15','No funciona el ciclo de enjuague.','10222333-5'),(21,'Susana','Viviana','San Martín','Camiroaga','Los Cineastas 233','Arica',1,'970702211',2,'2022-04-16',2,'2022-04-16','Se ha verificado que la tecla de encendido está dañada.','10223456-7'),(22,'Irene','Ingrid','Figueroa','Rivera','Los Cantautores 2111','Temuco',12,'977324455',4,'2022-04-14',1,'2022-04-14','El aparato no enciende.','12930777-6'),(23,'Claudio','Roberto','Rebaque','Cid','Los Españoles 200','Temuco',12,'944550022',5,'2022-04-16',1,'2022-04-16','El temporizador no funciona correctamente.','18434636-0'),(24,'Ramón','Alberto','Araneda','Araneda','Los Maitenes 0402','Osorno',14,'910102020',6,'2022-04-15',1,'2022-04-15','No se puede acceder a las configuraciones del televisor.','7666222-K'),(25,'Luisa','Irene','Garrido','Galindo','Luis Durand 1603','Temuco',12,'955443322',7,'2022-04-16',1,'2022-04-16','El aparato no enciende.','18303404-1');
/*!40000 ALTER TABLE `ordenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Aspiradora'),(2,'Licuadora'),(3,'Refrigerador'),(4,'Lavadora'),(5,'Horno Eléctrico'),(6,'Televisor LED'),(7,'Tostador');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regiones`
--

DROP TABLE IF EXISTS `regiones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `regiones` (
  `id` int NOT NULL AUTO_INCREMENT,
  `region` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regiones`
--

LOCK TABLES `regiones` WRITE;
/*!40000 ALTER TABLE `regiones` DISABLE KEYS */;
INSERT INTO `regiones` VALUES (1,'Arica y Parinacota'),(2,'Tarapacá'),(3,'Antofagasta'),(4,'Atacama'),(5,'Coquimbo'),(6,'Valparaiso'),(7,'Metropolitana de Santiago'),(8,'Libertador General Bernardo O\'Higgins'),(9,'Maule'),(10,'Ñuble'),(11,'Biobío'),(12,'La Araucanía'),(13,'Los Ríos'),(14,'Los Lagos'),(15,'Aysén del General Carlos Ibáñez del Campo'),(16,'Magallanes y de la Antártica Chilena');
/*!40000 ALTER TABLE `regiones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `rol` int NOT NULL,
  `rut` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name_UNIQUE` (`user_name`),
  UNIQUE KEY `rut_UNIQUE` (`rut`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'tecnico','12345',1,'12345678-9'),(2,'cliente','12345',2,'12333444-5');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-16 21:29:39
