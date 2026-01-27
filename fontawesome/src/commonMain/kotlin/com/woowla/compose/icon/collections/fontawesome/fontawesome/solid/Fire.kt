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

public val SolidGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.5f, -26.4f)
                curveToRelative(9.3f, -7.8f, 23.0f, -7.5f, 31.9f, 0.9f)
                curveToRelative(12.3f, 11.6f, 23.3f, 24.4f, 33.9f, 37.4f)
                curveToRelative(13.5f, 16.5f, 29.7f, 38.3f, 45.3f, 64.2f)
                curveToRelative(5.2f, -6.8f, 10.0f, -12.8f, 14.2f, -17.9f)
                curveToRelative(1.1f, -1.3f, 2.2f, -2.7f, 3.3f, -4.1f)
                curveToRelative(7.9f, -9.8f, 17.7f, -22.1f, 30.8f, -22.1f)
                curveToRelative(13.4f, 0.0f, 22.8f, 11.9f, 30.8f, 22.1f)
                curveToRelative(1.3f, 1.7f, 2.6f, 3.3f, 3.9f, 4.8f)
                curveToRelative(10.3f, 12.4f, 24.0f, 30.3f, 37.7f, 52.4f)
                curveToRelative(27.2f, 43.9f, 55.6f, 106.4f, 55.6f, 176.6f)
                curveToRelative(0.0f, 123.7f, -100.3f, 224.0f, -224.0f, 224.0f)
                reflectiveCurveTo(0.0f, 411.7f, 0.0f, 288.0f)
                curveToRelative(0.0f, -91.1f, 41.1f, -170.0f, 80.5f, -225.0f)
                curveToRelative(19.9f, -27.7f, 39.7f, -49.9f, 54.6f, -65.1f)
                curveToRelative(8.2f, -8.4f, 16.5f, -16.7f, 25.5f, -24.2f)
                close()
                moveTo(225.7f, 416.0f)
                curveToRelative(25.3f, 0.0f, 47.7f, -7.0f, 68.8f, -21.0f)
                curveToRelative(42.1f, -29.4f, 53.4f, -88.2f, 28.1f, -134.4f)
                curveToRelative(-4.5f, -9.0f, -16.0f, -9.6f, -22.5f, -2.0f)
                lineToRelative(-25.2f, 29.3f)
                curveToRelative(-6.6f, 7.6f, -18.5f, 7.4f, -24.7f, -0.5f)
                curveToRelative(-17.3f, -22.1f, -49.1f, -62.4f, -65.3f, -83.0f)
                curveToRelative(-5.4f, -6.9f, -15.2f, -8.0f, -21.5f, -1.9f)
                curveToRelative(-18.3f, 17.8f, -51.5f, 56.8f, -51.5f, 104.3f)
                curveToRelative(0.0f, 68.6f, 50.6f, 109.2f, 113.7f, 109.2f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
