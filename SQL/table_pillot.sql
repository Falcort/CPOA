-- phpMyAdmin SQL Dump
-- version 4.4.15.10
-- https://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Ven 12 Mai 2017 à 14:00
-- Version du serveur :  5.5.52-MariaDB
-- Version de PHP :  5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `cpoa`
--

-- --------------------------------------------------------

--
-- Structure de la table `DEPT`
--

CREATE TABLE IF NOT EXISTS `DEPT` (
  `DEPTNO` int(11) NOT NULL,
  `DNAME` varchar(14) DEFAULT NULL,
  `LOC` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `DEPT`
--

INSERT INTO `DEPT` (`DEPTNO`, `DNAME`, `LOC`) VALUES
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');

-- --------------------------------------------------------

--
-- Structure de la table `EMP`
--

CREATE TABLE IF NOT EXISTS `EMP` (
  `EMPNO` int(11) NOT NULL,
  `ENAME` varchar(10) DEFAULT NULL,
  `JOB` varchar(9) DEFAULT NULL,
  `HIREDATE` date DEFAULT NULL,
  `DEPTNO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `EMP`
--

INSERT INTO `EMP` (`EMPNO`, `ENAME`, `JOB`, `HIREDATE`, `DEPTNO`) VALUES
(2, 'WARD', 'SALESMAN', '2010-01-18', 30),
(3, 'JONES', 'MANAGER', '2010-10-09', 20),
(5, 'KING', 'PRESIDENT', '1998-11-06', 10),
(7, 'CLARK', 'MANAGER', '2014-01-13', 10),
(8, 'BLAKE', 'MANAGER', '2011-10-30', 30),
(9, 'ALLEN', 'SALESMAN', '1999-03-01', 30),
(10, 'SMITH', 'CLERK', '2015-11-28', 20),
(11, 'TURNER', 'SALESMAN', '2005-07-28', 30),
(12, 'ADAMS', 'CLERK', '2016-05-11', 20),
(13, 'JAMES', 'CLERK', '2013-02-15', 30),
(14, 'MARTIN', 'SALESMAN', '2012-01-21', 30),
(15, 'FORD', 'ANALYST', '2013-06-28', 20),
(16, 'MILLER', 'CLERK', '2017-04-05', 10),
(17, 'SCOTT', 'ANALYST', '2001-04-11', 20);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `DEPT`
--
ALTER TABLE `DEPT`
  ADD PRIMARY KEY (`DEPTNO`);

--
-- Index pour la table `EMP`
--
ALTER TABLE `EMP`
  ADD PRIMARY KEY (`EMPNO`),
  ADD KEY `FK_DEPTNO` (`DEPTNO`);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `EMP`
--
ALTER TABLE `EMP`
  ADD CONSTRAINT `FK_DEPTNO` FOREIGN KEY (`DEPTNO`) REFERENCES `DEPT` (`DEPTNO`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
