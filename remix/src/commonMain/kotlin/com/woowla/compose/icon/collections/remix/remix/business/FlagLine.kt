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

public val BusinessGroup.FlagLine: ImageVector
    get() {
        if (_flagLine != null) {
            return _flagLine!!
        }
        _flagLine = Builder(name = "FlagLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.382f, 3.0f)
                curveTo(12.761f, 3.0f, 13.107f, 3.214f, 13.276f, 3.553f)
                lineTo(14.0f, 5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 5.0f, 21.0f, 5.448f, 21.0f, 6.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 17.552f, 20.552f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(13.618f)
                curveTo(13.239f, 18.0f, 12.893f, 17.786f, 12.724f, 17.447f)
                lineTo(12.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.382f)
                close()
                moveTo(11.764f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.236f)
                lineTo(14.236f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.764f)
                lineTo(11.764f, 5.0f)
                close()
            }
        }
        .build()
        return _flagLine!!
    }

private var _flagLine: ImageVector? = null
