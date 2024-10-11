package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.FlipHorizontalLine: ImageVector
    get() {
        if (_flipHorizontalLine != null) {
            return _flipHorizontalLine!!
        }
        _flipHorizontalLine = Builder(name = "FlipHorizontalLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 4.895f, 2.895f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(7.0f)
                curveTo(8.105f, 4.0f, 9.0f, 4.895f, 9.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(9.0f, 19.105f, 8.105f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 20.0f, 2.0f, 19.105f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(20.0f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(17.0f, 4.0f)
                curveTo(15.895f, 4.0f, 15.0f, 4.895f, 15.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(15.0f, 19.105f, 15.895f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.105f, 20.0f, 22.0f, 19.105f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.895f, 21.105f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _flipHorizontalLine!!
    }

private var _flipHorizontalLine: ImageVector? = null
