package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.AliensFill: ImageVector
    get() {
        if (_aliensFill != null) {
            return _aliensFill!!
        }
        _aliensFill = Builder(name = "AliensFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(16.694f, 2.0f, 20.5f, 5.806f, 20.5f, 10.5f)
                curveTo(20.5f, 17.0f, 15.0f, 22.5f, 12.0f, 22.5f)
                curveTo(9.0f, 22.5f, 3.5f, 17.0f, 3.5f, 10.5f)
                curveTo(3.5f, 5.806f, 7.306f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(15.015f, 12.0f, 13.0f, 14.015f, 13.0f, 16.5f)
                curveTo(13.0f, 16.66f, 13.008f, 16.819f, 13.025f, 16.975f)
                curveTo(13.181f, 16.992f, 13.34f, 17.0f, 13.5f, 17.0f)
                curveTo(15.985f, 17.0f, 18.0f, 14.985f, 18.0f, 12.5f)
                curveTo(18.0f, 12.34f, 17.992f, 12.181f, 17.975f, 12.025f)
                curveTo(17.819f, 12.008f, 17.66f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(6.5f, 12.0f)
                curveTo(6.34f, 12.0f, 6.181f, 12.008f, 6.025f, 12.025f)
                curveTo(6.008f, 12.181f, 6.0f, 12.34f, 6.0f, 12.5f)
                curveTo(6.0f, 14.985f, 8.015f, 17.0f, 10.5f, 17.0f)
                curveTo(10.66f, 17.0f, 10.819f, 16.992f, 10.975f, 16.975f)
                curveTo(10.992f, 16.819f, 11.0f, 16.66f, 11.0f, 16.5f)
                curveTo(11.0f, 14.015f, 8.985f, 12.0f, 6.5f, 12.0f)
                close()
            }
        }
        .build()
        return _aliensFill!!
    }

private var _aliensFill: ImageVector? = null
