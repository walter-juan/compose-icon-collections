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

public val SolidGroup.HouseFire: ImageVector
    get() {
        if (_houseFire != null) {
            return _houseFire!!
        }
        _houseFire = Builder(name = "HouseFire", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 192.0f)
                curveToRelative(14.1f, 0.4f, 23.8f, 11.4f, 32.7f, 21.7f)
                curveToRelative(2.0f, 2.3f, 4.0f, 4.6f, 6.0f, 6.7f)
                lineToRelative(19.0f, 19.9f)
                lineToRelative(12.2f, -13.8f)
                curveToRelative(5.4f, -6.1f, 13.3f, -8.9f, 20.9f, -8.9f)
                curveToRelative(7.2f, 0.0f, 14.3f, 2.6f, 19.9f, 7.8f)
                curveToRelative(19.7f, 18.3f, 39.8f, 43.2f, 55.0f, 70.6f)
                curveToRelative(15.1f, 27.2f, 26.2f, 58.2f, 26.2f, 88.2f)
                curveToRelative(0.0f, 88.7f, -71.3f, 159.8f, -160.0f, 159.8f)
                curveToRelative(-89.6f, 0.0f, -160.0f, -71.3f, -160.0f, -159.8f)
                curveToRelative(0.0f, -37.3f, 16.0f, -73.4f, 36.8f, -104.5f)
                curveToRelative(20.9f, -31.3f, 47.5f, -59.0f, 70.9f, -80.1f)
                curveToRelative(5.7f, -5.2f, 13.1f, -7.7f, 20.3f, -7.5f)
                close()
                moveTo(268.6f, 6.5f)
                curveToRelative(12.2f, -9.3f, 29.7f, -8.7f, 41.2f, 2.0f)
                lineToRelative(147.5f, 137.0f)
                curveToRelative(-19.2f, -4.3f, -40.0f, 0.5f, -55.5f, 14.4f)
                curveToRelative(-36.4f, 32.6f, -67.7f, 69.8f, -90.3f, 106.4f)
                curveToRelative(-10.3f, 16.6f, -19.7f, 34.9f, -26.8f, 53.7f)
                lineTo(272.0f, 320.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(64.6f, 0.0f)
                curveToRelative(7.3f, 17.2f, 16.8f, 33.4f, 28.2f, 48.0f)
                lineTo(144.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -176.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-13.2f, 0.0f, -25.0f, -8.1f, -29.8f, -20.3f)
                reflectiveCurveToRelative(-1.6f, -26.2f, 8.0f, -35.1f)
                lineToRelative(224.0f, -208.0f)
                lineToRelative(2.4f, -2.0f)
                close()
                moveTo(489.3f, 343.7f)
                curveToRelative(-5.4f, -4.7f, -13.1f, -4.7f, -18.5f, 0.0f)
                curveToRelative(-17.7f, 15.4f, -54.7f, 51.9f, -54.7f, 88.4f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                curveToRelative(0.0f, -36.5f, -37.0f, -73.0f, -54.7f, -88.4f)
                close()
            }
        }
        .build()
        return _houseFire!!
    }

private var _houseFire: ImageVector? = null
