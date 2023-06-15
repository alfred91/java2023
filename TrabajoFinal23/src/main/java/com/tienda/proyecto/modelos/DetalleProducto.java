package com.tienda.proyecto.modelos;

import java.time.LocalDateTime;
/**
 * 
 * @author Apache
 * Clase DetalleProducto
 *
 */
public class DetalleProducto {
	
    private String url;
    private String foto;
    private String categorias;
    private String marca;
    private LocalDateTime fechaCreacion;
    
    /**
     * Constructor vacio
     */
    public DetalleProducto() {
	}

	/**
     * Constructor parametrizado
     * 
     * @param url
     * @param foto
     * @param categorias
     * @param marca
     * @param fechaCreacion
     */
	public DetalleProducto(String url, String foto, String categorias, String marca, LocalDateTime fechaCreacion) {
		this.url = url;
		this.foto = foto;
		this.categorias = categorias;
		this.marca = marca;
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/**
	 * @return the categorias
	 */
	public String getCategorias() {
		return categorias;
	}

	/**
	 * @param categorias the categorias to set
	 */
	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DetalleProducto [url=");
		builder.append(url);
		builder.append(", foto=");
		builder.append(foto);
		builder.append(", categorias=");
		builder.append(categorias);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append("]");
		return builder.toString();
	}
    
}