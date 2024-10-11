package com.woowla.compose.icon.collections.remix.remix.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FoodGroup

public val FoodGroup.GobletLine: ImageVector
    get() {
        if (_gobletLine != null) {
            return _gobletLine!!
        }
        _gobletLine = Builder(name = "GobletLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.0f)
                verticalLineTo(13.889f)
                lineTo(3.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                lineTo(13.0f, 13.889f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(7.491f, 7.0f)
                horizontalLineTo(16.509f)
                lineTo(18.309f, 5.0f)
                horizontalLineTo(5.691f)
                lineTo(7.491f, 7.0f)
                close()
                moveTo(9.291f, 9.0f)
                lineTo(12.0f, 12.01f)
                lineTo(14.709f, 9.0f)
                horizontalLineTo(9.291f)
                close()
            }
        }
        .build()
        return _gobletLine!!
    }

private var _gobletLine: ImageVector? = null
