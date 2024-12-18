package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.Number4KFill: ImageVector
    get() {
        if (_number4KFill != null) {
            return _number4KFill!!
        }
        _number4KFill = Builder(name = "Number4KFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(11.5f, 13.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(11.5f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(15.75f, 12.0f)
                lineTo(18.0f, 9.0f)
                horizontalLineTo(16.25f)
                lineTo(14.5f, 11.25f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(12.75f)
                lineTo(16.25f, 15.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _number4KFill!!
    }

private var _number4KFill: ImageVector? = null
