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

public val Simpleicons.Westerndigital: ImageVector
    get() {
        if (_westerndigital != null) {
            return _westerndigital!!
        }
        _westerndigital = Builder(name = "Westerndigital", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.492f, 4.62f)
                curveTo(0.177f, 4.623f, -0.492f, 6.203f, 0.421f, 7.149f)
                curveToRelative(1.158f, 1.155f, 2.314f, 2.312f, 3.47f, 3.468f)
                curveToRelative(2.406f, 2.382f, 4.809f, 4.766f, 7.202f, 7.16f)
                lineToRelative(1.07f, 1.115f)
                curveToRelative(0.94f, 0.952f, 2.561f, 0.266f, 2.531f, -1.072f)
                verticalLineToRelative(-3.425f)
                curveToRelative(-0.01f, -0.825f, -0.677f, -1.49f, -1.502f, -1.5f)
                horizontalLineToRelative(-4.156f)
                curveToRelative(-1.448f, 0.009f, -2.625f, -1.167f, -2.615f, -2.615f)
                verticalLineToRelative(-4.16f)
                curveToRelative(-0.01f, -0.825f, -0.677f, -1.49f, -1.502f, -1.5f)
                close()
                moveTo(10.753f, 4.62f)
                curveToRelative(-1.316f, 0.002f, -1.986f, 1.582f, -1.072f, 2.529f)
                curveToRelative(3.932f, 3.927f, 7.859f, 7.859f, 11.788f, 11.788f)
                curveToRelative(0.94f, 0.952f, 2.559f, 0.267f, 2.531f, -1.07f)
                verticalLineToRelative(-3.429f)
                curveToRelative(-0.01f, -0.825f, -0.677f, -1.49f, -1.502f, -1.5f)
                curveToRelative(-1.4f, 0.014f, -2.8f, -0.018f, -4.201f, -0.043f)
                curveToRelative(-1.447f, 0.009f, -2.623f, -1.168f, -2.613f, -2.615f)
                verticalLineToRelative(-4.16f)
                curveToRelative(-0.01f, -0.825f, -0.677f, -1.49f, -1.502f, -1.5f)
                close()
                moveTo(19.025f, 4.62f)
                curveToRelative(-1.352f, -0.007f, -2.013f, 1.645f, -1.029f, 2.572f)
                lineToRelative(3.431f, 3.429f)
                curveToRelative(0.947f, 0.914f, 2.527f, 0.244f, 2.529f, -1.072f)
                lineTo(23.957f, 6.12f)
                curveToRelative(-0.01f, -0.824f, -0.676f, -1.489f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _westerndigital!!
    }

private var _westerndigital: ImageVector? = null
