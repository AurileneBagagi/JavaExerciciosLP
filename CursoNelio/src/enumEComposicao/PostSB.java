package enumEComposicao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostSB {
	
	private static SimpleDateFormat formatacaoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String contexto;
	private Integer likes;
	
	List<ComentariosSB> comentarios = new ArrayList<>();
	
	public PostSB() {
	}

	public PostSB(Date momento, String titulo, String contexto, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.contexto = contexto;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContexto() {
		return contexto;
	}

	public void setContexto(String contexto) {
		this.contexto = contexto;
	}
	
	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<ComentariosSB> getComentarios() {
		return comentarios;
	}
	
	public void addComentario(ComentariosSB comentario) {
		comentarios.add(comentario);
	}
	
	public void removeComentario(ComentariosSB comentario) {
		comentarios.remove(comentario);
	}

	@Override
	public String toString() {
		StringBuilder postCompleto = new StringBuilder();
		postCompleto.append(titulo + "\n" + likes + " Likes - ");
		postCompleto.append(formatacaoData.format(momento));
		postCompleto.append("\n" + contexto + "\nComents:\n");
		for (ComentariosSB comentario : comentarios) {
			postCompleto.append(comentario.getTexto() + "\n");
		}
		return postCompleto.toString();
	}
	
	

}
