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

public val OthersGroup.Dice2Fill: ImageVector
    get() {
        if (_dice2Fill != null) {
            return _dice2Fill!!
        }
        _dice2Fill = Builder(name = "Dice2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.895f, 3.0f, 3.0f, 3.895f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.105f, 3.895f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 21.0f, 21.0f, 20.105f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.895f, 20.105f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(10.5f, 9.0f)
                curveTo(10.5f, 9.828f, 9.828f, 10.5f, 9.0f, 10.5f)
                curveTo(8.172f, 10.5f, 7.5f, 9.828f, 7.5f, 9.0f)
                curveTo(7.5f, 8.172f, 8.172f, 7.5f, 9.0f, 7.5f)
                curveTo(9.828f, 7.5f, 10.5f, 8.172f, 10.5f, 9.0f)
                close()
                moveTo(16.5f, 15.0f)
                curveTo(16.5f, 15.828f, 15.828f, 16.5f, 15.0f, 16.5f)
                curveTo(14.172f, 16.5f, 13.5f, 15.828f, 13.5f, 15.0f)
                curveTo(13.5f, 14.172f, 14.172f, 13.5f, 15.0f, 13.5f)
                curveTo(15.828f, 13.5f, 16.5f, 14.172f, 16.5f, 15.0f)
                close()
            }
        }
        .build()
        return _dice2Fill!!
    }

private var _dice2Fill: ImageVector? = null
