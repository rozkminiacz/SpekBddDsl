package me.rozkmin.spekbyexamples

import me.rozkmin.spekbdd.BddDsl.And
import me.rozkmin.spekbdd.BddDsl.Given
import me.rozkmin.spekbdd.BddDsl.Story
import me.rozkmin.spekbdd.BddDsl.Then
import me.rozkmin.spekbdd.BddDsl.When
import org.jetbrains.spek.api.Spek

import org.junit.Assert.assertTrue
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

/**
 * Created by jaroslawmichalik on 27.02.2018
 */
@RunWith(JUnitPlatform::class)
object SpekBddExample : Spek({
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
