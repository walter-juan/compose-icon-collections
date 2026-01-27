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

public val SolidGroup.LessThanEqual: ImageVector
    get() {
        if (_lessThanEqual != null) {
            return _lessThanEqual!!
        }
        _lessThanEqual = Builder(name = "LessThanEqual", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(426.1f, 94.4f)
                curveToRelative(16.8f, -5.6f, 25.8f, -23.7f, 20.2f, -40.5f)
                reflectiveCurveToRelative(-23.7f, -25.8f, -40.5f, -20.2f)
                lineToRelative(-384.0f, 128.0f)
                curveTo(8.8f, 166.0f, 0.0f, 178.2f, 0.0f, 192.0f)
                reflectiveCurveToRelative(8.8f, 26.0f, 21.9f, 30.4f)
                lineToRelative(384.0f, 128.0f)
                curveToRelative(16.8f, 5.6f, 34.9f, -3.5f, 40.5f, -20.2f)
                reflectiveCurveToRelative(-3.5f, -34.9f, -20.2f, -40.5f)
                lineTo(133.2f, 192.0f)
                lineTo(426.1f, 94.4f)
                close()
                moveTo(32.0f, 416.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 416.0f)
                close()
            }
        }
        .build()
        return _lessThanEqual!!
    }

private var _lessThanEqual: ImageVector? = null
