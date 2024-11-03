package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Number123: ImageVector
    get() {
        if (_number123 != null) {
            return _number123!!
        }
        _number123 = Builder(name = "Number123", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.873f, 11.297f)
                lineTo(2.873f, 4.142f)
                lineTo(1.699f, 4.142f)
                lineTo(0.0f, 5.379f)
                verticalLineToRelative(1.137f)
                lineToRelative(1.64f, -1.18f)
                horizontalLineToRelative(0.06f)
                verticalLineToRelative(5.961f)
                close()
                moveTo(6.086f, 6.207f)
                verticalLineToRelative(-0.063f)
                curveToRelative(0.0f, -0.618f, 0.44f, -1.169f, 1.196f, -1.169f)
                curveToRelative(0.676f, 0.0f, 1.174f, 0.44f, 1.174f, 1.106f)
                curveToRelative(0.0f, 0.624f, -0.42f, 1.101f, -0.807f, 1.526f)
                lineTo(4.99f, 10.553f)
                verticalLineToRelative(0.744f)
                horizontalLineToRelative(4.78f)
                verticalLineToRelative(-0.99f)
                lineTo(6.643f, 10.307f)
                verticalLineToRelative(-0.069f)
                lineTo(8.41f, 8.252f)
                curveToRelative(0.65f, -0.724f, 1.237f, -1.332f, 1.237f, -2.27f)
                curveTo(9.646f, 4.849f, 8.723f, 4.0f, 7.308f, 4.0f)
                curveToRelative(-1.573f, 0.0f, -2.36f, 1.064f, -2.36f, 2.15f)
                verticalLineToRelative(0.057f)
                close()
                moveTo(12.645f, 8.09f)
                horizontalLineToRelative(0.786f)
                curveToRelative(0.823f, 0.0f, 1.374f, 0.481f, 1.379f, 1.179f)
                curveToRelative(0.01f, 0.707f, -0.55f, 1.216f, -1.421f, 1.21f)
                curveToRelative(-0.77f, -0.005f, -1.326f, -0.419f, -1.379f, -0.953f)
                horizontalLineToRelative(-1.095f)
                curveToRelative(0.042f, 1.053f, 0.938f, 1.918f, 2.464f, 1.918f)
                curveToRelative(1.478f, 0.0f, 2.642f, -0.839f, 2.62f, -2.144f)
                curveToRelative(-0.02f, -1.143f, -0.922f, -1.651f, -1.551f, -1.714f)
                verticalLineToRelative(-0.063f)
                curveToRelative(0.535f, -0.09f, 1.347f, -0.66f, 1.326f, -1.678f)
                curveToRelative(-0.026f, -1.053f, -0.933f, -1.855f, -2.359f, -1.845f)
                curveToRelative(-1.5f, 0.005f, -2.317f, 0.88f, -2.348f, 1.898f)
                horizontalLineToRelative(1.116f)
                curveToRelative(0.032f, -0.498f, 0.498f, -0.944f, 1.206f, -0.944f)
                curveToRelative(0.703f, 0.0f, 1.206f, 0.435f, 1.206f, 1.07f)
                curveToRelative(0.005f, 0.64f, -0.504f, 1.106f, -1.2f, 1.106f)
                horizontalLineToRelative(-0.75f)
                close()
            }
        }
        .build()
        return _number123!!
    }

private var _number123: ImageVector? = null
