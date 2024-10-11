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

public val DeviceGroup.HotspotLine: ImageVector
    get() {
        if (_hotspotLine != null) {
            return _hotspotLine!!
        }
        _hotspotLine = Builder(name = "HotspotLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 21.552f, 18.552f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 22.0f, 5.0f, 21.552f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 2.448f, 5.448f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 7.0f)
                curveTo(14.105f, 7.0f, 15.0f, 7.895f, 15.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(13.0f, 4.0f)
                curveTo(15.761f, 4.0f, 18.0f, 6.239f, 18.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 7.343f, 14.657f, 6.0f, 13.0f, 6.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(13.0f, 1.0f)
                curveTo(17.418f, 1.0f, 21.0f, 4.582f, 21.0f, 9.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 5.686f, 16.314f, 3.0f, 13.0f, 3.0f)
                verticalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _hotspotLine!!
    }

private var _hotspotLine: ImageVector? = null
