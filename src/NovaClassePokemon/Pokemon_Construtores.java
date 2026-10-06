package NovaClassePokemon;

public class Pokemon_Construtores {;

    public static class Pokemon {

        private String nome;
        private String tipo;
        private int nivel;
        private int vida;

        // Construtor completo
        public Pokemon(String nome, String tipo, int nivel, int vida) {
            this.nome = nome;
            this.tipo = tipo;
            this.nivel = nivel;
            this.vida = vida;
        }

        // Construtor vazio
        public Pokemon() {
            this("", "", 0, 0);
        }

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public int getNivel() {
            return nivel;
        }

        public void setNivel(int nivel) {
            this.nivel = nivel;
        }

        public int getVida() {
            return vida;
        }

        public void setVida(int vida) {
            this.vida = vida;
        }

        @Override
        public String toString() {
            return "Pokemon{" +
                    "nome='" + nome + '\'' +
                    ", tipo='" + tipo + '\'' +
                    ", nivel=" + nivel +
                    ", vida=" + vida +
                    '}';
        }
    }
}
