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

public val SolidGroup.BridgeWater: ImageVector
    get() {
        if (_bridgeWater != null) {
            return _bridgeWater!!
        }
        _bridgeWater = Builder(name = "BridgeWater", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                lineToRelative(512.0f, 0.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(-37.6f, 9.4f, -64.0f, 43.2f, -64.0f, 82.0f)
                lineToRelative(0.0f, 76.4f)
                curveToRelative(-21.0f, -9.7f, -43.5f, -14.5f, -66.0f, -14.4f)
                curveToRelative(-10.0f, 0.1f, -20.1f, 1.1f, -30.0f, 3.1f)
                lineToRelative(0.0f, -35.1f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                lineToRelative(0.0f, 32.7f)
                curveToRelative(-5.3f, -0.5f, -10.7f, -0.8f, -16.0f, -0.7f)
                curveToRelative(-27.7f, 0.2f, -55.4f, 7.8f, -80.0f, 23.0f)
                lineToRelative(0.0f, -85.0f)
                curveToRelative(0.0f, -38.8f, -26.4f, -72.6f, -64.0f, -82.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(403.4f, 444.1f)
                curveTo(379.1f, 462.3f, 351.1f, 480.0f, 320.0f, 480.0f)
                reflectiveCurveToRelative(-59.1f, -17.7f, -83.4f, -35.9f)
                curveToRelative(-21.3f, -16.1f, -49.9f, -16.1f, -71.2f, 0.0f)
                curveToRelative(-23.8f, 17.9f, -54.1f, 35.5f, -88.1f, 35.3f)
                curveToRelative(-20.4f, -0.1f, -40.7f, -6.7f, -59.8f, -21.1f)
                curveToRelative(-10.6f, -8.0f, -12.7f, -23.0f, -4.7f, -33.6f)
                reflectiveCurveToRelative(23.0f, -12.7f, 33.6f, -4.7f)
                curveToRelative(11.3f, 8.5f, 21.6f, 11.4f, 31.2f, 11.5f)
                curveToRelative(17.6f, 0.1f, 37.3f, -9.4f, 58.9f, -25.7f)
                curveToRelative(38.4f, -29.0f, 90.5f, -29.0f, 129.0f, 0.0f)
                curveToRelative(24.0f, 18.1f, 40.7f, 26.3f, 54.5f, 26.3f)
                reflectiveCurveToRelative(30.5f, -8.2f, 54.5f, -26.3f)
                curveToRelative(38.4f, -29.0f, 90.5f, -29.0f, 129.0f, 0.0f)
                curveToRelative(16.9f, 12.7f, 32.9f, 21.5f, 47.8f, 24.6f)
                curveToRelative(13.7f, 2.8f, 27.4f, 0.9f, 42.3f, -10.3f)
                curveToRelative(10.6f, -8.0f, 25.6f, -5.9f, 33.6f, 4.7f)
                reflectiveCurveToRelative(5.9f, 25.6f, -4.7f, 33.6f)
                curveToRelative(-26.4f, 19.9f, -54.2f, 24.4f, -80.7f, 19.1f)
                curveToRelative(-25.3f, -5.1f, -48.1f, -18.9f, -67.2f, -33.3f)
                curveToRelative(-21.3f, -16.1f, -49.9f, -16.1f, -71.2f, 0.0f)
                close()
            }
        }
        .build()
        return _bridgeWater!!
    }

private var _bridgeWater: ImageVector? = null
