# Java Collections Project

**Descripció**:  
Aquest projecte té com a objectiu treballar i consolidar els conceptes fonamentals de les col·leccions en Java (`ArrayList`, `HashSet`, `HashMap` i `ListIterator`). També es practica la lectura i escriptura de fitxers, la interacció amb l’usuari i la correcta organització del codi en classes i mètodes.

---

## 📌 Enunciat del exercici

Aquest projecte està dividit en dos nivells:

### 🟢 Nivell 1

#### Exercici 1 — Duplicats
Treball amb `ArrayList` i `HashSet` utilitzant la classe `Month`.
- Creació d’una llista de mesos.
- Inserció correcta del mes “Agost”.
- Conversió a `HashSet` per observar el comportament davant duplicats.
- Recorregut amb `for` i `Iterator`.

---

#### Exercici 2 — ListIterator
- Creació d’una `List<Integer>`.
- Creació d’una segona llista.
- Inserció d’elements en ordre invers.
- Ús de `ListIterator` per recórrer la primera llista.

---

#### Exercici 3 — Capital Game
Joc de preguntes sobre capitals de països.

Funcionalitats:
- Lectura del fitxer `countries.txt`.
- Emmagatzematge en un `HashMap<String, String>`.
- 10 preguntes aleatòries a l’usuari.
- Càlcul de puntuació.
- Guardat de resultats a `classificacio.txt`.

---

### 🟡 Nivell 2

#### Exercici 1 — HashSet sense duplicats exactes
Classe `Restaurant`:
- Atributs: `name`, `rating`
- Implementació de `equals()` i `hashCode()`
- Evita duplicats exactes (mateix nom i puntuació)

---

#### Exercici 2 — Ordenació múltiple
Ordenació de `Restaurant`:
- Primer per nom (alfabètic)
- Després per puntuació (descendent)
- Ús de `Comparable` o `Comparator`

---

## ✨ Funcionalitats

- Gestió de col·leccions Java (`ArrayList`, `HashSet`, `HashMap`)
- Ús de `ListIterator`
- Eliminació de duplicats
- Ordenació d’objectes personalitzats
- Lectura i escriptura de fitxers
- Joc interactiu amb l’usuari

---

## 🛠 Tecnologies

- Java
- IntelliJ IDEA
- java.util (Collections Framework)
- FileReader / FileWriter

---

## 🚀 Instal·lació i Execució

1. Clonar el repositori:
   ```bash
   git clone https://github.com/ArnauCasals/JavaCollections.git
   ```
2. Obrir el projecte amb IntelliJ IDEA.
3. Assegurar-se que el fitxer countries.txt està dins del projecte.
4. Executar la classe Main.

---

## 📸 Demo

### Exercici 1 — Duplicates

**ArrayList (admet duplicats i manté l’ordre):**

```text
-ArrayList:
January
February
March
April
May
June
July
August
September
September
October
November
December
```

**HashSet (elimina duplicats però NO manté l’ordre):**

```text
-HashSet:
June
May
September
March
April
October
August
December
July
November
January
February
```

**Recorregut amb Iterator (mateix HashSet, ordre no garantit):**

```text
-Iterator:
June
May
September
March
April
October
August
December
July
November
January
February
```

### Exercici 2 — ListIterator

```text
numbers:
[10, 15, 20]

numbers2 (inicial):
[30, 35, 40]
```

### Recorregut invers de numbers2:

```text
40
35
30
```

### Afegint elements de numbers a numbers2 amb ListIterator:

```text
numbers2 final:
[30, 35, 40, 10, 15, 20]
```

> **Explicació:**  
Primer es recorre `numbers2` en ordre invers utilitzant `ListIterator`.  
Després es recorre `numbers` amb un `ListIterator` normal i s’afegeixen els elements a `numbers2`.

> **Nota:** El `HashSet` no garanteix cap ordre dels elements. L’ordre pot variar en cada execució.


### Exercici 3 — Capital Game

### Càrrega de dades

```text
Countries loaded from file → HashMap<String, String>
Ex: Spain → Madrid
    France → Paris
    Italy → Rome
```

---

### Inici del joc

```text
Enter your user:
Arnau

Welcome Arnau Let's start the game
```

---

### Preguntes (exemple d’execució)

```text
What is the capital of Spain? Madrid
Correct

What is the capital of France? Lyon
Wrong

What is the capital of Italy? Rome
Correct
...
```

---

### Resultat final

```text
Game over, Arnau
Your score: 7/10
```

---

### Guardat de puntuació

```text
Score saved successfully.
File: scores.txt

Example content:
Arnau,7
```


### Exercici nivell 2 — HashSet sense duplicats exactes (Restaurant)

### Inserció de dades

```text
restaurants.add(new Restaurant("Can Joan", 5));
restaurants.add(new Restaurant("Can Joan", 5)); // Duplicate
restaurants.add(new Restaurant("Can Joan", 4)); // Mateix nom, diferent puntuació
restaurants.add(new Restaurant("La Brasa", 5));
restaurants.add(new Restaurant("La Brasa", 3));
```

---

### Resultat amb HashSet

```text
Exemple de sortida:

Restaurant{name='Can Joan', rating=5}
Restaurant{name='Can Joan', rating=4}
Restaurant{name='La Brasa', rating=5}
Restaurant{name='La Brasa', rating=3}
```

---

### Explicació

- El `HashSet` elimina duplicats exactes (`name + rating`).
- Es permeten restaurants amb el mateix nom si la puntuació és diferent.
- L’ordre dels elements **no està garantit**.

> Això funciona correctament gràcies a la implementació de `equals()` i `hashCode()` a la classe `Restaurant`.

---

> **Nota:** Les preguntes es generen de forma aleatòria a partir del `HashMap`, per tant cada execució del joc és diferent.

---

## 🧩 Diagrames i justificació de decisions tècniques
- S’han utilitzat col·leccions de Java per practicar diferents estructures de dades.
- ArrayList per mantenir ordre.
- HashSet per evitar duplicats.
- HashMap per associacions país-capital.
- Separació de lògica en classes per millorar mantenibilitat.
- Ús de ListIterator per recorreguts bidireccionals.