package hk.gov.hkpo.ipss.sma.dto;

/**
 * $Log: not supported by cvs2svn $
 * Revision 1.1  2012/12/06 01:23:13  matthew
 * DTO to store EDD info
 *
 *
 *
 * 
 * @author Matthew_KK_Cheung
 *
 */

import java.util.List;

public class EddDTO {
	private List<String> msgDetail;
	private String guaranteeDate;
	private String cutOffTime;
	private String destStateOrProvince;
	private String destCity;
	private int numOfDeliveryDays;
	private int numOfOcNonWorkingDay;
	private int numOfDcNonWorkingDay;
	private List<nonWorkingDay> ocNnonWorkingDays;
	private List<nonWorkingDay> dcNnonWorkingDays;
	private String guarantee;
	private String totalNumberOfDeliveryDays;
	private String totalNumberOfNoneWorkingDays;
	private String totalNumberOfHolidays;
	private String totalNumberOfDeliveryDaysLeg1;
	private String totalNumberOfNoneWorkingDaysLeg1;
	private String totalNumberOfHolidaysLeg1;
	private String totalNumberOfDeliveryDaysLeg2;
	private String totalNumberOfNoneWorkingDaysLeg2;
	private String totalNumberOfHolidaysLeg2;
	private String totalNumberOfDeliveryDaysLeg3;
	private String totalNumberOfNoneWorkingDaysLeg3;
	private String totalNumberOfHolidaysLeg3;
	private String metroToMetroStandards;
	
	public EddDTO() {}
	
	
	public String getMetroToMetroStandards() {
		return metroToMetroStandards;
	}


	public void setMetroToMetroStandards(String metroToMetroStandards) {
		this.metroToMetroStandards = metroToMetroStandards;
	}


	public String getTotalNumberOfHolidaysLeg2() {
		return totalNumberOfHolidaysLeg2;
	}


	public void setTotalNumberOfHolidaysLeg2(String totalNumberOfHolidaysLeg2) {
		this.totalNumberOfHolidaysLeg2 = totalNumberOfHolidaysLeg2;
	}


	public String getTotalNumberOfDeliveryDays() {
		return totalNumberOfDeliveryDays;
	}


	public void setTotalNumberOfDeliveryDays(String totalNumberOfDeliveryDays) {
		this.totalNumberOfDeliveryDays = totalNumberOfDeliveryDays;
	}


	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public String getTotalNumberOfNoneWorkingDays() {
		return totalNumberOfNoneWorkingDays;
	}



	public void setTotalNumberOfNoneWorkingDays(String totalNumberOfNoneWorkingDays) {
		this.totalNumberOfNoneWorkingDays = totalNumberOfNoneWorkingDays;
	}



	public String getTotalNumberOfHolidays() {
		return totalNumberOfHolidays;
	}



	public void setTotalNumberOfHolidays(String totalNumberOfHolidays) {
		this.totalNumberOfHolidays = totalNumberOfHolidays;
	}



	public String getTotalNumberOfDeliveryDaysLeg1() {
		return totalNumberOfDeliveryDaysLeg1;
	}



	public void setTotalNumberOfDeliveryDaysLeg1(
			String totalNumberOfDeliveryDaysLeg1) {
		this.totalNumberOfDeliveryDaysLeg1 = totalNumberOfDeliveryDaysLeg1;
	}



	public String getTotalNumberOfNoneWorkingDaysLeg1() {
		return totalNumberOfNoneWorkingDaysLeg1;
	}



	public void setTotalNumberOfNoneWorkingDaysLeg1(
			String totalNumberOfNoneWorkingDaysLeg1) {
		this.totalNumberOfNoneWorkingDaysLeg1 = totalNumberOfNoneWorkingDaysLeg1;
	}



	public String getTotalNumberOfHolidaysLeg1() {
		return totalNumberOfHolidaysLeg1;
	}



	public void setTotalNumberOfHolidaysLeg1(String totalNumberOfHolidaysLeg1) {
		this.totalNumberOfHolidaysLeg1 = totalNumberOfHolidaysLeg1;
	}



