/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.global.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * MyEclipse Struts Creation date: 11-24-2008
 * 
 * XDoclet definition:
 * 
 * @struts.form name="deliverySpotForm"
 */
public class DeliverySpotForm extends ActionForm {
	/*
	 * Generated fields
	 */
	/** DeliverySpotID property */
	private String DeliverySpotID;

	/** provinceID property */
	private String provinceID;

	/** secondPrice property */
	private String secondPrice;

	/** startScope property */
	private String startScope;

	private String startvolumescope;

	private String startvolumeprice;

	private String secondvolumeprice;

	/** cityID property */
	private String cityID;

	/** startPrice property */
	private String startPrice;

	/** tel property */
	private String tel;

	/** empID property */
	private String empID;

	/** name property */
	private String name;

	/** deliverySpotNO property */
	private String deliverySpotNO;

	/*
	 * Generated Methods
	 */

	/**
	 * Method validate
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Method reset
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/**
	 * Returns the provinceID.
	 * 
	 * @return String
	 */
	public String getProvinceID() {
		return provinceID;
	}

	/**
	 * Set the provinceID.
	 * 
	 * @param provinceID
	 *            The provinceID to set
	 */
	public void setProvinceID(String provinceID) {
		this.provinceID = provinceID;
	}

	/**
	 * Returns the secondPrice.
	 * 
	 * @return String
	 */
	public String getSecondPrice() {
		return secondPrice;
	}

	/**
	 * Set the secondPrice.
	 * 
	 * @param secondPrice
	 *            The secondPrice to set
	 */
	public void setSecondPrice(String secondPrice) {
		this.secondPrice = secondPrice;
	}

	/**
	 * Returns the startScope.
	 * 
	 * @return String
	 */
	public String getStartScope() {
		return startScope;
	}

	/**
	 * Set the startScope.
	 * 
	 * @param startScope
	 *            The startScope to set
	 */
	public void setStartScope(String startScope) {
		this.startScope = startScope;
	}

	/**
	 * Returns the cityID.
	 * 
	 * @return String
	 */
	public String getCityID() {
		return cityID;
	}

	/**
	 * Set the cityID.
	 * 
	 * @param cityID
	 *            The cityID to set
	 */
	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

	/**
	 * Returns the startPrice.
	 * 
	 * @return String
	 */
	public String getStartPrice() {
		return startPrice;
	}

	/**
	 * Set the startPrice.
	 * 
	 * @param startPrice
	 *            The startPrice to set
	 */
	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}

	/**
	 * Returns the tel.
	 * 
	 * @return String
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * Set the tel.
	 * 
	 * @param tel
	 *            The tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * Returns the empID.
	 * 
	 * @return String
	 */
	public String getEmpID() {
		return empID;
	}

	/**
	 * Set the empID.
	 * 
	 * @param empID
	 *            The empID to set
	 */
	public void setEmpID(String empID) {
		this.empID = empID;
	}

	/**
	 * Returns the name.
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name.
	 * 
	 * @param name
	 *            The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the deliverySpotNO.
	 * 
	 * @return String
	 */
	public String getDeliverySpotNO() {
		return deliverySpotNO;
	}

	/**
	 * Set the deliverySpotNO.
	 * 
	 * @param deliverySpotNO
	 *            The deliverySpotNO to set
	 */
	public void setDeliverySpotNO(String deliverySpotNO) {
		this.deliverySpotNO = deliverySpotNO;
	}

	public String getDeliverySpotID() {
		return DeliverySpotID;
	}

	public void setDeliverySpotID(String deliverySpotID) {
		DeliverySpotID = deliverySpotID;
	}

	public String getSecondvolumeprice() {
		return secondvolumeprice;
	}

	public void setSecondvolumeprice(String secondvolumeprice) {
		this.secondvolumeprice = secondvolumeprice;
	}

	public String getStartvolumeprice() {
		return startvolumeprice;
	}

	public void setStartvolumeprice(String startvolumeprice) {
		this.startvolumeprice = startvolumeprice;
	}

	public String getStartvolumescope() {
		return startvolumescope;
	}

	public void setStartvolumescope(String startvolumescope) {
		this.startvolumescope = startvolumescope;
	}
}