package com.mydomain.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/*
	MappingJackson2HttpMessageConverter(<mvc:annotation-driven/> 이 등록주는 bean)
	->VO->JO({ }), List/배열 - Javascript 배열형태 ([ ])
	
	JsonSerializer -특정 property(instance변수) 의 값을 JSON 변환시 원하는 형태의 문자열로 변환처리하는 Bean. (Jackson API 에서 제공)
	ex) : 기본 - java.util.Date -> 밀리초
			   Date - yyyy-MM-dd: 이런 형태로 변환하는 JsonSerializer 클래스를 구현.
			   
			   1.JsonSerializer<T> 상속. T : 변환할 타입 지정. 
			   
			   2.Instance 변수에 @JsonSerializer 어노테이션을 추가 한다 -> 얘를 통해서 변환을 한다 라고.
*/
public class DateJsonSerializer extends JsonSerializer<Date> {
	/*
		1. 매개변수 -> 1. 변환할 Data
		2. 변환된 문자열을 출력해 주는 메소드 제공객체.
		3. 기존 변환처리 객체가 있는 경우 제공받는 경우 -> 별로 신경 쓸 필요 X
	
	
	*/
	@Override
	public void serialize(Date date, JsonGenerator gen, SerializerProvider provider)throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-ddd");
		String dateStr=sdf.format(date);
		
		//gen 을 사용
		gen.writeString(dateStr);
		//변환해서 출력.
		
	}
}

/*
Date -> 밀리초
정수 -> 정수*/
