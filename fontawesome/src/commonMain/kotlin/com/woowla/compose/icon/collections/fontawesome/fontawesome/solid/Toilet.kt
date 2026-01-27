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

public val SolidGroup.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                reflectiveCurveTo(10.7f, 48.0f, 24.0f, 48.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, 148.9f)
                curveToRelative(-1.9f, 1.4f, -3.8f, 2.9f, -5.6f, 4.4f)
                curveToRelative(-15.5f, 13.2f, -26.4f, 31.6f, -26.4f, 54.6f)
                curveToRelative(0.0f, 46.9f, 14.3f, 84.1f, 37.0f, 112.5f)
                curveToRelative(14.2f, 17.7f, 31.1f, 31.3f, 48.5f, 41.8f)
                lineTo(65.6f, 469.9f)
                curveToRelative(-3.3f, 9.8f, -1.6f, 20.5f, 4.4f, 28.8f)
                reflectiveCurveTo(85.7f, 512.0f, 96.0f, 512.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(10.3f, 0.0f, 19.9f, -4.9f, 26.0f, -13.3f)
                reflectiveCurveToRelative(7.7f, -19.1f, 4.4f, -28.8f)
                lineToRelative(-19.8f, -59.5f)
                curveToRelative(17.4f, -10.5f, 34.3f, -24.1f, 48.5f, -41.8f)
                curveToRelative(22.7f, -28.4f, 37.0f, -65.5f, 37.0f, -112.5f)
                curveToRelative(0.0f, -23.1f, -10.9f, -41.5f, -26.4f, -54.6f)
                curveToRelative(-1.8f, -1.5f, -3.7f, -3.0f, -5.6f, -4.4f)
                lineToRelative(0.0f, -148.9f)
                lineToRelative(8.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveTo(437.3f, 0.0f, 424.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(96.0f, 80.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                close()
                moveTo(224.0f, 288.0f)
                curveToRelative(-88.4f, 0.0f, -160.0f, -14.3f, -160.0f, -32.0f)
                reflectiveCurveToRelative(71.6f, -32.0f, 160.0f, -32.0f)
                reflectiveCurveToRelative(160.0f, 14.3f, 160.0f, 32.0f)
                reflectiveCurveToRelative(-71.6f, 32.0f, -160.0f, 32.0f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
