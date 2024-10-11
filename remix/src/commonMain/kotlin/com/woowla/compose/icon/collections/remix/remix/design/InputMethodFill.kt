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

public val DesignGroup.InputMethodFill: ImageVector
    get() {
        if (_inputMethodFill != null) {
            return _inputMethodFill!!
        }
        _inputMethodFill = Builder(name = "InputMethodFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(9.869f, 15.0f)
                horizontalLineTo(14.131f)
                lineTo(14.951f, 17.0f)
                horizontalLineTo(17.167f)
                lineTo(13.0f, 7.0f)
                horizontalLineTo(11.0f)
                lineTo(6.833f, 17.0f)
                horizontalLineTo(9.049f)
                lineTo(9.869f, 15.0f)
                close()
                moveTo(10.689f, 13.0f)
                lineTo(12.0f, 9.8f)
                lineTo(13.311f, 13.0f)
                horizontalLineTo(10.689f)
                close()
            }
        }
        .build()
        return _inputMethodFill!!
    }

private var _inputMethodFill: ImageVector? = null
