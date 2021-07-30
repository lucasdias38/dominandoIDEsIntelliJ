package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("A volta", 250);
        System.out.println(livro);
    }
}

    class Livro {
        private String nome;
        private  Integer numPag;

        public Livro(String nome, Integer numPag){
            this.nome = nome;
            this.numPag = numPag;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPag() {
            return numPag;
        }
        public void setNumPag(Integer numPag) {
            this.numPag = numPag;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPag=" + numPag +
                    '}';
        }
    }



