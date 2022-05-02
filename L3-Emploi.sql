CREATE TABLE Annee (
 idAnnee INT NOT NULL,
 anneeDebut VARCHAR(10),
 anneeFin VARCHAR(10)
);

ALTER TABLE Annee ADD CONSTRAINT PK_Annee PRIMARY KEY (idAnnee);


CREATE TABLE Departement (
 codeDepartement VARCHAR(10) NOT NULL,
 nomDepartement CHAR(100)
);

ALTER TABLE Departement ADD CONSTRAINT PK_Departement PRIMARY KEY (codeDepartement);


CREATE TABLE Filiere (
 codeFiliere CHAR(10) NOT NULL,
 nomFiliere CHAR(10)
);

ALTER TABLE Filiere ADD CONSTRAINT PK_Filiere PRIMARY KEY (codeFiliere);


CREATE TABLE Matiere (
 codeMatiere VARCHAR(10) NOT NULL,
 intituleMatiere CHAR(200)
);

ALTER TABLE Matiere ADD CONSTRAINT PK_Matiere PRIMARY KEY (codeMatiere);


CREATE TABLE Niveau (
 idNiveau INT NOT NULL,
 codeNiveau CHAR(10),
 nomNiveau VARCHAR(20),
 codeFiliere CHAR(10) NOT NULL
);

ALTER TABLE Niveau ADD CONSTRAINT PK_Niveau PRIMARY KEY (idNiveau);


CREATE TABLE Salle (
 codeSalle VARCHAR(10) NOT NULL,
 nomSalle VARCHAR(40),
 capacite INT
);

ALTER TABLE Salle ADD CONSTRAINT PK_Salle PRIMARY KEY (codeSalle);


CREATE TABLE Semestre (
 idSem INT NOT NULL,
 codeSemestre CHAR(10),
 nomSem CHAR(10),
 idAnnee INT NOT NULL
);

ALTER TABLE Semestre ADD CONSTRAINT PK_Semestre PRIMARY KEY (idSem);


CREATE TABLE Utilisateur (
 matricule CHAR(7) NOT NULL,
 nomUsr VARCHAR(100),
 mdp VARCHAR(100),
 nom VARCHAR(100),
 prenom VARCHAR(100),
 email VARCHAR(100),
 dateNais DATE
);

ALTER TABLE Utilisateur ADD CONSTRAINT PK_Utilisateur PRIMARY KEY (matricule);


CREATE TABLE Administrateur (
 matricule CHAR(7) NOT NULL
);

ALTER TABLE Administrateur ADD CONSTRAINT PK_Administrateur PRIMARY KEY (matricule);


CREATE TABLE Enseignant (
 matricule CHAR(7) NOT NULL,
 gradeEns VARCHAR(20),
 codeDepartement VARCHAR(10)
);

ALTER TABLE Enseignant ADD CONSTRAINT PK_Enseignant PRIMARY KEY (matricule);


CREATE TABLE Etudiant (
 matricule CHAR(7) NOT NULL
);

ALTER TABLE Etudiant ADD CONSTRAINT PK_Etudiant PRIMARY KEY (matricule);


CREATE TABLE Groupe (
 idGrp INT NOT NULL,
 groupeClass VARCHAR(10),
 idNiveau INT NOT NULL
);

ALTER TABLE Groupe ADD CONSTRAINT PK_Groupe PRIMARY KEY (idGrp);


CREATE TABLE FaireCours (
 codeSalle VARCHAR(10) NOT NULL,
 matricule CHAR(7) NOT NULL,
 codeMatiere VARCHAR(10) NOT NULL,
 idGrp INT NOT NULL,
 idSem INT NOT NULL,
 jour VARCHAR(10),
 heureDebut CHAR(10),
 heureFin CHAR(10)
);

ALTER TABLE FaireCours ADD CONSTRAINT PK_FaireCours PRIMARY KEY (codeSalle,matricule,codeMatiere,idGrp,idSem);


ALTER TABLE Niveau ADD CONSTRAINT FK_Niveau_0 FOREIGN KEY (codeFiliere) REFERENCES Filiere (codeFiliere);


ALTER TABLE Semestre ADD CONSTRAINT FK_Semestre_0 FOREIGN KEY (idAnnee) REFERENCES Annee (idAnnee);


ALTER TABLE Administrateur ADD CONSTRAINT FK_Administrateur_0 FOREIGN KEY (matricule) REFERENCES Utilisateur (matricule);


ALTER TABLE Enseignant ADD CONSTRAINT FK_Enseignant_0 FOREIGN KEY (matricule) REFERENCES Utilisateur (matricule);
ALTER TABLE Enseignant ADD CONSTRAINT FK_Enseignant_1 FOREIGN KEY (codeDepartement) REFERENCES Departement (codeDepartement);


ALTER TABLE Etudiant ADD CONSTRAINT FK_Etudiant_0 FOREIGN KEY (matricule) REFERENCES Utilisateur (matricule);


ALTER TABLE Groupe ADD CONSTRAINT FK_Groupe_0 FOREIGN KEY (idNiveau) REFERENCES Niveau (idNiveau);


ALTER TABLE FaireCours ADD CONSTRAINT FK_FaireCours_0 FOREIGN KEY (codeSalle) REFERENCES Salle (codeSalle);
ALTER TABLE FaireCours ADD CONSTRAINT FK_FaireCours_1 FOREIGN KEY (matricule) REFERENCES Enseignant (matricule);
ALTER TABLE FaireCours ADD CONSTRAINT FK_FaireCours_2 FOREIGN KEY (codeMatiere) REFERENCES Matiere (codeMatiere);
ALTER TABLE FaireCours ADD CONSTRAINT FK_FaireCours_3 FOREIGN KEY (idGrp) REFERENCES Groupe (idGrp);
ALTER TABLE FaireCours ADD CONSTRAINT FK_FaireCours_4 FOREIGN KEY (idSem) REFERENCES Semestre (idSem);


