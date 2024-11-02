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

public val Simpleicons.Filedotio: ImageVector
    get() {
        if (_filedotio != null) {
            return _filedotio!!
        }
        _filedotio = Builder(name = "Filedotio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.034f, 11.837f)
                arcToRelative(2.976f, 2.976f, 0.0f, false, true, -1.868f, 2.718f)
                lineToRelative(-4.385f, 1.401f)
                lineToRelative(-0.06f, -5.23f)
                curveToRelative(-0.011f, -1.256f, -0.514f, -2.48f, -1.135f, -2.727f)
                curveToRelative(-2.024f, -0.816f, -4.054f, -1.619f, -6.07f, -2.456f)
                arcToRelative(1.028f, 1.028f, 0.0f, false, true, -0.509f, -0.934f)
                curveToRelative(0.001f, -0.272f, 0.11f, -0.532f, 0.303f, -0.724f)
                curveToRelative(0.115f, -0.061f, 0.236f, -0.111f, 0.36f, -0.149f)
                lineTo(18.049f, 0.084f)
                curveToRelative(1.051f, -0.331f, 1.91f, 0.341f, 1.91f, 1.504f)
                lineToRelative(0.075f, 10.249f)
                close()
                moveTo(13.014f, 22.133f)
                curveToRelative(0.011f, 1.256f, -0.485f, 2.073f, -1.102f, 1.821f)
                curveToRelative(-2.287f, -0.916f, -4.565f, -1.869f, -6.854f, -2.773f)
                curveToRelative(-0.775f, -0.509f, -0.999f, -1.023f, -0.999f, -2.653f)
                lineTo(3.975f, 7.471f)
                arcToRelative(4.295f, 4.295f, 0.0f, false, true, 0.256f, -1.732f)
                arcToRelative(2.755f, 2.755f, 0.0f, false, true, 1.116f, -1.368f)
                curveToRelative(0.063f, -0.044f, 0.129f, -0.085f, 0.196f, -0.121f)
                curveToRelative(-0.195f, 0.19f, -0.304f, 0.451f, -0.303f, 0.723f)
                curveToRelative(-0.019f, 0.381f, 0.175f, 0.741f, 0.504f, 0.934f)
                lineToRelative(1.13f, 0.467f)
                lineToRelative(4.945f, 2.013f)
                curveToRelative(0.616f, 0.252f, 1.135f, 1.47f, 1.135f, 2.726f)
                curveToRelative(0.027f, 3.673f, 0.043f, 7.347f, 0.06f, 11.02f)
                close()
            }
        }
        .build()
        return _filedotio!!
    }

private var _filedotio: ImageVector? = null
