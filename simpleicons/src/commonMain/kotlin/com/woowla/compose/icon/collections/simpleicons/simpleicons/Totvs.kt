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

public val Simpleicons.Totvs: ImageVector
    get() {
        if (_totvs != null) {
            return _totvs!!
        }
        _totvs = Builder(name = "Totvs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.385f, 0.0f, 0.0f, 5.339f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.614f, 5.385f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.614f, 0.0f, 12.0f, -5.386f, 12.0f, -12.0f)
                reflectiveCurveTo(18.614f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(8.648f, 3.813f)
                curveToRelative(1.275f, -0.068f, 10.697f, 2.302f, 11.43f, 2.943f)
                curveToRelative(0.614f, 0.85f, 0.614f, 9.118f, 0.0f, 9.685f)
                curveToRelative(-0.284f, 0.095f, -2.127f, -0.283f, -4.205f, -0.755f)
                curveToRelative(0.0f, 2.031f, -0.143f, 3.966f, -0.426f, 4.203f)
                curveToRelative(-0.756f, 0.236f, -10.772f, -2.267f, -11.527f, -2.928f)
                curveToRelative(-0.615f, -0.85f, -0.615f, -9.119f, 0.0f, -9.686f)
                curveToRelative(0.283f, -0.094f, 2.079f, 0.284f, 4.205f, 0.756f)
                curveToRelative(0.0f, -2.031f, 0.142f, -3.969f, 0.425f, -4.205f)
                arcToRelative(0.448f, 0.448f, 0.0f, false, true, 0.098f, -0.013f)
                close()
                moveTo(8.125f, 8.078f)
                curveToRelative(-0.048f, 2.362f, 0.095f, 4.961f, 0.425f, 5.434f)
                curveToRelative(0.426f, 0.378f, 4.158f, 1.418f, 7.276f, 2.174f)
                curveToRelative(0.047f, -2.41f, -0.095f, -5.008f, -0.426f, -5.481f)
                curveToRelative(-0.425f, -0.378f, -4.157f, -1.418f, -7.275f, -2.127f)
                close()
            }
        }
        .build()
        return _totvs!!
    }

private var _totvs: ImageVector? = null
