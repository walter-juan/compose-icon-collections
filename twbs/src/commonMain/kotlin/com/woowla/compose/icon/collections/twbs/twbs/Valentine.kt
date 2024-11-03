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

public val Twbs.Valentine: ImageVector
    get() {
        if (_valentine != null) {
            return _valentine!!
        }
        _valentine = Builder(name = "Valentine", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0.0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0.0f, -5.132f)
                moveTo(2.25f, 4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.5f, 0.0f)
                lineTo(2.5f, 4.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                close()
                moveTo(12.25f, 4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(2.5f, 10.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, -0.5f, 0.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, -0.5f)
                lineTo(2.5f, 11.5f)
                close()
                moveTo(14.0f, 10.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, -0.5f, 0.0f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 2.994f)
                verticalLineToRelative(-0.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.859f, -0.99f)
                lineToRelative(13.0f, -1.857f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.141f, 0.99f)
                verticalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(1.0f, 3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _valentine!!
    }

private var _valentine: ImageVector? = null
