-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 03 Mai 2022 à 08:04
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

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE IF NOT EXISTS `administrateur` (
  `matricule` char(7) NOT NULL,
  PRIMARY KEY (`matricule`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `annee`
--

CREATE TABLE IF NOT EXISTS `annee` (
  `idAnnee` int(11) NOT NULL,
  `anneeDebut` varchar(10) DEFAULT NULL,
  `anneeFin` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idAnnee`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `departement`
--

CREATE TABLE IF NOT EXISTS `departement` (
  `codeDepartement` varchar(10) NOT NULL,
  `nomDepartement` char(100) DEFAULT NULL,
  PRIMARY KEY (`codeDepartement`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

CREATE TABLE IF NOT EXISTS `enseignant` (
  `matricule` char(7) NOT NULL,
  `gradeEns` varchar(20) DEFAULT NULL,
  `codeDepartement` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`matricule`),
  KEY `FK_Enseignant_1` (`codeDepartement`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE IF NOT EXISTS `etudiant` (
  `matricule` char(7) NOT NULL,
  PRIMARY KEY (`matricule`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `etudiant`
--

INSERT INTO `etudiant` (`matricule`) VALUES
('15P4574');

-- --------------------------------------------------------

--
-- Structure de la table `fairecours`
--

CREATE TABLE IF NOT EXISTS `fairecours` (
  `codeSalle` varchar(10) NOT NULL,
  `matricule` char(7) NOT NULL,
  `codeMatiere` varchar(10) NOT NULL,
  `idGrp` int(11) NOT NULL,
  `idSem` int(11) NOT NULL,
  `jour` varchar(10) DEFAULT NULL,
  `heureDebut` char(10) DEFAULT NULL,
  `heureFin` char(10) DEFAULT NULL,
  PRIMARY KEY (`codeSalle`,`matricule`,`codeMatiere`,`idGrp`,`idSem`),
  KEY `FK_FaireCours_1` (`matricule`),
  KEY `FK_FaireCours_2` (`codeMatiere`),
  KEY `FK_FaireCours_3` (`idGrp`),
  KEY `FK_FaireCours_4` (`idSem`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `filiere`
--

CREATE TABLE IF NOT EXISTS `filiere` (
  `codeFiliere` char(10) NOT NULL,
  `nomFiliere` char(10) DEFAULT NULL,
  PRIMARY KEY (`codeFiliere`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `groupe`
--

CREATE TABLE IF NOT EXISTS `groupe` (
  `idGrp` int(11) NOT NULL,
  `groupeClass` varchar(10) DEFAULT NULL,
  `idNiveau` int(11) NOT NULL,
  PRIMARY KEY (`idGrp`),
  KEY `FK_Groupe_0` (`idNiveau`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

CREATE TABLE IF NOT EXISTS `matiere` (
  `codeMatiere` varchar(10) NOT NULL,
  `intituleMatiere` char(200) DEFAULT NULL,
  PRIMARY KEY (`codeMatiere`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

CREATE TABLE IF NOT EXISTS `niveau` (
  `idNiveau` int(11) NOT NULL,
  `codeNiveau` char(10) DEFAULT NULL,
  `nomNiveau` varchar(20) DEFAULT NULL,
  `codeFiliere` char(10) NOT NULL,
  PRIMARY KEY (`idNiveau`),
  KEY `FK_Niveau_0` (`codeFiliere`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

CREATE TABLE IF NOT EXISTS `salle` (
  `codeSalle` varchar(10) NOT NULL,
  `nomSalle` varchar(40) DEFAULT NULL,
  `typeSalle` varchar(100) NOT NULL,
  `capacite` int(11) DEFAULT NULL,
  PRIMARY KEY (`codeSalle`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `semestre`
--

CREATE TABLE IF NOT EXISTS `semestre` (
  `idSem` int(11) NOT NULL,
  `codeSemestre` char(10) DEFAULT NULL,
  `nomSem` char(10) DEFAULT NULL,
  `idAnnee` int(11) NOT NULL,
  PRIMARY KEY (`idSem`),
  KEY `FK_Semestre_0` (`idAnnee`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `matricule` char(7) NOT NULL,
  `nomUsr` varchar(100) DEFAULT NULL,
  `mdp` varchar(100) DEFAULT NULL,
  `nom` varchar(100) DEFAULT NULL,
  `prenom` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `dateNais` date DEFAULT NULL,
  PRIMARY KEY (`matricule`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`matricule`, `nomUsr`, `mdp`, `nom`, `prenom`, `email`, `dateNais`) VALUES
('15P4574', 'Alex', NULL, 'Chris', 'Alexy', NULL, NULL),
('17D5748', 'Landry', 'land56', 'Aurel', 'Yann', 'landryyan12@yahoo.fr', '2000-02-12'),
('19Q2348', 'Landry', 'land56', 'Aurel', 'Yann', 'landryyan12@yahoo.fr', '2000-02-12');

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
  ADD CONSTRAINT `FK_Etudiant_0` FOREIGN KEY (`matricule`) REFERENCES `utilisateur` (`matricule`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `fairecours`
--
ALTER TABLE `fairecours`
  ADD CONSTRAINT `FK_FaireCours_4` FOREIGN KEY (`idSem`) REFERENCES `semestre` (`idSem`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_FaireCours_0` FOREIGN KEY (`codeSalle`) REFERENCES `salle` (`codeSalle`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_FaireCours_1` FOREIGN KEY (`matricule`) REFERENCES `enseignant` (`matricule`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_FaireCours_2` FOREIGN KEY (`codeMatiere`) REFERENCES `matiere` (`codeMatiere`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_FaireCours_3` FOREIGN KEY (`idGrp`) REFERENCES `groupe` (`idGrp`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `groupe`
--
ALTER TABLE `groupe`
  ADD CONSTRAINT `FK_Groupe_0` FOREIGN KEY (`idNiveau`) REFERENCES `niveau` (`idNiveau`) ON DELETE CASCADE ON UPDATE CASCADE;

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
