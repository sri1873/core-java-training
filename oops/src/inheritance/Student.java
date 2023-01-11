package inheritance;

public class Student {
	private String name;
	private String UGID;
	private String course;
	String subject;

	Student() {
	}

	Student(String name, String ugid, String course) {
		this.name = name;
		this.UGID = ugid;
		this.course = course;
	}

	void Details() {
		System.out.println(name + "|" + UGID + "|" + course + "|" + subject);
	}
}

class Subjects extends Student {
	Subjects(String name, String ugid, String course) {
		super(name, ugid, course);
		switch (course) {
		case ("CSE"):
			super.subject = "Full-Stack Development";
			break;
		case ("AI&DS"):
			super.subject = "Big Data And Business Analytics";
			break;
		case ("AR"):
			super.subject = "MicroProcessors";
			break;
		}
		super.Details();
	}
}