	public String getTotalNumberOfDeliveryDaysLeg2() {
		return totalNumberOfDeliveryDaysLeg2;
	}



	public void setTotalNumberOfDeliveryDaysLeg2(
			String totalNumberOfDeliveryDaysLeg2) {
		this.totalNumberOfDeliveryDaysLeg2 = totalNumberOfDeliveryDaysLeg2;
	}



	public String getTotalNumberOfNoneWorkingDaysLeg2() {
		return totalNumberOfNoneWorkingDaysLeg2;
	}



	public void setTotalNumberOfNoneWorkingDaysLeg2(
			String totalNumberOfNoneWorkingDaysLeg2) {
		this.totalNumberOfNoneWorkingDaysLeg2 = totalNumberOfNoneWorkingDaysLeg2;
	}



	public String getTotalNumberOfDeliveryDaysLeg3() {
		return totalNumberOfDeliveryDaysLeg3;
	}



	public void setTotalNumberOfDeliveryDaysLeg3(
			String totalNumberOfDeliveryDaysLeg3) {
		this.totalNumberOfDeliveryDaysLeg3 = totalNumberOfDeliveryDaysLeg3;
	}



	public String getTotalNumberOfNoneWorkingDaysLeg3() {
		return totalNumberOfNoneWorkingDaysLeg3;
	}



	public void setTotalNumberOfNoneWorkingDaysLeg3(
			String totalNumberOfNoneWorkingDaysLeg3) {
		this.totalNumberOfNoneWorkingDaysLeg3 = totalNumberOfNoneWorkingDaysLeg3;
	}



	public String getTotalNumberOfHolidaysLeg3() {
		return totalNumberOfHolidaysLeg3;
	}



	public void setTotalNumberOfHolidaysLeg3(String totalNumberOfHolidaysLeg3) {
		this.totalNumberOfHolidaysLeg3 = totalNumberOfHolidaysLeg3;
	}



	public List<String> getMsgDetail() {
		return msgDetail;
	}

	public void setMsgDetail(List<String> msgDetail) {
		this.msgDetail = msgDetail;
	}

	public String getGuaranteeDate() {
		return guaranteeDate;
	}

	public void setGuaranteeDate(String guaranteeDate) {
		this.guaranteeDate = guaranteeDate;
	}

	public String getCutOffTime() {
		return cutOffTime;
	}

	public void setCutOffTime(String cutOffTime) {
		this.cutOffTime = cutOffTime;
	}
	
	public String getDestStateOrProvince() {
		return destStateOrProvince;
	}

	public void setDestStateOrProvince(String destStateOrProvince) {
		this.destStateOrProvince = destStateOrProvince;
	}

	public String getDestCity() {
		return destCity;
	}

	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}

	public int getNumOfDeliveryDays() {
		return numOfDeliveryDays;
	}

	public void setNumOfDeliveryDays(int numOfDeliveryDays) {
		this.numOfDeliveryDays = numOfDeliveryDays;
	}

	public int getNumOfOcNonWorkingDay() {
		return numOfOcNonWorkingDay;
	}

	public void setNumOfOcNonWorkingDay(int numOfOcNonWorkingDay) {
		this.numOfOcNonWorkingDay = numOfOcNonWorkingDay;
	}

	public int getNumOfDcNonWorkingDay() {
		return numOfDcNonWorkingDay;
	}

	public void setNumOfDcNonWorkingDay(int numOfDcNonWorkingDay) {
		this.numOfDcNonWorkingDay = numOfDcNonWorkingDay;
	}

	public List<nonWorkingDay> getOcNnonWorkingDays() {
		return ocNnonWorkingDays;
	}

	public void setOcNnonWorkingDays(List<nonWorkingDay> ocNnonWorkingDays) {
		this.ocNnonWorkingDays = ocNnonWorkingDays;
	}

	public List<nonWorkingDay> getDcNnonWorkingDays() {
		return dcNnonWorkingDays;
	}

	public void setDcNnonWorkingDays(List<nonWorkingDay> dcNnonWorkingDays) {
		this.dcNnonWorkingDays = dcNnonWorkingDays;
	}	
}