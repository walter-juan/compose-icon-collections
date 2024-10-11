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

public val ArrowsGroup.ArrowTurnBackLine: ImageVector
    get() {
        if (_arrowTurnBackLine != null) {
            return _arrowTurnBackLine!!
        }
        _arrowTurnBackLine = Builder(name = "ArrowTurnBackLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.172f)
                lineTo(14.465f, 15.636f)
                lineTo(13.051f, 17.05f)
                lineTo(18.0f, 22.0f)
                lineTo(22.95f, 17.05f)
                lineTo(21.536f, 15.636f)
                lineTo(19.0f, 18.172f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 6.582f, 15.419f, 3.0f, 11.0f, 3.0f)
                curveTo(6.582f, 3.0f, 3.0f, 6.582f, 3.0f, 11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 7.686f, 7.687f, 5.0f, 11.0f, 5.0f)
                curveTo(14.314f, 5.0f, 17.0f, 7.686f, 17.0f, 11.0f)
                verticalLineTo(18.172f)
                close()
            }
        }
        .build()
        return _arrowTurnBackLine!!
    }

private var _arrowTurnBackLine: ImageVector? = null
