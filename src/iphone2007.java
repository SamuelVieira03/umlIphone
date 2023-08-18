import java.util.ArrayList;
import Mp3Player;
import Navegadorinternet;

public class Mp3Player {

}
package public static void main(String[]args){
public class iphone {

    private boolean ligado;
    private boolean chamadaRecebida;

    public iphone() {
        ligado = false;
        chamadaRecebida = false;
    }

    public void atender() {
        if (ligado) {
            if (chamadaRecebida) {
                System.out.println("Atender.");
            } else {
                System.out.println("Desligar");
            }
        }
    }

    public void iniciarCorreioVoz() {
        if (ligado) {
            if (!chamadaRecebida) {
                System.out.println("Iniciando correio de voz.");
            } else {
                System.out.println("Não Há mensagens!");
            }
        }
    }

    class Contato {
        private String nome;
        private String numero;

        public Contato(String nome, String numero) {
            this.nome = nome;
            this.numero = numero;
        }

        public String getNome() {
            return nome;
        }

        public String getNumero() {
            return numero;
        }
    }

    public class Agenda {
        private List<Contato> contatos;

        public Agenda() {
            contatos = new ArrayList<>();
        }

        public void adicionarContato(Contato contato) {
            contatos.add(contato);
        }

        public Contato procurarContato(String nome) {
            for (Contato contato : contatos) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    return contato;
                }
            }
            return null;
        }

        public void fazerLigacao(String nome) {
            Contato contato = procurarContato(nome);
            if (contato != null) {
                System.out.println("Ligando para " + contato.getNome() + " (" + contato.getNumero() + ")");
            } else {
                System.out.println("Contato não encontrado.");
            }
        }

        public static void main(String[] args) {
            Agenda minhaAgenda = new Agenda();

            minhaAgenda.adicionarContato(new Contato("João", "123456789"));
            minhaAgenda.adicionarContato(new Contato("Maria", "987654321"));

            String nomeProcurado = "João";
            Contato contatoEncontrado = minhaAgenda.procurarContato(nomeProcurado);
            if (contatoEncontrado != null) {
                System.out.println("Contato encontrado: " + contatoEncontrado.getNome() + " - " + contatoEncontrado.getNumero());
            } else {
                System.out.println("Contato não encontrado.");
            }

            minhaAgenda.fazerLigacao("Maria");
            minhaAgenda.fazerLigacao("Pedro");
        }
    }
}
        }
