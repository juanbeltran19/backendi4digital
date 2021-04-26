/**
 * Copyright (c) 2021 i4digital
 * <br><A HREF="http://www.i4digital.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.i4digital.modelo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Clase modelo Company
 *
 * @version
 * @author juanpbeltran <br>
 *         <b>Fecha de desarrollo : </b> 24/04/2021 <br>
 *         <b>Fecha de modificación : </b> 00/00/0000
 */
@Generated("jsonschema2pojo")
public class Company {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("catchPhrase")
	@Expose
	private String catchPhrase;
	@SerializedName("bs")
	@Expose
	private String bs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

}