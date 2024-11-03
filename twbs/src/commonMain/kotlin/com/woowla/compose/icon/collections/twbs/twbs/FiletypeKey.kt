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

public val Twbs.FiletypeKey: ImageVector
    get() {
        if (_filetypeKey != null) {
            return _filetypeKey!!
        }
        _filetypeKey = Builder(name = "FiletypeKey", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
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
                moveTo(3.21f, 11.85f)
                horizontalLineToRelative(-0.87f)
                lineTo(0.83f, 13.64f)
                lineTo(0.79f, 13.64f)
                verticalLineToRelative(-1.79f)
                lineTo(0.0f, 11.85f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(-1.283f)
                lineToRelative(0.41f, -0.466f)
                lineToRelative(1.12f, 1.749f)
                horizontalLineToRelative(0.951f)
                lineToRelative(-1.488f, -2.276f)
                lineToRelative(1.427f, -1.723f)
                close()
                moveTo(6.113f, 15.202f)
                horizontalLineToRelative(-1.79f)
                verticalLineToRelative(-1.073f)
                horizontalLineToRelative(1.685f)
                verticalLineToRelative(-0.606f)
                lineTo(4.323f, 13.523f)
                verticalLineToRelative(-1.025f)
                horizontalLineToRelative(1.79f)
                verticalLineToRelative(-0.648f)
                lineTo(3.538f, 11.85f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(2.575f)
                close()
                moveTo(8.356f, 14.314f)
                verticalLineToRelative(1.535f)
                horizontalLineToRelative(-0.794f)
                verticalLineToRelative(-1.52f)
                lineTo(6.223f, 11.85f)
                lineTo(7.1f, 11.85f)
                lineToRelative(0.853f, 1.696f)
                horizontalLineToRelative(0.032f)
                lineToRelative(0.855f, -1.696f)
                horizontalLineToRelative(0.856f)
                close()
            }
        }
        .build()
        return _filetypeKey!!
    }

private var _filetypeKey: ImageVector? = null
