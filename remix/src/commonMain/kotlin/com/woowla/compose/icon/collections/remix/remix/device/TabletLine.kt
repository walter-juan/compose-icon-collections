package com.woowla.compose.icon.collections.remix.remix.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DeviceGroup

public val DeviceGroup.TabletLine: ImageVector
    get() {
        if (_tabletLine != null) {
            return _tabletLine!!
        }
        _tabletLine = Builder(name = "TabletLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 2.0f, 20.0f, 2.448f, 20.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.552f, 19.552f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 22.0f, 4.0f, 21.552f, 4.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(4.0f, 2.448f, 4.448f, 2.0f, 5.0f, 2.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(12.552f, 17.0f, 13.0f, 17.448f, 13.0f, 18.0f)
                curveTo(13.0f, 18.552f, 12.552f, 19.0f, 12.0f, 19.0f)
                curveTo(11.448f, 19.0f, 11.0f, 18.552f, 11.0f, 18.0f)
                curveTo(11.0f, 17.448f, 11.448f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _tabletLine!!
    }

private var _tabletLine: ImageVector? = null
