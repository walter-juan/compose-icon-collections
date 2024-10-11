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

public val BusinessGroup.Projector2Line: ImageVector
    get() {
        if (_projector2Line != null) {
            return _projector2Line!!
        }
        _projector2Line = Builder(name = "Projector2Line", defaultWidth = 24.0.dp, defaultHeight =
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
                horizontalLineTo(12.528f)
                curveTo(13.626f, 3.773f, 15.223f, 3.0f, 17.0f, 3.0f)
                curveTo(18.777f, 3.0f, 20.374f, 3.773f, 21.472f, 5.0f)
                horizontalLineTo(22.0f)
                curveTo(22.552f, 5.0f, 23.0f, 5.448f, 23.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 18.552f, 22.552f, 19.0f, 22.0f, 19.0f)
                close()
                moveTo(11.341f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.472f)
                curveTo(19.938f, 14.422f, 18.537f, 15.0f, 17.0f, 15.0f)
                curveTo(13.686f, 15.0f, 11.0f, 12.314f, 11.0f, 9.0f)
                curveTo(11.0f, 8.299f, 11.12f, 7.626f, 11.341f, 7.0f)
                close()
                moveTo(17.0f, 13.0f)
                curveTo(19.209f, 13.0f, 21.0f, 11.209f, 21.0f, 9.0f)
                curveTo(21.0f, 6.791f, 19.209f, 5.0f, 17.0f, 5.0f)
                curveTo(14.791f, 5.0f, 13.0f, 6.791f, 13.0f, 9.0f)
                curveTo(13.0f, 11.209f, 14.791f, 13.0f, 17.0f, 13.0f)
                close()
                moveTo(5.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _projector2Line!!
    }

private var _projector2Line: ImageVector? = null
