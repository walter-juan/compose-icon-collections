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

public val Twbs.LuggageFill: ImageVector
    get() {
        if (_luggageFill != null) {
            return _luggageFill!!
        }
        _luggageFill = Builder(name = "LuggageFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 6.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(2.5f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.335f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 13.5f)
                verticalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 5.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(3.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveToRelative(10.0f, 1.0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                lineTo(8.5f, 8.0f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(13.0f, 8.0f)
                close()
                moveTo(10.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(11.5f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 7.0f)
                moveTo(5.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 8.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 14.5f)
                close()
                moveTo(14.0f, 16.0f)
                lineTo(14.0f, 8.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 9.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _luggageFill!!
    }

private var _luggageFill: ImageVector? = null
