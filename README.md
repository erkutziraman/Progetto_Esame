# Springboot Web Application

Un **Web service** fornisce un **servizio tramite Internet**. Si tratta quindi di un’interfaccia attraverso la quale due dispositivi possono comunicare tra loro tramite il **protocollo HTTP**. Essa consente ai clienti che si collegano con degli applicazioni(browser qualsiasi, Postman ecc) di usufruire delle funzioni che sono messi alla loro disposizione. Con **Spring Boot**, è stato possibile creare questo software che lancia l'intera applicazione web, compreso il web server integrato;
    nel nostro caso sulla porta 8080 `http://localhost:8080`.

L'obiettivo del nostro progetto è di produrre delle statistiche e filtri sui tweet (che raccogliamo **dall'API di twitter**) e loro andamenti temporali, a partire da una lista di almeno **50 post contenenti localizzazioni** (places) con i relativi **ID**; `Funzionando in modalità offline e online`. 

La nostra applicazione permette di richiedere mediante API REST (GET) con rotte distinte:

-   Connessione al API affinché la nostra applicazione possa aggiornare i suoi dati.
-   Restituzione dei metadati, in formato JSON, ovvero l’elenco di tutti i tweet raccolti e trattati dalla nostra application proveniente dal API.
-   Restituzione delle statistiche riguardanti i campi selezionati, in formato JSON.
-   Restituzione dei dati in riferimento ai campi filtrati, in formato JSON.

  
# Istruzione d'uso

Quest'applicazione è stata codificata per essere lanciata quando c'è la connessione alla rete internet **(Modalità Online)** ma anche quando non si può connettersi alla rete **(Modalità Offline)**; 

 ### Lanciare l'applicazione
 **Compilando tutti i file è stato prodotto un file eseguibile** `.jar` 

> Il file eseguibile può essere avviato direttamente dal file .jar e poi essere utilizzato.

> Oppure essere lanciare in un ambiente di svillupo(Eclipse, VS code ecc) rassicurandosi che la JVM, il compilatore e il framework SpringBoot sono stati installati nel Computer  .

Ora l'aplicazione Web Service sarà attiva e in ascolto alla porta http://localhost:8080.
 

### Eseguire richieste

Tramite un software di API testing (nel nostro caso il software **Postman**), si può effetuare delle richieste GET. 
 La seguente tabella mostra le richieste possibili:
  - Raccolta e aggiornamento dei dati:
 
 |    TIPO        |rotta                          |descrizione                                |
|----------------|-------------------------------|-------------------------------------------|
|GET             |/connessione                      |aggiorna i dati che saranno trattati dentro l'applicazione           |
|GET*             |/metadata                          |restituisce l'intero database    |


   - Possibili **statistiche** che si possono richiedere:

 |    TIPO        |rotta                          |descrizione                                |
