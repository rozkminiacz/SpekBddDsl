package me.rozkmin.spekbdd

import org.jetbrains.spek.api.dsl.ActionBody
import org.jetbrains.spek.api.dsl.SpecBody
import org.jetbrains.spek.api.dsl.TestBody
import org.jetbrains.spek.api.dsl.TestContainer

/**
 * Created by jaroslawmichalik on 27.02.2018
 */
object BddDsl{
    fun SpecBody.Story(description: String, body: SpecBody.() -> Unit) {
        group("story: $description", body = body)
    }

    fun SpecBody.Given(description: String, body: SpecBody.() -> Unit) {
        group("given $description", body = body)
    }

    fun SpecBody.When(description: String, body: SpecBody.() -> Unit) {
        group("when $description", body = body)
    }

    fun TestContainer.Then(description: String, body: TestBody.() -> Unit) {
        test("then $description", body = body)
    }

    fun SpecBody.And(description: String, body: ActionBody.() -> Unit){
        action("and $description", body = body)
    }
}