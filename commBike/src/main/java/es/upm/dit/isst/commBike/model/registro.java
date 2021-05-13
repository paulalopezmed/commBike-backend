package es.upm.dit.isst.commBike.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class registro implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String recordCode;
	private String bikeCode;
	private double originBikeCoordenatesX;
	private double originBikeCoordenatesY;
	private double endBikeCoordenatesX;
	private double endBikeCoordenatesY;
	private int originTime;
	private int endTime;
	private int time;
	private double precio;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public String getRecordCode() {
		return recordCode;
	}
	public void setRecordCode(String recordCode) {
		this.recordCode = recordCode;
	}
	public String getBikeCode() {
		return bikeCode;
	}
	public void setBikeCode(String bikeCode) {
		this.bikeCode = bikeCode;
	}
	public double getOriginBikeCoordenatesX() {
		return originBikeCoordenatesX;
	}
	public void setOriginBikeCoordenatesX(double originBikeCoordenatesX) {
		this.originBikeCoordenatesX = originBikeCoordenatesX;
	}
	public double getOriginBikeCoordenatesY() {
		return originBikeCoordenatesY;
	}
	public void setOriginBikeCoordenatesY(double originBikeCoordenatesY) {
		this.originBikeCoordenatesY = originBikeCoordenatesY;
	}
	public double getEndBikeCoordenatesX() {
		return endBikeCoordenatesX;
	}
	public void setEndBikeCoordenatesX(double endBikeCoordenatesX) {
		this.endBikeCoordenatesX = endBikeCoordenatesX;
	}
	public double getEndBikeCoordenatesY() {
		return endBikeCoordenatesY;
	}
	public void setEndBikeCoordenatesY(double endBikeCoordenatesY) {
		this.endBikeCoordenatesY = endBikeCoordenatesY;
	}
	public int getOriginTime() {
		return originTime;
	}
	public void setOriginTime(int originTime) {
		this.originTime = originTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public registro(String recordCode, String bikeCode, double originBikeCoordenatesX, double originBikeCoordenatesY,
			double endBikeCoordenatesX, double endBikeCoordenatesY, int originTime, int endTime, int time,
			double precio) {
		super();
		this.recordCode = recordCode;
		this.bikeCode = bikeCode;
		this.originBikeCoordenatesX = originBikeCoordenatesX;
		this.originBikeCoordenatesY = originBikeCoordenatesY;
		this.endBikeCoordenatesX = endBikeCoordenatesX;
		this.endBikeCoordenatesY = endBikeCoordenatesY;
		this.originTime = originTime;
		this.endTime = endTime;
		this.time = time;
		this.precio = precio;
	}
	
	public registro() {
		super();
	}
	
	
	

	
	
	
	
	
	
	
	
	}