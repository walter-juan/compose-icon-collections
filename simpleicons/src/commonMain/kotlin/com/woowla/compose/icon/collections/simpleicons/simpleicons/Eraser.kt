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

public val Simpleicons.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.186f, 7.328f)
                curveToRelative(-0.248f, 0.0f, -0.482f, 0.168f, -0.608f, 0.443f)
                lineToRelative(-3.476f, 7.51f)
                curveToRelative(-0.283f, 0.61f, 0.057f, 1.39f, 0.605f, 1.39f)
                horizontalLineToRelative(10.682f)
                lineTo(11.389f, 7.329f)
                close()
                moveTo(12.611f, 7.328f)
                lineTo(12.609f, 16.672f)
                horizontalLineToRelative(7.205f)
                curveToRelative(0.248f, 0.0f, 0.482f, -0.168f, 0.608f, -0.443f)
                lineToRelative(3.476f, -7.51f)
                curveToRelative(0.283f, -0.61f, -0.057f, -1.39f, -0.605f, -1.39f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
