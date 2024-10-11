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

public val BusinessGroup.Medal2Line: ImageVector
    get() {
        if (_medal2Line != null) {
            return _medal2Line!!
        }
        _medal2Line = Builder(name = "Medal2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.5f)
                lineTo(14.116f, 13.587f)
                lineTo(19.608f, 14.028f)
                lineTo(15.424f, 17.612f)
                lineTo(16.702f, 22.972f)
                lineTo(12.0f, 20.1f)
                lineTo(7.298f, 22.972f)
                lineTo(8.576f, 17.612f)
                lineTo(4.392f, 14.028f)
                lineTo(9.884f, 13.587f)
                lineTo(12.0f, 8.5f)
                close()
                moveTo(12.0f, 13.707f)
                lineTo(11.262f, 15.483f)
                lineTo(9.345f, 15.637f)
                lineTo(10.805f, 16.888f)
                lineTo(10.358f, 18.759f)
                lineTo(12.0f, 17.756f)
                lineTo(13.641f, 18.759f)
                lineTo(13.195f, 16.888f)
                lineTo(14.654f, 15.637f)
                lineTo(12.739f, 15.483f)
                lineTo(12.0f, 13.707f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(18.0f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(13.0f, 2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _medal2Line!!
    }

private var _medal2Line: ImageVector? = null
