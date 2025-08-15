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

public val SolidGroup.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(name = "History", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 64.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, 86.0f, 192.0f, 192.0f)
                reflectiveCurveTo(394.0f, 448.0f, 288.0f, 448.0f)
                curveToRelative(-65.2f, 0.0f, -122.9f, -32.5f, -157.6f, -82.3f)
                curveToRelative(-10.1f, -14.5f, -30.1f, -18.0f, -44.6f, -7.9f)
                reflectiveCurveToRelative(-18.0f, 30.1f, -7.9f, 44.6f)
                curveTo(124.1f, 468.6f, 201.0f, 512.0f, 288.0f, 512.0f)
                curveTo(429.4f, 512.0f, 544.0f, 397.4f, 544.0f, 256.0f)
                reflectiveCurveTo(429.4f, 0.0f, 288.0f, 0.0f)
                curveTo(202.3f, 0.0f, 126.5f, 42.1f, 80.0f, 106.7f)
                lineTo(80.0f, 80.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(16.0f, 62.3f, 16.0f, 80.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(24.6f, 0.0f)
                curveToRelative(0.5f, 0.0f, 1.0f, 0.0f, 1.5f, 0.0f)
                lineToRelative(86.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-38.3f, 0.0f)
                curveTo(154.9f, 102.6f, 217.0f, 64.0f, 288.0f, 64.0f)
                close()
                moveTo(312.0f, 152.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 104.0f)
                curveToRelative(0.0f, 6.4f, 2.5f, 12.5f, 7.0f, 17.0f)
                lineToRelative(72.0f, 72.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-65.0f, -65.0f)
                lineToRelative(0.0f, -94.1f)
                close()
            }
        }
        .build()
        return _history!!
    }

private var _history: ImageVector? = null
