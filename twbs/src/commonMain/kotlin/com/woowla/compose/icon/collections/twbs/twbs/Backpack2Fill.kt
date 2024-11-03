package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val Twbs.Backpack2Fill: ImageVector
    get() {
        if (_backpack2Fill != null) {
            return _backpack2Fill!!
        }
        _backpack2Fill = Builder(name = "Backpack2Fill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                verticalLineToRelative(0.341f)
                curveTo(3.67f, 3.165f, 2.0f, 5.388f, 2.0f, 8.0f)
                verticalLineToRelative(1.191f)
                lineToRelative(-1.17f, 0.585f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 11.118f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 15.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.456f, 0.607f, 1.182f, 1.0f, 2.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.818f, 0.0f, 1.544f, -0.393f, 2.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-2.382f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.83f, -1.342f)
                lineTo(14.0f, 9.191f)
                verticalLineTo(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.0f, -5.659f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                moveToRelative(2.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(0.083f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.96f, 3.43f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.99f, 0.14f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.94f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.99f, -0.14f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 4.0f)
                moveTo(4.5f, 9.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
            }
        }
        .build()
        return _backpack2Fill!!
    }

private var _backpack2Fill: ImageVector? = null
