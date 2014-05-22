package portugol.lexer;

import portugol.node.*;

public class New_Lexer extends Lexer{
	private int count;
	private TComentInicio comment;
	private StringBuffer text;
	
	public New_Lexer (java.io.PushbackReader in) { 
		super(in);
	}
	protected void filter() { 
		System.out.println("1: "+ text + "fim1");
		if(state.equals(State.COMENTARIO)){ 
			if(comment == null){ 
				comment = (TComentInicio) token;
				text = new StringBuffer(comment.getText());
				count = 1;
				token = null;
			}else{
				text.append(token.getText());
				if(token instanceof TComentInicio)
					count++;
				else if(token instanceof TComentFim)
					count--;
				if(count != 0)
					token = null;
				else{
					System.out.println();
					comment.setText(text.toString());
					token = comment; 
					state = State.NORMAL; 
					comment = null;
				}
			}
		}
	}
}