# Spek BDD



| Spek BDD DSL         | Spek DSL |
|---:           | ---:      |
| Story         | group     |
| Given         | group     |
| When          | group     |
| Then          | test      |
| And           | action    |

## Example in code:

![spek-intelij](spek-bdd-run.png)


```kotlin
@RunWith(JUnitPlatform::class)
object SpekBddExample : Spek({
    Story("user is looking for a bus") {
        //setup context of a user
        Given("bus list screen") {
            When("enters bus list screen") {
                And("has favorite stops"){
                    Then("display list of bus with favorites on top") {
                        Assert.assertTrue(true)
                    }
                }
                And("has not favorite stops"){
                    Then("display list of bus") {
                        Assert.assertTrue(true)
                    }
                }

            }
            When("enters bus detail screen"){
                Then("display detailed bus stop"){
                    Assert.assertTrue(true)
                }
            }
        }
    }
})

```