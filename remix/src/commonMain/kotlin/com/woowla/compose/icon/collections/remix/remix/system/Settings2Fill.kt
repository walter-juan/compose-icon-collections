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

public val SystemGroup.Settings2Fill: ImageVector
    get() {
        if (_settings2Fill != null) {
            return _settings2Fill!!
        }
        _settings2Fill = Builder(name = "Settings2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.686f, 4.0f)
                lineTo(11.293f, 1.393f)
                curveTo(11.684f, 1.003f, 12.317f, 1.003f, 12.707f, 1.393f)
                lineTo(15.314f, 4.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 4.0f, 20.0f, 4.448f, 20.0f, 5.0f)
                verticalLineTo(8.686f)
                lineTo(22.607f, 11.293f)
                curveTo(22.997f, 11.684f, 22.997f, 12.317f, 22.607f, 12.707f)
                lineTo(20.0f, 15.314f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 19.552f, 19.552f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(15.314f)
                lineTo(12.707f, 22.607f)
                curveTo(12.317f, 22.997f, 11.684f, 22.997f, 11.293f, 22.607f)
                lineTo(8.686f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 20.0f, 4.0f, 19.552f, 4.0f, 19.0f)
                verticalLineTo(15.314f)
                lineTo(1.393f, 12.707f)
                curveTo(1.003f, 12.317f, 1.003f, 11.684f, 1.393f, 11.293f)
                lineTo(4.0f, 8.686f)
                verticalLineTo(5.0f)
                curveTo(4.0f, 4.448f, 4.448f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(8.686f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                curveTo(15.0f, 10.343f, 13.657f, 9.0f, 12.0f, 9.0f)
                curveTo(10.343f, 9.0f, 9.0f, 10.343f, 9.0f, 12.0f)
                curveTo(9.0f, 13.657f, 10.343f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _settings2Fill!!
    }

private var _settings2Fill: ImageVector? = null
