package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat


class TipCalculatorTests {
    @Test
    fun calculateTip_20PercentNoRoundUp() {
        val amount = 10.0
        val percent = 20.0
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount, percent, false)

        assertEquals(expectedTip, actualTip)


    }
}