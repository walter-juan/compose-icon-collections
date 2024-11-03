package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Bricks: ImageVector
    get() {
        if (_bricks != null) {
            return _bricks!!
        }
        _bricks = Builder(name = "Bricks", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(14.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(14.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(0.5f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 6.0f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 4.0f)
                lineTo(0.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(3.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.5f)
                lineTo(7.5f, 4.0f)
                close()
                moveTo(8.5f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(13.0f, 6.0f)
                lineTo(13.0f, 4.0f)
                close()
                moveTo(3.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.5f, 10.0f)
                verticalLineToRelative(2.0f)
                lineTo(13.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                lineTo(4.5f, 1.0f)
                close()
                moveTo(5.5f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(10.5f, 1.0f)
                close()
                moveTo(11.5f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(15.0f, 3.0f)
                lineTo(15.0f, 1.0f)
                close()
                moveTo(1.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                lineTo(4.5f, 7.0f)
                close()
                moveTo(5.5f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(10.5f, 7.0f)
                close()
                moveTo(11.5f, 7.0f)
                verticalLineToRelative(2.0f)
                lineTo(15.0f, 9.0f)
                lineTo(15.0f, 7.0f)
                close()
                moveTo(1.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(5.5f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.5f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(15.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bricks!!
    }

private var _bricks: ImageVector? = null
