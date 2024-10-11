package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.QqFill: ImageVector
    get() {
        if (_qqFill != null) {
            return _qqFill!!
        }
        _qqFill = Builder(name = "QqFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.914f, 14.529f)
                curveTo(19.734f, 13.955f, 19.488f, 13.286f, 19.239f, 12.643f)
                lineTo(18.329f, 10.397f)
                curveTo(18.33f, 10.371f, 18.341f, 9.929f, 18.341f, 9.701f)
                curveTo(18.341f, 5.86f, 16.508f, 2.0f, 12.001f, 2.0f)
                curveTo(7.494f, 2.0f, 5.661f, 5.86f, 5.661f, 9.701f)
                curveTo(5.661f, 9.929f, 5.672f, 10.371f, 5.673f, 10.397f)
                lineTo(4.764f, 12.643f)
                curveTo(4.515f, 13.286f, 4.268f, 13.955f, 4.088f, 14.529f)
                curveTo(3.228f, 17.266f, 3.507f, 18.398f, 3.719f, 18.424f)
                curveTo(4.174f, 18.478f, 5.49f, 16.364f, 5.49f, 16.364f)
                curveTo(5.49f, 17.588f, 6.127f, 19.186f, 7.506f, 20.34f)
                curveTo(6.991f, 20.497f, 6.359f, 20.739f, 5.952f, 21.035f)
                curveTo(5.587f, 21.302f, 5.633f, 21.574f, 5.699f, 21.684f)
                curveTo(5.988f, 22.166f, 10.654f, 21.992f, 12.002f, 21.842f)
                curveTo(13.349f, 21.992f, 18.016f, 22.166f, 18.304f, 21.684f)
                curveTo(18.37f, 21.574f, 18.416f, 21.302f, 18.051f, 21.035f)
                curveTo(17.644f, 20.739f, 17.012f, 20.497f, 16.496f, 20.34f)
                curveTo(17.875f, 19.186f, 18.512f, 17.588f, 18.512f, 16.364f)
                curveTo(18.512f, 16.364f, 19.828f, 18.478f, 20.283f, 18.424f)
                curveTo(20.495f, 18.398f, 20.773f, 17.266f, 19.914f, 14.529f)
                close()
            }
        }
        .build()
        return _qqFill!!
    }

private var _qqFill: ImageVector? = null
