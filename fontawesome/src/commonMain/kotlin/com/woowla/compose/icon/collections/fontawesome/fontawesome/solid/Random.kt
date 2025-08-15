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

public val SolidGroup.Random: ImageVector
    get() {
        if (_random != null) {
            return _random!!
        }
        _random = Builder(name = "Random", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.8f, 34.4f)
                curveToRelative(12.0f, -5.0f, 25.7f, -2.2f, 34.9f, 6.9f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(6.0f, 6.0f, 9.4f, 14.1f, 9.4f, 22.6f)
                reflectiveCurveToRelative(-3.4f, 16.6f, -9.4f, 22.6f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-9.2f, 9.2f, -22.9f, 11.9f, -34.9f, 6.9f)
                reflectiveCurveTo(384.0f, 204.9f, 384.0f, 192.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-10.1f, 0.0f, -19.6f, 4.7f, -25.6f, 12.8f)
                lineToRelative(-32.4f, 43.2f)
                lineToRelative(-40.0f, -53.3f)
                lineToRelative(21.2f, -28.3f)
                curveTo(293.3f, 110.2f, 321.8f, 96.0f, 352.0f, 96.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -12.9f, 7.8f, -24.6f, 19.8f, -29.6f)
                close()
                moveTo(154.0f, 296.0f)
                lineToRelative(40.0f, 53.3f)
                lineToRelative(-21.2f, 28.3f)
                curveTo(154.7f, 401.8f, 126.2f, 416.0f, 96.0f, 416.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(10.1f, 0.0f, 19.6f, -4.7f, 25.6f, -12.8f)
                lineTo(154.0f, 296.0f)
                close()
                moveTo(438.6f, 470.6f)
                curveToRelative(-9.2f, 9.2f, -22.9f, 11.9f, -34.9f, 6.9f)
                reflectiveCurveTo(384.0f, 460.9f, 384.0f, 448.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-30.2f, 0.0f, -58.7f, -14.2f, -76.8f, -38.4f)
                lineTo(121.6f, 172.8f)
                curveToRelative(-6.0f, -8.1f, -15.5f, -12.8f, -25.6f, -12.8f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveTo(14.3f, 96.0f, 32.0f, 96.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(30.2f, 0.0f, 58.7f, 14.2f, 76.8f, 38.4f)
                lineTo(326.4f, 339.2f)
                curveToRelative(6.0f, 8.1f, 15.5f, 12.8f, 25.6f, 12.8f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -12.9f, 7.8f, -24.6f, 19.8f, -29.6f)
                reflectiveCurveToRelative(25.7f, -2.2f, 34.9f, 6.9f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(6.0f, 6.0f, 9.4f, 14.1f, 9.4f, 22.6f)
                reflectiveCurveToRelative(-3.4f, 16.6f, -9.4f, 22.6f)
                lineToRelative(-64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _random!!
    }

private var _random: ImageVector? = null
