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

public val SolidGroup.Number3: ImageVector
    get() {
        if (_number3 != null) {
            return _number3!!
        }
        _number3 = Builder(name = "Number3", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(240.0f, 0.0f)
                curveToRelative(13.2f, 0.0f, 25.0f, 8.1f, 29.8f, 20.4f)
                reflectiveCurveToRelative(1.5f, 26.3f, -8.2f, 35.2f)
                lineTo(162.3f, 208.0f)
                lineToRelative(21.7f, 0.0f)
                curveToRelative(75.1f, 0.0f, 136.0f, 60.9f, 136.0f, 136.0f)
                reflectiveCurveToRelative(-60.9f, 136.0f, -136.0f, 136.0f)
                lineToRelative(-78.6f, 0.0f)
                curveTo(63.0f, 480.0f, 24.2f, 456.0f, 5.3f, 418.1f)
                lineToRelative(-1.9f, -3.8f)
                curveToRelative(-7.9f, -15.8f, -1.5f, -35.0f, 14.3f, -42.9f)
                reflectiveCurveToRelative(35.0f, -1.5f, 42.9f, 14.3f)
                lineToRelative(1.9f, 3.8f)
                curveToRelative(8.1f, 16.3f, 24.8f, 26.5f, 42.9f, 26.5f)
                lineToRelative(78.6f, 0.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, -32.2f, 72.0f, -72.0f)
                reflectiveCurveToRelative(-32.2f, -72.0f, -72.0f, -72.0f)
                lineTo(80.0f, 272.0f)
                curveToRelative(-13.2f, 0.0f, -25.0f, -8.1f, -29.8f, -20.4f)
                reflectiveCurveToRelative(-1.5f, -26.3f, 8.2f, -35.2f)
                lineTo(189.7f, 96.0f)
                lineTo(32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _number3!!
    }

private var _number3: ImageVector? = null
