package p.ejercicio13;

public abstract class MixingTank {
	private int heatPower;
	private int mixerPower;
	
	
	public abstract boolean heatPower(int porcentaje);
	public abstract boolean mixerPower(int porcentaje);
	public abstract boolean purge();
}