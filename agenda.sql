-- MySQL dump 10.13  Distrib 26.7.0, for macos26.6 (arm64)
--
-- Host: 192.168.1.176    Database: agenda
-- ------------------------------------------------------
-- Server version	8.4.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `agenda`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `agenda` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `agenda`;

--
-- Table structure for table `contactos`
--

DROP TABLE IF EXISTS `contactos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contactos` (
  `id_Contacto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `paterno` varchar(100) DEFAULT NULL,
  `materno` varchar(100) DEFAULT NULL,
  `nombre_buscar` varchar(200) NOT NULL,
  `activo` tinyint(1) NOT NULL,
  `email` varchar(150) NOT NULL,
  `fecha_Creacion` timestamp NULL DEFAULT NULL,
  `fecha_Actualizacion` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id_Contacto`),
  KEY `contactos_nombre_buscar_IDX` (`nombre_buscar`,`activo`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactos`
--

LOCK TABLES `contactos` WRITE;
/*!40000 ALTER TABLE `contactos` DISABLE KEYS */;
INSERT INTO `contactos` VALUES (1,'prueba','ejemplo','Mercado','Daniel Gaona Mercado',0,'isc.gaona@gmail.com','2026-10-10 00:00:00','2020-10-01 00:00:00');
/*!40000 ALTER TABLE `contactos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contactos_telefonos`
--

DROP TABLE IF EXISTS `contactos_telefonos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contactos_telefonos` (
  `id_contactos_telefonos` int NOT NULL AUTO_INCREMENT,
  `idContacto` int DEFAULT NULL,
  `id_telefonos_contactos` int DEFAULT NULL,
  `activo` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_contactos_telefonos`),
  KEY `contactos_telefonos_telefonos_contactos_FK` (`id_telefonos_contactos`),
  KEY `contactos_telefonos_contactos_FK` (`idContacto`),
  KEY `contactos_telefonos_activo_IDX` (`activo`) USING BTREE,
  CONSTRAINT `contactos_telefonos_contactos_FK` FOREIGN KEY (`idContacto`) REFERENCES `contactos` (`id_Contacto`),
  CONSTRAINT `contactos_telefonos_telefonos_contactos_FK` FOREIGN KEY (`id_telefonos_contactos`) REFERENCES `telefonos_contactos` (`idTelefono_contacto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactos_telefonos`
--

LOCK TABLES `contactos_telefonos` WRITE;
/*!40000 ALTER TABLE `contactos_telefonos` DISABLE KEYS */;
/*!40000 ALTER TABLE `contactos_telefonos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefonos_contactos`
--

DROP TABLE IF EXISTS `telefonos_contactos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefonos_contactos` (
  `idTelefono_contacto` int NOT NULL AUTO_INCREMENT,
  `telefono` varchar(15) NOT NULL,
  `activo` tinyint(1) NOT NULL,
  `fechaCreacion` timestamp NULL DEFAULT NULL,
  `fechaActualizacion` timestamp NULL DEFAULT NULL,
  `cveTipoTelefono` int DEFAULT NULL,
  PRIMARY KEY (`idTelefono_contacto`),
  KEY `telefonos_contactos_tipos_telefonos_FK` (`cveTipoTelefono`),
  CONSTRAINT `telefonos_contactos_tipos_telefonos_FK` FOREIGN KEY (`cveTipoTelefono`) REFERENCES `tipos_telefonos` (`cve_tipo_telefono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefonos_contactos`
--

LOCK TABLES `telefonos_contactos` WRITE;
/*!40000 ALTER TABLE `telefonos_contactos` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefonos_contactos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos_telefonos`
--

DROP TABLE IF EXISTS `tipos_telefonos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos_telefonos` (
  `cve_tipo_telefono` int NOT NULL AUTO_INCREMENT,
  `desc_tipo_telefono` varchar(100) NOT NULL,
  `activo` tinyint(1) NOT NULL,
  PRIMARY KEY (`cve_tipo_telefono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos_telefonos`
--

LOCK TABLES `tipos_telefonos` WRITE;
/*!40000 ALTER TABLE `tipos_telefonos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipos_telefonos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-10-09  9:18:05
