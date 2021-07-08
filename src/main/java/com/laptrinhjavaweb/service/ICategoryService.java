package com.laptrinhjavaweb.service;

import java.util.Map;

public interface ICategoryService {
	Map<String, String> findAll( ); // Khi dùng spring form để hiển thị các thể loại thì spring yêu cầu cung cấp map 
	
}
