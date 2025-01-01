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

public val Simpleicons.Nuxt: ImageVector
    get() {
        if (_nuxt != null) {
            return _nuxt!!
        }
        _nuxt = Builder(name = "Nuxt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.464f, 19.83f)
                horizontalLineToRelative(8.922f)
                curveToRelative(0.283f, 0.0f, 0.562f, -0.072f, 0.807f, -0.21f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.591f, -0.573f)
                arcToRelative(1.529f, 1.529f, 0.0f, false, false, 0.216f, -0.783f)
                arcToRelative(1.529f, 1.529f, 0.0f, false, false, -0.217f, -0.783f)
                lineTo(17.792f, 7.414f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, -0.591f, -0.573f)
                arcToRelative(1.652f, 1.652f, 0.0f, false, false, -0.807f, -0.21f)
                curveToRelative(-0.283f, 0.0f, -0.562f, 0.072f, -0.807f, 0.21f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, -0.591f, 0.573f)
                lineTo(13.464f, 9.99f)
                lineToRelative(-2.995f, -5.037f)
                arcToRelative(1.591f, 1.591f, 0.0f, false, false, -0.591f, -0.573f)
                arcToRelative(1.653f, 1.653f, 0.0f, false, false, -0.807f, -0.21f)
                curveToRelative(-0.283f, 0.0f, -0.562f, 0.072f, -0.807f, 0.21f)
                arcToRelative(1.591f, 1.591f, 0.0f, false, false, -0.591f, 0.573f)
                lineTo(0.217f, 17.481f)
                arcTo(1.529f, 1.529f, 0.0f, false, false, 0.0f, 18.264f)
                curveToRelative(-0.0f, 0.275f, 0.074f, 0.545f, 0.216f, 0.783f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.591f, 0.573f)
                curveToRelative(0.245f, 0.138f, 0.524f, 0.21f, 0.807f, 0.21f)
                horizontalLineToRelative(5.6f)
                curveToRelative(2.219f, 0.0f, 3.855f, -0.945f, 4.981f, -2.79f)
                lineToRelative(2.734f, -4.592f)
                lineTo(16.393f, 9.99f)
                lineToRelative(4.394f, 7.382f)
                horizontalLineToRelative(-5.859f)
                close()
                moveTo(7.123f, 17.369f)
                lineToRelative(-3.908f, -0.001f)
                lineToRelative(5.859f, -9.842f)
                lineToRelative(2.923f, 4.921f)
                lineToRelative(-1.957f, 3.289f)
                curveToRelative(-0.748f, 1.197f, -1.597f, 1.633f, -2.916f, 1.633f)
                close()
            }
        }
        .build()
        return _nuxt!!
    }

private var _nuxt: ImageVector? = null
