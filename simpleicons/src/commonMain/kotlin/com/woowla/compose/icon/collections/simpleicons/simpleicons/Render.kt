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

public val Simpleicons.Render: ImageVector
    get() {
        if (_render != null) {
            return _render!!
        }
        _render = Builder(name = "Render", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.263f, 0.007f)
                curveToRelative(-3.121f, -0.147f, -5.744f, 2.109f, -6.192f, 5.082f)
                curveToRelative(-0.018f, 0.138f, -0.045f, 0.272f, -0.067f, 0.405f)
                curveToRelative(-0.696f, 3.703f, -3.936f, 6.507f, -7.827f, 6.507f)
                curveToRelative(-1.388f, 0.0f, -2.691f, -0.356f, -3.825f, -0.979f)
                arcToRelative(0.202f, 0.202f, 0.0f, false, false, -0.302f, 0.178f)
                verticalLineTo(24.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-8.999f)
                curveToRelative(0.0f, -1.656f, 1.338f, -3.0f, 2.987f, -3.0f)
                horizontalLineToRelative(2.988f)
                curveToRelative(3.382f, 0.0f, 6.103f, -2.817f, 5.97f, -6.244f)
                curveToRelative(-0.12f, -3.084f, -2.61f, -5.603f, -5.682f, -5.75f)
            }
        }
        .build()
        return _render!!
    }

private var _render: ImageVector? = null
