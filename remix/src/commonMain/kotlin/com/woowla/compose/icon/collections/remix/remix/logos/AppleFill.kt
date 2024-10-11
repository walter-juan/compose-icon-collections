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

public val LogosGroup.AppleFill: ImageVector
    get() {
        if (_appleFill != null) {
            return _appleFill!!
        }
        _appleFill = Builder(name = "AppleFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.673f, 7.222f)
                curveTo(10.797f, 7.222f, 9.441f, 6.226f, 8.013f, 6.262f)
                curveTo(6.129f, 6.286f, 4.401f, 7.354f, 3.429f, 9.046f)
                curveTo(1.473f, 12.442f, 2.925f, 17.458f, 4.833f, 20.218f)
                curveTo(5.769f, 21.562f, 6.873f, 23.074f, 8.337f, 23.026f)
                curveTo(9.741f, 22.966f, 10.269f, 22.114f, 11.973f, 22.114f)
                curveTo(13.665f, 22.114f, 14.145f, 23.026f, 15.633f, 22.99f)
                curveTo(17.145f, 22.966f, 18.105f, 21.622f, 19.029f, 20.266f)
                curveTo(20.097f, 18.706f, 20.541f, 17.194f, 20.565f, 17.11f)
                curveTo(20.529f, 17.098f, 17.625f, 15.982f, 17.589f, 12.622f)
                curveTo(17.565f, 9.814f, 19.881f, 8.47f, 19.989f, 8.41f)
                curveTo(18.669f, 6.478f, 16.641f, 6.262f, 15.933f, 6.214f)
                curveTo(14.085f, 6.07f, 12.537f, 7.222f, 11.673f, 7.222f)
                close()
                moveTo(14.793f, 4.39f)
                curveTo(15.573f, 3.454f, 16.089f, 2.146f, 15.945f, 0.85f)
                curveTo(14.829f, 0.898f, 13.485f, 1.594f, 12.681f, 2.53f)
                curveTo(11.961f, 3.358f, 11.337f, 4.69f, 11.505f, 5.962f)
                curveTo(12.741f, 6.058f, 14.013f, 5.326f, 14.793f, 4.39f)
                close()
            }
        }
        .build()
        return _appleFill!!
    }

private var _appleFill: ImageVector? = null
