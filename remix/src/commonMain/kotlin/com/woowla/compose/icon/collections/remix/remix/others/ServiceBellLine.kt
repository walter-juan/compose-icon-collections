package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.ServiceBellLine: ImageVector
    get() {
        if (_serviceBellLine != null) {
            return _serviceBellLine!!
        }
        _serviceBellLine = Builder(name = "ServiceBellLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.049f)
                curveTo(5.947f, 6.551f, 2.0f, 10.815f, 2.0f, 16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 10.815f, 18.053f, 6.551f, 13.0f, 6.049f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(16.08f, 8.0f, 19.446f, 11.054f, 19.938f, 15.0f)
                horizontalLineTo(4.062f)
                curveTo(4.554f, 11.054f, 7.92f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(23.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _serviceBellLine!!
    }

private var _serviceBellLine: ImageVector? = null
