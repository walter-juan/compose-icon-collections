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

public val OthersGroup.KeyFill: ImageVector
    get() {
        if (_keyFill != null) {
            return _keyFill!!
        }
        _keyFill = Builder(name = "KeyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                horizontalLineTo(12.659f)
                curveTo(11.835f, 16.33f, 9.612f, 18.0f, 7.0f, 18.0f)
                curveTo(3.686f, 18.0f, 1.0f, 15.314f, 1.0f, 12.0f)
                curveTo(1.0f, 8.686f, 3.686f, 6.0f, 7.0f, 6.0f)
                curveTo(9.612f, 6.0f, 11.835f, 7.67f, 12.659f, 10.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(7.0f, 14.0f)
                curveTo(8.105f, 14.0f, 9.0f, 13.105f, 9.0f, 12.0f)
                curveTo(9.0f, 10.895f, 8.105f, 10.0f, 7.0f, 10.0f)
                curveTo(5.895f, 10.0f, 5.0f, 10.895f, 5.0f, 12.0f)
                curveTo(5.0f, 13.105f, 5.895f, 14.0f, 7.0f, 14.0f)
                close()
            }
        }
        .build()
        return _keyFill!!
    }

private var _keyFill: ImageVector? = null
