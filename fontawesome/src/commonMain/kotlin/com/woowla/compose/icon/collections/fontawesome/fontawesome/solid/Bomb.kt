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

public val SolidGroup.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, -16.0f)
                curveToRelative(6.9f, 0.0f, 13.0f, 4.4f, 15.2f, 10.9f)
                lineToRelative(13.5f, 40.4f)
                lineToRelative(40.4f, 13.5f)
                curveTo(555.6f, 51.0f, 560.0f, 57.1f, 560.0f, 64.0f)
                reflectiveCurveToRelative(-4.4f, 13.0f, -10.9f, 15.2f)
                lineToRelative(-40.4f, 13.5f)
                lineToRelative(-13.5f, 40.4f)
                curveTo(493.0f, 139.6f, 486.9f, 144.0f, 480.0f, 144.0f)
                reflectiveCurveToRelative(-13.0f, -4.4f, -15.2f, -10.9f)
                lineToRelative(-13.5f, -40.4f)
                lineToRelative(-40.4f, -13.5f)
                curveTo(404.4f, 77.0f, 400.0f, 70.9f, 400.0f, 64.0f)
                reflectiveCurveToRelative(4.4f, -13.0f, 10.9f, -15.2f)
                lineToRelative(40.4f, -13.5f)
                lineToRelative(13.5f, -40.4f)
                curveTo(467.0f, -11.6f, 473.1f, -16.0f, 480.0f, -16.0f)
                close()
                moveTo(321.4f, 97.4f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                lineToRelative(80.0f, 80.0f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(-10.9f, 10.9f)
                curveToRelative(7.9f, 22.0f, 12.2f, 45.7f, 12.2f, 70.5f)
                curveToRelative(0.0f, 114.9f, -93.1f, 208.0f, -208.0f, 208.0f)
                reflectiveCurveTo(32.0f, 418.9f, 32.0f, 304.0f)
                reflectiveCurveTo(125.1f, 96.0f, 240.0f, 96.0f)
                curveToRelative(24.7f, 0.0f, 48.5f, 4.3f, 70.5f, 12.3f)
                lineToRelative(10.9f, -10.9f)
                close()
                moveTo(144.0f, 304.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                curveToRelative(-79.5f, 0.0f, -144.0f, 64.5f, -144.0f, 144.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
