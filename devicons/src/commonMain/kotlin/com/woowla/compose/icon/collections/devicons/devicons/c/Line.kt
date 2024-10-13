package com.woowla.compose.icon.collections.devicons.devicons.c

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CGroup

public val CGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF03599C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.5f, 32.3f)
                curveToRelative(-0.6f, -1.1f, -1.4f, -2.1f, -2.3f, -2.6f)
                lineTo(66.1f, 1.9f)
                curveToRelative(-0.8f, -0.5f, -1.9f, -0.7f, -3.1f, -0.7f)
                curveToRelative(-1.2f, 0.0f, -2.3f, 0.3f, -3.1f, 0.7f)
                lineTo(11.4f, 29.7f)
                curveToRelative(-1.7f, 1.0f, -3.4f, 3.5f, -3.4f, 5.4f)
                verticalLineToRelative(55.7f)
                curveToRelative(0.0f, 1.1f, 0.7f, 2.3f, 1.4f, 3.4f)
                lineToRelative(0.1f, 0.1f)
                curveToRelative(0.5f, 0.8f, 1.3f, 1.5f, 2.0f, 1.9f)
                lineToRelative(48.3f, 27.9f)
                curveToRelative(0.8f, 0.5f, 2.0f, 0.7f, 3.2f, 0.7f)
                curveToRelative(1.2f, 0.0f, 2.3f, -0.3f, 3.1f, -0.7f)
                lineToRelative(47.5f, -27.9f)
                curveToRelative(1.7f, -1.0f, 2.4f, -3.5f, 2.4f, -5.4f)
                lineTo(116.0f, 35.1f)
                curveToRelative(0.0f, -0.8f, 0.4f, -1.8f, 0.0f, -2.6f)
                lineToRelative(0.5f, -0.2f)
                close()
                moveTo(112.3f, 34.4f)
                curveToRelative(0.0f, 0.3f, -0.3f, 0.5f, -0.3f, 0.7f)
                verticalLineToRelative(55.7f)
                curveToRelative(0.0f, 0.8f, -0.2f, 1.7f, -0.4f, 2.0f)
                lineTo(64.0f, 120.6f)
                curveToRelative(-0.1f, 0.1f, -0.5f, 0.2f, -1.1f, 0.2f)
                curveToRelative(-0.6f, 0.0f, -1.0f, -0.1f, -1.1f, -0.2f)
                lineTo(13.6f, 92.8f)
                reflectiveCurveToRelative(-0.1f, -0.1f, -0.2f, -0.1f)
                lineToRelative(-0.6f, -0.6f)
                curveToRelative(-0.4f, -0.7f, 0.2f, -1.1f, -0.8f, -1.2f)
                lineTo(12.0f, 35.2f)
                curveToRelative(1.0f, -0.5f, 0.9f, -1.7f, 1.4f, -1.9f)
                lineTo(61.7f, 5.4f)
                curveToRelative(0.1f, 0.0f, 0.6f, -0.2f, 1.2f, -0.2f)
                reflectiveCurveToRelative(1.0f, 0.1f, 1.1f, 0.2f)
                lineToRelative(48.0f, 27.7f)
                lineToRelative(0.4f, 0.9f)
                curveToRelative(0.1f, 0.1f, -0.1f, 0.3f, -0.1f, 0.4f)
                close()
                moveTo(63.0f, 38.5f)
                curveToRelative(9.1f, 0.0f, 17.1f, 5.0f, 21.3f, 12.5f)
                lineToRelative(13.0f, -7.5f)
                curveToRelative(-6.8f, -11.9f, -19.6f, -20.0f, -34.3f, -20.0f)
                curveToRelative(-21.8f, 0.0f, -39.5f, 17.7f, -39.5f, 39.5f)
                reflectiveCurveToRelative(17.7f, 39.5f, 39.5f, 39.5f)
                curveToRelative(14.6f, 0.0f, 27.4f, -8.0f, 34.2f, -19.8f)
                lineToRelative(-12.9f, -7.6f)
                curveTo(80.1f, 82.5f, 72.1f, 87.5f, 63.0f, 87.5f)
                curveToRelative(-13.5f, 0.0f, -24.5f, -11.0f, -24.5f, -24.5f)
                reflectiveCurveToRelative(11.0f, -24.5f, 24.5f, -24.5f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
