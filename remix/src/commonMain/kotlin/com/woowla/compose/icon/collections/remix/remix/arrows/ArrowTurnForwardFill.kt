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

public val ArrowsGroup.ArrowTurnForwardFill: ImageVector
    get() {
        if (_arrowTurnForwardFill != null) {
            return _arrowTurnForwardFill!!
        }
        _arrowTurnForwardFill = Builder(name = "ArrowTurnForwardFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(17.0f, 16.314f, 14.314f, 19.0f, 11.0f, 19.0f)
                curveTo(7.686f, 19.0f, 5.0f, 16.314f, 5.0f, 13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 17.418f, 6.582f, 21.0f, 11.0f, 21.0f)
                curveTo(15.418f, 21.0f, 19.0f, 17.418f, 19.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(23.0f)
                lineTo(18.0f, 2.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _arrowTurnForwardFill!!
    }

private var _arrowTurnForwardFill: ImageVector? = null
