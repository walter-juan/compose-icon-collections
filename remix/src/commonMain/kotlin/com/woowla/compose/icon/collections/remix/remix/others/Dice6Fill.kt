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

public val OthersGroup.Dice6Fill: ImageVector
    get() {
        if (_dice6Fill != null) {
            return _dice6Fill!!
        }
        _dice6Fill = Builder(name = "Dice6Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(9.0f, 9.5f)
                curveTo(8.172f, 9.5f, 7.5f, 8.828f, 7.5f, 8.0f)
                curveTo(7.5f, 7.172f, 8.172f, 6.5f, 9.0f, 6.5f)
                curveTo(9.828f, 6.5f, 10.5f, 7.172f, 10.5f, 8.0f)
                curveTo(10.5f, 8.828f, 9.828f, 9.5f, 9.0f, 9.5f)
                close()
                moveTo(10.5f, 12.0f)
                curveTo(10.5f, 12.828f, 9.828f, 13.5f, 9.0f, 13.5f)
                curveTo(8.172f, 13.5f, 7.5f, 12.828f, 7.5f, 12.0f)
                curveTo(7.5f, 11.172f, 8.172f, 10.5f, 9.0f, 10.5f)
                curveTo(9.828f, 10.5f, 10.5f, 11.172f, 10.5f, 12.0f)
                close()
                moveTo(10.5f, 16.0f)
                curveTo(10.5f, 16.828f, 9.828f, 17.5f, 9.0f, 17.5f)
                curveTo(8.172f, 17.5f, 7.5f, 16.828f, 7.5f, 16.0f)
                curveTo(7.5f, 15.172f, 8.172f, 14.5f, 9.0f, 14.5f)
                curveTo(9.828f, 14.5f, 10.5f, 15.172f, 10.5f, 16.0f)
                close()
                moveTo(15.0f, 9.5f)
                curveTo(14.172f, 9.5f, 13.5f, 8.828f, 13.5f, 8.0f)
                curveTo(13.5f, 7.172f, 14.172f, 6.5f, 15.0f, 6.5f)
                curveTo(15.828f, 6.5f, 16.5f, 7.172f, 16.5f, 8.0f)
                curveTo(16.5f, 8.828f, 15.828f, 9.5f, 15.0f, 9.5f)
                close()
                moveTo(16.5f, 12.0f)
                curveTo(16.5f, 12.828f, 15.828f, 13.5f, 15.0f, 13.5f)
                curveTo(14.172f, 13.5f, 13.5f, 12.828f, 13.5f, 12.0f)
                curveTo(13.5f, 11.172f, 14.172f, 10.5f, 15.0f, 10.5f)
                curveTo(15.828f, 10.5f, 16.5f, 11.172f, 16.5f, 12.0f)
                close()
                moveTo(16.5f, 16.0f)
                curveTo(16.5f, 16.828f, 15.828f, 17.5f, 15.0f, 17.5f)
                curveTo(14.172f, 17.5f, 13.5f, 16.828f, 13.5f, 16.0f)
                curveTo(13.5f, 15.172f, 14.172f, 14.5f, 15.0f, 14.5f)
                curveTo(15.828f, 14.5f, 16.5f, 15.172f, 16.5f, 16.0f)
                close()
            }
        }
        .build()
        return _dice6Fill!!
    }

private var _dice6Fill: ImageVector? = null
