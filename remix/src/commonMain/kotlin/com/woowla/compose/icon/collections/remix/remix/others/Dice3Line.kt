package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.Dice3Line: ImageVector
    get() {
        if (_dice3Line != null) {
            return _dice3Line!!
        }
        _dice3Line = Builder(name = "Dice3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(3.0f, 5.0f)
                curveTo(3.0f, 3.895f, 3.895f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 3.0f, 21.0f, 3.895f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.105f, 20.105f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 21.0f, 3.0f, 20.105f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(15.5f, 17.0f)
                curveTo(16.328f, 17.0f, 17.0f, 16.328f, 17.0f, 15.5f)
                curveTo(17.0f, 14.672f, 16.328f, 14.0f, 15.5f, 14.0f)
                curveTo(14.672f, 14.0f, 14.0f, 14.672f, 14.0f, 15.5f)
                curveTo(14.0f, 16.328f, 14.672f, 17.0f, 15.5f, 17.0f)
                close()
                moveTo(10.0f, 8.5f)
                curveTo(10.0f, 9.328f, 9.328f, 10.0f, 8.5f, 10.0f)
                curveTo(7.672f, 10.0f, 7.0f, 9.328f, 7.0f, 8.5f)
                curveTo(7.0f, 7.672f, 7.672f, 7.0f, 8.5f, 7.0f)
                curveTo(9.328f, 7.0f, 10.0f, 7.672f, 10.0f, 8.5f)
                close()
                moveTo(12.0f, 13.5f)
                curveTo(12.828f, 13.5f, 13.5f, 12.828f, 13.5f, 12.0f)
                curveTo(13.5f, 11.172f, 12.828f, 10.5f, 12.0f, 10.5f)
                curveTo(11.172f, 10.5f, 10.5f, 11.172f, 10.5f, 12.0f)
                curveTo(10.5f, 12.828f, 11.172f, 13.5f, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _dice3Line!!
    }

private var _dice3Line: ImageVector? = null