|----------------|-------------------------------|-------------------------------------------|
|GET             |/statlocation?param=**place_id**      |restituisce una statistica sul luogo presa dal campo *Place_id* contenuto nel database (l'id del campo *place_id* fa riferimento al luogo dentro *location*).
|GET             |/statcountry?param=**country**      |restituisce una statistica sul "paese" presa dal campo *country* contenuto nel database.
|GET             |/statora?param=**Ora**      |restituisce una statistica sul "Ora" presa dal campo Created_at contenuto nel database.     |

- Possibili **filtri** che si possono richiedere:

 |    TIPO        |rotta                          |descrizione                                |
|----------------|-------------------------------|-------------------------------------------|
|GET             |/location?param=**place_id**      |restituisce dei dati filtrati sul "luogo" su cui l'id di *place_id* fa riferimento, contenuto nel database.     |
|GET            |/country?param=**country**      |restituisce dei dati filtrati sul "paese" selezionato contenuto nel database.     |
|GET            |/ora?param=**ora**      |restituisce dei dati filtrati sull' "Ora" selezionato dentro il campo **Created_at** contenuto nel database.     |


> GET* : vuol dire che la comanda deve essere fatta all'inizio quando si ha appena avviato l''applicazione.
> Place_id : corrisponde al luogo che fa riferimento il tweet dentro il campo *location*.

### Particolarità con il Protocollo HTTP
Con le modalità di richieste REST API si può dopo aver lanciato l'applicazione, effettuare i comandi GET con l'applicazione Postman oppure fare le richieste su **qualsiasi browser** (firefox, Google chrome, Opera ecc),
  puntando il localhost 8080 con le rotte viste sopra.

esempio1:  `http://localhost:8080/metadata`
esempio2:  `http://localhost:8080/country?param=Italy`


## 1- Modalità Online

L'obiettivo di quest'applicazione è di raccogliere i dati dal API twitter perciò abbiamo messo la possibilità di aggiornare i tweet con il comando
`http://localhost:8080/connessione`
e poi  trattati con il commando 
`http://localhost:8080/metadata`

dunque l'ordine di **avviamento obbligatorio** dell'applicazione in questa modalità è il seguito:

|    Ordine       |rotta                        |
|----------------|-------------------------------|
|1             |http://localhost:8080/connessione|                            
|2             |http://localhost:8080/metadata                          |

> dopo questi comandi si può fare le altre richieste.

Questa modalità è stata impostata creando due file **twitter1** e **twitter2** che ci servono per salvare i dati presi dal API, cosi ci aiuta ad velocizzare le operazioni dopo la connessione e aver salvato i dati.

## 2- Modalità Offline

Per default certi dati sono già stati salvati,  per conseguenza richiedere l'aggiornamento dei dati con il comando `/connessione` non si deve fare in questa modalità.
> Abbiamo gestito il fatto che sia fatta il comando `/connessione` anche in modalità offline e non influenza sul funzionamento dell'applicazione.

dunque l'ordine di **avviamento obbligatorio** dell'applicazione in questa modalità è il seguito:

|    Ordine       |rotta                        |
|----------------|-------------------------------|
|1             |http://localhost:8080/metadata |

> dopo questa comanda si può fare le altre richieste.


## 3- Metadata

La richiesta `http://localhost:8080/metadata` è molto importante e si deve fare come specificato sopra;
Questa comanda ci aiuta a prelevare i dati che sono **stati salvati** dentro il file supporto **twitter2** (per essere messi dentro una Stringa) e quindi tutte le richieste che verranno fatte di conseguenza saranno **molto più veloci**.


# Sviluppo 

## Software Utilizzati
* [Visual Studio Code](https://code.visualstudio.com/) - ambiente di sviluppo integrato
*  [Postman](https://www.postman.com/) - software di API testing
* [Spring Boot](https://spring.io/projects/spring-boot) - framework per  sviluppo applicazioni Java
* [Maven](https://maven.apache.org/) - strumento di gestione di progetti
* [Microsoft TEAMS](https://www.microsoft.com/en-us/microsoft-365/microsoft-teams/group-chat-software) - software di videochiamata 


## Autori
* **ERKUT ZIRAMAN** - [GitHub](https://github.com/erkutziraman)
* **TOYEM TEZEM RYAN PARFAIT** - [GitHub](https://github.com/toyemryan)

la distribuzione del lavoro non è stata effettuata in modo sistematico, nella gestione dei diversi problemi che abbiamo riscontrato abbiamo usato la funzionalità della `condivizione dello schermo` più la `richiesta del controllo` disponibile su l'applicazione **Microsoft TEAMS**, quindi la distribuzione non uniforme dei commit e degli autori dei classi sarebbe dovuta al fatto che tante classi **sono state scritte da noi due**, **ei commit fatti da un computer**.

> NB: sarebbe saggio specificare che con Visual Studio Code potremmo effettuare direttamente commit su github, quindi dopo una sessione di lavoro decidiamo sempre di fare il commit sul computer su cui stiamo lavorando
