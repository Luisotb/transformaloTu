Primer paso: Clonar el repo (solo tienes que hacerlo una vez)
``` 
git clone https://github.com/kant003/transformaloTu.git
```
```
cd transformaloTu
```

Crear una rama nueva y situarse en ella
```
git checkout -b featureXXX
```
Codificar
```
code .
```

Publico los cambios en la rama featureXXX
```
git add Textos.java
git commit -m "subo codigo para completar la feature XXX"
```

Subir los cambios al repositorio remote (github)
```
git push origin featureXXX
```

Lanzar un pull request (PR)
Para ello ir a github y pulsar el 
```
>>> boton de <new pullrequest>
```

Borrar la rama featureXXX
Puedes hacerlo desde github

Refrescamos nuestro proyecto 
```
git pull
```

