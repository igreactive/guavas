// CHECKSTYLE:OFF
/**
 * Source code generated by Fluent Builders Generator
 * Do not modify this file
 * See generator home page at: http://code.google.com/p/fluent-builders-generator-eclipse-plugin/
 */

package com.efigence.guava.model;

public class PersonBuilder extends PersonBuilderBase<PersonBuilder> {

	public static PersonBuilder person() {
		return new PersonBuilder();
	}

	public PersonBuilder() {
		super(new Person());
	}

	public Person build() {
		return getInstance();
	}
}

class PersonBuilderBase<GeneratorT extends PersonBuilderBase<GeneratorT>> {

	private Person instance;

	protected PersonBuilderBase(Person aInstance) {
		instance = aInstance;
	}

	protected Person getInstance() {
		return instance;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withId(Long aValue) {
		instance.setId(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withName(String aValue) {
		instance.setName(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withSurname(String aValue) {
		instance.setSurname(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withPhone(String aValue) {
		instance.setPhone(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withActive(Boolean aValue) {
		instance.setActive(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withAge(Integer aValue) {
		instance.setAge(aValue);

		return (GeneratorT) this;
	}
}