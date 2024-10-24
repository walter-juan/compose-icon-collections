package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.FlagOffFill: ImageVector
    get() {
        if (_flagOffFill != null) {
            return _flagOffFill!!
        }
        _flagOffFill = Builder(name = "FlagOffFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.586f, 18.0f)
                lineTo(21.192f, 22.607f)
                lineTo(22.607f, 21.192f)
                lineTo(2.808f, 1.393f)
                lineTo(1.394f, 2.808f)
                lineTo(3.0f, 4.414f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                lineTo(12.724f, 17.447f)
                curveTo(12.893f, 17.786f, 13.239f, 18.0f, 13.618f, 18.0f)
                horizontalLineTo(16.586f)
                close()
                moveTo(21.0f, 6.0f)
                verticalLineTo(16.758f)
                lineTo(7.242f, 3.0f)
                horizontalLineTo(12.382f)
                curveTo(12.761f, 3.0f, 13.107f, 3.214f, 13.276f, 3.553f)
                lineTo(14.0f, 5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 5.0f, 21.0f, 5.448f, 21.0f, 6.0f)
                close()
            }
        }
        .build()
        return _flagOffFill!!
    }

private var _flagOffFill: ImageVector? = null
