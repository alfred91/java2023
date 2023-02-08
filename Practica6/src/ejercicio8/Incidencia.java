package ejercicio8;

public class Incidencia {

private int codigo;
private String estado,descripcion,solucion;
private int pendientes;
private int numeroIncidencias;
	
/**
	 * @param codigo
	 * @param estado
	 * @param descripcion
	 * @param solucion
	 * @param pendientes
	 * @param numeroIncidencias
	 */
	Incidencia(int codigo, String estado, String descripcion, String solucion, int pendientes, int numeroIncidencias) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.descripcion = descripcion;
		this.solucion = solucion;
		this.pendientes = pendientes;
		this.numeroIncidencias = numeroIncidencias;
	}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Incidencia [codigo=");
	builder.append(codigo);
	builder.append(", estado=");
	builder.append(estado);
	builder.append(", descripcion=");
	builder.append(descripcion);
	builder.append(", solucion=");
	builder.append(solucion);
	builder.append(", pendientes=");
	builder.append(pendientes);
	builder.append(", numeroIncidencias=");
	builder.append(numeroIncidencias);
	builder.append(", getCodigo()=");
	builder.append(getCodigo());
	builder.append(", getEstado()=");
	builder.append(getEstado());
	builder.append(", getDescripcion()=");
	builder.append(getDescripcion());
	builder.append(", getSolucion()=");
	builder.append(getSolucion());
	builder.append(", getPendientes()=");
	builder.append(getPendientes());
	builder.append(", getNumeroIncidencias()=");
	builder.append(getNumeroIncidencias());
	builder.append(", getClass()=");
	builder.append(getClass());
	builder.append(", hashCode()=");
	builder.append(hashCode());
	builder.append(", toString()=");
	builder.append(super.toString());
	builder.append("]");
	return builder.toString();
}

/**
 * @return the codigo
 */
public int getCodigo() {
	return codigo;
}

/**
 * @param codigo the codigo to set
 */
public void setCodigo(int codigo) {
	this.codigo = codigo;
}

/**
 * @return the estado
 */
public String getEstado() {
	return estado;
}

/**
 * @param estado the estado to set
 */
public void setEstado(String estado) {
	this.estado = estado;
}

/**
 * @return the descripcion
 */
public String getDescripcion() {
	return descripcion;
}

/**
 * @param descripcion the descripcion to set
 */
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

/**
 * @return the solucion
 */
public String getSolucion() {
	return solucion;
}

/**
 * @param solucion the solucion to set
 */
public void setSolucion(String solucion) {
	this.solucion = solucion;
}

/**
 * @return the pendientes
 */
public int getPendientes() {
	return pendientes;
}

/**
 * @param pendientes the pendientes to set
 */
public void setPendientes(int pendientes) {
	this.pendientes = pendientes;
}

/**
 * @return the numeroIncidencias
 */
public int getNumeroIncidencias() {
	return numeroIncidencias;
}

/**
 * @param numeroIncidencias the numeroIncidencias to set
 */
public void setNumeroIncidencias(int numeroIncidencias) {
	this.numeroIncidencias = numeroIncidencias;
	}

public static class pendientes{
	}

static int resuelve(int pendientes) {
	return pendientes-1;
	}
}