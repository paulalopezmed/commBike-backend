package es.upm.dit.isst.commBike.model;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import java.util.Locale;
import java.util.stream.IntStream;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class bicicleta implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Id
	private String bikeCode;
	private double bikeCoordenatesX;
	private double bikeCoordenatesY;
	private boolean available;
	
	public bicicleta(){
		   super();
		}
	
	
	
	
	public bicicleta(String bikeCode, double bikeCoordenatesX, double bikeCoordenatesY, boolean available) {
		super();
		this.bikeCode = bikeCode;
		this.bikeCoordenatesX = bikeCoordenatesX;
		this.bikeCoordenatesY = bikeCoordenatesY;
		this.available = available;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public char charAt(int arg0) {
		return bikeCode.charAt(arg0);
	}
	public IntStream chars() {
		return bikeCode.chars();
	}
	public int codePointAt(int arg0) {
		return bikeCode.codePointAt(arg0);
	}
	public int codePointBefore(int arg0) {
		return bikeCode.codePointBefore(arg0);
	}
	public int codePointCount(int arg0, int arg1) {
		return bikeCode.codePointCount(arg0, arg1);
	}
	public IntStream codePoints() {
		return bikeCode.codePoints();
	}
	public int compareTo(String arg0) {
		return bikeCode.compareTo(arg0);
	}
	public int compareToIgnoreCase(String arg0) {
		return bikeCode.compareToIgnoreCase(arg0);
	}
	public String concat(String arg0) {
		return bikeCode.concat(arg0);
	}
	public boolean contains(CharSequence arg0) {
		return bikeCode.contains(arg0);
	}
	public boolean contentEquals(CharSequence arg0) {
		return bikeCode.contentEquals(arg0);
	}
	public boolean contentEquals(StringBuffer arg0) {
		return bikeCode.contentEquals(arg0);
	}
	public boolean endsWith(String arg0) {
		return bikeCode.endsWith(arg0);
	}
	public boolean equals(Object arg0) {
		return bikeCode.equals(arg0);
	}
	public boolean equalsIgnoreCase(String arg0) {
		return bikeCode.equalsIgnoreCase(arg0);
	}
	public byte[] getBytes() {
		return bikeCode.getBytes();
	}
	public byte[] getBytes(Charset arg0) {
		return bikeCode.getBytes(arg0);
	}

	public byte[] getBytes(String arg0) throws UnsupportedEncodingException {
		return bikeCode.getBytes(arg0);
	}
	public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
		bikeCode.getChars(arg0, arg1, arg2, arg3);
	}
	public int hashCode() {
		return bikeCode.hashCode();
	}
	public int indexOf(int arg0, int arg1) {
		return bikeCode.indexOf(arg0, arg1);
	}
	public int indexOf(int arg0) {
		return bikeCode.indexOf(arg0);
	}
	public int indexOf(String arg0, int arg1) {
		return bikeCode.indexOf(arg0, arg1);
	}
	public int indexOf(String arg0) {
		return bikeCode.indexOf(arg0);
	}
	public String intern() {
		return bikeCode.intern();
	}
	public boolean isEmpty() {
		return bikeCode.isEmpty();
	}
	public int lastIndexOf(int arg0, int arg1) {
		return bikeCode.lastIndexOf(arg0, arg1);
	}
	public int lastIndexOf(int arg0) {
		return bikeCode.lastIndexOf(arg0);
	}
	public int lastIndexOf(String arg0, int arg1) {
		return bikeCode.lastIndexOf(arg0, arg1);
	}
	public int lastIndexOf(String arg0) {
		return bikeCode.lastIndexOf(arg0);
	}
	public int length() {
		return bikeCode.length();
	}
	public boolean matches(String arg0) {
		return bikeCode.matches(arg0);
	}
	public int offsetByCodePoints(int arg0, int arg1) {
		return bikeCode.offsetByCodePoints(arg0, arg1);
	}
	public boolean regionMatches(boolean arg0, int arg1, String arg2, int arg3, int arg4) {
		return bikeCode.regionMatches(arg0, arg1, arg2, arg3, arg4);
	}
	public boolean regionMatches(int arg0, String arg1, int arg2, int arg3) {
		return bikeCode.regionMatches(arg0, arg1, arg2, arg3);
	}
	public String replace(char arg0, char arg1) {
		return bikeCode.replace(arg0, arg1);
	}
	public String replace(CharSequence arg0, CharSequence arg1) {
		return bikeCode.replace(arg0, arg1);
	}
	public String replaceAll(String arg0, String arg1) {
		return bikeCode.replaceAll(arg0, arg1);
	}
	public String replaceFirst(String arg0, String arg1) {
		return bikeCode.replaceFirst(arg0, arg1);
	}
	public String[] split(String arg0, int arg1) {
		return bikeCode.split(arg0, arg1);
	}
	public String[] split(String arg0) {
		return bikeCode.split(arg0);
	}
	public boolean startsWith(String arg0, int arg1) {
		return bikeCode.startsWith(arg0, arg1);
	}
	public boolean startsWith(String arg0) {
		return bikeCode.startsWith(arg0);
	}
	public CharSequence subSequence(int arg0, int arg1) {
		return bikeCode.subSequence(arg0, arg1);
	}
	public String substring(int arg0, int arg1) {
		return bikeCode.substring(arg0, arg1);
	}
	public String substring(int arg0) {
		return bikeCode.substring(arg0);
	}
	public char[] toCharArray() {
		return bikeCode.toCharArray();
	}
	public String toLowerCase() {
		return bikeCode.toLowerCase();
	}
	public String toLowerCase(Locale arg0) {
		return bikeCode.toLowerCase(arg0);
	}
	public String toString() {
		return bikeCode.toString();
	}
	public String toUpperCase() {
		return bikeCode.toUpperCase();
	}
	public String toUpperCase(Locale arg0) {
		return bikeCode.toUpperCase(arg0);
	}
	public String trim() {
		return bikeCode.trim();
	}

	
	
	
	
}




