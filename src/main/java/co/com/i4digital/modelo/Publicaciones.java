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
 * Clase modelo Publicaciones
 *
 * @version
 * @author juanpbeltran <br>
 *         <b>Fecha de desarrollo : </b> 24/04/2021 <br>
 *         <b>Fecha de modificación : </b> 00/00/0000
 */
@Generated("jsonschema2pojo")
public class Publicaciones {

	@SerializedName("userId")
	@Expose
	private Integer userId;
	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("body")
	@Expose
	private String body;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}