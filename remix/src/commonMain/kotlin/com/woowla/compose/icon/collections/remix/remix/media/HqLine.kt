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

public val MediaGroup.HqLine: ImageVector
    get() {
        if (_hqLine != null) {
            return _hqLine!!
        }
        _hqLine = Builder(name = "HqLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
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
                moveTo(7.5f, 11.25f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(7.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.25f)
                close()
                moveTo(16.25f, 15.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(14.75f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                curveTo(13.448f, 15.0f, 13.0f, 14.552f, 13.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(13.0f, 9.448f, 13.448f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 9.0f, 18.0f, 9.448f, 18.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 14.552f, 17.552f, 15.0f, 17.0f, 15.0f)
                horizontalLineTo(16.25f)
                close()
                moveTo(14.5f, 10.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _hqLine!!
    }

private var _hqLine: ImageVector? = null
