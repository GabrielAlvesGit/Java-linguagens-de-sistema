package br.edu.ifsp.lp2.model.estudante;

import java.util.HashSet;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Estudante {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 120, nullable = false)
	private String nome;
	private Character sexo;
	private Boolean deficiencia;
	
	//índice de rendimento acadêmico (IRA)
	@Column(name = "ira", precision = 4, scale = 2)
	private Double ira;
	
	@OneToOne
	@JoinColumn(name = "curso_estudante",
				JoinColumns = @JoinColumn(name = "curso_id"),
				inverseJoinColumns = @JoinColumn(name = "curso_id"))
		private Set <Curso> cursos = new HashSet<>();
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public Boolean getDeficiencia() {
		return deficiencia;
	}
	public void setDeficiencia(Boolean deficiencia) {
		this.deficiencia = deficiencia;
	}
	
	public Double getIra() {
		return ira;
	}
	public void setIra(Double ira) {
		this.ira = ira;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(deficiencia, id, nome, sexo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudante other = (Estudante) obj;
		return Objects.equals(deficiencia, other.deficiencia) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(sexo, other.sexo);
	}
	
}
