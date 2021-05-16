package es.upm.dit.isst.commBike.model;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import java.util.Locale;
import java.util.stream.IntStream;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name= "BICICLETA")
public class bicicleta implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Id
	private String bikeCode;
	private double bikeCoordenatesX;
	private double bikeCoordenatesY;
	private boolean available;
	public bicicleta(String bikeCode, double bikeCoordenatesX, double bikeCoordenatesY, boolean available) {
		super();
		this.bikeCode = bikeCode;
		this.bikeCoordenatesX = bikeCoordenatesX;
		this.bikeCoordenatesY = bikeCoordenatesY;
		this.available = available;
	}
	public bicicleta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBikeCode() {
		return bikeCode;
	}
	public void setBikeCode(String bikeCode) {
		this.bikeCode = bikeCode;
	}
	public double getBikeCoordenatesX() {
		return bikeCoordenatesX;
	}
	public void setBikeCoordenatesX(double bikeCoordenatesX) {
		this.bikeCoordenatesX = bikeCoordenatesX;
	}
	public double getBikeCoordenatesY() {
		return bikeCoordenatesY;
	}
	public void setBikeCoordenatesY(double bikeCoordenatesY) {
		this.bikeCoordenatesY = bikeCoordenatesY;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (available ? 1231 : 1237);
		result = prime * result + ((bikeCode == null) ? 0 : bikeCode.hashCode());
		long temp;
		temp = Double.doubleToLongBits(bikeCoordenatesX);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(bikeCoordenatesY);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		bicicleta other = (bicicleta) obj;
		if (available != other.available)
			return false;
		if (bikeCode == null) {
			if (other.bikeCode != null)
				return false;
		} else if (!bikeCode.equals(other.bikeCode))
			return false;
		if (Double.doubleToLongBits(bikeCoordenatesX) != Double.doubleToLongBits(other.bikeCoordenatesX))
			return false;
		if (Double.doubleToLongBits(bikeCoordenatesY) != Double.doubleToLongBits(other.bikeCoordenatesY))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "bicicleta [bikeCode=" + bikeCode + ", bikeCoordenatesX=" + bikeCoordenatesX + ", bikeCoordenatesY="
				+ bikeCoordenatesY + ", available=" + available + "]";
	}
	
	
	
	
	
	
}




