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

public val RegularGroup.GrinWink: ImageVector
    get() {
        if (_grinWink != null) {
            return _grinWink!!
        }
        _grinWink = Builder(name = "GrinWink", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, -416.0f, 0.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
                moveTo(372.2f, 302.3f)
                curveToRelative(11.8f, -3.6f, 23.7f, 6.1f, 19.6f, 17.8f)
                curveToRelative(-19.8f, 55.9f, -73.1f, 96.0f, -135.8f, 96.0f)
                curveToRelative(-62.7f, 0.0f, -116.0f, -40.0f, -135.8f, -95.9f)
                curveToRelative(-4.1f, -11.6f, 7.8f, -21.4f, 19.6f, -17.8f)
                curveToRelative(34.7f, 10.6f, 74.2f, 16.5f, 116.1f, 16.5f)
                curveToRelative(42.0f, 0.0f, 81.5f, -6.0f, 116.3f, -16.6f)
                close()
                moveTo(144.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(308.0f, 216.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                curveToRelative(0.0f, -33.1f, 26.9f, -60.0f, 60.0f, -60.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(33.1f, 0.0f, 60.0f, 26.9f, 60.0f, 60.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-9.0f, -20.0f, -20.0f, -20.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, 9.0f, -20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _grinWink!!
    }

private var _grinWink: ImageVector? = null
