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

public val LogosGroup.MixtralLine: ImageVector
    get() {
        if (_mixtralLine != null) {
            return _mixtralLine!!
        }
        _mixtralLine = Builder(name = "MixtralLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(8.2f)
                verticalLineTo(6.2f)
                lineTo(11.4f, 6.2f)
                verticalLineTo(9.4f)
                lineTo(12.6f, 9.4f)
                lineTo(12.6f, 6.2f)
                horizontalLineTo(15.8f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.8f)
                verticalLineTo(14.6f)
                lineTo(14.6f, 14.6f)
                verticalLineTo(17.8f)
                horizontalLineTo(9.4f)
                verticalLineTo(14.6f)
                lineTo(8.2f, 14.6f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(5.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.2f)
                verticalLineTo(12.6f)
                lineTo(11.4f, 12.6f)
                verticalLineTo(15.8f)
                horizontalLineTo(12.6f)
                verticalLineTo(12.6f)
                lineTo(17.8f, 12.6f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.8f)
                verticalLineTo(8.2f)
                horizontalLineTo(14.6f)
                lineTo(14.6f, 11.4f)
                lineTo(9.4f, 11.4f)
                verticalLineTo(8.2f)
                lineTo(6.2f, 8.2f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _mixtralLine!!
    }

private var _mixtralLine: ImageVector? = null
