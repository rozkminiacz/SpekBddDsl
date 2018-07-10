package me.rozkmin.spekbdd

import org.jetbrains.spek.api.dsl.ActionBody
import org.jetbrains.spek.api.dsl.Pending
import org.jetbrains.spek.api.dsl.SpecBody
import org.jetbrains.spek.api.dsl.TestBody
import org.jetbrains.spek.api.dsl.TestContainer

/**
 * Created by jaroslawmichalik on 27.02.2018
 */
object BddDsl {

    fun SpecBody.Scenario(description: String, body: SpecBody.() -> Unit) {
        group("scenario: $description", body = body)
    }

    fun SpecBody.xScenario(description: String, pendingReason: String = "", body: SpecBody.() -> Unit) {
        group("scenario: $description", body = body, pending = Pending.Yes(pendingReason))
    }

    fun SpecBody.xStory(description: String, pendingReason: String = "", body: SpecBody.() -> Unit) {
        group("story: $description", body = body, pending = Pending.Yes(pendingReason))
    }

    fun SpecBody.Given(description: String, body: SpecBody.() -> Unit) {
        group("given $description", body = body)
    }

    fun SpecBody.xGiven(description: String, pendingReason: String = "", body: SpecBody.() -> Unit) {
        group("given $description", body = body, pending = Pending.Yes(pendingReason))
    }

    fun SpecBody.When(description: String, body: SpecBody.() -> Unit) {
        group("when $description", body = body)
    }

    fun SpecBody.xWhen(description: String, pendingReason: String = "", body: SpecBody.() -> Unit) {
        group("when $description", body = body, pending = Pending.Yes(pendingReason))
    }

    fun TestContainer.Then(description: String, body: TestBody.() -> Unit) {
        test("then $description", body = body)
    }

    fun TestContainer.xThen(description: String, pendingReason: String = "", body: TestBody.() -> Unit) {
        test("then $description", body = body, pending = Pending.Yes(pendingReason))
    }

    fun SpecBody.And(description: String, body: ActionBody.() -> Unit) {
        action("and $description", body = body)
    }

    fun SpecBody.xAnd(description: String, pendingReason: String = "", body: ActionBody.() -> Unit) {
        action("and $description", body = body, pending = Pending.Yes(pendingReason))
    }
}