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

public val SolidGroup.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 0.0f)
                lineTo(128.0f, 0.0f)
                curveTo(110.3f, 0.0f, 96.0f, 14.3f, 96.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(128.0f, 215.5f)
                lineTo(7.5f, 426.3f)
                curveTo(2.6f, 435.0f, 0.0f, 444.7f, 0.0f, 454.7f)
                curveTo(0.0f, 486.4f, 25.6f, 512.0f, 57.3f, 512.0f)
                lineToRelative(333.4f, 0.0f)
                curveToRelative(31.6f, 0.0f, 57.3f, -25.6f, 57.3f, -57.3f)
                curveToRelative(0.0f, -10.0f, -2.6f, -19.8f, -7.5f, -28.4f)
                lineTo(320.0f, 215.5f)
                lineTo(320.0f, 64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveTo(337.7f, 0.0f, 320.0f, 0.0f)
                lineTo(288.0f, 0.0f)
                close()
                moveTo(192.0f, 215.5f)
                lineToRelative(0.0f, -151.5f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 151.5f)
                curveToRelative(0.0f, 11.1f, 2.9f, 22.1f, 8.4f, 31.8f)
                lineToRelative(41.6f, 72.7f)
                lineToRelative(-164.0f, 0.0f)
                lineToRelative(41.6f, -72.7f)
                curveToRelative(5.5f, -9.7f, 8.4f, -20.6f, 8.4f, -31.8f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
