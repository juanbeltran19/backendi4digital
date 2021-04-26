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
 * Clase modelo Foto
 *
 * @version
 * @author juanpbeltran <br>
 *         <b>Fecha de desarrollo : </b> 24/04/2021 <br>
 *         <b>Fecha de modificación : </b> 00/00/0000
 */
@Generated("jsonschema2pojo")
public class Foto {

	@SerializedName("albumId")
	@Expose
	private Integer albumId;
	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("url")
	@Expose
	private String url;
	@SerializedName("thumbnailUrl")
	@Expose
	private String thumbnailUrl;

	public Integer getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

}