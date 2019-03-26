# Projet Android 3A - Pokémon OverUsed List
---

# Description du projet

Ce projet est un projet de troisième année d'école d'ingénieur (ESIEA). Il a comme objectif de faire découvrir aux étudiants le **développement android**. La consigne était de créer une application contenant deux vues, une liste et les détails des éléments de cette liste. Il fallait aussi faire un **appel API** pour récupérer les éléments. Étant trésorier du BdJ et aimant particulièrement la stratégie pokémon, j'ai choisi d'utiliser et de modifier une API des sets des pokémons du rang OverUsed (OU) (sur mon GitHub : https://nicolasmeurgues.github.io/pkmnOUAPI/pkmn.json )


# Consignes respectées

- **Récuparatuion des données d'une API REST** disponible sur internet
- **Stockage** des données dans un **modèle JAVA cohérent**
- Architecture **MVC**
- Affichage des données dans une **RecyclerView** avec un **Adapter**
- Utilisation de **plusieurs activités** dont une affichant une **liste de données** et une autre affichant le **détail d'un objet de cette liste**.
- **Présence d'un cache** permettant un fonctionnement hors connexion

# Foncitonnalités

L'application permet de voir la **liste des pokémons** de l'OverUsed et d'en **afficher les détails** grâce à **deux activités**

## Icone

L'icone de l'application a été modifiée pour un maximum de cohérence

<img src="https://cdn.discordapp.com/attachments/443175669329821699/559864705183776788/Screenshot_20190325-232153_Samsung_Experience_Home.jpg" width="100"/>

## Liste des pokémons

Cette activité, la première, a pour but de récupérer les données grâce à **un appel à une API Rest** pour ensuite les afficher sous forme d'une **liste**

<img src="https://media.discordapp.net/attachments/443175669329821699/559866098883887135/Screenshot_20190325-232721_androidPkmn.jpg?width=190&height=326" width="250"/> 

## Écran de détail

Cette activité a pour but d'afficher **les détails** relatifs au pokémon choisi en cliquant dessus.
On y voit le nom du pokémon (en anglais), ainsi que sa nature, son *talent*, son objet et sa répatition d'Evs

<img src="https://media.discordapp.net/attachments/443175669329821699/559872645382799394/Screenshot_20190325-235342_androidPkmn.jpg?width=190&height=326" width="250"/> 

## Conclusion

Ce projet m'a permi de découvrir le dévelopement sous **Android** avec Android Studio et de me familiariser avec la **programmation orientée objet**. En effet, ce projet m'a permi de mettre en oeuvre les principes vus en cours.
