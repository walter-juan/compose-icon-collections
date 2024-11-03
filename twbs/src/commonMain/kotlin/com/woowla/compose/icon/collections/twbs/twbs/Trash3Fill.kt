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

public val Twbs.Trash3Fill: ImageVector
    get() {
        if (_trash3Fill != null) {
            return _trash3Fill!!
        }
        _trash3Fill = Builder(name = "Trash3Fill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 1.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-0.538f)
                lineToRelative(-0.853f, 10.66f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.115f, 16.0f)
                horizontalLineToRelative(-6.23f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.994f, -1.84f)
                lineTo(2.038f, 3.5f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 1.5f)
                moveToRelative(-5.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                moveTo(4.5f, 5.029f)
                lineToRelative(0.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.998f, -0.06f)
                lineToRelative(-0.5f, -8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.998f, 0.06f)
                moveToRelative(6.53f, -0.528f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.528f, 0.47f)
                lineToRelative(-0.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.998f, 0.058f)
                lineToRelative(0.5f, -8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.47f, -0.528f)
                moveTo(8.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineTo(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
            }
        }
        .build()
        return _trash3Fill!!
    }

private var _trash3Fill: ImageVector? = null
