package designPattern.builder;

public class Testing {
	public static void main (String[] args) {
		AutoSearchCriteria criteria = new AutoSearchCriteria.AutoSearchCriteriaBuilder().mark("BMW").model("X5").build();
		System.out.println(criteria.getMark());
		System.out.println(criteria.getModel());
		System.out.println(criteria.getStartYear());
		
	}
}
