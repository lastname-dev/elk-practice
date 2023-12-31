package com.practice.elasticsearch.store;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StoreDto {
	private long id;
	private String name;
	private String address;
	private Location location;
}
