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

public val SystemGroup.Settings6Fill: ImageVector
    get() {
        if (_settings6Fill != null) {
            return _settings6Fill!!
        }
        _settings6Fill = Builder(name = "Settings6Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.474f)
                lineTo(23.0f, 12.0f)
                lineTo(17.5f, 21.526f)
                horizontalLineTo(6.5f)
                lineTo(1.0f, 12.0f)
                lineTo(6.5f, 2.474f)
                horizontalLineTo(17.5f)
                close()
                moveTo(8.634f, 8.17f)
                lineTo(13.634f, 16.83f)
                lineTo(15.366f, 15.83f)
                lineTo(10.366f, 7.17f)
                lineTo(8.634f, 8.17f)
                close()
            }
        }
        .build()
        return _settings6Fill!!
    }

private var _settings6Fill: ImageVector? = null
