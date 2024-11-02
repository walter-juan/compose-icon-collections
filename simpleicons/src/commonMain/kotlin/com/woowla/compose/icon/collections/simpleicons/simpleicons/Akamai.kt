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

public val Simpleicons.Akamai: ImageVector
    get() {
        if (_akamai != null) {
            return _akamai!!
        }
        _akamai = Builder(name = "Akamai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.055f, 0.0f)
                curveTo(6.384f, 0.0f, 0.961f, 5.38f, 0.961f, 12.008f)
                curveTo(0.961f, 18.635f, 6.37f, 24.0f, 13.055f, 24.0f)
                curveToRelative(0.617f, 0.0f, 0.645f, -0.357f, 0.086f, -0.529f)
                curveToRelative(-4.935f, -1.506f, -8.535f, -6.069f, -8.535f, -11.463f)
                curveToRelative(0.0f, -5.466f, 3.672f, -10.071f, 8.693f, -11.519f)
                curveTo(13.815f, 0.345f, 13.672f, 0.0f, 13.055f, 0.0f)
                close()
                moveTo(15.379f, 1.822f)
                curveToRelative(-5.265f, 0.0f, -9.525f, 4.261f, -9.525f, 9.525f)
                curveToRelative(0.0f, 1.219f, 0.228f, 2.382f, 0.645f, 3.443f)
                curveToRelative(0.172f, 0.459f, 0.445f, 0.458f, 0.402f, 0.014f)
                curveToRelative(-0.029f, -0.316f, -0.057f, -0.645f, -0.057f, -0.975f)
                curveToRelative(0.0f, -5.265f, 4.261f, -9.525f, 9.525f, -9.525f)
                curveToRelative(4.978f, 0.0f, 6.47f, 2.224f, 6.656f, 2.08f)
                curveToRelative(0.201f, -0.158f, -1.808f, -4.562f, -7.647f, -4.562f)
                close()
                moveTo(15.848f, 5.893f)
                curveToRelative(-1.862f, 0.059f, -3.651f, 0.717f, -5.103f, 1.855f)
                curveToRelative(-0.258f, 0.201f, -0.157f, 0.328f, 0.145f, 0.199f)
                curveToRelative(2.467f, -1.076f, 5.581f, -1.105f, 8.637f, -0.043f)
                curveToRelative(2.051f, 0.717f, 3.241f, 1.736f, 3.342f, 1.693f)
                curveToRelative(0.158f, -0.072f, -1.191f, -2.223f, -3.645f, -3.141f)
                curveToRelative(-1.113f, -0.42f, -2.258f, -0.6f, -3.375f, -0.564f)
                close()
            }
        }
        .build()
        return _akamai!!
    }

private var _akamai: ImageVector? = null
