package Model;
import java.util.Date;
/**
 * @author Fabio
 *
 */
class Opera {
private int id;
private String nome;
private Date anno;
private String lingua ;

	public Opera(int id, String nome, Date anno, String lingua) {
		this.id=id;
		this.nome=nome;
		this.anno=anno;
		this.lingua=lingua;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int x) {
		this.id=x;	
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String a) {
		this.nome=a;
	}
	
	public Date getanno() {
		return anno;
	}
	
	public void setanno(Date x) {
		this.anno=x ;
	}	
	public String getlingua() {
		return lingua;
	}
	
	public void setlingua(String x) {
		this.lingua=x ;
	}	
}