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

public val Simpleicons.Actualbudget: ImageVector
    get() {
        if (_actualbudget != null) {
            return _actualbudget!!
        }
        _actualbudget = Builder(name = "Actualbudget", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.442f, 10.779f)
                lineToRelative(0.737f, 2.01f)
                lineToRelative(-16.758f, 6.145f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, true, -0.324f, -0.15f)
                lineToRelative(-0.563f, -1.536f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, true, 0.15f, -0.324f)
                close()
                moveTo(1.13f, 23.309f)
                lineTo(12.036f, 0.145f)
                arcTo(0.253f, 0.253f, 0.0f, false, true, 12.265f, 0.0f)
                horizontalLineToRelative(0.478f)
                curveToRelative(0.097f, 0.0f, 0.185f, 0.055f, 0.227f, 0.142f)
                lineToRelative(7.036f, 14.455f)
                lineToRelative(2.206f, -0.848f)
                curveToRelative(0.13f, -0.05f, 0.277f, 0.015f, 0.327f, 0.145f)
                lineToRelative(0.587f, 1.526f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, true, -0.145f, 0.327f)
                lineToRelative(-2.034f, 0.783f)
                lineToRelative(2.51f, 5.156f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, true, -0.117f, 0.338f)
                lineToRelative(-1.47f, 0.716f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, true, -0.339f, -0.117f)
                lineToRelative(-2.59f, -5.322f)
                lineToRelative(-17.37f, 6.682f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, true, -0.328f, -0.145f)
                curveToRelative(0.0f, -0.001f, 0.0f, -0.003f, -0.002f, -0.004f)
                lineToRelative(-0.12f, -0.33f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, true, 0.009f, -0.195f)
                close()
                moveTo(12.528f, 4.127f)
                lineTo(4.854f, 20.425f)
                lineTo(18.0f, 15.369f)
                close()
            }
        }
        .build()
        return _actualbudget!!
    }

private var _actualbudget: ImageVector? = null
