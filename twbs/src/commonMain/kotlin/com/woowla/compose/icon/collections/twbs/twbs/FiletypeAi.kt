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

public val Twbs.FiletypeAi: ImageVector
    get() {
        if (_filetypeAi != null) {
            return _filetypeAi!!
        }
        _filetypeAi = Builder(name = "FiletypeAi", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 4.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 3.0f)
                lineTo(9.5f, 1.0f)
                lineTo(4.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(1.113f, 14.82f)
                lineTo(0.8f, 15.85f)
                lineTo(0.0f, 15.85f)
                lineToRelative(1.342f, -3.999f)
                horizontalLineToRelative(0.926f)
                lineToRelative(1.336f, 3.999f)
                horizontalLineToRelative(-0.841f)
                lineToRelative(-0.314f, -1.028f)
                lineTo(1.113f, 14.822f)
                close()
                moveTo(2.291f, 14.232f)
                lineTo(1.801f, 12.615f)
                horizontalLineToRelative(-0.034f)
                lineToRelative(-0.49f, 1.617f)
                close()
                moveTo(4.716f, 11.85f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(-0.791f)
                lineTo(3.925f, 11.85f)
                horizontalLineToRelative(0.79f)
                close()
            }
        }
        .build()
        return _filetypeAi!!
    }

private var _filetypeAi: ImageVector? = null
