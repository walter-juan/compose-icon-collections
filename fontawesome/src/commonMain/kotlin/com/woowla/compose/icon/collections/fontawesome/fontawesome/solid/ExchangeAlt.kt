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

public val SolidGroup.ExchangeAlt: ImageVector
    get() {
        if (_exchangeAlt != null) {
            return _exchangeAlt!!
        }
        _exchangeAlt = Builder(name = "ExchangeAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.6f, 150.6f)
                lineToRelative(-96.0f, 96.0f)
                curveToRelative(-9.2f, 9.2f, -22.9f, 11.9f, -34.9f, 6.9f)
                reflectiveCurveTo(352.0f, 236.9f, 352.0f, 224.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-320.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveTo(14.3f, 96.0f, 32.0f, 96.0f)
                lineToRelative(320.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -12.9f, 7.8f, -24.6f, 19.8f, -29.6f)
                reflectiveCurveToRelative(25.7f, -2.2f, 34.9f, 6.9f)
                lineToRelative(96.0f, 96.0f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                close()
                moveTo(105.3f, 502.6f)
                lineToRelative(-96.0f, -96.0f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(96.0f, -96.0f)
                curveToRelative(9.2f, -9.2f, 22.9f, -11.9f, 34.9f, -6.9f)
                reflectiveCurveTo(160.0f, 275.1f, 160.0f, 288.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-320.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 12.9f, -7.8f, 24.6f, -19.8f, 29.6f)
                reflectiveCurveToRelative(-25.7f, 2.2f, -34.9f, -6.9f)
                close()
            }
        }
        .build()
        return _exchangeAlt!!
    }

private var _exchangeAlt: ImageVector? = null
