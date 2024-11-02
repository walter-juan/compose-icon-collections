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

public val Simpleicons.Transmission: ImageVector
    get() {
        if (_transmission != null) {
            return _transmission!!
        }
        _transmission = Builder(name = "Transmission", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.696f, 9.46f)
                verticalLineTo(22.254f)
                curveToRelative(0.0f, 0.945f, 0.885f, 1.709f, 1.716f, 1.709f)
                horizontalLineToRelative(17.157f)
                curveToRelative(0.878f, 0.0f, 1.716f, -0.61f, 1.716f, -1.709f)
                verticalLineTo(9.467f)
                curveToRelative(-2.332f, 0.375f, -4.618f, 0.623f, -6.863f, 0.771f)
                verticalLineToRelative(5.147f)
                horizontalLineToRelative(3.431f)
                lineToRelative(-6.863f, 6.863f)
                lineToRelative(-6.863f, -6.863f)
                horizontalLineToRelative(3.431f)
                verticalLineToRelative(-5.087f)
                curveToRelative(-2.339f, -0.121f, -4.624f, -0.389f, -6.843f, -0.831f)
                horizontalLineToRelative(-0.02f)
                verticalLineToRelative(-0.007f)
                close()
                moveTo(15.421f, 0.037f)
                verticalLineToRelative(8.418f)
                curveToRelative(2.245f, -0.147f, 4.531f, -0.168f, 6.863f, -0.543f)
                curveTo(23.223f, 7.764f, 24.0f, 7.101f, 24.0f, 6.089f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0.0f, -1.012f, -0.784f, -1.662f, -1.716f, -1.83f)
                curveToRelative(-2.339f, -0.429f, -4.618f, -0.295f, -6.863f, -0.422f)
                close()
                moveTo(8.559f, 0.05f)
                curveTo(6.24f, 0.191f, 3.961f, 0.077f, 1.716f, 0.459f)
                curveTo(0.777f, 0.62f, 0.0f, 1.277f, 0.0f, 2.289f)
                verticalLineToRelative(3.8f)
                curveToRelative(0.0f, 1.012f, 0.784f, 1.642f, 1.716f, 1.823f)
                curveToRelative(2.218f, 0.442f, 4.504f, 0.476f, 6.843f, 0.603f)
                verticalLineTo(0.05f)
                close()
            }
        }
        .build()
        return _transmission!!
    }

private var _transmission: ImageVector? = null
