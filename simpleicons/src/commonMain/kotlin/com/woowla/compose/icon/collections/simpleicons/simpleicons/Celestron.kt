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

public val Simpleicons.Celestron: ImageVector
    get() {
        if (_celestron != null) {
            return _celestron!!
        }
        _celestron = Builder(name = "Celestron", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.002f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.371f, -12.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.373f, 11.996f, 12.0f, 11.996f)
                curveToRelative(1.745f, 0.0f, 3.403f, -0.37f, 4.898f, -1.041f)
                curveTo(10.759f, 21.239f, 2.279f, 17.325f, 3.25f, 9.531f)
                curveToRelative(0.641f, -5.134f, 7.214f, -8.46f, 13.805f, -8.414f)
                curveTo(15.518f, 0.401f, 13.806f, 0.002f, 12.0f, 0.002f)
                close()
                moveTo(17.43f, 1.846f)
                curveToRelative(-5.092f, -0.049f, -9.306f, 2.041f, -9.688f, 5.557f)
                curveToRelative(-0.605f, 5.596f, 7.155f, 8.808f, 11.844f, 10.141f)
                curveToRelative(0.906f, 0.259f, 1.897f, 0.42f, 2.768f, 0.523f)
                curveTo(23.399f, 16.286f, 24.0f, 14.211f, 24.0f, 12.002f)
                curveToRelative(0.0f, -4.25f, -2.21f, -7.983f, -5.541f, -10.117f)
                arcToRelative(18.676f, 18.676f, 0.0f, false, false, -1.029f, -0.039f)
                close()
            }
        }
        .build()
        return _celestron!!
    }

private var _celestron: ImageVector? = null
