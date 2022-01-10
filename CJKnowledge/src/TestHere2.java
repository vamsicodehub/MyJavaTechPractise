import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestHere2 {

	public static void main(String[] args) {
		
		List<CityRainFallInfo> list = new ArrayList<>();
		CityRainFallInfo cityRainFallInfo = new CityRainFallInfo("Mumbai", 200, 2019);
		CityRainFallInfo cityRainFallInfo1 = new CityRainFallInfo("Mumbai", 180, 2018);
		CityRainFallInfo cityRainFallInfo2 = new CityRainFallInfo("Mumbai", 210, 2020);
		CityRainFallInfo cityRainFallInfo3 = new CityRainFallInfo("Delhi", 280, 2018);
		CityRainFallInfo cityRainFallInfo4 = new CityRainFallInfo("Delhi", 110, 2020);
		
		
		list.add(cityRainFallInfo);
		list.add(cityRainFallInfo1);
		list.add(cityRainFallInfo2);
		list.add(cityRainFallInfo3);
		list.add(cityRainFallInfo4);
		
		findHighestAvgRainFallCity(list);

		/*
		 * Range range1 = new Range(0.6, 1.0); Range range2 = new Range(0.2, 0.7);
		 * 
		 * if(range1.getFrom() < (range2.getFrom())) overLapRange(range1, range2); else
		 * overLapRange(range2, range1);
		 */

	}

	private static void findHighestAvgRainFallCity(List<CityRainFallInfo> cityRainFallInfos) {
		System.out.println(cityRainFallInfos.stream().mapToDouble(x -> x.getRainFallInMM()).distinct().average().getAsDouble());
		System.out.println(cityRainFallInfos.stream().collect(Collectors.toConcurrentMap(CityRainFallInfo::getCity, m -> m.getRainFallInMM(), Double::sum )));
		System.out.println(cityRainFallInfos.stream().collect(Collectors.groupingBy(CityRainFallInfo::getCity, Collectors.averagingDouble(CityRainFallInfo::getRainFallInMM))));
		System.out.println(cityRainFallInfos.stream().collect(Collectors.groupingBy(CityRainFallInfo::getCity, 
				Collectors.averagingDouble(CityRainFallInfo::getRainFallInMM))).entrySet().stream().sorted(Map.Entry.comparingByValue((n1,n2) -> n2.compareTo(n1))).findFirst().get());
	}

	private static Range overLapRange(Range range1, Range range2) {

		if (range1.getTo() < range2.getFrom())
			return null;

		if (range2.getFrom() < range1.getTo())
			return new Range(range2.getFrom(), range1.getTo());

		return null;
	}

}

class CityRainFallInfo {
	String city;
	double rainFallInMM;
	int year;

	public CityRainFallInfo(String city, double rainFallInMM, int year) {
		super();
		this.city = city;
		this.rainFallInMM = rainFallInMM;
		this.year = year;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getRainFallInMM() {
		return rainFallInMM;
	}

	public void setRainFallInMM(double rainFallInMM) {
		this.rainFallInMM = rainFallInMM;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}

class Range {
	Double from;
	Double to;

	public Range(Double from, Double to) {
		this.from = from;
		this.to = to;
	}

	public Double getFrom() {
		return from;
	}

	public void setFrom(Double from) {
		this.from = from;
	}

	public Double getTo() {
		return to;
	}

	public void setTo(Double to) {
		this.to = to;
	}

}
