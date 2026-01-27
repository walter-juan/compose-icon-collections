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

public val Simpleicons.Coder: ImageVector
    get() {
        if (_coder != null) {
            return _coder!!
        }
        _coder = Builder(name = "Coder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.862f, 6.67f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(10.663f)
                horizontalLineToRelative(-9.138f)
                close()
                moveTo(6.945f, 15.304f)
                curveToRelative(-1.934f, 0.0f, -3.366f, -1.264f, -3.366f, -3.305f)
                reflectiveCurveToRelative(1.432f, -3.323f, 3.366f, -3.365f)
                curveToRelative(1.411f, -0.03f, 2.787f, 0.99f, 2.878f, 2.543f)
                lineToRelative(3.472f, -0.106f)
                curveToRelative(-0.076f, -2.802f, -2.33f, -4.706f, -6.35f, -4.706f)
                reflectiveCurveTo(0.0f, 8.558f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.426f, 3.046f, 5.635f, 6.945f, 5.635f)
                curveToRelative(3.898f, 0.0f, 6.29f, -1.935f, 6.38f, -4.782f)
                lineToRelative(-3.472f, -0.077f)
                curveToRelative(-0.152f, 1.553f, -1.497f, 2.528f, -2.908f, 2.528f)
                close()
            }
        }
        .build()
        return _coder!!
    }

private var _coder: ImageVector? = null
