package by.homework.homework3.deal.annatation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)

public @interface Producer {

	int startYear();
	String country();
	String  founderFullName();
}
