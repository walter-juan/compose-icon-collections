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

public val DeviceGroup.Database2Fill: ImageVector
    get() {
        if (_database2Fill != null) {
            return _database2Fill!!
        }
        _database2Fill = Builder(name = "Database2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.5f)
                verticalLineTo(12.5f)
                curveTo(21.0f, 14.985f, 16.971f, 17.0f, 12.0f, 17.0f)
                curveTo(7.029f, 17.0f, 3.0f, 14.985f, 3.0f, 12.5f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 11.985f, 7.029f, 14.0f, 12.0f, 14.0f)
                curveTo(16.971f, 14.0f, 21.0f, 11.985f, 21.0f, 9.5f)
                close()
                moveTo(3.0f, 14.5f)
                curveTo(3.0f, 16.985f, 7.029f, 19.0f, 12.0f, 19.0f)
                curveTo(16.971f, 19.0f, 21.0f, 16.985f, 21.0f, 14.5f)
                verticalLineTo(17.5f)
                curveTo(21.0f, 19.985f, 16.971f, 22.0f, 12.0f, 22.0f)
                curveTo(7.029f, 22.0f, 3.0f, 19.985f, 3.0f, 17.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(7.029f, 12.0f, 3.0f, 9.985f, 3.0f, 7.5f)
                curveTo(3.0f, 5.015f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 5.015f, 21.0f, 7.5f)
                curveTo(21.0f, 9.985f, 16.971f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _database2Fill!!
    }

private var _database2Fill: ImageVector? = null
