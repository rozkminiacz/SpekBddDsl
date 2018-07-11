# Spek BDD Extensions

[ ![Download](https://api.bintray.com/packages/rozkminiacz/SpekBDD/spek-bdd/images/download.svg?version=1.1) ](https://bintray.com/rozkminiacz/SpekBDD/spek-bdd/1.1/link)
>only Spek 1.x is supported

## About
This library provides some extensions for [Spek](http://spekframework.org/), to match Behavior-Driven-Development specifications language.

| Spek BDD DSL         | Spek DSL |
|---:           | ---:      |
| Scenario      | group     |
| Story         | group     |
| Given         | group     |
| When          | group     |
| Then          | test      |
| And           | action    |

## Setup

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://dl.bintray.com/rozkminiacz/SpekBDD/' }
		}
	}
```

```gradle
	dependencies {
	        testCompile 'me.rozkmin.spekbdd:spek-bdd:1.1'
	}

```


## Example in code:

![spek-intelij](spek-bdd-dsl.png)


```kotlin
import me.rozkmin.spekbdd.BddDsl.And
import me.rozkmin.spekbdd.BddDsl.Given
import me.rozkmin.spekbdd.BddDsl.Story
import me.rozkmin.spekbdd.BddDsl.Then
import me.rozkmin.spekbdd.BddDsl.When
import org.jetbrains.spek.api.Spek

class SpekBddExample : Spek({
    Story("user is looking for a bus") {
        //setup context of a user
        Given("bus list screen") {
            When("enters bus list screen") {
                And("has favorite stops"){
                    Then("display list of bus with favorites on top") {
                        assertTrue(true)
                    }
                }
                And("has not favorite stops"){
                    Then("display list of bus") {
                        assertTrue(true)
                    }
                }
            }
            When("enters bus detail screen"){
                Then("display detailed bus stop"){
                    assertTrue(true)
                }
            }
        }
    }
})

```

## Disabling test groups
add `x` before method call - this will ignore specific test or container.
For example, don't want to test "user has favorite stops" yet, but we want to have full specification written:
```kotlin
class ManyCaseScenarioSample : Spek({
    Scenario("user is looking for a bus") {
        //setup context of a user
        Given("bus list screen") {
            When("enters bus list screen") {
                xAnd("has favorite stops", "not implemented yet") {
                    Then("display list of bus with favorites on top") {
                        assertTrue(true)
                    }
                }
                And("has not favorite stops") {
                    Then("display list of bus") {
                        assertTrue(true)
                    }
                }
            }
            When("enters bus detail screen") {
                Then("display detailed bus stop") {
                    assertTrue(true)
                }
            }
        }
    }
})
```

## Summary

Contributions are welcome
