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

public val Twbs.GraphDown: ImageVector
    get() {
        if (_graphDown != null) {
            return _graphDown!!
        }
        _graphDown = Builder(name = "GraphDown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
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
                moveTo(14.817f, 11.887f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.07f, -0.704f)
                lineToRelative(-4.5f, -5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.74f, -0.037f)
                lineTo(7.06f, 8.233f)
                lineTo(3.404f, 3.206f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.808f, 0.588f)
                lineToRelative(4.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.758f, 0.06f)
                lineToRelative(2.609f, -2.61f)
                lineToRelative(4.15f, 5.073f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.704f, 0.07f)
            }
        }
        .build()
        return _graphDown!!
    }

private var _graphDown: ImageVector? = null
