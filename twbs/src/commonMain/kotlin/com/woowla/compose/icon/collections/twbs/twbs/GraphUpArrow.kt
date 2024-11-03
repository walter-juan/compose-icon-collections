package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.GraphUpArrow: ImageVector
    get() {
        if (_graphUpArrow != null) {
            return _graphUpArrow!!
        }
        _graphUpArrow = Builder(name = "GraphUpArrow", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 16.0f)
                close()
                moveTo(10.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(14.0f, 4.9f)
                lineToRelative(-3.613f, 4.417f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.74f, 0.037f)
                lineTo(7.06f, 6.767f)
                lineToRelative(-3.656f, 5.027f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.808f, -0.588f)
                lineToRelative(4.0f, -5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.758f, -0.06f)
                lineToRelative(2.609f, 2.61f)
                lineTo(13.445f, 4.0f)
                lineTo(10.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
            }
        }
        .build()
        return _graphUpArrow!!
    }

private var _graphUpArrow: ImageVector? = null
