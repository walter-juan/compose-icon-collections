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

public val SolidGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.3f, 0.0f)
                lineToRelative(224.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.1f, 21.8f, 47.1f, 48.2f)
                curveToRelative(-0.2f, 5.3f, -0.4f, 10.6f, -0.7f, 15.8f)
                lineToRelative(49.6f, 0.0f)
                curveToRelative(26.1f, 0.0f, 49.1f, 21.6f, 47.1f, 49.8f)
                curveToRelative(-7.5f, 103.7f, -60.5f, 160.7f, -118.0f, 190.5f)
                curveToRelative(-15.8f, 8.2f, -31.9f, 14.3f, -47.2f, 18.8f)
                curveToRelative(-20.2f, 28.6f, -41.2f, 43.7f, -57.9f, 51.8f)
                lineToRelative(0.0f, 73.1f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-192.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -73.1f)
                curveToRelative(-16.0f, -7.7f, -35.9f, -22.0f, -55.3f, -48.3f)
                curveToRelative(-18.4f, -4.8f, -38.4f, -12.1f, -57.9f, -23.1f)
                curveToRelative(-54.1f, -30.3f, -102.9f, -87.4f, -109.9f, -189.9f)
                curveToRelative(-1.9f, -28.1f, 21.0f, -49.7f, 47.1f, -49.7f)
                lineToRelative(49.6f, 0.0f)
                curveToRelative(-0.3f, -5.2f, -0.5f, -10.4f, -0.7f, -15.8f)
                curveToRelative(-1.0f, -26.5f, 20.6f, -48.2f, 47.1f, -48.2f)
                close()
                moveTo(101.5f, 112.0f)
                lineToRelative(-52.4f, 0.0f)
                curveToRelative(6.2f, 84.7f, 45.1f, 127.1f, 85.2f, 149.6f)
                curveToRelative(-14.4f, -37.3f, -26.3f, -86.0f, -32.8f, -149.6f)
                close()
                moveTo(380.0f, 256.8f)
                curveToRelative(40.5f, -23.8f, 77.1f, -66.1f, 83.3f, -144.8f)
                lineTo(411.0f, 112.0f)
                curveToRelative(-6.2f, 60.9f, -17.4f, 108.2f, -31.0f, 144.8f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
