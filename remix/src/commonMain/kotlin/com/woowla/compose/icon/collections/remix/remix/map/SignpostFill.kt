package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.SignpostFill: ImageVector
    get() {
        if (_signpostFill != null) {
            return _signpostFill!!
        }
        _signpostFill = Builder(name = "SignpostFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 5.0f, 3.0f, 5.448f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 14.552f, 3.448f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(17.414f)
                lineTo(21.707f, 10.707f)
                curveTo(22.098f, 10.317f, 22.098f, 9.683f, 21.707f, 9.293f)
                lineTo(17.414f, 5.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _signpostFill!!
    }

private var _signpostFill: ImageVector? = null