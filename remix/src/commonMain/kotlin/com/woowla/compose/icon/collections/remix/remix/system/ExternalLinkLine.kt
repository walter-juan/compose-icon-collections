package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.ExternalLinkLine: ImageVector
    get() {
        if (_externalLinkLine != null) {
            return _externalLinkLine!!
        }
        _externalLinkLine = Builder(name = "ExternalLinkLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 20.552f, 17.552f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 6.448f, 3.448f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(21.0f, 3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                lineTo(19.0f, 6.413f)
                lineTo(11.207f, 14.207f)
                lineTo(9.793f, 12.793f)
                lineTo(17.585f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _externalLinkLine!!
    }

private var _externalLinkLine: ImageVector? = null
