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

public val Twbs.FiletypeHtml: ImageVector
    get() {
        if (_filetypeHtml != null) {
            return _filetypeHtml!!
        }
        _filetypeHtml = Builder(name = "FiletypeHtml", defaultWidth = 16.0.dp, defaultHeight =
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
                moveTo(4.264f, 11.85f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(-0.791f)
                verticalLineToRelative(-1.714f)
                lineTo(1.79f, 14.135f)
                verticalLineToRelative(1.714f)
                lineTo(1.0f, 15.849f)
                lineTo(1.0f, 11.85f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(1.626f)
                horizontalLineToRelative(1.682f)
                lineTo(3.473f, 11.85f)
                horizontalLineToRelative(0.79f)
                close()
                moveTo(6.515f, 12.512f)
                verticalLineToRelative(3.337f)
                horizontalLineToRelative(-0.794f)
                verticalLineToRelative(-3.337f)
                lineTo(4.588f, 12.512f)
                verticalLineToRelative(-0.662f)
                horizontalLineToRelative(3.064f)
                verticalLineToRelative(0.662f)
                close()
                moveTo(8.691f, 15.849f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.952f, 2.159f)
                horizontalLineToRelative(0.516f)
                lineToRelative(0.946f, -2.16f)
                horizontalLineToRelative(0.038f)
                verticalLineToRelative(2.661f)
                horizontalLineToRelative(0.715f)
                lineTo(11.896f, 11.85f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-1.14f, 2.596f)
                lineTo(9.93f, 14.446f)
                lineTo(8.79f, 11.85f)
                horizontalLineToRelative(-0.805f)
                verticalLineToRelative(3.999f)
                close()
                moveTo(13.401f, 15.175f)
                horizontalLineToRelative(1.696f)
                verticalLineToRelative(0.674f)
                lineTo(12.61f, 15.849f)
                lineTo(12.61f, 11.85f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(3.325f)
                close()
            }
        }
        .build()
        return _filetypeHtml!!
    }

private var _filetypeHtml: ImageVector? = null
