## Istilah di NLP (Natural Language Processing)

#### Tokenization.
Proses splitting kalimat menjadi beberapa bagian, dan proses ini memerlukan key/karakter.

Contoh:
- Text: `Aku sedang belajar di meja belajar`
- Key : ` ` (spasi)
- Hasil: `["Aku", "sedang", "belajar", "di", "meja", "belajar"]`

#### Token & Term.
`Token` merupakan hasil dari Tokenization, sedangkan `Term` merupakan token yang unik.

Contoh:
- Text: `Aku sedang belajar di meja belajar`
- Key : ` ` (spasi)
- Token: `["Aku", "sedang", "belajar", "di", "meja", "belajar"]`,  Total 6.
- Term: `["Aku", "sedang", "belajar", "di", "meja"]`,  Total 5, karena `belajar` ada 2 dan cukup diambil 1 saja.

#### Stemming.
Proses penghapusan kata imbuhan tanpa merubah ke bentuk asal.

Contoh:
- `Writing` menjadi `Writ`

#### Lemmatization.
Proses penghapusan kata imbuhan dan merubah ke bentuk asal.

Contoh:
- `Writing` menjadi `Write`

#### NER (Named Entity Recognition).
Proses pendeteksian suatu entitas didalam suatu text, contohnya mendeteksi apakah suatu entitas masuk dalam kategori kata benda, tempat, orang dll.

### WS (Word Segmentation).
Proses pemecahan suatu text yang digabung tanpa spasi, contoh dalam kasus hashtag.

Contoh:
- Text: `#choosespain`
- Kemungkinan 1: `choose spain`
- Kemungkinan 2: `chooses pain`
