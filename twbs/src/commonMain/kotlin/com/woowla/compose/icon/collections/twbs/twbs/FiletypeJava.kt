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

public val Twbs.FiletypeJava: ImageVector
    get() {
        if (_filetypeJava != null) {
            return _filetypeJava!!
        }
        _filetypeJava = Builder(name = "FiletypeJava", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
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
                moveTo(1.521f, 15.175f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.082f, -0.466f)
                horizontalLineToRelative(0.765f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.073f, 0.27f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.454f, 0.246f)
                quadToRelative(0.285f, 0.0f, 0.422f, -0.164f)
                quadToRelative(0.138f, -0.165f, 0.138f, -0.466f)
                lineTo(3.291f, 11.85f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(2.725f)
                quadToRelative(0.0f, 0.66f, -0.357f, 1.005f)
                quadToRelative(-0.354f, 0.345f, -0.984f, 0.345f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -0.568f, -0.094f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -0.408f, -0.266f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -0.243f, -0.39f)
                moveToRelative(3.972f, -0.354f)
                lineToRelative(-0.314f, 1.028f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(1.342f, -3.999f)
                horizontalLineToRelative(0.926f)
                lineToRelative(1.336f, 3.999f)
                horizontalLineToRelative(-0.84f)
                lineToRelative(-0.314f, -1.028f)
                close()
                moveTo(6.671f, 14.231f)
                lineTo(6.181f, 12.615f)
                horizontalLineToRelative(-0.035f)
                lineToRelative(-0.49f, 1.617f)
                close()
                moveTo(9.013f, 15.849f)
                horizontalLineToRelative(0.952f)
                lineToRelative(1.327f, -3.999f)
                horizontalLineToRelative(-0.878f)
                lineToRelative(-0.888f, 3.138f)
                horizontalLineToRelative(-0.038f)
                lineTo(8.59f, 11.85f)
                horizontalLineToRelative(-0.917f)
                close()
                moveTo(12.1f, 14.821f)
                lineTo(11.786f, 15.849f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(1.342f, -3.999f)
                horizontalLineToRelative(0.926f)
                lineToRelative(1.336f, 3.999f)
                horizontalLineToRelative(-0.84f)
                lineToRelative(-0.314f, -1.028f)
                close()
                moveTo(13.278f, 14.231f)
                lineTo(12.788f, 12.615f)
                horizontalLineToRelative(-0.035f)
                lineToRelative(-0.49f, 1.617f)
                close()
            }
        }
        .build()
        return _filetypeJava!!
    }

private var _filetypeJava: ImageVector? = null
