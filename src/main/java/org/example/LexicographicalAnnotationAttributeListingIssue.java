package org.example;

public class LexicographicalAnnotationAttributeListingIssue {

  private final AnyClass someInjectedValue;

  public LexicographicalAnnotationAttributeListingIssue(AnyClass someInjectedValue) {
    this.someInjectedValue = someInjectedValue;
  }

  public String doSomething() {
    return someInjectedValue.toString();
  }

}