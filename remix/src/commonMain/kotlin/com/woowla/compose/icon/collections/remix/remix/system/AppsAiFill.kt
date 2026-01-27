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

public val SystemGroup.AppsAiFill: ImageVector
    get() {
        if (_appsAiFill != null) {
            return _appsAiFill!!
        }
        _appsAiFill = Builder(name = "AppsAiFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 2.5f)
                curveTo(9.097f, 2.5f, 11.0f, 4.403f, 11.0f, 6.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.75f)
                curveTo(4.403f, 11.0f, 2.5f, 9.097f, 2.5f, 6.75f)
                curveTo(2.5f, 4.403f, 4.403f, 2.5f, 6.75f, 2.5f)
                close()
                moveTo(6.75f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.25f)
                curveTo(11.0f, 19.597f, 9.097f, 21.5f, 6.75f, 21.5f)
                curveTo(4.403f, 21.5f, 2.5f, 19.597f, 2.5f, 17.25f)
                curveTo(2.5f, 14.903f, 4.403f, 13.0f, 6.75f, 13.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineTo(17.25f)
                curveTo(19.597f, 13.0f, 21.5f, 14.903f, 21.5f, 17.25f)
                curveTo(21.5f, 19.597f, 19.597f, 21.5f, 17.25f, 21.5f)
                curveTo(14.903f, 21.5f, 13.0f, 19.597f, 13.0f, 17.25f)
                verticalLineTo(13.0f)
                close()
                moveTo(18.008f, 10.069f)
                lineTo(17.746f, 10.67f)
                curveTo(17.554f, 11.11f, 16.946f, 11.11f, 16.754f, 10.67f)
                lineTo(16.492f, 10.069f)
                curveTo(16.025f, 8.998f, 15.184f, 8.146f, 14.134f, 7.679f)
                lineTo(13.327f, 7.32f)
                curveTo(12.891f, 7.126f, 12.891f, 6.492f, 13.327f, 6.298f)
                lineTo(14.089f, 5.959f)
                curveTo(15.166f, 5.48f, 16.022f, 4.596f, 16.481f, 3.488f)
                lineTo(16.75f, 2.839f)
                curveTo(16.937f, 2.387f, 17.563f, 2.387f, 17.75f, 2.839f)
                lineTo(18.019f, 3.488f)
                curveTo(18.478f, 4.596f, 19.334f, 5.48f, 20.411f, 5.959f)
                lineTo(21.173f, 6.298f)
                curveTo(21.609f, 6.492f, 21.609f, 7.126f, 21.173f, 7.32f)
                lineTo(20.366f, 7.679f)
                curveTo(19.316f, 8.146f, 18.475f, 8.998f, 18.008f, 10.069f)
                close()
            }
        }
        .build()
        return _appsAiFill!!
    }

private var _appsAiFill: ImageVector? = null
