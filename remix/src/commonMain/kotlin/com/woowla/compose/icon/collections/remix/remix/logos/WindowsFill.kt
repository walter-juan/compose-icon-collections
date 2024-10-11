package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.WindowsFill: ImageVector
    get() {
        if (_windowsFill != null) {
            return _windowsFill!!
        }
        _windowsFill = Builder(name = "WindowsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.001f, 5.479f)
                lineTo(10.378f, 4.463f)
                verticalLineTo(11.59f)
                horizontalLineTo(3.001f)
                verticalLineTo(5.479f)
                close()
                moveTo(3.001f, 18.521f)
                lineTo(10.378f, 19.538f)
                verticalLineTo(12.498f)
                horizontalLineTo(3.001f)
                verticalLineTo(18.521f)
                close()
                moveTo(11.189f, 19.646f)
                lineTo(21.001f, 21.0f)
                verticalLineTo(12.498f)
                horizontalLineTo(11.189f)
                verticalLineTo(19.646f)
                close()
                moveTo(11.189f, 4.354f)
                verticalLineTo(11.59f)
                horizontalLineTo(21.001f)
                verticalLineTo(3.0f)
                lineTo(11.189f, 4.354f)
                close()
            }
        }
        .build()
        return _windowsFill!!
    }

private var _windowsFill: ImageVector? = null
