# Progetto di Comunicazione Socket in Java

## Panoramica

Questo progetto Java dimostra una semplice comunicazione client-server utilizzando le socket. Il client e il server stabiliscono una connessione, e vengono visualizzate informazioni sulla connessione.

## Come iniziare

### Prerequisiti

- Java Development Kit (JDK) installato sulla tua macchina.

### Clonare il Repository

```bash
git clone https://github.com/Yassoss/TCPClientServer.git
```

### Struttura del Progetto

```
TCPClientServer/
│
├──
│   ├── Client.java
│   └── Server.java
│
├── .gitignore
└── README.md
```

## Utilizzo

1. Apri un terminale e naviga nella directory del progetto.

### Esecuzione del Server

```bash
javac src/Server.java
java src.Server
```

Il server sarà in ascolto per i client.

### Esecuzione del Client

```bash
javac src/Client.java
java src.Client
```

Il Client si connetterà al Server e i dettagli della connessione verranno visualizzati.

### Chiusura della Connessione

La connessione si chiude automaticamente dopo aver visualizzato i dettagli della connessione.

## Personalizzazione

- Puoi modificare l'indirizzo IP e la porta nel codice in base alle tue esigenze.
- Regola i valori di timeout e altri parametri secondo le necessità.

## Riconoscimenti

- Questo progetto è una semplice implementazione dei socket a scopo educativo.

---