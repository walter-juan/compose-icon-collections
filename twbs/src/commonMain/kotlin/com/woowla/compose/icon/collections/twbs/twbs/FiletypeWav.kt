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

public val Twbs.FiletypeWav: ImageVector
    get() {
        if (_filetypeWav != null) {
            return _filetypeWav!!
        }
        _filetypeWav = Builder(name = "FiletypeWav", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                verticalLineToRelative(-1.0f)
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
                moveTo(1.784f, 15.849f)
                lineToRelative(0.741f, -2.789f)
                horizontalLineToRelative(0.033f)
                lineToRelative(0.74f, 2.789f)
                horizontalLineToRelative(0.73f)
                lineToRelative(1.055f, -3.999f)
                horizontalLineToRelative(-0.858f)
                lineToRelative(-0.595f, 2.903f)
                horizontalLineToRelative(-0.041f)
                lineToRelative(-0.706f, -2.903f)
                lineTo(2.2f, 11.85f)
                lineToRelative(-0.706f, 2.903f)
                horizontalLineToRelative(-0.038f)
                lineToRelative(-0.6f, -2.903f)
                lineTo(0.0f, 11.85f)
                lineToRelative(1.055f, 3.999f)
                close()
                moveTo(5.499f, 15.849f)
                lineTo(5.813f, 14.821f)
                horizontalLineToRelative(1.336f)
                lineToRelative(0.313f, 1.028f)
                horizontalLineToRelative(0.841f)
                lineTo(6.967f, 11.85f)
                horizontalLineToRelative(-0.926f)
                lineTo(4.7f, 15.849f)
                horizontalLineToRelative(0.8f)
                close()
                moveTo(6.501f, 12.615f)
                lineTo(6.991f, 14.232f)
                lineTo(5.977f, 14.232f)
                lineToRelative(0.49f, -1.617f)
                lineTo(6.5f, 12.615f)
                close()
                moveTo(10.105f, 15.849f)
                horizontalLineToRelative(-0.952f)
                lineTo(7.814f, 11.85f)
                horizontalLineToRelative(0.917f)
                lineToRelative(0.897f, 3.138f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.888f, -3.138f)
                horizontalLineToRelative(0.879f)
                close()
            }
        }
        .build()
        return _filetypeWav!!
    }

private var _filetypeWav: ImageVector? = null
