package kits.util.collections;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

public class ImmutableMap {

	private ImmutableMap(){}
	
	public static <K, V> Map<K, V> mapOf(K k, V v){
		Map<K, V> map = new HashMap<>();
		map.put(k, v);
		return Collections.unmodifiableMap(map);
	}
	
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2){
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1); map.put(k2, v2);
		return Collections.unmodifiableMap(map);
	}
	
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3){
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1); map.put(k2, v2); map.put(k3, v3);
		return Collections.unmodifiableMap(map);
	}
	
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4){
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1); map.put(k2, v2); map.put(k3, v3); map.put(k4, v4);
		return Collections.unmodifiableMap(map);
	}
	
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5){
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1); map.put(k2, v2); map.put(k3, v3); map.put(k4, v4); map.put(k5, v5);
		return Collections.unmodifiableMap(map);
	}
	
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6){
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1); map.put(k2, v2); map.put(k3, v3); map.put(k4, v4); map.put(k5, v5); map.put(k6, v6);
		return Collections.unmodifiableMap(map);
	}
	
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7){
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1); map.put(k2, v2); map.put(k3, v3); map.put(k4, v4); map.put(k5, v5); map.put(k6, v6); map.put(k7, v7);
		return Collections.unmodifiableMap(map);
	}
	
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8){
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1); map.put(k2, v2); map.put(k3, v3); map.put(k4, v4); map.put(k5, v5); map.put(k6, v6); map.put(k7, v7); map.put(k8, v8);
		return Collections.unmodifiableMap(map);
	}
	
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9){
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1); map.put(k2, v2); map.put(k3, v3); map.put(k4, v4); map.put(k5, v5); map.put(k6, v6); map.put(k7, v7); map.put(k8, v8); map.put(k9, v9);
		return Collections.unmodifiableMap(map);
	}
	
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10){
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1); map.put(k2, v2); map.put(k3, v3); map.put(k4, v4); map.put(k5, v5); map.put(k6, v6); map.put(k7, v7); map.put(k8, v8); map.put(k9, v9); map.put(k10, v10);
		return Collections.unmodifiableMap(map);
	}
	
}
