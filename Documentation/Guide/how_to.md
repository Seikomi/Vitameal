# Guide

[Installer le projet dans eclipse](#installer-le-projet-dans-eclipse)  
[Optenir un rendu Github des .md avec eclipse](#optenir-un-rendu-github-des-md-avec-eclipse)  
[Activer la coloration syntaxique des `.tex` dans eclipse](#activer-la-coloration-syntaxique-des-tex-dans-eclipse)  
[Inclure des images dans les fichiers `.md` sur Github](#inclure-des-images-dans-les-fichiers-md-sur-github)  
[Utiliser pandoc pour convertir les fichiers `.md` en `.tex`](#utiliser-pandoc-pour-convertir-les-fichiers-md-en-tex)  
[Modifier la taille d'affichage des `.svg` dans les `.md`](#modifier-la-taille-d-affichage-des-svg-dans-les-md)  
[Ajouter un retour à la ligne dans un `.md`](#ajouter-un-retour-la-ligne-dans-un-md)

## Installer le projet dans eclipse

* Cloner le projet : `File > Import... > Git > Projects from Git` ;
* Sélectionner `Clone URI` et copier l'adresse suivante : `https://github.com/Seikomi/Vitameal.git` ;
* Entrer votre login et mot de passe Github, puis sélectionner toutes les branches du projet ;
* Sélectionner le dossier de votre système de fichier dans lequel vous voulez cloner le repository ;
* Sélectionner `Import as general projects`
* Séléctioner le projet dans le package explorer et 

## Optenir un rendu Github des `.md` avec eclipse

Les .md sont des fichiers mardown respectant la syntaxe ` TODO GitHub Flavored Markdown link`. Eclipse permet d'optenir un rendu 
correcte de ces fichiers avec le plugin *GitHub Flavored Markdown viewer*.  
Cliquer sur le fichier que vous voulez voir et sélectionner `Show on GFM view`.

##### Eclipse drag & drop installeur :

<a href="http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=900708" class="drag" title="Drag to your running Eclipse workspace.">
  <img class="img-responsive" src="http://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.png" alt="Drag to your running Eclipse workspace." />
</a>


## Activer la coloration syntaxique des `.tex` dans eclipse

Pour activer la coloration syntaxique des `.tex`, installer le plugin eclipse *TeXclispe*.

##### Eclipse drag & drop installeur :

<a href="http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=139" class="drag" title="Drag to your running Eclipse workspace.">
  <img class="img-responsive" src="http://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.png" alt="Drag to your running Eclipse workspace." />
</a>


## Inclure des images dans les fichiers `.md` sur Github

Respecter la syntaxe suivante : 

```
![alt text](https://seikomi.github.io/Vitameal/ + path to the image on github)
```
Exemple:

```markdown
![Diagramme de cas d'utilisation](https://seikomi.github.io/Vitameal/problem_model.svg)
```

## Utiliser pandoc pour convertir les fichiers `.md` en `.tex`

Lancer la commande suivante :

```
pandoc -o [nom du fichier source].md [nom du fichier destination].tex
```

Vous pouver ensuite éditer le `.tex` généré pour une meilleure présentation.

## Modifier la taille d'affichage des `.svg` dans les `.md`

Utiliser la balise html suivante, en passant bien à utiliser `https://seikomi.github.io/Vitameal/` comme
dossier racine  :

```html
<img alt=[alt_text] src=[image_URL] width=[image_width] height=[image_height] />
```

## Ajouter un retour à la ligne dans un `.md`

Ajouter en fin de ligne 2 espaces.

