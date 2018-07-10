package me.rozkmin.spekbyexamples

import me.rozkmin.spekbdd.BddDsl.And
import me.rozkmin.spekbdd.BddDsl.Given
import me.rozkmin.spekbdd.BddDsl.Scenario
import me.rozkmin.spekbdd.BddDsl.Then
import me.rozkmin.spekbdd.BddDsl.When
import me.rozkmin.spekbdd.BddDsl.xAnd
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertTrue

class ManyCaseScenarioSample : Spek({
    Scenario("user is looking for a bus") {
        //setup context of a user
        Given("bus list screen") {
            When("user exists screen") {
                Then("save data ") {

                }
            }
            When("enters bus list screen") {
                And("has favorite stops") {
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

class ManyCaseAndOneDisabledSample : Spek({
    Scenario("user is looking for a bus") {
        Given("bus list screen") {
            When("enters bus list screen") {
                xAnd("has favorite stops", "NOT IMPLEMENTED YET") {
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


class VanillaSpek : Spek({
    describe("something") {
        on("user action") {
            it("should respond to action") {
                assertTrue(false)
            }
            it("should do another action") {
                assertTrue(true)
            }
        }
    }
})
