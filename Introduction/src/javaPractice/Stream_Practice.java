package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Stream_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>list = new ArrayList<String>(Arrays.asList("Sasi","Soman","Ravi","Sasi","Bubu","Tutu","Satish"));
		int count = (int) list.stream().filter(p->p.startsWith("S")).count();
		System.out.println(count);
		list.stream().distinct().forEach(n->System.out.println(n));
		System.out.println();
		
		Stream.of("Sasi","Soman","Ravi","Bubu","Tutu","Satish").filter(p->p.startsWith("S")).limit(2).forEach(p->System.out.println(p));
	}

}
