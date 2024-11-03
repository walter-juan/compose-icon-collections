package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Mouse2: ImageVector
    get() {
        if (_mouse2 != null) {
            return _mouse2!!
        }
        _mouse2 = Builder(name = "Mouse2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.188f)
                curveTo(3.0f, 2.341f, 5.22f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(5.0f, 2.342f, 5.0f, 5.188f)
                verticalLineToRelative(5.625f)
                curveTo(13.0f, 13.658f, 10.78f, 16.0f, 8.0f, 16.0f)
                reflectiveCurveToRelative(-5.0f, -2.342f, -5.0f, -5.188f)
                lineTo(3.0f, 5.189f)
                close()
                moveTo(7.5f, 1.033f)
                curveTo(5.541f, 1.289f, 4.0f, 3.035f, 4.0f, 5.188f)
                lineTo(4.0f, 5.5f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(8.5f, 1.033f)
                lineTo(8.5f, 5.5f)
                lineTo(12.0f, 5.5f)
                verticalLineToRelative(-0.313f)
                curveToRelative(0.0f, -2.152f, -1.541f, -3.898f, -3.5f, -4.154f)
                moveTo(12.0f, 6.5f)
                lineTo(4.0f, 6.5f)
                verticalLineToRelative(4.313f)
                curveTo(4.0f, 13.145f, 5.81f, 15.0f, 8.0f, 15.0f)
                reflectiveCurveToRelative(4.0f, -1.855f, 4.0f, -4.188f)
                close()
            }
        }
        .build()
        return _mouse2!!
    }

private var _mouse2: ImageVector? = null
