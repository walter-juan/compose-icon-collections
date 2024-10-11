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

public val SystemGroup.DeleteBackFill: ImageVector
    get() {
        if (_deleteBackFill != null) {
            return _deleteBackFill!!
        }
        _deleteBackFill = Builder(name = "DeleteBackFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.535f, 3.0f)
                horizontalLineTo(20.999f)
                curveTo(21.552f, 3.0f, 21.999f, 3.448f, 21.999f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.999f, 20.552f, 21.552f, 21.0f, 20.999f, 21.0f)
                horizontalLineTo(6.535f)
                curveTo(6.2f, 21.0f, 5.888f, 20.833f, 5.702f, 20.555f)
                lineTo(0.369f, 12.555f)
                curveTo(0.145f, 12.219f, 0.145f, 11.781f, 0.369f, 11.445f)
                lineTo(5.702f, 3.445f)
                curveTo(5.888f, 3.167f, 6.2f, 3.0f, 6.535f, 3.0f)
                close()
                moveTo(15.999f, 11.0f)
                horizontalLineTo(8.999f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.999f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _deleteBackFill!!
    }

private var _deleteBackFill: ImageVector? = null
