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

public val Simpleicons.Oclc: ImageVector
    get() {
        if (_oclc != null) {
            return _oclc!!
        }
        _oclc = Builder(name = "Oclc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.628f, 7.117f)
                curveTo(18.366f, 2.388f, 13.69f, -0.691f, 8.746f, 0.133f)
                curveTo(3.478f, 1.01f, -0.076f, 5.97f, 0.8f, 11.214f)
                curveToRelative(0.605f, 3.685f, 3.22f, 6.52f, 6.529f, 7.602f)
                arcToRelative(5.34f, 5.34f, 0.0f, false, false, 2.42f, 4.304f)
                curveToRelative(2.474f, 1.623f, 5.809f, 0.94f, 7.419f, -1.547f)
                curveToRelative(0.142f, -0.219f, 0.27f, -0.45f, 0.386f, -0.682f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, false, 5.512f, -5.322f)
                curveToRelative(0.915f, -3.35f, -0.592f, -6.79f, -3.451f, -8.465f)
                close()
                moveTo(7.393f, 17.863f)
                curveToRelative(-2.253f, -1.057f, -3.966f, -3.234f, -4.417f, -5.914f)
                curveToRelative(-0.708f, -4.317f, 2.086f, -8.362f, 6.259f, -9.045f)
                curveToRelative(2.975f, -0.49f, 5.847f, 0.863f, 7.495f, 3.247f)
                arcToRelative(7.52f, 7.52f, 0.0f, false, false, -8.14f, 5.463f)
                arcToRelative(7.46f, 7.46f, 0.0f, false, false, -0.076f, 3.685f)
                arcToRelative(5.45f, 5.45f, 0.0f, false, false, -1.133f, 2.577f)
                close()
                moveTo(9.493f, 14.345f)
                curveToRelative(0.0f, -0.541f, 0.077f, -1.108f, 0.23f, -1.662f)
                curveToRelative(0.916f, -3.324f, 4.264f, -5.321f, 7.484f, -4.42f)
                curveToRelative(3.22f, 0.89f, 5.1f, 4.291f, 4.172f, 7.641f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -3.503f, 4.11f)
                arcToRelative(5.37f, 5.37f, 0.0f, false, false, -2.253f, -5.85f)
                arcToRelative(5.34f, 5.34f, 0.0f, false, false, -6.143f, 0.181f)
                close()
                moveTo(15.97f, 21.303f)
                curveToRelative(-1.287f, 1.958f, -3.85f, 2.538f, -5.743f, 1.301f)
                reflectiveCurveToRelative(-2.383f, -3.84f, -1.095f, -5.785f)
                curveToRelative(1.275f, -1.958f, 3.85f, -2.538f, 5.744f, -1.301f)
                curveToRelative(1.893f, 1.25f, 2.382f, 3.852f, 1.094f, 5.785f)
            }
        }
        .build()
        return _oclc!!
    }

private var _oclc: ImageVector? = null
