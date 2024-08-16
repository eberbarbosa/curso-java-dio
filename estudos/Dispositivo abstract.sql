+-------------------------+
|       Dispositivo       | <<abstract>> 
+-------------------------+
| - modelo: String        |
| - armazenamento: int    |
| - bateria: int          |
+-------------------------+
| + ligar(): void         |
| + desligar(): void      |
| + configurar(): void    |
| + sincronizar(): void   |
+---------+---------------+
          |
          | inherits
+---------+---------------+
|       iPhone            |
+-------------------------+
| - sistemaOperacional: SistemaOperacional |
+-------------------------+
| + ligar(): void         |
| + desligar(): void      |
| + configurar(): void    |
| + sincronizar(): void   |
+---------+---------------+
          |
          | uses
+---------+---------------+
|       Telefone          |
+-------------------------+
| - numeroTelefone: String|
| - historicoChamadas: List<String> |
+-------------------------+
| + fazerChamada(numero: String): void |
| + receberChamada(): void |
+---------+---------------+
          |
          | uses
+---------+---------------+
|       Mensagens         |
+-------------------------+
| - mensagensEnviadas: List<String> |
| - mensagensRecebidas: List<String> |
+-------------------------+
| + enviarMensagem(numero: String, mensagem: String): void |
| + receberMensagem(): void |
+---------+---------------+
          |
          | uses
+---------+---------------+
|        Mídia            |
+-------------------------+
| - bibliotecaMidia: List<String> |
+-------------------------+
| + reproduzirMusica(nomeMusica: String): void |
| + exibirImagem(nomeImagem: String): void |
| + reproduzirVideo(nomeVideo: String): void |
+---------+---------------+
          |
          | uses
+---------+---------------+
|     NavegadorWeb        |
+-------------------------+
| - historicoNavegacao: List<String> |
| - favoritos: List<String> |
+-------------------------+
| + navegarParaURL(url: String): void |
| + adicionarFavorito(url: String): void |
+---------+---------------+
          |
          |
+---------+---------------+
| SistemaOperacional      |
+-------------------------+
| - versao: String        |
| - configuracoes: Map<String, String> |
+-------------------------+
| + atualizar(): void     |
| + configurar(opcao: String, valor: String): void |
+-------------------------+

