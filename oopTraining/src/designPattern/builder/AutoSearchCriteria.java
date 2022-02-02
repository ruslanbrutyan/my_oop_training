package designPattern.builder;

public class AutoSearchCriteria {
	private String mark;
	private String model;
	private String transferBoxType;
	private String motorType;
	private int startYear;
	private int endYear;
	private int startPrice;
	private int endPrice;
	private boolean exchange;
	private boolean partialPaiment;
    
	private AutoSearchCriteria(AutoSearchCriteriaBuilder builder){
    	this.endPrice=builder.endPrice;
    	this.endYear=builder.endYear;
    	this.startPrice=builder.startPrice;
    	this.startYear=builder.startYear;
    	this.mark=builder.mark;
    	this.model=builder.model;
    	this.transferBoxType=builder.transferBoxType;
    	this.motorType=builder.motorType;
    	this.exchange=builder.exchange;
    	this.partialPaiment=builder.partialPaiment;
    	
    }	
	public String getMark() {
		return mark;
	}
	public String getModel() {
		return model;
	}
	public String getTransferBoxType() {
		return transferBoxType;
	}
	public String getMotorType() {
		return motorType;
	}
	public int getStartPrice() {
		return startPrice;
	}
	public int getEndPrice() {
		return endPrice;
	}
	public int getStartYear() {
		return startYear;
	}
	public int getEndYear() {
		return endYear;
	}
	public boolean exchange() {
		return exchange;	
	}
	public boolean partialPaiment() {
		return partialPaiment;	
	}
	
    public static class AutoSearchCriteriaBuilder{
    	private String mark;
    	private String model;
    	private String transferBoxType;
    	private String motorType;
    	private int startYear;
    	private int endYear;
    	private int startPrice;
    	private int endPrice;
    	private boolean exchange;
    	private boolean partialPaiment;
    	
    	public AutoSearchCriteriaBuilder  mark(String mark){
    		this.mark = mark;
    		return this;     		
    	}
    	public AutoSearchCriteriaBuilder  model(String model){
    		this.model = model;
    		return this;     		
    	}
    	public AutoSearchCriteriaBuilder  transferBoxType(String transferBoxType){
    		this.transferBoxType = transferBoxType;
    		return this;     		
    	}
    	public AutoSearchCriteriaBuilder  motorType(String motorType){
    		this.motorType = motorType;
    		return this;     		
    	}
    	public AutoSearchCriteriaBuilder  startYear(int startYear){
    		this.startYear = startYear;
    		return this;     		
    	}
    	public AutoSearchCriteriaBuilder  endYear(int endYear ){
    		this.endYear = endYear;
    		return this;     		
    	}
    	public AutoSearchCriteriaBuilder  startPrice(int startPrice ){
    		this.startPrice = startPrice;
    		return this;     		
    	}
    	public AutoSearchCriteriaBuilder  endPrice(int endPrice){
    		this.endPrice = endPrice;
    		return this;     		
    	}
    	public AutoSearchCriteriaBuilder  exchange(boolean exchange){
    		this.exchange = exchange;
    		return this;     		
    	}
    	public AutoSearchCriteriaBuilder  partialPaiment(boolean partialPaiment){
    		this.partialPaiment = partialPaiment;
    		return this;     		
    	}
    	public AutoSearchCriteria build() {
    		return new AutoSearchCriteria(this);
    	}
    }
}
