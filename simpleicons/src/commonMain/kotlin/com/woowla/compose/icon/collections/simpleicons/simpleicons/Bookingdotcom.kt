package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Bookingdotcom: ImageVector
    get() {
        if (_bookingdotcom != null) {
            return _bookingdotcom!!
        }
        _bookingdotcom = Builder(name = "Bookingdotcom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(8.575f, 6.563f)
                horizontalLineToRelative(2.658f)
                curveToRelative(2.108f, 0.0f, 3.473f, 1.15f, 3.473f, 2.898f)
                curveToRelative(0.0f, 1.15f, -0.575f, 1.82f, -0.91f, 2.108f)
                lineToRelative(-0.287f, 0.263f)
                lineToRelative(0.335f, 0.192f)
                curveToRelative(0.815f, 0.479f, 1.318f, 1.389f, 1.318f, 2.395f)
                curveToRelative(0.0f, 1.988f, -1.51f, 3.257f, -3.857f, 3.257f)
                lineTo(7.449f, 17.676f)
                lineTo(7.449f, 7.713f)
                curveToRelative(0.0f, -0.623f, 0.503f, -1.126f, 1.126f, -1.15f)
                close()
                moveTo(10.275f, 8.431f)
                curveToRelative(-0.479f, 0.024f, -0.694f, 0.264f, -0.694f, 0.79f)
                verticalLineToRelative(1.893f)
                horizontalLineToRelative(1.676f)
                curveToRelative(0.958f, 0.0f, 1.294f, -0.743f, 1.294f, -1.365f)
                curveToRelative(0.0f, -0.815f, -0.503f, -1.318f, -1.318f, -1.318f)
                close()
                moveTo(10.179f, 12.791f)
                curveToRelative(-0.407f, 0.071f, -0.598f, 0.31f, -0.598f, 0.79f)
                verticalLineToRelative(2.251f)
                horizontalLineToRelative(1.868f)
                curveToRelative(0.934f, 0.0f, 1.509f, -0.55f, 1.509f, -1.533f)
                curveToRelative(0.0f, -0.934f, -0.599f, -1.509f, -1.51f, -1.509f)
                close()
                moveTo(17.916f, 15.185f)
                curveToRelative(0.743f, 0.0f, 1.341f, 0.599f, 1.341f, 1.342f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, true, -1.341f, 1.341f)
                arcToRelative(1.355f, 1.355f, 0.0f, false, true, -1.341f, -1.341f)
                curveToRelative(0.0f, -0.743f, 0.598f, -1.342f, 1.34f, -1.342f)
                close()
            }
        }
        .build()
        return _bookingdotcom!!
    }

private var _bookingdotcom: ImageVector? = null
