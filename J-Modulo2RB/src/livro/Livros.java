package livro;

import java.util.Calendar;
import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name = "Livro")
public class Livros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_Livro", nullable = false)
	private int ID_LIVRO;
	
	@Column(name = "AUTOR", nullable = false)
	private String AUTOR;
	
	@Column(name = "TITULO", nullable = false)
	private String TITULO;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "Data_Publicacao", nullable = true)
	private Calendar Data_Publicacao;
	
	public Livros() {
		super();
	}

	public Livros(String aUTOR, String tITULO, Calendar data_Publicacao) {
		super();
		AUTOR = aUTOR;
		TITULO = tITULO;
		Data_Publicacao = data_Publicacao;
	}

	public int getID_LIVRO() {
		return ID_LIVRO;
	}



	public void setID_LIVRO(int iD_LIVRO) {
		ID_LIVRO = iD_LIVRO;
	}



	public String getAUTOR() {
		return AUTOR;
	}



	public void setAUTOR(String aUTOR) {
		AUTOR = aUTOR;
	}



	public String getTITULO() {
		return TITULO;
	}



	public void setTITULO(String tITULO) {
		TITULO = tITULO;
	}



	public Calendar getData_Publicacao() {
		return Data_Publicacao;
	}



	public void setData_Publicacao(Calendar data_Publicacao) {
		Data_Publicacao = data_Publicacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID_LIVRO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		return ID_LIVRO == other.ID_LIVRO;
	}
	
	
	
}
