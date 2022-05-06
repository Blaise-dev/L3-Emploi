-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 05 Mai 2022 à 14:55
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `tp_emploi`
--
CREATE DATABASE IF NOT EXISTS `tp_emploi` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `tp_emploi`;

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

DROP TABLE IF EXISTS `administrateur`;
CREATE TABLE IF NOT EXISTS `administrateur` (
  `matricule` char(7) NOT NULL,
  PRIMARY KEY (`matricule`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `administrateur`
--

TRUNCATE TABLE `administrateur`;
--
-- Contenu de la table `administrateur`
--

INSERT INTO `administrateur` (`matricule`) VALUES
('14M9924');

-- --------------------------------------------------------

--
-- Structure de la table `annee`
--

DROP TABLE IF EXISTS `annee`;
CREATE TABLE IF NOT EXISTS `annee` (
  `idAnnee` int(11) NOT NULL AUTO_INCREMENT,
  `anneeDebut` varchar(10) DEFAULT NULL,
  `anneeFin` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idAnnee`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Vider la table avant d'insérer `annee`
--

TRUNCATE TABLE `annee`;
--
-- Contenu de la table `annee`
--

INSERT INTO `annee` (`idAnnee`, `anneeDebut`, `anneeFin`) VALUES
(1, '2021', '2022');

-- --------------------------------------------------------

--
-- Structure de la table `departement`
--

DROP TABLE IF EXISTS `departement`;
CREATE TABLE IF NOT EXISTS `departement` (
  `codeDepartement` varchar(10) NOT NULL,
  `nomDepartement` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codeDepartement`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `departement`
--

TRUNCATE TABLE `departement`;
--
-- Contenu de la table `departement`
--

INSERT INTO `departement` (`codeDepartement`, `nomDepartement`) VALUES
('INF', 'INFORMATIQUE');

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

DROP TABLE IF EXISTS `enseignant`;
CREATE TABLE IF NOT EXISTS `enseignant` (
  `matricule` char(7) NOT NULL,
  `gradeEns` varchar(20) DEFAULT NULL,
  `codeDepartement` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`matricule`),
  KEY `FK_Enseignant_1` (`codeDepartement`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `enseignant`
--

TRUNCATE TABLE `enseignant`;
--
-- Contenu de la table `enseignant`
--

INSERT INTO `enseignant` (`matricule`, `gradeEns`, `codeDepartement`) VALUES
('10D6647', 'Pr', 'INF'),
('11L4475', 'Dr', 'INF'),
('14D5587', 'Dr', 'INF'),
('17T8457', 'Dr', 'INF'),
('20W4715', 'Dr', 'INF');

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `matricule` char(7) NOT NULL,
  `idGrp` int(11) NOT NULL,
  PRIMARY KEY (`matricule`),
  KEY `FK_Etudiant_1` (`idGrp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `etudiant`
--

TRUNCATE TABLE `etudiant`;
--
-- Contenu de la table `etudiant`
--

INSERT INTO `etudiant` (`matricule`, `idGrp`) VALUES
('19W4571', 1),
('18T2510', 2),
('16U2076', 3),
('19M2070', 4);

-- --------------------------------------------------------

--
-- Structure de la table `fairecours`
--

DROP TABLE IF EXISTS `fairecours`;
CREATE TABLE IF NOT EXISTS `fairecours` (
  `codeSalle` varchar(10) NOT NULL,
  `matricule` char(7) NOT NULL,
  `codeMatiere` varchar(10) NOT NULL,
  `idGrp` int(11) NOT NULL,
  `idSem` int(11) NOT NULL,
  `jour` varchar(10) DEFAULT NULL,
  `heureDebut` time NOT NULL,
  `heureFin` time NOT NULL,
  PRIMARY KEY (`codeSalle`,`matricule`,`codeMatiere`,`idGrp`,`idSem`),
  KEY `FK_FaireCours_1` (`matricule`),
  KEY `FK_FaireCours_2` (`codeMatiere`),
  KEY `FK_FaireCours_3` (`idGrp`),
  KEY `FK_FaireCours_4` (`idSem`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `fairecours`
--

TRUNCATE TABLE `fairecours`;
--
-- Contenu de la table `fairecours`
--

INSERT INTO `fairecours` (`codeSalle`, `matricule`, `codeMatiere`, `idGrp`, `idSem`, `jour`, `heureDebut`, `heureFin`) VALUES
('S006', '10D6647', 'INF3176', 5, 1, 'Lundi', '07:00:00', '09:55:00');

-- --------------------------------------------------------

--
-- Structure de la table `filiere`
--

DROP TABLE IF EXISTS `filiere`;
CREATE TABLE IF NOT EXISTS `filiere` (
  `codeFiliere` varchar(30) NOT NULL,
  `nomFiliere` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codeFiliere`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `filiere`
--

TRUNCATE TABLE `filiere`;
--
-- Contenu de la table `filiere`
--

INSERT INTO `filiere` (`codeFiliere`, `nomFiliere`) VALUES
('INF', 'INFORMATIQUE');

-- --------------------------------------------------------

--
-- Structure de la table `groupe`
--

DROP TABLE IF EXISTS `groupe`;
CREATE TABLE IF NOT EXISTS `groupe` (
  `idGrp` int(11) NOT NULL AUTO_INCREMENT,
  `groupeClass` varchar(10) DEFAULT NULL,
  `nomGroupe` varchar(100) NOT NULL,
  `effectif` int(11) NOT NULL,
  `idNiveau` int(11) NOT NULL,
  PRIMARY KEY (`idGrp`),
  KEY `FK_Groupe_0` (`idNiveau`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Vider la table avant d'insérer `groupe`
--

TRUNCATE TABLE `groupe`;
--
-- Contenu de la table `groupe`
--

INSERT INTO `groupe` (`idGrp`, `groupeClass`, `nomGroupe`, `effectif`, `idNiveau`) VALUES
(1, 'G1', 'GROUPE 1', 40, 1),
(2, 'G1', 'GROUPE 1', 40, 2),
(3, 'G1', 'GROUPE 1', 40, 3),
(4, 'G1', 'GROUPE 1', 40, 4),
(5, 'G1', 'GROUPE 1', 40, 5);

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

DROP TABLE IF EXISTS `matiere`;
CREATE TABLE IF NOT EXISTS `matiere` (
  `codeMatiere` varchar(10) NOT NULL,
  `intituleMatiere` varchar(200) DEFAULT NULL,
  `codeDepartement` varchar(100) NOT NULL,
  PRIMARY KEY (`codeMatiere`),
  KEY `FK_Matiere_0` (`codeDepartement`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `matiere`
--

TRUNCATE TABLE `matiere`;
--
-- Contenu de la table `matiere`
--

INSERT INTO `matiere` (`codeMatiere`, `intituleMatiere`, `codeDepartement`) VALUES
('INF3176', 'Techniques de Programmation Avancée', 'INF');

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

DROP TABLE IF EXISTS `niveau`;
CREATE TABLE IF NOT EXISTS `niveau` (
  `idNiveau` int(11) NOT NULL AUTO_INCREMENT,
  `codeNiveau` varchar(10) DEFAULT NULL,
  `nomNiveau` varchar(20) DEFAULT NULL,
  `codeFiliere` varchar(30) NOT NULL,
  PRIMARY KEY (`idNiveau`),
  KEY `FK_Niveau_0` (`codeFiliere`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Vider la table avant d'insérer `niveau`
--

TRUNCATE TABLE `niveau`;
--
-- Contenu de la table `niveau`
--

INSERT INTO `niveau` (`idNiveau`, `codeNiveau`, `nomNiveau`, `codeFiliere`) VALUES
(1, 'L3', 'LICENCE 3', 'INF'),
(2, 'L3', 'LICENCE 3', 'INF'),
(3, 'L3', 'LICENCE 3', 'INF'),
(4, 'L3', 'LICENCE 3', 'INF'),
(5, 'L3', 'LICENCE 3', 'INF');

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

DROP TABLE IF EXISTS `salle`;
CREATE TABLE IF NOT EXISTS `salle` (
  `codeSalle` varchar(10) NOT NULL,
  `nomSalle` varchar(40) DEFAULT NULL,
  `typeSalle` varchar(100) NOT NULL,
  `capacite` int(11) DEFAULT NULL,
  PRIMARY KEY (`codeSalle`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `salle`
--

TRUNCATE TABLE `salle`;
--
-- Contenu de la table `salle`
--

INSERT INTO `salle` (`codeSalle`, `nomSalle`, `typeSalle`, `capacite`) VALUES
('S006', 'Salle 006', 'Salle', 40);

-- --------------------------------------------------------

--
-- Structure de la table `semestre`
--

DROP TABLE IF EXISTS `semestre`;
CREATE TABLE IF NOT EXISTS `semestre` (
  `idSem` int(11) NOT NULL AUTO_INCREMENT,
  `codeSemestre` varchar(10) DEFAULT NULL,
  `nomSem` varchar(20) DEFAULT NULL,
  `idAnnee` int(11) NOT NULL,
  PRIMARY KEY (`idSem`),
  KEY `FK_Semestre_0` (`idAnnee`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Vider la table avant d'insérer `semestre`
--

TRUNCATE TABLE `semestre`;
--
-- Contenu de la table `semestre`
--

INSERT INTO `semestre` (`idSem`, `codeSemestre`, `nomSem`, `idAnnee`) VALUES
(1, 'S2', 'SEMESTRE 2', 1);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `matricule` char(7) NOT NULL,
  `mdp` varchar(100) DEFAULT NULL,
  `nom` varchar(100) DEFAULT NULL,
  `prenom` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `dateNais` date DEFAULT NULL,
  PRIMARY KEY (`matricule`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `utilisateur`
--

TRUNCATE TABLE `utilisateur`;
--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`matricule`, `mdp`, `nom`, `prenom`, `email`, `dateNais`) VALUES
('10D6647', 'tchteMaupi24', 'Maurice', 'Tchuente', 'tchuentemau777@gmail.com', '1958-01-20'),
('11L4475', 'djoucab124', 'Djoumessi', 'Cabrel', 'cabdjoum44@gmail.com', '1974-01-24'),
('14D5587', 'jiofi', 'Fidel Azanzi', 'Jiomekong', 'fidelijiomekong@gmail.com', '1989-04-19'),
('14M9924', 'admFab', 'Fabien Rick', 'Gospa', 'gospafab77@yahoo.fr', '1992-08-11'),
('16U2076', 'dariusst445tem', 'Temgoua Passo', 'Darius Steve', 'dariusstvpasso@gmail.com', '1997-05-03'),
('17T8457', 'Williamsenior', 'William', 'Ngannou', 'ngannouwilliam@gmail.com', '2000-01-24'),
('18T2510', 'cabrel235', 'Djossinkou', 'Boris Cabrel', 'djossinkoucabrel@gmail.com', '2001-01-03'),
('19M2070', 'kouagnangfr16', 'Kouagnang Djidieu', 'Franck Daniel', 'kouagnangfranck25@gmail.com', '2000-09-21'),
('19W4571', 'landry78', 'Landry', 'Ename', 'landryename88@gmail.com', '2002-05-01'),
('20W4715', 'aurel1en', 'Aurelienng', 'Gassam', 'gassamaurelien6@gmail.com', '1995-01-20');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `administrateur`
--
ALTER TABLE `administrateur`
  ADD CONSTRAINT `FK_Administrateur_0` FOREIGN KEY (`matricule`) REFERENCES `utilisateur` (`matricule`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `enseignant`
--
ALTER TABLE `enseignant`
  ADD CONSTRAINT `FK_Enseignant_1` FOREIGN KEY (`codeDepartement`) REFERENCES `departement` (`codeDepartement`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_Enseignant_0` FOREIGN KEY (`matricule`) REFERENCES `utilisateur` (`matricule`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD CONSTRAINT `FK_Etudiant_1` FOREIGN KEY (`idGrp`) REFERENCES `groupe` (`idGrp`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_Etudiant_0` FOREIGN KEY (`matricule`) REFERENCES `utilisateur` (`matricule`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `fairecours`
--
ALTER TABLE `fairecours`
  ADD CONSTRAINT `FK_FaireCours_0` FOREIGN KEY (`codeSalle`) REFERENCES `salle` (`codeSalle`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_FaireCours_1` FOREIGN KEY (`matricule`) REFERENCES `enseignant` (`matricule`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_FaireCours_2` FOREIGN KEY (`codeMatiere`) REFERENCES `matiere` (`codeMatiere`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_FaireCours_3` FOREIGN KEY (`idGrp`) REFERENCES `groupe` (`idGrp`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_FaireCours_4` FOREIGN KEY (`idSem`) REFERENCES `semestre` (`idSem`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `groupe`
--
ALTER TABLE `groupe`
  ADD CONSTRAINT `FK_Groupe_0` FOREIGN KEY (`idNiveau`) REFERENCES `niveau` (`idNiveau`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `matiere`
--
ALTER TABLE `matiere`
  ADD CONSTRAINT `FK_Matiere_0` FOREIGN KEY (`codeDepartement`) REFERENCES `departement` (`codeDepartement`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `niveau`
--
ALTER TABLE `niveau`
  ADD CONSTRAINT `FK_Niveau_0` FOREIGN KEY (`codeFiliere`) REFERENCES `filiere` (`codeFiliere`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `semestre`
--
ALTER TABLE `semestre`
  ADD CONSTRAINT `FK_Semestre_0` FOREIGN KEY (`idAnnee`) REFERENCES `annee` (`idAnnee`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
