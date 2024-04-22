package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import enumEComposicao.ComentariosSB;
import enumEComposicao.PostSB;

public class StringBuilderProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		ComentariosSB comentario1 = new ComentariosSB("Have a nice trip");
		ComentariosSB comentario2 = new ComentariosSB("Wow that's awesome!");
		
		PostSB post1 = new PostSB(
				formatacao.parse("21/06/2018 13:05:44"),
				"Traveling to New Zeland",
				"I'm going to visit this wonderful country!",
				12
				);
		
		post1.addComentario(comentario1);
		post1.addComentario(comentario2);
		
		ComentariosSB comentario3 = new ComentariosSB("Good night");
		ComentariosSB comentario4 = new ComentariosSB("May the Force be with you");
		
		PostSB post2 = new PostSB(
				formatacao.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5
				);
		
		post2.addComentario(comentario3);
		post2.addComentario(comentario4);
		
		System.out.println(post1);
		System.out.println(post2);
	}

}