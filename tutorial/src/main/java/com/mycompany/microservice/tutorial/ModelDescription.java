package com.mycompany.microservice.tutorial;

import java.util.List;
import java.util.StringJoiner;

import org.springframework.restdocs.constraints.ConstraintDescriptions;
import org.springframework.restdocs.payload.FieldDescriptor;
import org.springframework.restdocs.payload.PayloadDocumentation;

public class ModelDescription {

	private ModelDescription() {}
	
	/**
	 * @return The full mobile suit description
	 */
	public static FieldDescriptor[] mobileSuit() {
		
		return new FieldDescriptor[] {
				PayloadDocumentation.fieldWithPath("id").description("The mobile suit's id"),
				PayloadDocumentation.fieldWithPath("modelName").description("The mobile suit's model name"),
				PayloadDocumentation.fieldWithPath("weapons").description("Array of mobile suit's weapons")
		};
	}
	
	public static FieldDescriptor[] listOfMobileSuits(){
        return new FieldDescriptor[]{
                PayloadDocumentation.fieldWithPath("[]").description("Array of mobile suits"),
                PayloadDocumentation.fieldWithPath("[].id").description("The mobile suit's id"),
                PayloadDocumentation.fieldWithPath("[].modelName").description("The mobile suit's model name"),
                PayloadDocumentation.fieldWithPath("[].weapons").description("Array of mobile suit's weapons")
        };
    }
	
	private static <T> String getConstraints(Class<T> clazz, String property){
        ConstraintDescriptions userConstraints = new ConstraintDescriptions(clazz);
        List<String> descriptions = userConstraints.descriptionsForProperty(property);

        StringJoiner stringJoiner = new StringJoiner(". ", "", ".");
        descriptions.forEach(stringJoiner::add);
        return stringJoiner.toString();
    }

    public static FieldDescriptor[] mobileSuitPostDto() {

        return new FieldDescriptor[]{
                PayloadDocumentation.fieldWithPath("modelName").description("The mobile suit's model name. " + getConstraints(MobileSuitPostDto.class, "modelName")),
                PayloadDocumentation.fieldWithPath("weapons").description("Array of mobile suit's weapons. " + getConstraints(MobileSuitPostDto.class, "weapons"))
        };
    }
}
