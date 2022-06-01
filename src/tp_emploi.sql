-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 01 juin 2022 à 08:34
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `tp_emploi`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE `administrateur` (
  `matricule` char(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `administrateur`
--

INSERT INTO `administrateur` (`matricule`) VALUES
('14M9924');

-- --------------------------------------------------------

--
-- Structure de la table `annee`
--

CREATE TABLE `annee` (
  `idAnnee` int(11) NOT NULL,
  `anneeDebut` varchar(10) DEFAULT NULL,
  `anneeFin` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `annee`
--

INSERT INTO `annee` (`idAnnee`, `anneeDebut`, `anneeFin`) VALUES
(1, '2021', '2022');

-- --------------------------------------------------------

--
-- Structure de la table `departement`
--

CREATE TABLE `departement` (
  `codeDepartement` varchar(10) NOT NULL,
  `nomDepartement` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `departement`
--

INSERT INTO `departement` (`codeDepartement`, `nomDepartement`) VALUES
('BIOS', 'BIOLOGIE'),
('CHM', 'CHIMIE'),
('INF', 'INFORMATIQUE'),
('MAT', 'MATHEMATIQUE'),
('PHY', 'PHYSIQUE');

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

CREATE TABLE `enseignant` (
  `matricule` char(7) NOT NULL,
  `gradeEns` varchar(20) DEFAULT NULL,
  `codeDepartement` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `enseignant`
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

CREATE TABLE `etudiant` (
  `matricule` char(7) NOT NULL,
  `idGrp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`matricule`, `idGrp`) VALUES
('16U2076', 5),
('18T2510', 5),
('19M2070', 5),
('19M2219', 5),
('19W4571', 5);

-- --------------------------------------------------------

--
-- Structure de la table `fairecours`
--

CREATE TABLE `fairecours` (
  `codeSalle` varchar(10) NOT NULL,
  `matricule` char(7) NOT NULL,
  `codeMatiere` varchar(10) NOT NULL,
  `idGrp` int(11) NOT NULL,
  `idSem` int(11) NOT NULL,
  `jour` int(11) DEFAULT NULL,
  `heureDebut` varchar(10) NOT NULL,
  `heureFin` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `fairecours`
--

INSERT INTO `fairecours` (`codeSalle`, `matricule`, `codeMatiere`, `idGrp`, `idSem`, `jour`, `heureDebut`, `heureFin`) VALUES
('S006', '10D6647', 'INF3176', 5, 1, 1, '07:00', '09:55');

-- --------------------------------------------------------

--
-- Structure de la table `filiere`
--

CREATE TABLE `filiere` (
  `codeFiliere` varchar(30) NOT NULL,
  `nomFiliere` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `filiere`
--

INSERT INTO `filiere` (`codeFiliere`, `nomFiliere`) VALUES
('BCH', 'BIOCHIMIE'),
('BIOS', 'BIOLOGIE'),
('BOA', 'BIOLOGIE ANIMAL'),
('BOV', 'BIOLOGIE VEGETALE'),
('CHM', 'CHIMIE'),
('INF', 'INFORMATIQUE'),
('MAT', 'MATHEMATIQUE'),
('MIB', 'MICROBIOLOGIE'),
('PHY', 'PHYSIQUE');

-- --------------------------------------------------------

--
-- Structure de la table `groupe`
--

CREATE TABLE `groupe` (
  `idGrp` int(11) NOT NULL,
  `groupeClass` varchar(10) DEFAULT NULL,
  `nomGroupe` varchar(100) NOT NULL,
  `effectif` int(11) NOT NULL,
  `idNiveau` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `groupe`
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

CREATE TABLE `matiere` (
  `codeMatiere` varchar(10) NOT NULL,
  `intituleMatiere` varchar(200) DEFAULT NULL,
  `codeDepartement` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `matiere`
--

INSERT INTO `matiere` (`codeMatiere`, `intituleMatiere`, `codeDepartement`) VALUES
('CHM4057', 'Notion d\'acide', 'CHM'),
('ENG2013', 'English', 'BIOS'),
('FRA2013', 'Francais', 'BIOS'),
('INF3036', 'Base de Donnees', 'INF'),
('INF3046', 'Reseau et Systeme d\'Exploitation', 'INF'),
('INF3176', 'Techniques de Programmation Avancée', 'INF'),
('INF3266', 'Theorie de Code 2', 'INF'),
('INF3276', 'Theorie des nombres', 'INF');

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

CREATE TABLE `niveau` (
  `idNiveau` int(11) NOT NULL,
  `codeNiveau` varchar(10) DEFAULT NULL,
  `nomNiveau` varchar(20) DEFAULT NULL,
  `codeFiliere` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `niveau`
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

CREATE TABLE `salle` (
  `codeSalle` varchar(10) NOT NULL,
  `nomSalle` varchar(40) DEFAULT NULL,
  `typeSalle` varchar(100) NOT NULL,
  `capacite` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`codeSalle`, `nomSalle`, `typeSalle`, `capacite`) VALUES
('A1001', 'Amphi 1001', 'Amphi', 1300),
('A1002', 'Amphi 1002', 'Amphi', 1500),
('A250', 'Amphi 250', 'Amphi', 300),
('A3', 'Amphi 3', 'Amphi', 100),
('A350', 'Amphi 350', 'Amphi', 900),
('A501', 'Amphi 501', 'Amphi', 700),
('A502', 'Amphi 502', 'Amphi', 700),
('S005', 'Salle 005', 'Salle', 30),
('S006', 'Salle 006', 'Salle', 40),
('S007', 'Salle 007', 'Salle', 30),
('S008', 'Salle 008', 'Salle', 40);

-- --------------------------------------------------------

--
-- Structure de la table `semestre`
--

CREATE TABLE `semestre` (
  `idSem` int(11) NOT NULL,
  `codeSemestre` varchar(10) DEFAULT NULL,
  `nomSem` varchar(20) DEFAULT NULL,
  `idAnnee` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `semestre`
--

INSERT INTO `semestre` (`idSem`, `codeSemestre`, `nomSem`, `idAnnee`) VALUES
(1, 'S2', 'SEMESTRE 2', 1);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `matricule` char(7) NOT NULL,
  `mdp` varchar(100) DEFAULT NULL,
  `nom` varchar(100) DEFAULT NULL,
  `prenom` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `dateNais` date DEFAULT NULL,
  `type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`matricule`, `mdp`, `nom`, `prenom`, `email`, `dateNais`, `type`) VALUES
('10D6647', 'tchteMaupi24', 'Maurice', 'Tchuente', 'tchuentemau777@gmail.com', '1958-01-20', 'ens'),
('11L4475', 'djoucab124', 'Djoumessi', 'Cabrel', 'cabdjoum44@gmail.com', '1974-01-24', 'ens'),
('14D5587', 'jiofi', 'Fidel Azanzi', 'Jiomekong', 'fidelijiomekong@gmail.com', '1989-04-19', 'ens'),
('14M9924', 'admFab', 'Fabien Rick', 'Gospa', 'gospafab77@yahoo.fr', '1992-08-11', 'admin'),
('16U2076', 'dariusst445tem', 'Temgoua Passo', 'Darius Steve', 'dariusstvpasso@gmail.com', '1997-05-03', 'etudiant'),
('17T8457', 'Williamsenior', 'William', 'Ngannou', 'ngannouwilliam@gmail.com', '2000-01-24', 'ens'),
('18T2510', 'cabrel235', 'Djossinkou', 'Boris Cabrel', 'djossinkoucabrel@gmail.com', '2001-01-03', 'etudiant'),
('19M2070', 'kouagnangfr16', 'Kouagnang Djidieu', 'Franck Daniel', 'kouagnangfranck25@gmail.com', '2000-09-21', 'etudiant'),
('19M2219', 'ivanna237', 'Nana Nana', 'Guylaine Ivanna', 'yvannanana041@gmail.com', '1999-05-19', 'etudiante'),
('19W4571', 'landry78', 'Landry', 'Ename', 'landryename88@gmail.com', '2002-05-01', 'etudiant'),
('20W4715', 'aurel1en', 'Aurelienng', 'Gassam', 'gassamaurelien6@gmail.com', '1995-01-20', 'ens');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `administrateur`
--
ALTER TABLE `administrateur`
  ADD PRIMARY KEY (`matricule`);

--
-- Index pour la table `annee`
--
ALTER TABLE `annee`
  ADD PRIMARY KEY (`idAnnee`);

--
-- Index pour la table `departement`
--
ALTER TABLE `departement`
  ADD PRIMARY KEY (`codeDepartement`);

--
-- Index pour la table `enseignant`
--
ALTER TABLE `enseignant`
  ADD PRIMARY KEY (`matricule`),
  ADD KEY `FK_Enseignant_1` (`codeDepartement`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`matricule`),
  ADD KEY `FK_Etudiant_1` (`idGrp`);

--
-- Index pour la table `fairecours`
--
ALTER TABLE `fairecours`
  ADD PRIMARY KEY (`codeSalle`,`matricule`,`codeMatiere`,`idGrp`,`idSem`),
  ADD KEY `FK_FaireCours_1` (`matricule`),
  ADD KEY `FK_FaireCours_2` (`codeMatiere`),
  ADD KEY `FK_FaireCours_3` (`idGrp`),
  ADD KEY `FK_FaireCours_4` (`idSem`);

--
-- Index pour la table `filiere`
--
ALTER TABLE `filiere`
  ADD PRIMARY KEY (`codeFiliere`);

--
-- Index pour la table `groupe`
--
ALTER TABLE `groupe`
  ADD PRIMARY KEY (`idGrp`),
  ADD KEY `FK_Groupe_0` (`idNiveau`);

--
-- Index pour la table `matiere`
--
ALTER TABLE `matiere`
  ADD PRIMARY KEY (`codeMatiere`),
  ADD KEY `FK_Matiere_0` (`codeDepartement`);

--
-- Index pour la table `niveau`
--
ALTER TABLE `niveau`
  ADD PRIMARY KEY (`idNiveau`),
  ADD KEY `FK_Niveau_0` (`codeFiliere`);

--
-- Index pour la table `salle`
--
ALTER TABLE `salle`
  ADD PRIMARY KEY (`codeSalle`);

--
-- Index pour la table `semestre`
--
ALTER TABLE `semestre`
  ADD PRIMARY KEY (`idSem`),
  ADD KEY `FK_Semestre_0` (`idAnnee`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`matricule`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `annee`
--
ALTER TABLE `annee`
  MODIFY `idAnnee` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `groupe`
--
ALTER TABLE `groupe`
  MODIFY `idGrp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `niveau`
--
ALTER TABLE `niveau`
  MODIFY `idNiveau` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `semestre`
--
ALTER TABLE `semestre`
  MODIFY `idSem` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Contraintes pour les tables déchargées
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
  ADD CONSTRAINT `FK_Enseignant_0` FOREIGN KEY (`matricule`) REFERENCES `utilisateur` (`matricule`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_Enseignant_1` FOREIGN KEY (`codeDepartement`) REFERENCES `departement` (`codeDepartement`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD CONSTRAINT `FK_Etudiant_0` FOREIGN KEY (`matricule`) REFERENCES `utilisateur` (`matricule`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_Etudiant_1` FOREIGN KEY (`idGrp`) REFERENCES `groupe` (`idGrp`) ON DELETE CASCADE ON UPDATE CASCADE;

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
