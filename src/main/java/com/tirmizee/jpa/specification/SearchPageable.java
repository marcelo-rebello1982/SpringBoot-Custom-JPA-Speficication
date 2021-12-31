package com.tirmizee.jpa.specification;

import lombok.Data;

@Data
public abstract class SearchPageable {
	 	
	 private Integer page = 0;  // default page is 0
	 private Integer size = 10; // default size is 10
	 private String sort;
	 private String sortField;

}
