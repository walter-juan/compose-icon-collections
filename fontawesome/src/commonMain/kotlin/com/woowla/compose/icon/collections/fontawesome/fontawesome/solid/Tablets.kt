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

public val SolidGroup.Tablets: ImageVector
    get() {
        if (_tablets != null) {
            return _tablets!!
        }
        _tablets = Builder(name = "Tablets", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(614.3f, 247.0f)
                curveToRelative(-5.2f, 7.9f, -16.2f, 8.5f, -22.9f, 1.8f)
                lineTo(391.2f, 48.6f)
                curveToRelative(-6.7f, -6.7f, -6.2f, -17.8f, 1.8f, -22.9f)
                curveTo(418.1f, 9.4f, 447.9f, 0.0f, 480.0f, 0.0f)
                curveToRelative(88.4f, 0.0f, 160.0f, 71.6f, 160.0f, 160.0f)
                curveToRelative(0.0f, 32.1f, -9.4f, 61.9f, -25.7f, 87.0f)
                close()
                moveTo(567.0f, 294.3f)
                curveToRelative(-25.0f, 16.3f, -54.9f, 25.7f, -87.0f, 25.7f)
                curveToRelative(-88.4f, 0.0f, -160.0f, -71.6f, -160.0f, -160.0f)
                curveToRelative(0.0f, -32.1f, 9.4f, -61.9f, 25.7f, -87.0f)
                curveToRelative(5.2f, -7.9f, 16.2f, -8.5f, 22.9f, -1.8f)
                lineTo(568.8f, 271.4f)
                curveToRelative(6.7f, 6.7f, 6.2f, 17.8f, -1.8f, 22.9f)
                close()
                moveTo(301.5f, 368.0f)
                curveToRelative(9.5f, 0.0f, 16.9f, 8.2f, 15.0f, 17.5f)
                curveTo(301.1f, 457.8f, 236.9f, 512.0f, 160.0f, 512.0f)
                reflectiveCurveTo(18.9f, 457.8f, 3.5f, 385.5f)
                curveToRelative(-2.0f, -9.3f, 5.5f, -17.5f, 15.0f, -17.5f)
                lineToRelative(283.1f, 0.0f)
                close()
                moveTo(301.5f, 336.0f)
                lineTo(18.5f, 336.0f)
                curveToRelative(-9.5f, 0.0f, -16.9f, -8.2f, -15.0f, -17.5f)
                curveTo(18.9f, 246.2f, 83.1f, 192.0f, 160.0f, 192.0f)
                reflectiveCurveToRelative(141.1f, 54.2f, 156.5f, 126.5f)
                curveToRelative(2.0f, 9.3f, -5.5f, 17.5f, -15.0f, 17.5f)
                close()
            }
        }
        .build()
        return _tablets!!
    }

private var _tablets: ImageVector? = null
