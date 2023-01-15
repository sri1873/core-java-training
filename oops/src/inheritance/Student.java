package inheritance;

public class Student {
	private String name;
	private String UGID;
	private String course;
	private String subject;

	Student() {
	}

	Student(String name, String ugid, String course) {
		this.name = name;
		this.UGID = ugid;
		this.course = course;
	}

	void setSubject(String sub) {
		this.subject = sub;
	}

	String getSubject() {
		return subject;
	}
	String getName() {
		return name;
	}
}

class Subjects extends Student {
	Subjects(String name, String ugid, String course) {
		super(name, ugid, course);
		switch (course) {
		case ("CSE"):
			super.setSubject("Full-Stack Development");
			break;
		case ("AI&DS"):
			super.setSubject("Big Data And Business Analytics");
			break;
		case ("AR"):
			super.setSubject("MicroProcessors");
			break;
		}
		String sub = super.getSubject();
		System.out.println(name+':'+sub);

	}
}
