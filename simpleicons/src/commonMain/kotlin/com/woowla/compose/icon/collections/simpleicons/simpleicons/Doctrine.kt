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

public val Simpleicons.Doctrine: ImageVector
    get() {
        if (_doctrine != null) {
            return _doctrine!!
        }
        _doctrine = Builder(name = "Doctrine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.791f, 0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.254f, 0.016f)
                curveTo(7.352f, 0.158f, 6.492f, 1.21f, 6.587f, 2.399f)
                arcToRelative(2.215f, 2.215f, 0.0f, false, false, 0.666f, 1.416f)
                lineToRelative(-0.003f, 0.003f)
                lineTo(9.585f, 6.02f)
                curveToRelative(-4.178f, 1.138f, -7.061f, 5.115f, -6.707f, 9.556f)
                curveToRelative(0.391f, 4.897f, 4.578f, 8.612f, 9.487f, 8.416f)
                reflectiveCurveToRelative(8.787f, -4.232f, 8.787f, -9.144f)
                lineToRelative(-0.116f, -1.452f)
                curveToRelative(-0.322f, -2.004f, -1.274f, -3.756f, -2.624f, -5.079f)
                lineToRelative(0.002f, 0.0f)
                lineToRelative(-8.077f, -7.706f)
                lineToRelative(-0.002f, 0.001f)
                verticalLineToRelative(0.0f)
                arcTo(2.22f, 2.22f, 0.0f, false, false, 8.791f, 0.0f)
                moveToRelative(2.215f, 8.548f)
                arcToRelative(1.485f, 1.485f, 0.0f, false, true, 0.91f, 0.453f)
                lineToRelative(4.747f, 4.773f)
                arcToRelative(1.324f, 1.324f, 0.0f, false, true, 0.437f, 0.789f)
                lineToRelative(0.017f, 0.211f)
                arcToRelative(1.326f, 1.326f, 0.0f, false, true, -0.451f, 0.998f)
                lineToRelative(-4.779f, 4.822f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, -0.999f, 0.438f)
                curveToRelative(-0.799f, 0.032f, -1.48f, -0.572f, -1.544f, -1.367f)
                arcToRelative(1.481f, 1.481f, 0.0f, false, true, 0.439f, -1.176f)
                lineToRelative(-0.001f, -0.001f)
                lineToRelative(2.421f, -2.422f)
                horizontalLineToRelative(-5.027f)
                verticalLineToRelative(-0.002f)
                curveToRelative(-0.696f, 0.008f, -1.284f, -0.525f, -1.339f, -1.223f)
                curveToRelative(-0.057f, -0.711f, 0.458f, -1.34f, 1.166f, -1.425f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 0.144f, -0.01f)
                lineToRelative(0.017f, 0.0f)
                curveToRelative(1.658f, 0.006f, 3.315f, 0.002f, 4.973f, 0.002f)
                lineTo(9.856f, 11.13f)
                arcToRelative(1.475f, 1.475f, 0.0f, false, true, -0.498f, -0.993f)
                curveToRelative(-0.063f, -0.792f, 0.512f, -1.493f, 1.303f, -1.588f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.345f, -0.001f)
            }
        }
        .build()
        return _doctrine!!
    }

private var _doctrine: ImageVector? = null
