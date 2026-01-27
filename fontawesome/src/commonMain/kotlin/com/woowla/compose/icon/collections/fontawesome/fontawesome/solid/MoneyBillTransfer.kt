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

public val SolidGroup.MoneyBillTransfer: ImageVector
    get() {
        if (_moneyBillTransfer != null) {
            return _moneyBillTransfer!!
        }
        _moneyBillTransfer = Builder(name = "MoneyBillTransfer", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.0f, 105.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(103.0f, -1.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-31.0f, 31.0f)
                lineToRelative(67.7f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(338.3f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 178.2f)
                lineToRelative(-5.1f, -5.1f)
                curveToRelative(-28.1f, -28.1f, -73.7f, -28.1f, -101.8f, 0.0f)
                curveToRelative(-27.2f, 27.2f, -28.1f, 70.6f, -2.8f, 98.9f)
                lineToRelative(67.7f, 0.0f)
                lineToRelative(-31.0f, -31.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(72.0f, 72.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-72.0f, 72.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(31.0f, -31.0f)
                lineToRelative(-406.1f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -178.2f)
                lineToRelative(5.1f, 5.1f)
                curveToRelative(28.1f, 28.1f, 73.7f, 28.1f, 101.8f, 0.0f)
                curveToRelative(27.2f, -27.2f, 28.1f, -70.6f, 2.8f, -98.9f)
                lineToRelative(-67.7f, 0.0f)
                lineToRelative(31.0f, 31.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineTo(31.0f, 105.0f)
                close()
                moveTo(416.0f, 256.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, -192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 192.0f, 0.0f)
                close()
                moveTo(504.0f, 191.5f)
                curveToRelative(4.4f, 0.5f, 8.0f, -3.1f, 8.0f, -7.5f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-4.4f, 0.0f, -8.1f, 3.6f, -7.5f, 8.0f)
                curveToRelative(3.6f, 29.0f, 26.6f, 51.9f, 55.5f, 55.5f)
                close()
                moveTo(136.0f, 320.5f)
                curveToRelative(-4.4f, -0.5f, -8.0f, 3.1f, -8.0f, 7.5f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(4.4f, 0.0f, 8.1f, -3.6f, 7.5f, -8.0f)
                curveToRelative(-3.6f, -29.0f, -26.6f, -51.9f, -55.5f, -55.5f)
                close()
            }
        }
        .build()
        return _moneyBillTransfer!!
    }

private var _moneyBillTransfer: ImageVector? = null
