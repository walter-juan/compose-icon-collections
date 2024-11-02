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

public val Simpleicons.Forgejo: ImageVector
    get() {
        if (_forgejo != null) {
            return _forgejo!!
        }
        _forgejo = Builder(name = "Forgejo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.777f, 0.0f)
                curveToRelative(1.602f, 0.0f, 2.9f, 1.299f, 2.9f, 2.901f)
                reflectiveCurveToRelative(-1.299f, 2.9f, -2.9f, 2.9f)
                curveToRelative(-1.085f, 0.0f, -2.032f, -0.596f, -2.529f, -1.479f)
                lineTo(12.91f, 4.322f)
                curveToRelative(-2.332f, 0.0f, -4.227f, 1.872f, -4.265f, 4.195f)
                lineToRelative(-0.001f, 2.118f)
                arcToRelative(7.076f, 7.076f, 0.0f, false, true, 4.148f, -1.421f)
                lineToRelative(0.118f, -0.001f)
                lineToRelative(1.339f, 0.0f)
                curveToRelative(0.497f, -0.883f, 1.443f, -1.479f, 2.529f, -1.479f)
                curveToRelative(1.602f, 0.0f, 2.9f, 1.299f, 2.9f, 2.901f)
                reflectiveCurveToRelative(-1.299f, 2.9f, -2.9f, 2.9f)
                curveToRelative(-1.085f, 0.0f, -2.032f, -0.596f, -2.529f, -1.479f)
                lineTo(12.91f, 12.057f)
                curveToRelative(-2.332f, 0.0f, -4.227f, 1.872f, -4.265f, 4.195f)
                lineToRelative(-0.001f, 2.319f)
                curveToRelative(0.883f, 0.497f, 1.479f, 1.443f, 1.479f, 2.529f)
                curveToRelative(0.0f, 1.602f, -1.299f, 2.901f, -2.901f, 2.901f)
                curveToRelative(-1.602f, 0.0f, -2.9f, -1.299f, -2.9f, -2.901f)
                curveToRelative(0.0f, -1.085f, 0.596f, -2.031f, 1.479f, -2.529f)
                lineToRelative(-0.0f, -9.983f)
                curveToRelative(0.0f, -3.887f, 3.119f, -7.045f, 6.991f, -7.108f)
                lineToRelative(0.118f, -0.001f)
                horizontalLineToRelative(1.339f)
                curveTo(14.746f, 0.596f, 15.692f, 0.0f, 16.777f, 0.0f)
                close()
                moveTo(7.223f, 19.905f)
                curveToRelative(-0.66f, 0.0f, -1.194f, 0.535f, -1.194f, 1.194f)
                reflectiveCurveToRelative(0.535f, 1.194f, 1.194f, 1.194f)
                reflectiveCurveToRelative(1.194f, -0.535f, 1.194f, -1.194f)
                reflectiveCurveToRelative(-0.535f, -1.194f, -1.194f, -1.194f)
                close()
                moveTo(16.777f, 9.441f)
                curveToRelative(-0.66f, 0.0f, -1.194f, 0.535f, -1.194f, 1.194f)
                reflectiveCurveToRelative(0.535f, 1.194f, 1.194f, 1.194f)
                curveToRelative(0.66f, 0.0f, 1.194f, -0.535f, 1.194f, -1.194f)
                reflectiveCurveToRelative(-0.535f, -1.194f, -1.194f, -1.194f)
                close()
                moveTo(16.777f, 1.706f)
                curveToRelative(-0.66f, 0.0f, -1.194f, 0.535f, -1.194f, 1.194f)
                reflectiveCurveToRelative(0.535f, 1.194f, 1.194f, 1.194f)
                curveToRelative(0.66f, 0.0f, 1.194f, -0.535f, 1.194f, -1.194f)
                reflectiveCurveToRelative(-0.535f, -1.194f, -1.194f, -1.194f)
                close()
            }
        }
        .build()
        return _forgejo!!
    }

private var _forgejo: ImageVector? = null
