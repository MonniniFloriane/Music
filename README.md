#Music API

Test d'API pour gérer les collections de music pour gérer les albums, leurs genres et les artistes

##Lancement du projet :
- Le dossier "controlleurs" contien les requetes de l'API pour tester la récupération de donner dans PostMan 
(Albums = ElementControlleur, Genre = TableauControlleur et Groupe = ThemeControlleur)
- Le dossier "modele" contient les entités de basse de la BDD (Albums, Genre, et Groupes)
- Le dossier "repos" contient les repository des entités afin de sauvegarder des données au lancement de la BDD
- Le dossier "utils" contient une factory qui permet de creer une biblioteque de groupe et de genre lier à un albums

- Le fichier "MusicAPI" à la source, contient les requetes PostMan

- Le projet est stocker en Local, sur le port 8080, veuillez trouver ci-joint le lien Github pour voir le code plus en détails
"Lien".

- Les dossiers de base du projet se trouvent dans "src>main>java>com.exemple.music".

##Etapes réaliser :

- Etape 1 : Lancement du projet avec les dependance (H2 database, Spring boot, JPA et Faker)
- Etape 2 : Créations des classes (Collection, Collectionneur, et Sets)
- Etape 3 : Gestion des relations et transformation des classes en Entity
- Etape 4 : Test dans la base de donnée local
- Etape 5 : Création de données au lancement de la BDD
- Etape 6 : Creer des routes sur Postman pour afficher sous forme JSON le contenu des classes