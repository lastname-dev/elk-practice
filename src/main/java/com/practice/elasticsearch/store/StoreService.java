package com.practice.elasticsearch.store;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class StoreService {

	private final StoreRepository storeRepository;

	@Transactional
	public void save(StoreDto storeDto) {
		storeRepository.save(Store.from(storeDto));
	}
}
