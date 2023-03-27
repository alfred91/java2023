package pruebaBasica;

import java.util.Objects;

public class Publicacion {

		/**
	 * @param titulo
	 * @param autor
	 */
	Publicacion(String titulo, String autor) {
		super();
		Titulo = titulo;
		Autor = autor;
	}
		public String Titulo;
		public String Autor;
		/**
		 * @return the titulo
		 */
		public String getTitulo() {
			return Titulo;
		}
		/**
		 * @param titulo the titulo to set
		 */
		public void setTitulo(String titulo) {
			Titulo = titulo;
		}
		/**
		 * @return the autor
		 */
		public String getAutor() {
			return Autor;
		}
		/**
		 * @param autor the autor to set
		 */
		public void setAutor(String autor) {
			Autor = autor;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Prueba [Titulo=");
			builder.append(Titulo);
			builder.append(", Autor=");
			builder.append(Autor);
			builder.append("]");
			return builder.toString();
		}
		@Override
		public int hashCode() {
			return Objects.hash(Titulo);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Publicacion other = (Publicacion) obj;
			return Objects.equals(Titulo, other.Titulo);
		}
	}