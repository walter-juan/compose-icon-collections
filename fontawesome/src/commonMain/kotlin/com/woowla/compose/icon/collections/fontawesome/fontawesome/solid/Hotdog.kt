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

public val SolidGroup.Hotdog: ImageVector
    get() {
        if (_hotdog != null) {
            return _hotdog!!
        }
        _hotdog = Builder(name = "Hotdog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 0.0f)
                curveToRelative(-20.5f, 0.0f, -40.1f, 8.1f, -54.6f, 22.6f)
                lineTo(22.6f, 233.4f)
                curveTo(8.1f, 247.9f, 0.0f, 267.5f, 0.0f, 288.0f)
                curveTo(0.0f, 300.2f, 2.9f, 312.1f, 8.2f, 322.7f)
                lineTo(322.7f, 8.2f)
                curveTo(312.1f, 2.9f, 300.2f, 0.0f, 288.0f, 0.0f)
                close()
                moveTo(224.0f, 512.0f)
                curveToRelative(20.5f, 0.0f, 40.1f, -8.1f, 54.6f, -22.6f)
                lineTo(489.4f, 278.6f)
                curveToRelative(14.5f, -14.5f, 22.6f, -34.1f, 22.6f, -54.6f)
                curveToRelative(0.0f, -12.2f, -2.9f, -24.1f, -8.2f, -34.7f)
                lineTo(189.3f, 503.8f)
                curveToRelative(10.7f, 5.4f, 22.6f, 8.2f, 34.7f, 8.2f)
                close()
                moveTo(456.6f, 168.6f)
                curveToRelative(31.2f, -31.2f, 31.2f, -81.9f, 0.0f, -113.1f)
                reflectiveCurveToRelative(-81.9f, -31.2f, -113.1f, 0.0f)
                lineToRelative(-288.0f, 288.0f)
                curveToRelative(-31.2f, 31.2f, -31.2f, 81.9f, 0.0f, 113.1f)
                reflectiveCurveToRelative(81.9f, 31.2f, 113.1f, 0.0f)
                lineToRelative(288.0f, -288.0f)
                close()
            }
        }
        .build()
        return _hotdog!!
    }

private var _hotdog: ImageVector? = null
