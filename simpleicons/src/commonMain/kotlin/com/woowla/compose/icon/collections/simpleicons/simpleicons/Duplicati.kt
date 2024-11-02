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

public val Simpleicons.Duplicati: ImageVector
    get() {
        if (_duplicati != null) {
            return _duplicati!!
        }
        _duplicati = Builder(name = "Duplicati", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.571f, 1.286f)
                arcTo(1.72f, 1.72f, 0.0f, false, false, 6.857f, 3.0f)
                verticalLineToRelative(10.286f)
                curveToRelative(0.0f, 0.634f, 0.353f, 1.183f, 0.868f, 1.48f)
                curveToRelative(0.251f, 0.144f, 0.538f, 0.234f, 0.846f, 0.234f)
                horizontalLineToRelative(13.715f)
                arcTo(1.72f, 1.72f, 0.0f, false, false, 24.0f, 13.286f)
                lineTo(24.0f, 3.0f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, -1.714f, -1.714f)
                close()
                moveTo(9.131f, 13.373f)
                close()
                moveTo(12.297f, 13.373f)
                close()
                moveTo(1.714f, 13.286f)
                arcTo(1.72f, 1.72f, 0.0f, false, false, 0.0f, 15.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, 1.714f, 1.714f)
                horizontalLineToRelative(8.572f)
                arcToRelative(1.715f, 1.715f, 0.0f, false, false, 1.473f, -0.857f)
                curveToRelative(0.148f, -0.253f, 0.241f, -0.544f, 0.241f, -0.857f)
                verticalLineToRelative(-4.286f)
                lineTo(8.571f, 16.714f)
                curveToRelative(-0.296f, 0.0f, -0.582f, -0.042f, -0.857f, -0.114f)
                arcToRelative(3.439f, 3.439f, 0.0f, false, true, -2.571f, -3.314f)
                close()
                moveTo(19.714f, 16.714f)
                horizontalLineToRelative(-6.0f)
                lineTo(13.714f, 21.0f)
                lineTo(18.0f, 21.0f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, 1.714f, -1.714f)
                close()
            }
        }
        .build()
        return _duplicati!!
    }

private var _duplicati: ImageVector? = null
