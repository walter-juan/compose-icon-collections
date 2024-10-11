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

public val LogosGroup.AngularjsFill: ImageVector
    get() {
        if (_angularjsFill != null) {
            return _angularjsFill!!
        }
        _angularjsFill = Builder(name = "AngularjsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(21.3f, 5.32f)
                lineTo(19.882f, 17.63f)
                lineTo(12.0f, 22.0f)
                lineTo(4.119f, 17.63f)
                lineTo(2.7f, 5.32f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.21f)
                lineTo(6.186f, 17.26f)
                horizontalLineTo(8.354f)
                lineTo(9.523f, 14.34f)
                horizontalLineTo(14.458f)
                lineTo(15.626f, 17.26f)
                horizontalLineTo(17.794f)
                lineTo(12.0f, 4.21f)
                close()
                moveTo(13.698f, 12.54f)
                horizontalLineTo(10.302f)
                lineTo(12.0f, 8.45f)
                lineTo(13.698f, 12.54f)
                close()
            }
        }
        .build()
        return _angularjsFill!!
    }

private var _angularjsFill: ImageVector? = null
