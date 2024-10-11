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

public val BusinessGroup.CustomerServiceLine: ImageVector
    get() {
        if (_customerServiceLine != null) {
            return _customerServiceLine!!
        }
        _customerServiceLine = Builder(name = "CustomerServiceLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.002f)
                curveTo(21.999f, 19.873f, 19.982f, 22.273f, 17.287f, 22.862f)
                lineTo(16.649f, 20.948f)
                curveTo(17.853f, 20.751f, 18.876f, 20.017f, 19.465f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(15.895f, 19.0f, 15.0f, 18.105f, 15.0f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(15.0f, 11.895f, 15.895f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(19.938f)
                curveTo(19.446f, 7.054f, 16.08f, 4.0f, 12.0f, 4.0f)
                curveTo(7.92f, 4.0f, 4.554f, 7.054f, 4.062f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(8.105f, 11.0f, 9.0f, 11.895f, 9.0f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 18.105f, 8.105f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 19.0f, 2.0f, 18.105f, 2.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                verticalLineTo(12.999f)
                verticalLineTo(13.0f)
                verticalLineTo(17.0f)
                verticalLineTo(17.001f)
                verticalLineTo(17.002f)
                close()
                moveTo(20.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(4.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _customerServiceLine!!
    }

private var _customerServiceLine: ImageVector? = null
