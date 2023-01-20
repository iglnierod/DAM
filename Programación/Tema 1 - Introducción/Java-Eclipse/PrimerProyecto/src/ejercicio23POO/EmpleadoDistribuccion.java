package ejercicio23POO;

public class EmpleadoDistribuccion extends Asalariado{
	private String region;
	
	public EmpleadoDistribuccion(String nombre, long nif, int diasVacaciones, double salarioBase, String region){
		super(nombre, nif, diasVacaciones, salarioBase);
		this.region = region;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() + (super.getSalario() * 10 / 100);
	}
}
