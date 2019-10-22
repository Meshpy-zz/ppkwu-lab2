# Laboratorium 2 - analiza tekstu

API przyjmuje dowolny ciąg znaków i analizuje tekst pod kątem wybranej przez siebie usługi:
  - wystąpienie dużych/małych znaków
  - długość ciągu znaków
  - wystąpienie spacji
  - wystąpienie znaków specjalnych
  - liczba białych znaków
  - liczba dużych liter
  - liczba małych liter
  - liczba znaków specjalnych

# Opis usług
| Metoda | Ścieżka                     | Parametr | Opis                                                |
|--------|-----------------------------|----------|-----------------------------------------------------|
| GET    | /api/length/                | {text}   | Zwraca długość podanego tekstu w parametrze         |
| GET    | /api/contain/whitespace/    | {text}   | Zwraca informację, czy tekst posiada biały znak     |
| GET    | /api/contain/uppercase/     | {text}   | Zwraca informację, czy tekst posiada duży znak      |
| GET    | /api/contain/lowercase/     | {text}   | Zwraca informację, czy tekst posiada mały znak      |
| GET    | /api/contain/specialsymbol/ | {text}   | Zwraca informację, czy tekst posiada znak specjalny |

# Przykładowe wywołanie usługi
```sh
curl http://localhost:8080/api/contain/specialsymbol/testowy$Tekst&@123
```