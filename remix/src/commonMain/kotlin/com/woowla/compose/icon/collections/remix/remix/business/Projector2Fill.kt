package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.Projector2Fill: ImageVector
    get() {
        if (_projector2Fill != null) {
            return _projector2Fill!!
        }
        _projector2Fill = Builder(name = "Projector2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                curveTo(1.448f, 19.0f, 1.0f, 18.552f, 1.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 5.448f, 1.448f, 5.0f, 2.0f, 5.0f)
                horizontalLineTo(11.81f)
                curveTo(12.993f, 3.767f, 14.657f, 3.0f, 16.5f, 3.0f)
                curveTo(18.343f, 3.0f, 20.007f, 3.767f, 21.19f, 5.0f)
                horizontalLineTo(22.0f)
                curveTo(22.552f, 5.0f, 23.0f, 5.448f, 23.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 18.552f, 22.552f, 19.0f, 22.0f, 19.0f)
                close()
                moveTo(16.5f, 14.0f)
                curveTo(18.985f, 14.0f, 21.0f, 11.985f, 21.0f, 9.5f)
                curveTo(21.0f, 7.015f, 18.985f, 5.0f, 16.5f, 5.0f)
                curveTo(14.015f, 5.0f, 12.0f, 7.015f, 12.0f, 9.5f)
                curveTo(12.0f, 11.985f, 14.015f, 14.0f, 16.5f, 14.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveTo(15.119f, 12.0f, 14.0f, 10.881f, 14.0f, 9.5f)
                curveTo(14.0f, 8.119f, 15.119f, 7.0f, 16.5f, 7.0f)
                curveTo(17.881f, 7.0f, 19.0f, 8.119f, 19.0f, 9.5f)
                curveTo(19.0f, 10.881f, 17.881f, 12.0f, 16.5f, 12.0f)
                close()
                moveTo(4.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _projector2Fill!!
    }

private var _projector2Fill: ImageVector? = null
