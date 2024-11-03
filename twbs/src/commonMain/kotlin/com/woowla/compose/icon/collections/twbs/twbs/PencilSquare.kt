package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.PencilSquare: ImageVector
    get() {
        if (_pencilSquare != null) {
            return _pencilSquare!!
        }
        _pencilSquare = Builder(name = "PencilSquare", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.502f, 1.94f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.706f)
                lineTo(14.459f, 3.69f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(13.502f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                lineToRelative(1.293f, 1.293f)
                close()
                moveTo(13.752f, 4.396f)
                lineTo(11.752f, 2.396f)
                lineTo(4.939f, 9.21f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.121f, 0.196f)
                lineToRelative(-0.805f, 2.414f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.316f, 0.316f)
                lineToRelative(2.414f, -0.805f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.196f, -0.12f)
                lineToRelative(6.813f, -6.814f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.5f, 15.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 2.5f)
                close()
            }
        }
        .build()
        return _pencilSquare!!
    }

private var _pencilSquare: ImageVector? = null
