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

public val Simpleicons.Haystack: ImageVector
    get() {
        if (_haystack != null) {
            return _haystack!!
        }
        _haystack = Builder(name = "Haystack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.008f, 0.0f)
                curveTo(0.899f, 0.0f, 0.0f, 0.899f, 0.0f, 2.008f)
                verticalLineToRelative(19.983f)
                curveTo(0.0f, 23.101f, 0.899f, 24.0f, 2.008f, 24.0f)
                horizontalLineToRelative(19.983f)
                curveTo(23.101f, 24.0f, 24.0f, 23.101f, 24.0f, 21.992f)
                lineTo(24.0f, 2.008f)
                curveTo(24.0f, 0.899f, 23.101f, 0.0f, 21.992f, 0.0f)
                close()
                moveTo(11.971f, 3.84f)
                curveToRelative(3.43f, 0.0f, 6.211f, 2.763f, 6.211f, 6.171f)
                verticalLineToRelative(6.488f)
                arcToRelative(0.269f, 0.269f, 0.0f, false, true, -0.27f, 0.268f)
                curveToRelative(-1.342f, 0.0f, -2.431f, -1.081f, -2.431f, -2.415f)
                verticalLineToRelative(-4.341f)
                curveToRelative(0.0f, -1.926f, -1.572f, -3.488f, -3.51f, -3.488f)
                reflectiveCurveToRelative(-3.424f, 1.562f, -3.424f, 3.488f)
                verticalLineToRelative(1.608f)
                arcToRelative(0.263f, 0.263f, 0.0f, false, false, 0.259f, 0.268f)
                horizontalLineToRelative(1.539f)
                arcToRelative(0.269f, 0.269f, 0.0f, false, false, 0.275f, -0.263f)
                lineTo(10.621f, 9.945f)
                curveToRelative(0.0f, -0.741f, 0.604f, -1.341f, 1.35f, -1.341f)
                reflectiveCurveToRelative(1.35f, 0.6f, 1.35f, 1.341f)
                lineTo(13.321f, 20.029f)
                arcToRelative(0.275f, 0.275f, 0.0f, false, true, -0.281f, 0.268f)
                curveToRelative(-1.336f, 0.0f, -2.42f, -1.077f, -2.42f, -2.404f)
                verticalLineToRelative(-3.231f)
                arcToRelative(0.275f, 0.275f, 0.0f, false, false, -0.275f, -0.268f)
                lineTo(8.811f, 14.394f)
                arcToRelative(0.264f, 0.264f, 0.0f, false, false, -0.265f, 0.263f)
                verticalLineToRelative(1.079f)
                curveToRelative(0.0f, 1.334f, -1.175f, 2.415f, -2.517f, 2.415f)
                arcToRelative(0.269f, 0.269f, 0.0f, false, true, -0.27f, -0.268f)
                verticalLineToRelative(-7.872f)
                curveToRelative(0.0f, -3.408f, 2.78f, -6.171f, 6.211f, -6.171f)
                close()
            }
        }
        .build()
        return _haystack!!
    }

private var _haystack: ImageVector? = null
