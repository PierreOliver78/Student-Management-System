package modulo9.classes;

public class Disciplina {

	private String disciplina1;
	private double nota01;
	private String disciplina2;
	private double nota02;
	private String disciplina3;
	private double nota03;
	private String disciplina4;
	private double nota04;
	
	
	
	public String getDisciplina1() {
		return disciplina1;
	}
	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	public double getNota01() {
		return nota01;
	}
	public void setNota01(double nota01) {
		this.nota01 = nota01;
	}
	public String getDisciplina2() {
		return disciplina2;
	}
	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	public double getNota02() {
		return nota02;
	}
	public void setNota02(double nota02) {
		this.nota02 = nota02;
	}
	public String getDisciplina3() {
		return disciplina3;
	}
	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}
	public double getNota03() {
		return nota03;
	}
	public void setNota03(double nota03) {
		this.nota03 = nota03;
	}
	public String getDisciplina4() {
		return disciplina4;
	}
	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}
	public double getNota04() {
		return nota04;
	}
	public void setNota04(double nota04) {
		this.nota04 = nota04;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina1 == null) ? 0 : disciplina1.hashCode());
		result = prime * result + ((disciplina2 == null) ? 0 : disciplina2.hashCode());
		result = prime * result + ((disciplina3 == null) ? 0 : disciplina3.hashCode());
		result = prime * result + ((disciplina4 == null) ? 0 : disciplina4.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota01);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota02);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota03);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota04);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (disciplina1 == null) {
			if (other.disciplina1 != null)
				return false;
		} else if (!disciplina1.equals(other.disciplina1))
			return false;
		if (disciplina2 == null) {
			if (other.disciplina2 != null)
				return false;
		} else if (!disciplina2.equals(other.disciplina2))
			return false;
		if (disciplina3 == null) {
			if (other.disciplina3 != null)
				return false;
		} else if (!disciplina3.equals(other.disciplina3))
			return false;
		if (disciplina4 == null) {
			if (other.disciplina4 != null)
				return false;
		} else if (!disciplina4.equals(other.disciplina4))
			return false;
		if (Double.doubleToLongBits(nota01) != Double.doubleToLongBits(other.nota01))
			return false;
		if (Double.doubleToLongBits(nota02) != Double.doubleToLongBits(other.nota02))
			return false;
		if (Double.doubleToLongBits(nota03) != Double.doubleToLongBits(other.nota03))
			return false;
		if (Double.doubleToLongBits(nota04) != Double.doubleToLongBits(other.nota04))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Disciplina [disciplina1=" + disciplina1 + ", nota01=" + nota01 + ", disciplina2=" + disciplina2
				+ ", nota02=" + nota02 + ", disciplina3=" + disciplina3 + ", nota03=" + nota03 + ", disciplina4="
				+ disciplina4 + ", nota04=" + nota04 + "]";
	}
	
	
	
	
}