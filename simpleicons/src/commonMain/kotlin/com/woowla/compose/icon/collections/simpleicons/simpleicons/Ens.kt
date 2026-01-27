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

public val Simpleicons.Ens: ImageVector
    get() {
        if (_ens != null) {
            return _ens!!
        }
        _ens = Builder(name = "Ens", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.725f, 0.223f)
                lineTo(5.107f, 11.13f)
                arcToRelative(0.146f, 0.146f, 0.0f, false, true, -0.237f, 0.018f)
                curveToRelative(-0.583f, -0.692f, -2.753f, -3.64f, -0.067f, -6.327f)
                curveToRelative(2.45f, -2.452f, 5.572f, -4.2f, 6.73f, -4.804f)
                curveToRelative(0.13f, -0.068f, 0.269f, 0.08f, 0.192f, 0.206f)
                moveToRelative(-0.366f, 23.747f)
                curveToRelative(0.132f, 0.093f, 0.295f, -0.064f, 0.206f, -0.2f)
                curveToRelative(-1.478f, -2.251f, -6.392f, -9.744f, -7.07f, -10.869f)
                curveToRelative(-0.67f, -1.11f, -1.987f, -2.953f, -2.097f, -4.53f)
                curveToRelative(-0.011f, -0.158f, -0.228f, -0.19f, -0.283f, -0.042f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.27f, 0.85f)
                curveToRelative(-1.105f, 4.11f, 0.5f, 8.472f, 3.985f, 10.916f)
                close()
                moveTo(12.268f, 23.777f)
                lineTo(18.886f, 12.87f)
                arcToRelative(0.146f, 0.146f, 0.0f, false, true, 0.237f, -0.018f)
                curveToRelative(0.582f, 0.692f, 2.753f, 3.64f, 0.067f, 6.327f)
                curveToRelative(-2.45f, 2.452f, -5.572f, 4.2f, -6.73f, 4.804f)
                curveToRelative(-0.13f, 0.068f, -0.269f, -0.08f, -0.192f, -0.206f)
                moveTo(12.641f, 0.028f)
                curveToRelative(-0.132f, -0.093f, -0.295f, 0.065f, -0.206f, 0.2f)
                curveToRelative(1.478f, 2.252f, 6.392f, 9.745f, 7.07f, 10.87f)
                curveToRelative(0.67f, 1.109f, 1.987f, 2.952f, 2.097f, 4.53f)
                curveToRelative(0.011f, 0.157f, 0.228f, 0.19f, 0.283f, 0.041f)
                curveToRelative(0.088f, -0.239f, 0.182f, -0.524f, 0.27f, -0.85f)
                curveToRelative(1.105f, -4.11f, -0.5f, -8.472f, -3.985f, -10.915f)
                close()
            }
        }
        .build()
        return _ens!!
    }

private var _ens: ImageVector? = null
