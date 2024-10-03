public class VideoDigital extends ItemBibliotecaDigital implements Visualizavel, Baixavel {
    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    public String descricao() {
        return "Video Digital: " + getTitulo() + " by " + getAutor();
    }

    public void visualizar() {
        System.out.println("Visualizando o vídeo digital: " + getTitulo());
    }

    public void baixar() {
        System.out.println("Baixando o vídeo digital: " + getTitulo());
    }
}