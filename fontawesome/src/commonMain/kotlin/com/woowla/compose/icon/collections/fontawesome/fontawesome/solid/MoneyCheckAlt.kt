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

public val SolidGroup.MoneyCheckAlt: ImageVector
    get() {
        if (_moneyCheckAlt != null) {
            return _moneyCheckAlt!!
        }
        _moneyCheckAlt = Builder(name = "MoneyCheckAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                curveTo(28.7f, 64.0f, 0.0f, 92.7f, 0.0f, 128.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(296.0f, 288.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(272.0f, 200.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                close()
                moveTo(148.0f, 144.0f)
                curveToRelative(11.0f, 0.0f, 20.0f, 9.0f, 20.0f, 20.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(8.0f, 0.0f)
                curveToRelative(11.0f, 0.0f, 20.0f, 9.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(-9.0f, 20.0f, -20.0f, 20.0f)
                lineToRelative(-47.5f, 0.0f)
                curveToRelative(-6.9f, 0.0f, -12.5f, 5.6f, -12.5f, 12.5f)
                curveToRelative(0.0f, 6.1f, 4.4f, 11.3f, 10.4f, 12.3f)
                lineToRelative(41.7f, 7.0f)
                curveToRelative(25.3f, 4.2f, 43.9f, 26.1f, 43.9f, 51.8f)
                curveToRelative(0.0f, 26.1f, -19.0f, 47.7f, -44.0f, 51.8f)
                lineToRelative(0.0f, 4.7f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(-24.0f, 0.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, -9.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(9.0f, -20.0f, 20.0f, -20.0f)
                lineToRelative(55.5f, 0.0f)
                curveToRelative(6.9f, 0.0f, 12.5f, -5.6f, 12.5f, -12.5f)
                curveToRelative(0.0f, -6.1f, -4.4f, -11.3f, -10.4f, -12.3f)
                lineToRelative(-41.7f, -7.0f)
                curveTo(94.5f, 268.0f, 76.0f, 246.1f, 76.0f, 220.5f)
                curveTo(76.0f, 191.7f, 99.2f, 168.3f, 128.0f, 168.0f)
                lineToRelative(0.0f, -4.0f)
                curveToRelative(0.0f, -11.0f, 9.0f, -20.0f, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _moneyCheckAlt!!
    }

private var _moneyCheckAlt: ImageVector? = null
