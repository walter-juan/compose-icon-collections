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

public val SolidGroup.Earth: ImageVector
    get() {
        if (_earth != null) {
            return _earth!!
        }
        _earth = Builder(name = "Earth", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(55.7f, 199.7f)
                lineToRelative(30.9f, 30.9f)
                curveToRelative(6.0f, 6.0f, 14.1f, 9.4f, 22.6f, 9.4f)
                lineToRelative(21.5f, 0.0f)
                curveToRelative(8.5f, 0.0f, 16.6f, 3.4f, 22.6f, 9.4f)
                lineToRelative(29.3f, 29.3f)
                curveToRelative(6.0f, 6.0f, 9.4f, 14.1f, 9.4f, 22.6f)
                lineToRelative(0.0f, 37.5f)
                curveToRelative(0.0f, 8.5f, 3.4f, 16.6f, 9.4f, 22.6f)
                lineToRelative(13.3f, 13.3f)
                curveToRelative(6.0f, 6.0f, 9.4f, 14.1f, 9.4f, 22.6f)
                lineToRelative(0.0f, 18.7f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -2.7f)
                curveToRelative(0.0f, -8.5f, 3.4f, -16.6f, 9.4f, -22.6f)
                lineToRelative(45.3f, -45.3f)
                curveToRelative(6.0f, -6.0f, 9.4f, -14.1f, 9.4f, -22.6f)
                lineToRelative(0.0f, -34.7f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-82.7f, 0.0f)
                curveToRelative(-8.5f, 0.0f, -16.6f, -3.4f, -22.6f, -9.4f)
                lineToRelative(-16.0f, -16.0f)
                curveToRelative(-4.2f, -4.2f, -6.6f, -10.0f, -6.6f, -16.0f)
                curveToRelative(0.0f, -12.5f, 10.1f, -22.6f, 22.6f, -22.6f)
                lineToRelative(34.7f, 0.0f)
                curveToRelative(12.5f, 0.0f, 22.6f, -10.1f, 22.6f, -22.6f)
                curveToRelative(0.0f, -6.0f, -2.4f, -11.8f, -6.6f, -16.0f)
                lineToRelative(-19.7f, -19.7f)
                curveTo(242.0f, 130.0f, 240.0f, 125.1f, 240.0f, 120.0f)
                reflectiveCurveToRelative(2.0f, -10.0f, 5.7f, -13.7f)
                lineToRelative(17.3f, -17.3f)
                curveToRelative(5.8f, -5.8f, 9.1f, -13.7f, 9.1f, -21.9f)
                curveToRelative(0.0f, -7.2f, -2.4f, -13.7f, -6.4f, -18.9f)
                curveToRelative(-3.2f, -0.1f, -6.4f, -0.2f, -9.6f, -0.2f)
                curveToRelative(-95.4f, 0.0f, -175.7f, 64.2f, -200.3f, 151.7f)
                close()
                moveTo(464.0f, 256.0f)
                curveToRelative(0.0f, -34.6f, -8.4f, -67.2f, -23.4f, -95.8f)
                curveToRelative(-6.4f, 0.9f, -12.7f, 3.9f, -17.9f, 9.1f)
                lineToRelative(-13.4f, 13.4f)
                curveToRelative(-6.0f, 6.0f, -9.4f, 14.1f, -9.4f, 22.6f)
                lineToRelative(0.0f, 34.7f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(24.1f, 0.0f)
                curveToRelative(2.5f, 0.0f, 5.0f, -0.3f, 7.3f, -0.8f)
                curveToRelative(0.4f, -5.0f, 0.5f, -10.1f, 0.5f, -15.2f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
            }
        }
        .build()
        return _earth!!
    }

private var _earth: ImageVector? = null
