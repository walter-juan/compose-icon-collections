package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.HandBackFist: ImageVector
    get() {
        if (_handBackFist != null) {
            return _handBackFist!!
        }
        _handBackFist = Builder(name = "HandBackFist", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 400.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(96.0f, 400.0f)
                close()
                moveTo(73.2f, 352.0f)
                lineToRelative(64.6f, 0.0f)
                lineToRelative(-79.5f, -88.3f)
                curveTo(51.7f, 256.3f, 48.0f, 246.8f, 48.0f, 236.9f)
                lineTo(48.0f, 204.0f)
                curveToRelative(0.0f, -16.1f, 11.9f, -29.5f, 27.4f, -31.7f)
                curveToRelative(11.8f, -1.7f, 20.6f, -11.8f, 20.6f, -23.8f)
                lineTo(96.0f, 72.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                curveToRelative(7.2f, 0.0f, 13.6f, 3.1f, 18.0f, 8.1f)
                curveToRelative(4.6f, 5.2f, 11.1f, 8.1f, 18.0f, 8.1f)
                reflectiveCurveToRelative(13.4f, -3.0f, 18.0f, -8.1f)
                curveToRelative(4.4f, -5.0f, 10.8f, -8.1f, 18.0f, -8.1f)
                curveToRelative(8.5f, 0.0f, 15.9f, 4.4f, 20.2f, 11.1f)
                curveToRelative(6.9f, 10.7f, 20.9f, 14.2f, 32.0f, 8.0f)
                curveToRelative(3.5f, -1.9f, 7.4f, -3.1f, 11.8f, -3.1f)
                curveToRelative(10.6f, 0.0f, 19.7f, 6.9f, 22.8f, 16.6f)
                curveToRelative(3.8f, 11.7f, 15.9f, 18.7f, 28.0f, 16.0f)
                curveToRelative(1.7f, -0.4f, 3.4f, -0.6f, 5.2f, -0.6f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 92.2f)
                curveToRelative(0.0f, 14.4f, -3.5f, 28.5f, -10.2f, 41.2f)
                lineToRelative(-52.2f, 98.6f)
                lineToRelative(54.3f, 0.0f)
                lineToRelative(40.3f, -76.2f)
                curveToRelative(10.4f, -19.6f, 15.8f, -41.5f, 15.8f, -63.6f)
                lineToRelative(0.0f, -92.2f)
                curveToRelative(0.0f, -38.4f, -30.1f, -69.8f, -68.1f, -71.9f)
                curveToRelative(-12.9f, -19.3f, -34.9f, -32.1f, -59.9f, -32.1f)
                curveToRelative(-5.7f, 0.0f, -11.2f, 0.7f, -16.5f, 1.9f)
                curveToRelative(-12.7f, -11.1f, -29.3f, -17.9f, -47.5f, -17.9f)
                curveToRelative(-13.1f, 0.0f, -25.4f, 3.5f, -36.0f, 9.6f)
                curveToRelative(-10.6f, -6.1f, -22.9f, -9.6f, -36.0f, -9.6f)
                curveToRelative(-39.8f, 0.0f, -72.0f, 32.2f, -72.0f, 72.0f)
                lineToRelative(0.0f, 58.7f)
                curveTo(19.7f, 143.0f, 0.0f, 171.2f, 0.0f, 204.0f)
                lineToRelative(0.0f, 32.9f)
                curveToRelative(0.0f, 21.7f, 8.0f, 42.7f, 22.6f, 58.9f)
                lineTo(73.2f, 352.0f)
                close()
            }
        }
        .build()
        return _handBackFist!!
    }

private var _handBackFist: ImageVector? = null
