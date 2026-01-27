package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.MoneyBillWave: ImageVector
    get() {
        if (_moneyBillWave != null) {
            return _moneyBillWave!!
        }
        _moneyBillWave = Builder(name = "MoneyBillWave", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 419.6f)
                lineTo(0.0f, 109.5f)
                curveToRelative(0.0f, -23.2f, 24.1f, -38.6f, 46.3f, -32.0f)
                curveToRelative(87.7f, 26.2f, 149.7f, 5.5f, 212.1f, -15.3f)
                curveToRelative(64.5f, -21.5f, 129.4f, -43.1f, 223.3f, -13.1f)
                curveToRelative(18.5f, 5.9f, 30.3f, 23.8f, 30.3f, 43.3f)
                lineToRelative(0.0f, 310.1f)
                curveToRelative(0.0f, 23.2f, -24.1f, 38.6f, -46.2f, 32.0f)
                curveToRelative(-87.7f, -26.2f, -149.8f, -5.5f, -212.1f, 15.3f)
                curveToRelative(-64.5f, 21.5f, -129.4f, 43.1f, -223.3f, 13.1f)
                curveToRelative(-18.5f, -5.9f, -30.3f, -23.8f, -30.3f, -43.3f)
                close()
                moveTo(336.0f, 256.0f)
                curveToRelative(0.0f, -53.0f, -35.8f, -96.0f, -80.0f, -96.0f)
                reflectiveCurveToRelative(-80.0f, 43.0f, -80.0f, 96.0f)
                reflectiveCurveToRelative(35.8f, 96.0f, 80.0f, 96.0f)
                reflectiveCurveToRelative(80.0f, -43.0f, 80.0f, -96.0f)
                close()
                moveTo(120.0f, 413.6f)
                curveToRelative(4.4f, 0.0f, 7.9f, -3.8f, 7.2f, -8.1f)
                curveToRelative(-4.6f, -27.8f, -27.0f, -49.5f, -55.2f, -53.0f)
                curveToRelative(-4.4f, -0.5f, -8.0f, 3.1f, -8.0f, 7.5f)
                lineToRelative(0.0f, 39.9f)
                curveToRelative(0.0f, 3.6f, 2.4f, 6.8f, 6.0f, 7.7f)
                curveToRelative(17.9f, 4.2f, 34.3f, 6.1f, 50.0f, 6.1f)
                close()
                moveTo(438.5f, 362.5f)
                curveToRelative(5.0f, 0.8f, 9.5f, -3.0f, 9.5f, -8.0f)
                lineToRelative(0.0f, -42.6f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.1f, -8.0f, -7.5f)
                curveToRelative(-25.2f, 3.1f, -45.9f, 20.9f, -53.2f, 44.6f)
                curveToRelative(-1.4f, 4.7f, 2.3f, 9.1f, 7.2f, 9.2f)
                curveToRelative(14.2f, 0.4f, 29.0f, 1.7f, 44.4f, 4.3f)
                close()
                moveTo(448.0f, 152.0f)
                lineToRelative(0.0f, -39.9f)
                curveToRelative(0.0f, -3.6f, -2.5f, -6.8f, -6.0f, -7.7f)
                curveToRelative(-17.9f, -4.2f, -34.3f, -6.1f, -50.0f, -6.1f)
                curveToRelative(-4.4f, 0.0f, -7.9f, 3.8f, -7.2f, 8.1f)
                curveToRelative(4.6f, 27.8f, 27.0f, 49.5f, 55.2f, 53.0f)
                curveToRelative(4.4f, 0.5f, 8.0f, -3.1f, 8.0f, -7.5f)
                close()
                moveTo(125.2f, 162.9f)
                curveToRelative(1.4f, -4.7f, -2.3f, -9.1f, -7.2f, -9.2f)
                curveToRelative(-14.2f, -0.4f, -29.0f, -1.7f, -44.4f, -4.3f)
                curveToRelative(-5.0f, -0.8f, -9.5f, 3.0f, -9.5f, 8.0f)
                lineTo(64.0f, 200.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.1f, 8.0f, 7.5f)
                curveToRelative(25.2f, -3.1f, 45.9f, -20.9f, 53.2f, -44.6f)
                close()
            }
        }
        .build()
        return _moneyBillWave!!
    }

private var _moneyBillWave: ImageVector? = null
