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

public val SolidGroup.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.4f, 1.1f)
                curveToRelative(-122.2f, 11.4f, -219.5f, 108.7f, -230.9f, 230.9f)
                curveToRelative(16.2f, -0.1f, 32.0f, -1.8f, 47.2f, -5.0f)
                curveToRelative(13.0f, -2.7f, 25.7f, 5.5f, 28.4f, 18.5f)
                reflectiveCurveToRelative(-5.5f, 25.7f, -18.5f, 28.4f)
                curveToRelative(-18.4f, 3.9f, -37.6f, 6.0f, -57.1f, 6.1f)
                curveToRelative(11.4f, 122.2f, 108.7f, 219.5f, 230.9f, 230.9f)
                curveToRelative(0.1f, -19.5f, 2.2f, -38.7f, 6.1f, -57.1f)
                curveToRelative(2.7f, -13.0f, 15.5f, -21.3f, 28.4f, -18.5f)
                reflectiveCurveToRelative(21.3f, 15.5f, 18.5f, 28.4f)
                curveToRelative(-3.2f, 15.2f, -4.9f, 31.0f, -5.0f, 47.2f)
                curveToRelative(122.2f, -11.4f, 219.5f, -108.7f, 230.9f, -230.9f)
                curveToRelative(-16.2f, 0.1f, -32.0f, 1.8f, -47.2f, 5.0f)
                curveToRelative(-13.0f, 2.7f, -25.7f, -5.5f, -28.4f, -18.5f)
                reflectiveCurveToRelative(5.5f, -25.7f, 18.5f, -28.4f)
                curveToRelative(18.4f, -3.9f, 37.6f, -6.0f, 57.1f, -6.1f)
                curveToRelative(-11.4f, -122.2f, -108.7f, -219.5f, -230.9f, -230.9f)
                curveToRelative(-0.1f, 19.5f, -2.2f, 38.7f, -6.1f, 57.1f)
                curveToRelative(-2.7f, 13.0f, -15.5f, 21.3f, -28.4f, 18.5f)
                reflectiveCurveToRelative(-21.3f, -15.5f, -18.5f, -28.4f)
                curveToRelative(3.2f, -15.2f, 4.9f, -31.0f, 5.0f, -47.2f)
                close()
                moveTo(235.2f, 152.5f)
                curveToRelative(-21.4f, 32.9f, -49.5f, 60.9f, -82.3f, 82.3f)
                curveToRelative(-11.1f, 7.2f, -26.0f, 4.1f, -33.2f, -7.0f)
                reflectiveCurveToRelative(-4.1f, -26.0f, 7.0f, -33.2f)
                curveToRelative(27.2f, -17.7f, 50.5f, -41.0f, 68.3f, -68.3f)
                curveToRelative(7.2f, -11.1f, 22.1f, -14.3f, 33.2f, -7.0f)
                reflectiveCurveToRelative(14.3f, 22.1f, 7.0f, 33.2f)
                close()
                moveTo(393.1f, 284.2f)
                curveToRelative(7.2f, 11.1f, 4.1f, 26.0f, -7.0f, 33.2f)
                curveToRelative(-27.2f, 17.7f, -50.5f, 41.0f, -68.3f, 68.3f)
                curveToRelative(-7.2f, 11.1f, -22.1f, 14.3f, -33.2f, 7.0f)
                reflectiveCurveToRelative(-14.3f, -22.1f, -7.0f, -33.2f)
                curveToRelative(21.4f, -32.9f, 49.5f, -60.9f, 82.3f, -82.3f)
                curveToRelative(11.1f, -7.2f, 26.0f, -4.1f, 33.2f, 7.0f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
