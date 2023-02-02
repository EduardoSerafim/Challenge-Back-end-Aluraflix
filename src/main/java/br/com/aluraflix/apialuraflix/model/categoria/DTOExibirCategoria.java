package br.com.aluraflix.apialuraflix.model.categoria;

public record DTOExibirCategoria(
        Long id,
        String titulo,
        String cor
) {
    public DTOExibirCategoria(Categoria categoria){
        this(categoria.getId(), categoria.getTitulo(), categoria.getCor());
    }
}
