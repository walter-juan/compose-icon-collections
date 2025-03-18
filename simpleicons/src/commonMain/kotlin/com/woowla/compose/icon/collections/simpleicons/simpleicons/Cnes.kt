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

public val Simpleicons.Cnes: ImageVector
    get() {
        if (_cnes != null) {
            return _cnes!!
        }
        _cnes = Builder(name = "Cnes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.173f, 0.0f)
                horizontalLineToRelative(0.953f)
                lineTo(11.126f, 13.798f)
                curveToRelative(0.0f, 2.881f, 3.682f, 8.729f, 9.726f, 4.83f)
                lineToRelative(0.123f, -0.068f)
                curveTo(19.621f, 21.744f, 16.256f, 24.0f, 12.317f, 24.0f)
                curveTo(7.185f, 24.0f, 3.025f, 20.169f, 3.025f, 15.444f)
                curveToRelative(0.0f, -4.046f, 3.05f, -7.436f, 7.148f, -8.327f)
                lineTo(10.173f, 0.0f)
                close()
                moveTo(20.572f, 11.511f)
                curveToRelative(-1.525f, -2.708f, -4.575f, -4.57f, -8.103f, -4.622f)
                curveToRelative(-0.064f, 1.108f, 0.825f, 7.135f, 4.96f, 7.472f)
                curveToRelative(1.078f, 0.088f, 3.84f, -0.549f, 3.143f, -2.85f)
                close()
            }
        }
        .build()
        return _cnes!!
    }

private var _cnes: ImageVector? = null
