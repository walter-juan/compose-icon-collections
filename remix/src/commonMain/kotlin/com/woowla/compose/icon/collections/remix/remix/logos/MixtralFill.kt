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

public val LogosGroup.MixtralFill: ImageVector
    get() {
        if (_mixtralFill != null) {
            return _mixtralFill!!
        }
        _mixtralFill = Builder(name = "MixtralFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(6.6f)
                verticalLineTo(6.6f)
                lineTo(10.2f, 6.6f)
                verticalLineTo(10.2f)
                lineTo(13.8f, 10.2f)
                lineTo(13.8f, 6.6f)
                horizontalLineTo(17.4f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.4f)
                verticalLineTo(13.8f)
                lineTo(13.8f, 13.8f)
                verticalLineTo(17.4f)
                horizontalLineTo(10.2f)
                verticalLineTo(13.8f)
                lineTo(6.6f, 13.8f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _mixtralFill!!
    }

private var _mixtralFill: ImageVector? = null
