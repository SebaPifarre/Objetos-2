package ejercicios.refact;

public abstract class Ring<T>{
	protected T[] source;
	protected int idx;
	
	public Ring() { this.idx = 0; }
	
	public T next(){
		if (this.idx >= this.source.length) {
			this.idx = 0;
		}
		return this.source[this.idx++];
	}
}