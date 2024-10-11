package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ArrowTurnBackFill: ImageVector
    get() {
        if (_arrowTurnBackFill != null) {
            return _arrowTurnBackFill!!
        }
        _arrowTurnBackFill = Builder(name = "ArrowTurnBackFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                horizontalLineTo(13.0f)
                lineTo(18.0f, 22.0f)
                lineTo(23.0f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 6.582f, 15.418f, 3.0f, 11.0f, 3.0f)
                curveTo(6.582f, 3.0f, 3.0f, 6.582f, 3.0f, 11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 7.686f, 7.686f, 5.0f, 11.0f, 5.0f)
                curveTo(14.314f, 5.0f, 17.0f, 7.686f, 17.0f, 11.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _arrowTurnBackFill!!
    }

private var _arrowTurnBackFill: ImageVector? = null
