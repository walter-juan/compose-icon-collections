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

public val SolidGroup.GreaterThanEqual: ImageVector
    get() {
        if (_greaterThanEqual != null) {
            return _greaterThanEqual!!
        }
        _greaterThanEqual = Builder(name = "GreaterThanEqual", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9f, 94.4f)
                curveTo(5.1f, 88.8f, -3.9f, 70.6f, 1.7f, 53.9f)
                reflectiveCurveTo(25.4f, 28.1f, 42.1f, 33.6f)
                lineToRelative(384.0f, 128.0f)
                curveTo(439.2f, 166.0f, 448.0f, 178.2f, 448.0f, 192.0f)
                reflectiveCurveToRelative(-8.8f, 26.0f, -21.9f, 30.4f)
                lineToRelative(-384.0f, 128.0f)
                curveToRelative(-16.8f, 5.6f, -34.9f, -3.5f, -40.5f, -20.2f)
                reflectiveCurveToRelative(3.5f, -34.9f, 20.2f, -40.5f)
                lineTo(314.8f, 192.0f)
                lineTo(21.9f, 94.4f)
                close()
                moveTo(416.0f, 416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(384.0f, 0.0f)
                close()
            }
        }
        .build()
        return _greaterThanEqual!!
    }

private var _greaterThanEqual: ImageVector? = null
