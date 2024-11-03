package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BalloonFill: ImageVector
    get() {
        if (_balloonFill != null) {
            return _balloonFill!!
        }
        _balloonFill = Builder(name = "BalloonFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.48f, 10.901f)
                curveTo(11.211f, 10.227f, 13.0f, 7.837f, 13.0f, 5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 3.0f, 5.0f)
                curveToRelative(0.0f, 2.837f, 1.789f, 5.227f, 4.52f, 5.901f)
                lineToRelative(-0.244f, 0.487f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.448f, 0.224f)
                lineToRelative(0.04f, -0.08f)
                curveToRelative(0.009f, 0.17f, 0.024f, 0.315f, 0.051f, 0.45f)
                curveToRelative(0.068f, 0.344f, 0.208f, 0.622f, 0.448f, 1.102f)
                lineToRelative(0.013f, 0.028f)
                curveToRelative(0.212f, 0.422f, 0.182f, 0.85f, 0.05f, 1.246f)
                curveToRelative(-0.135f, 0.402f, -0.366f, 0.751f, -0.534f, 1.003f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.416f, 0.278f)
                lineToRelative(0.004f, -0.007f)
                curveToRelative(0.166f, -0.248f, 0.431f, -0.646f, 0.588f, -1.115f)
                curveToRelative(0.16f, -0.479f, 0.212f, -1.051f, -0.076f, -1.629f)
                curveToRelative(-0.258f, -0.515f, -0.365f, -0.732f, -0.419f, -1.004f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.037f, -0.289f)
                lineToRelative(0.008f, 0.017f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.448f, -0.224f)
                close()
                moveTo(4.352f, 3.356f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.15f, -2.325f)
                curveTo(7.774f, 0.997f, 8.0f, 1.224f, 8.0f, 1.5f)
                reflectiveCurveToRelative(-0.226f, 0.496f, -0.498f, 0.542f)
                curveToRelative(-0.95f, 0.162f, -1.749f, 0.78f, -2.173f, 1.617f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.52f, 0.341f)
                curveToRelative(-0.346f, 0.0f, -0.599f, -0.329f, -0.457f, -0.644f)
            }
        }
        .build()
        return _balloonFill!!
    }

private var _balloonFill: ImageVector? = null
