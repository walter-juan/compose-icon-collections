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

public val Twbs.FiletypeYml: ImageVector
    get() {
        if (_filetypeYml != null) {
            return _filetypeYml!!
        }
        _filetypeYml = Builder(name = "FiletypeYml", defaultWidth = 16.0.dp, defaultHeight =
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
                moveTo(2.133f, 15.849f)
                verticalLineToRelative(-1.535f)
                lineToRelative(1.339f, -2.464f)
                horizontalLineToRelative(-0.856f)
                lineToRelative(-0.855f, 1.696f)
                horizontalLineToRelative(-0.032f)
                lineTo(0.876f, 11.85f)
                lineTo(0.0f, 11.85f)
                lineToRelative(1.339f, 2.479f)
                verticalLineToRelative(1.52f)
                close()
                moveTo(4.42f, 15.849f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.952f, 2.159f)
                horizontalLineToRelative(0.516f)
                lineToRelative(0.946f, -2.16f)
                horizontalLineToRelative(0.038f)
                verticalLineToRelative(2.661f)
                horizontalLineToRelative(0.715f)
                lineTo(7.625f, 11.85f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-1.14f, 2.596f)
                lineTo(5.66f, 14.446f)
                lineTo(4.52f, 11.85f)
                horizontalLineToRelative(-0.805f)
                verticalLineToRelative(3.999f)
                close()
                moveTo(9.13f, 15.175f)
                horizontalLineToRelative(1.696f)
                verticalLineToRelative(0.674f)
                lineTo(8.338f, 15.849f)
                lineTo(8.338f, 11.85f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(3.325f)
                close()
            }
        }
        .build()
        return _filetypeYml!!
    }

private var _filetypeYml: ImageVector? = null
