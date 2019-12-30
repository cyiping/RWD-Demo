package course.c03.aop.xmlBased;

public class ResourceAspect {

	public void beforeSetContent(String content) {
		System.out.println("@Aspect: before set content: " + content);
	}

}